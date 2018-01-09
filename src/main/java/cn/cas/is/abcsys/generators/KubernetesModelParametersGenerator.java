/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys.generators;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import cn.cas.is.abcsys.ModelParamtersGenerator;
import cn.cas.is.abcsys.analyzers.KubernetesKindModelsAnalyzer;
import cn.cas.is.abcsys.analyzers.KubernetesKindsAnalyzer;
import cn.cas.is.abcsys.analyzers.KubernetesModelParametersAnalyzer;
import cn.cas.is.abcsys.rules.JavaObjectRule;
import cn.cas.is.abcsys.utils.ObjectUtils;
import cn.cas.is.abcsys.utils.StringUtils;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public class KubernetesModelParametersGenerator extends ModelParamtersGenerator {

	protected final static String NEW_OBJECT_METHOD = "create";
	
	protected final Map<String, Object> objCaches = new HashMap<String, Object>();
	
	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	
	@Override
	protected Object generateKindModel(Object client, String kind) throws Exception {
		String desc = getDesc(kind);
		return createKindModelByDesc(client, desc);
	}
	
	/* (non-Javadoc)
	 * @see cn.cas.is.abcsys.ModelParamtersGenerator#generateParameters(java.util.Map, java.lang.String)
	 */
	@Override
	protected Object generateParameters(Map<String, Object> allParams, String kind) throws Exception {
		kindModel = Class.forName(KubernetesKindModelsAnalyzer
										.getAnalyzer().getKindModel(kind)).newInstance();
		Map<String, String> paramMapping = getModelParams(kind);
		for (String currentParamName : allParams.keySet()) {
			/**
			 * 使用stack的原因，是参数是由如下形式组成
			 * setMetadata-setInitializers
			 * 首先需要先反射setMetadata
			 * 再基于此反射化setInitializers
			 * 
			 * 此时，stack里面存在两个参数，如栈顺序分别是
			 * setMetadata-setInitializers和setMetadata
			 */
			Stack<String> paramStack = toParams(currentParamName);
			/**
			 * 所以出栈stack的顺序应该是先setMetadata，再setMetadata-setInitializers
			 */
			while (!paramStack.isEmpty()) {
				generateParameter(paramMapping, 
						paramStack.pop(), 
						allParams);
			}
			
		}
		return kindModel;
	}

	@Override
	protected Method getCreateMethod(Object client, String kind) throws Exception {
		String desc = getDesc(kind);
		Object kindModel = getKindModel(client, desc);
		return getMethod(kindModel, NEW_OBJECT_METHOD);
	}
	
	/**
	 * 比如，对于 <p>
	 * 
	 * ```<br>
	 *   DefaultKubernetesClient client = new DefaultKubernetesClient(); <br>
	 *   client.extensions().deployments(). <br>
	 * ``` <br>
	 * 
	 * 在这里，object就是client的对象，desc为extensions-deployments <br>
	 * 
	 * 故需要得到deployments对象，在client基础上，先要执行extension = client.extensions()，然后是extension.deployments() <br>
	 * 
	 * 以下过程描述的就是该实例化过程 <br>
	 * 
	 * @param client
	 * @param desc
	 * @return
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	protected Object createKindModelByDesc(Object client, String desc)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		Object thisObject = client;
		for (String name : desc.split("-")) {
			Method method = thisObject.getClass().getMethod(name);
			thisObject = method.invoke(thisObject);
		}
		return thisObject;
	}

	

	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	protected Stack<String> toParams(String currentParamName) {
		/**
		 * 使用stack的原因，是参数是由如下形式组成
		 * setMetadata-setInitializers
		 * 首先需要先反射setMetadata
		 * 再基于此反射化setInitializers
		 * 
		 * 此时，stack里面存在两个参数，如栈顺序分别是
		 * setMetadata-setInitializers和setMetadata
		 */
		Stack<String> paramStack = new Stack<String>();
		
		String temp = currentParamName;
		paramStack.push(temp);
		while (temp.lastIndexOf("-") != -1) {
			temp = temp.substring(0, temp.lastIndexOf("-")); 
			paramStack.push(temp);
		}
		return paramStack;
	}

	protected void generateParameter(Map<String, String> paramMapping, String paramName, 
											Map<String, Object> allParams) throws Exception { 
		
		String classname = paramMapping.get(paramName);
		
		if (JavaObjectRule.isPrimitive(classname)) {
			generatePrimitiveParameter(paramMapping, paramName, paramMapping.get(paramName), allParams);
		} else if (JavaObjectRule.isList(classname)) {
			List<Object> objects = new ArrayList<Object>();
			int idx = paramName.lastIndexOf("-");
			String realParamName = (idx == -1) ? paramName : paramName.substring(idx + 1);
			String objectKey = (idx == -1) ? paramName : paramName.substring(0, idx);
			Object thisObject = (idx == -1) ? kindModel : objCaches.get(objectKey);
			Method thisMethod = getMethod(thisObject, realParamName);
			thisMethod.invoke(thisObject, objects);
			
			
			@SuppressWarnings("unchecked")
			List<Object> list = (List<Object>) allParams.get(paramName);
			Map<String, Object> tempParams = new HashMap<String, Object>();
			for (int i = 0; i < list.size(); i++) {
				Object newInstance = Class.forName(toClassName(paramMapping.get(paramName))).newInstance();
				objCaches.put(paramName, newInstance);
				objects.add(newInstance);
				if (list.get(i) instanceof Map) {
					@SuppressWarnings("unchecked")
					Map<String, String> map = (Map<String, String>) list.get(i);
					for(String key : map.keySet()) {
						tempParams.put(paramName + "-" + key, map.get(key));
						generatePrimitiveParameter(paramMapping, 
								paramName + "-" + key, 
								paramMapping.get(paramName + "-" + key), 
								tempParams);
						tempParams.remove(paramName + "-" + key);
					}
					objCaches.remove(paramName);
				}
			}
		} else if (JavaObjectRule.isMap(classname)) {
			int idx = paramName.lastIndexOf("-");
			String realParamName = (idx == -1) ? paramName : paramName.substring(idx + 1);
			String objectKey = (idx == -1) ? paramName : paramName.substring(0, idx);
			Object thisObject = (idx == -1) ? kindModel : objCaches.get(objectKey);
			Method thisMethod = getMethod(thisObject, realParamName);
			thisMethod.invoke(thisObject, allParams.get(paramName));
		} else {
			generatePrimitiveParameter(paramMapping, paramName, paramMapping.get(paramName), allParams);
		}
		
	}
	
	protected void generatePrimitiveParameter(Map<String, String> paramMapping, 
										String paramName, 
										String paramValue,
										Map<String, Object> allParams) throws Exception {
		int idx = paramName.lastIndexOf("-");
		String realParamName = (idx == -1) ? paramName : paramName.substring(idx + 1);
		String objectKey = (idx == -1) ? paramName : paramName.substring(0, idx);
		Object thisObject = (idx == -1) ? kindModel : objCaches.get(objectKey);
		Method thisMethod = getMethod(thisObject, realParamName);
		Object newInstance = null;
		if(JavaObjectRule.isPrimitive(paramValue)) {
			// valueOf
			String value = String.valueOf(allParams.get(paramName));
			Constructor<?> csr = Class.forName(paramValue).getConstructor(String.class);
			newInstance = csr.newInstance(value);
		} else {
			if (objCaches.containsKey(paramName)) {
				return;
			}
			newInstance = Class.forName(paramValue).newInstance();
			objCaches.put(paramName, newInstance);
		}
		thisMethod.invoke(thisObject, newInstance);
	}
	
	protected String toClassName(String fullname) {
		return fullname.indexOf("<") == -1 ? fullname 
				: fullname.substring(fullname.indexOf("<") + 1, fullname.indexOf(">"));
	}
	
	protected static Method getPrimitiveMethod(Class<?> clazz, String name) {
		
		if (ObjectUtils.isNull(clazz) || StringUtils.isNull(name)) {
			return null;
		}
		
		for(Method method : clazz.getMethods()) {
			if (name.equals(method.getName()) && method.getParameterCount() == 1 &&
					(method.getParameterTypes()[0].getName().equals("java.lang.String")
					|| method.getParameterTypes()[0].getName().equals("java.lang.Object"))) {
				return method;
			}
		}
		return null;
	}
	
	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	
	protected Map<String, String> getModelParams(String kind) {
		return StringUtils.isNull(kind) ? new HashMap<String, String>() : 
			KubernetesModelParametersAnalyzer.getAnalyzer().getModelParameters(kind);
	}
	
	protected String getDesc(String kind) {
		return StringUtils.isNull(kind) ? "" 
				: KubernetesKindsAnalyzer.getAnalyzer().getKindDesc(kind);
	}

	/**
	 * 暂时不清楚如何反射出来的，只能暂时用最简单的遍历方法
	 * 
	 * @param kindModel
	 * @param name
	 * @return
	 */
	protected Method getMethod(Object kindModel, String name) {
		for (Method method : kindModel.getClass().getMethods()) {
			if (method.getName().equals(name)) {
				return method;
			}
		}
		return null;
	}
	
}
