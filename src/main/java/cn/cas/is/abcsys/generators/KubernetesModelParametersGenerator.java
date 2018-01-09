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

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public class KubernetesModelParametersGenerator extends ModelParamtersGenerator {

	protected final static String NEW_OBJECT_METHOD = "create";
	
	protected final Map<String, Object> objCaches = new HashMap<String, Object>();
	
	@Override
	protected Object getKindObject(Object client, String kind) throws Exception {
		this.kindModel = Class.forName(KubernetesKindModelsAnalyzer
										.getAnalyzer().getKindModel(kind))
										.newInstance();
		String desc = KubernetesKindsAnalyzer.getAnalyzer().getKindDesc(kind);
		return _getKindObject(client, desc);
	}

	protected Object _getKindObject(Object client, String desc)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		Object thisObject = client;
		for (String name : desc.split("-")) {
			Method method = thisObject.getClass().getMethod(name);
			thisObject = method.invoke(thisObject);
		}
		this.kind = thisObject;
		return thisObject;
	}

	@Override
	protected Object getParameter(Map<String, Object> allParams, String kind) throws Exception {
		Map<String, String> paramMapping = KubernetesModelParametersAnalyzer.getAnalyzer().getModelParameters(kind);
		for (String paramNameTag : allParams.keySet()) {
			
			Stack<String> stack = new Stack<String>();
			String temp = paramNameTag;
			stack.push(temp);
			while (temp.lastIndexOf("-") != -1) {
				temp = temp.substring(0, temp.lastIndexOf("-")); 
				stack.push(temp);
			}
			
			while (!stack.isEmpty()) {
				initParameter(paramMapping, 
						stack.pop(), 
						allParams);
			}
			
		}
		return kindModel;
	}

	protected void initParameter(Map<String, String> paramMapping, 
									String paramName, 
									Map<String, Object> allParams) throws Exception { 
		
		String classname = paramMapping.get(paramName);
		
		if (JavaObjectRule.isPrimitive(classname)) {
			initPrimitiveParam(paramMapping, paramName, paramMapping.get(paramName), allParams);
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
						initPrimitiveParam(paramMapping, 
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
			initPrimitiveParam(paramMapping, paramName, paramMapping.get(paramName), allParams);
		}
		
	}
	
	protected void initPrimitiveParam(Map<String, String> paramMapping, 
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
	
	@Override
	protected Method getCreateMethod(Object client, String kind) throws Exception {
		String desc = KubernetesKindsAnalyzer.getAnalyzer().getKindDesc(kind);
		Object kindModel = getKindModel(client, desc);
		return getMethod(kindModel, NEW_OBJECT_METHOD);
	}

	protected Method getMethod(Object kindModel, String name) {
		for (Method method : kindModel.getClass().getMethods()) {
			if (method.getName().equals(name)) {
				return method;
			}
		}
		return null;
	}
	
	protected static Method getPrimitiveMethod(Class<?> clazz, String name) {
		
		if (clazz == null || name == null ) {
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
	
}
