/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.generators;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.github.isdream.cdispatcher.ModelParamtersGenerator;
import com.github.isdream.cdispatcher.analyzers.KubernetesKindModelsAnalyzer;
import com.github.isdream.cdispatcher.analyzers.KubernetesKindsAnalyzer;
import com.github.isdream.cdispatcher.analyzers.KubernetesModelParametersAnalyzer;
import com.github.isdream.cdispatcher.rules.JavaObjectRule;
import com.github.isdream.cdispatcher.utils.StringUtils;

/**
 * @author henry
 * @email wuheng@otcaix.iscas.ac.cn
 *
 * @date 2018年1月3日
 */
public class KubernetesModelParametersGenerator extends ModelParamtersGenerator {

	protected final static String NEW_OBJECT_METHOD = "create";
	
	protected final static String DEFAULT_PREFIX = "";
	
	protected final static String NO_IGNORE = "";
	
	protected final static Class<?> NEW_OBJECT_METHOD_PARAMS = new Object[] {}.getClass();

	protected final Map<String, Object> objCaches = new HashMap<String, Object>();

	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.cas.is.abcsys.ModelParamtersGenerator#generateParameters(java.util.Map,
	 * java.lang.String)
	 */
	@Override
	public Object generateParameters(Map<String, Object> paramValues, String kind) throws Exception {
		// 
		kindModel = createKindModel(kind);
		paramTypes =  createParamsType(kind);
		initAndGenerateParameters(paramValues, NO_IGNORE);
		objCaches.clear();
		return kindModel;
	}


	protected void initAndGenerateParameters(Map<String, Object> paramValues, String ignore) throws Exception {
		for (String fullname : paramValues.keySet()) {
			/**
			 * 使用stack的原因，是参数是由如下形式组成 setMetadata-setInitializers 首先需要先反射setMetadata
			 * 再基于此反射化setInitializers
			 * 
			 * 此时，stack里面存在两个参数，如栈顺序分别是 setMetadata-setInitializers和setMetadata
			 */
			Stack<String> paramStack = initParamStack(fullname, ignore);
			/**
			 * 所以出栈stack的顺序应该是先setMetadata，再setMetadata-setInitializers
			 */
			while (!paramStack.isEmpty()) {
//				generateParameter(paramTypes, paramStack.pop(), paramValues);
				generateParameter(paramStack.pop(), paramValues);
			}
		}
	}

	
	@SuppressWarnings("unchecked")
	protected void generateParameter(String fullname, Map<String, Object> paramValues)
			throws Exception {

		String typename = paramTypes.get(fullname);
		Object thisParam = null;
		if (JavaObjectRule.isPrimitive(typename)) {
			thisParam = getPrimitiveInstance(fullname, 
					   paramTypes.get(fullname), paramValues.get(fullname));
		} else if (JavaObjectRule.isStringList(typename)) {
			thisParam = new ArrayList<String>();
			List<String> values = (List<String>) paramValues.get(fullname);
			for(String key : values) {
				 ((List<String>)thisParam).add(key);
			}
		} else if (JavaObjectRule.isObjectList(typename)) {
			thisParam = new ArrayList<Object>();
			List<Object> values = (List<Object>) paramValues.get(fullname);
			HashMap<String, Object> newParamValues = new HashMap<String, Object>();
			for(Object subObjValue : values) {
				Object subObject = Class.forName(
						getClassNameForListStyle(typename)).newInstance();
				objCaches.put(fullname, subObject);
				((List<Object>)thisParam).add(subObject);
				Map<String, Object> mapValues = (Map<String, Object>) subObjValue;
				for(String newKey : mapValues.keySet()) {
					newParamValues.put(fullname + "-" + newKey, mapValues.get(newKey));
				}
				initAndGenerateParameters(newParamValues, fullname);
				for(String newKey : mapValues.keySet()) {
					objCaches.remove(fullname + "-" + newKey);
				}
				objCaches.remove(fullname);
			}
		} else if (JavaObjectRule.isStringMap(typename)) {
			thisParam = new HashMap<String, String>();
			Map<String, String> values = (Map<String, String>) paramValues.get(fullname);
			for(String key : values.keySet()) {
				 ((Map<String, String>)thisParam).put(key, values.get(key));
			}
		} else if (JavaObjectRule.isObjectMap(typename)) {
			thisParam = new HashMap<String, Object>();
			Map<String, List<Object>> values = (Map<String, List<Object>>) paramValues.get(fullname);
			for (String key : values.keySet()) {
				Object subObject = Class.forName(
						 getClassNameForMapStyle(typename)).newInstance();
				((Map<String, Object>)thisParam).put(key, subObject);
				List<Object> mapValues = (List<Object>) values.get(key);

				for (Object obj : mapValues) {
					Map<String, Object> map = (Map<String, Object>) obj;
					for (String newKey : map.keySet()) {
						Object thisParameter = getPrimitiveInstance(newKey, String.class.getName(), map.get(newKey));
						Method thisMethod = getMethod(subObject, newKey, String.class);
						thisMethod.invoke(subObject, thisParameter);
					}
				}
				
			}
		} else {
			if(objCaches.get(fullname) != null) {
				return;
			}
			thisParam = getObjectInstance(fullname, paramTypes.get(fullname));
		}
		Object parentObject = getParentObject(fullname);
		Method parentMethod = getMethod(parentObject, fullname, getParamType(typename));
		parentMethod.invoke(parentObject, thisParam);
		objCaches.put(fullname, thisParam);
	}
	
	/************************************************************************************
	 * 
	 *                            Create
	 * 
	 ************************************************************************************/
	
	protected Map<String, String> createParamsType(String kind) {
		return StringUtils.isNull(kind) ? new HashMap<String, String>()
									: KubernetesModelParametersAnalyzer.getAnalyzer().getModelParameters(kind);
	}

	protected void createParamsObject(String paramName, Object instance) throws Exception {
		int idx = paramName.lastIndexOf("-");
		String realParamName = (idx == -1) ? paramName : paramName.substring(idx + 1);
		String objectIndex = (idx == -1) ? paramName : paramName.substring(0, idx);
		// default parent is kindModel
		Object parentObject = (idx == -1) ? kindModel : objCaches.get(objectIndex);
//		Method parentMethod = getMethod(parentObject, realParamName);
		Method parentMethod = getMethod(parentObject, realParamName, instance.getClass());
		parentMethod.invoke(parentObject, instance);
	}
	
	protected Object createKindModel(String kind) throws Exception {
		return Class.forName(KubernetesKindModelsAnalyzer
				.getAnalyzer().getKindModel(kind)).newInstance();
	}

	/************************************************************************************
	 * 
	 *                             Getter and Setter
	 * 
	 ************************************************************************************/
	
	protected String getDesc(String kind) {
		return StringUtils.isNull(kind) ? "" : KubernetesKindsAnalyzer.getAnalyzer().getKindDesc(kind);
	}
	
	protected Class<?> getParamType(String typename) throws Exception {
		// if fullname is setMetadata-setName, paramName is setName
		// if fullname is setMatadata paramName is setMatadata
		if(JavaObjectRule.isMap(typename)) {
			return Map.class;
		} else if (JavaObjectRule.isList(typename)) {
			return List.class;
		} else {
			return Class.forName(typename);
		}
	}
	
	protected Method getMethod(Object object, String fullname, Class<?> paramType) throws Exception {
		// if fullname is setMetadata-setName, paramName is setName
		// if fullname is setMatadata paramName is setMatadata
		String paramName = getParamName(fullname);
		return object.getClass().getMethod(paramName, paramType);
	}


	protected String getParamName(String fullname) {
		int idx = fullname.lastIndexOf("-");
		String paramName = (idx == -1) ? fullname : fullname.substring(idx + 1);
		return paramName;
	}
	
	protected Object getParentObject(String fullname) {
		String methodKey = getParentMethodKey(fullname);
		return (methodKey.equals(fullname)) ? kindModel : objCaches.get(methodKey);
	}


	protected String getParentMethodKey(String fullname) {
		int idx = fullname.lastIndexOf("-");
		String methodName = (idx == -1) ? fullname : fullname.substring(0, idx);
		return methodName;
	}
	
	@Override
	protected Method getCreateMethod(Object client, String kind) throws Exception {
		String kindDesc = getDesc(kind);
		Class<?> kindModel = getKindModel(client, kindDesc).getClass();
		return kindModel.getMethod(NEW_OBJECT_METHOD, NEW_OBJECT_METHOD_PARAMS);
	}
	
	protected String getClassNameForMapStyle(String fullname) {
		// Map<String, Object>，需要返回Object的类名
		int start = fullname.indexOf(",");
		int end = fullname.indexOf(">");
		return fullname.substring(start + 2, end); //<String, Object>的,后有一个空格
	}
	
	protected String getClassNameForListStyle(String fullname) {
		// List<Object>，需要返回Object的类名
		int start = fullname.indexOf("<");
		int end = fullname.indexOf(">");
		return fullname.substring(start + 1, end);
	}

	@Override
	public Object getKindModel(Object client, String kind) throws Exception {
		// client.extensions.depolyments()
		Object thisObject = client;
		for (String name : getDesc(kind).split("-")) {
			Method method = thisObject.getClass().getMethod(name);
			thisObject = method.invoke(thisObject);
		}
		return thisObject;
	}
	
	protected Object getPrimitiveInstance(String paramName, String paramType, Object paramValue) throws Exception {
		// valueOf
		String value = String.valueOf(paramValue);
		Constructor<?> csr = Class.forName(paramType).getConstructor(String.class);
		return csr.newInstance(value);
	}
	
	protected Object getObjectInstance(String fullname, String paramType) throws Exception {
		Object obj = objCaches.get(fullname);
		return (obj == null) ? Class.forName(paramType).newInstance() : obj;
	}
	
	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	protected Stack<String> initParamStack(String fullname, String ignore) {
		/**
		 * 使用stack的原因，是参数是由如下形式组成 setMetadata-setInitializers 首先需要先反射setMetadata
		 * 再基于此反射化setInitializers
		 * 
		 * 此时，stack里面存在两个参数，如栈顺序分别是 setMetadata-setInitializers和setMetadata
		 */
		Stack<String> paramStack = new Stack<String>();

		String tfn = fullname;
		paramStack.push(tfn);
		while (tfn.lastIndexOf("-") != -1) {
			tfn = tfn.substring(0, tfn.lastIndexOf("-"));
			if (!NO_IGNORE.equals(ignore) && tfn.length() <= ignore.length()) {
				break;
			} 
			paramStack.push(tfn);
		}
		return paramStack;
	}
	
//	/************************************************************************************
//	 * 
//	 *  Deprecated
//	 * 
//	 ************************************************************************************/
//	/**
//	 * 比如，对于
//	 * <p>
//	 * 
//	 * ```<br>
//	 * DefaultKubernetesClient client = new DefaultKubernetesClient(); <br>
//	 * client.extensions().deployments(). <br>
//	 * ``` <br>
//	 * 
//	 * 在这里，object就是client的对象，desc为extensions-deployments <br>
//	 * 
//	 * 故需要得到deployments对象，在client基础上，先要执行extension =
//	 * client.extensions()，然后是extension.deployments() <br>
//	 * 
//	 * 以下过程描述的就是该实例化过程 <br>
//	 * 
//	 * @param client
//	 * @param desc
//	 * @return
//	 * @throws NoSuchMethodException
//	 * @throws IllegalAccessException
//	 * @throws InvocationTargetException
//	 */
//	protected Object createKindModelByDesc(Object client, String desc)
//			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
//		Object thisObject = client;
//		for (String name : desc.split("-")) {
//			Method method = thisObject.getClass().getMethod(name);
//			thisObject = method.invoke(thisObject);
//		}
//		return thisObject;
//	}
//
//	
//
//
//	protected String toClassName(String fullname) {
//		return fullname.indexOf("<") == -1 ? fullname
//				: fullname.substring(fullname.indexOf("<") + 1, fullname.indexOf(">"));
//	}
//	
//	/************************************************************************************
//	 * 
//	 * 
//	 * 
//	 ************************************************************************************/
//	@SuppressWarnings("unchecked")
//	protected void generateParameter(Map<String, String> paramMapping, String paramName, Map<String, Object> allParams)
//			throws Exception {
//
//		String classname = paramMapping.get(paramName);
//
//		if (JavaObjectRule.isList(classname)) {
//			List<Object> thisObject = new ArrayList<Object>();
//			generateThisParameter(paramName, thisObject);
//			if (JavaObjectRule.isStringList(classname)) {
//				List<String> list = (List<String>) allParams.get(paramName);
//				for(String value : list) {
//					thisObject.add(value);
//				}
//			} else {
//				generateListParameters(paramMapping, paramName, allParams, thisObject);
//			}
//		} else if (JavaObjectRule.isMap(classname)) {
//			if (JavaObjectRule.isStringMap(classname)) {
//				generateStringMapParameters(paramName, allParams);
//			} else {
//				generatObjectMapParameters(paramName, allParams, getClassNameForMapStyle(classname));
//			}
// 		}else {
//			generateThisParameter(paramName, 
//					getInstance(paramName, paramMapping.get(paramName), allParams));
//		}
//
//	}
//
//	@SuppressWarnings("unchecked")
//	protected void generatObjectMapParameters(String paramName, 
//			Map<String, Object> allParams, String classname) throws Exception {
//		Map<String, Object> objects = new HashMap<String, Object>();
//		Map<String, String> maps = (Map<String, String>)allParams.get(paramName);
//		for (String key : maps.keySet()) {
//			Class<?> clazz = Class.forName(classname);
//			Constructor<?> cst = clazz.getConstructor(String.class);
//			Object obj = cst.newInstance(maps.get(key));
//			objects.put(key.substring(3).toLowerCase(), obj);
//		}
//		generateThisParameter(paramName, objects);
//	}
//	
//	@SuppressWarnings("unchecked")
//	protected void generateStringMapParameters(String paramName, Map<String, Object> allParams) throws Exception {
//		Map<String, String> objects = new HashMap<String, String>();
//		Map<String, String> maps = (Map<String, String>)allParams.get(paramName);
//		for (String key : maps.keySet()) {
//			objects.put(key, maps.get(key));
//		}
//		generateThisParameter(paramName, objects);
//	}
//
//	@SuppressWarnings("unchecked")
//	protected void generateListParameters(Map<String, String> paramMapping, String paramName,
//			Map<String, Object> allParams, List<Object> objects) throws InstantiationException, IllegalAccessException,
//			ClassNotFoundException, Exception, NoSuchMethodException, InvocationTargetException {
//		List<Object> list = (List<Object>) allParams.get(paramName);
//		Map<String, Object> tempParams = new HashMap<String, Object>();
//		for (int i = 0; i < list.size(); i++) {
//			String className = toClassName(paramMapping.get(paramName));
//			Object newInstance = Class.forName(className).newInstance();
//			objCaches.put(paramName, newInstance);
//			objects.add(newInstance);
//			tempParams.put(paramName, newInstance);
//			if (list.get(i) instanceof Map) {
//				Map<String, Object> map = (Map<String, Object>) list.get(i);
//				for (String key : map.keySet()) {
//
//					tempParams.put(paramName + "-" + key, map.get(key));
//					if(map.get(key) instanceof List) {
//						List<Object> values = (List<Object>) map.get(key);
//						if(values.size() > 0 && values.get(0) instanceof String) {
//							generateThisParameter(paramName + "-" + key, values);
//						} else {
//							generateListParameters(paramMapping, paramName + "-" + key, tempParams, (List<Object>)map.get(key));
//						}
//					} else if (map.get(key) instanceof Map) {
//						generateStringMapParameters(paramName + "-" + key, (Map<String, Object>)map.get(key));
//					} else {
//						generateThisParameter(paramName + "-" + key, 
//												getInstance(paramName + "-" + key, 
//														map.get(key).getClass().getName(), tempParams));
//					}
//					tempParams.remove(paramName + "-" + key);
//				}
//				tempParams.remove(paramName);
//				objCaches.remove(paramName);
//			}
//		}
//	}
//
//	
//	protected void generateThisParameter(String paramName, Object instance) throws Exception {
//		if (ObjectUtils.isNull(instance)) {
//			return;
//		}
//		
//		int idx = paramName.lastIndexOf("-");
//		String realParamName = (idx == -1) ? paramName : paramName.substring(idx + 1);
//		String objectIndex = (idx == -1) ? paramName : paramName.substring(0, idx);
//		Object thisObject = (idx == -1) ? kindModel : objCaches.get(objectIndex);
//		Method thisMethod = getMethod(thisObject, realParamName);
//		thisMethod.invoke(thisObject, instance);
//	}
//
//
//	/************************************************************************************
//	 * 
//	 * 
//	 * 
//	 ************************************************************************************/
//
//	
//	
//	protected Object getInstance(String paramName, String paramValue, Map<String, Object> allParams)
//			throws NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException,
//			InvocationTargetException {
//		Object newInstance = null;
//		if (JavaObjectRule.isPrimitive(paramValue)) {
//			// valueOf
//			String value = String.valueOf(allParams.get(paramName));
//			Constructor<?> csr = Class.forName(paramValue).getConstructor(String.class);
//			newInstance = csr.newInstance(value);
//		} else {
//			if (objCaches.containsKey(paramName)) {
//				return null;
//			}
//			newInstance = Class.forName(paramValue).newInstance();
//			objCaches.put(paramName, newInstance);
//		}
//		return newInstance;
//	}
//	
//	protected static Method getPrimitiveMethod(Class<?> clazz, String name) {
//
//		if (ObjectUtils.isNull(clazz) || StringUtils.isNull(name)) {
//			return null;
//		}
//
//		for (Method method : clazz.getMethods()) {
//			if (name.equals(method.getName()) && method.getParameterCount() == 1
//					&& (method.getParameterTypes()[0].getName().equals("java.lang.String")
//							|| method.getParameterTypes()[0].getName().equals("java.lang.Object"))) {
//				return method;
//			}
//		}
//		return null;
//	}
//
//	protected Map<String, String> getModelParams(String kind) {
//		return createParamsType(kind);
//	}
//
//	/**
//	 * 暂时不清楚如何反射出来的，只能暂时用最简单的遍历方法
//	 * 
//	 * @param kindModel
//	 * @param name
//	 * @return
//	 */
//	protected Method getMethod(Object kindModel, String name) {
//		for (Method method : kindModel.getClass().getMethods()) {
//			if (method.getName().equals(name)) {
//				return method;
//			}
//		}
//		return null;
//	}

}
