/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.docker;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.github.isdream.cdispatcher.KindModelStyleGenerator;
import com.github.isdream.cdispatcher.commons.rules.JavaObjectRule;
import com.github.isdream.cdispatcher.commons.utils.StringUtils;

/**
 * @author henry,wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月29日
 */
public class DockerModelParametersGenerator extends KindModelStyleGenerator {


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
		paramTypes = createParamsType(kind);
		initAndGenerateParameters(paramValues, NO_IGNORE);
		objCaches.clear();
		return kindModel;
	}

	// This is a test method
	/**
	 * @param paramValues
	 *            参数类型
	 * @param km
	 *            对象
	 * @param pt
	 *            参数数值
	 * @return 对象
	 * @throws Exception
	 *             反射异常
	 */
	public Object generateParameters(Map<String, Object> paramValues, Object km, Map<String, String> pt)
			throws Exception {
		//
		kindModel = km;
		paramTypes = pt;
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
				// generateParameter(paramTypes, paramStack.pop(), paramValues);
				generateParameter(paramStack.pop(), paramValues);
			}
		}
	}

	@SuppressWarnings("unchecked")
	protected void generateParameter(String fullname, Map<String, Object> paramValues) throws Exception {

		String typename = paramTypes.get(fullname);
		Object thisParam = null;
		if (JavaObjectRule.isPrimitive(typename)) {
			thisParam = getPrimitiveInstance(fullname, paramTypes.get(fullname), paramValues.get(fullname));
		} else if (JavaObjectRule.isStringList(typename)) {
			thisParam = new ArrayList<String>();
			List<String> values = (List<String>) paramValues.get(fullname);
			for (String key : values) {
				((List<String>) thisParam).add(key);
			}
		} else if (JavaObjectRule.isObjectList(typename)) {
			thisParam = new ArrayList<Object>();
			List<Object> values = (List<Object>) paramValues.get(fullname);
			HashMap<String, Object> newParamValues = new HashMap<String, Object>();
			for (Object subObjValue : values) {
				// Object subObject = Class.forName(
				// getClassNameForListStyle(typename)).newInstance();
				Object subObject = getThisObject(getClassNameForListStyle(typename));
				objCaches.put(fullname, subObject);
				((List<Object>) thisParam).add(subObject);
				Map<String, Object> mapValues = (Map<String, Object>) subObjValue;
				for (String newKey : mapValues.keySet()) {
					newParamValues.put(fullname + "-" + newKey, mapValues.get(newKey));
				}
				initAndGenerateParameters(newParamValues, fullname);
				for (String newKey : mapValues.keySet()) {
					objCaches.remove(fullname + "-" + newKey);
				}
				objCaches.remove(fullname);
				newParamValues.clear();
			}
		} else if (JavaObjectRule.isStringMap(typename)) {
			thisParam = new HashMap<String, String>();
			Map<String, String> values = (Map<String, String>) paramValues.get(fullname);
			for (String key : values.keySet()) {
				((Map<String, String>) thisParam).put(key, values.get(key));
			}
		} else if (JavaObjectRule.isObjectMap(typename)) {
			thisParam = new HashMap<String, Object>();
			Map<String, List<Object>> values = (Map<String, List<Object>>) paramValues.get(fullname);
			for (String key : values.keySet()) {
				// Object subObject = Class.forName(
				// getClassNameForMapStyle(typename)).newInstance();
				Object subObject = getThisObject(getClassNameForMapStyle(typename));
				((Map<String, Object>) thisParam).put(key, subObject);
				List<Object> mapValues = (List<Object>) values.get(key);

				for (Object obj : mapValues) {
					Map<String, Object> map = (Map<String, Object>) obj;
					for (String newKey : map.keySet()) {
						Object thisParameter = getPrimitiveInstance(newKey, String.class.getName(), map.get(newKey));
						Method thisMethod = getThisMethod(subObject, newKey, String.class);
						thisMethod.invoke(subObject, thisParameter);
					}
				}

			}
		} else {
			if (objCaches.get(fullname) != null) {
				return;
			}
			thisParam = getObjectInstance(fullname, paramTypes.get(fullname));
		}
		Object parentObject = getParentObject(fullname);
		Method parentMethod = getThisMethod(parentObject, fullname, getParamType(typename));
		parentMethod.invoke(parentObject, thisParam);
		objCaches.put(fullname, thisParam);
	}

	/************************************************************************************
	 * 
	 * Create
	 * 
	 ************************************************************************************/

	/**
	 * @param kind
	 *            kind类型
	 * @return kind对应的Map对象
	 */
	protected Map<String, String> createParamsType(String kind) {
		return StringUtils.isNull(kind) ? new HashMap<String, String>()
				: DockerModelParametersAnalyzer.getAnalyzer().getModelParameters(kind);
	}

	/**
	 * @param paramName
	 *            参数名
	 * @param instance
	 *            实例
	 * @throws Exception
	 *             反射异常
	 */
	protected void createParamsObject(String paramName, Object instance) throws Exception {
		int idx = paramName.lastIndexOf("-");
		String realParamName = (idx == -1) ? paramName : paramName.substring(idx + 1);
		String objectIndex = (idx == -1) ? paramName : paramName.substring(0, idx);
		// default parent is kindModel
		Object parentObject = (idx == -1) ? kindModel : objCaches.get(objectIndex);
		// Method parentMethod = getMethod(parentObject, realParamName);
		Method parentMethod = getThisMethod(parentObject, realParamName, instance.getClass());
		parentMethod.invoke(parentObject, instance);
	}

	/**
	 * @param kind
	 *            kind类型
	 * @return kind对应的fabric8对象
	 * @throws Exception
	 *             反射异常
	 */
	protected Object createKindModel(String kind) throws Exception {
		return Class.forName(DockerKindModelsAnalyzer.getAnalyzer().getKindModel(kind)).newInstance();
	}

	/************************************************************************************
	 * 
	 * Getter and Setter
	 * 
	 ************************************************************************************/

	/**
	 * @param kind
	 *            类型
	 * @return 描述
	 */
	protected String getDesc(String kind) {
		return StringUtils.isNull(kind) ? "" : DockerKindsAnalyzer.getAnalyzer().getKindDesc(kind);
	}

	/**
	 * @param typename
	 *            名字
	 * @return 对象的类
	 * @throws Exception
	 *             反射异常
	 */
	protected Class<?> getParamType(String typename) throws Exception {
		// if fullname is setMetadata-setName, paramName is setName
		// if fullname is setMatadata paramName is setMatadata
		if (JavaObjectRule.isMap(typename)) {
			return Map.class;
		} else if (JavaObjectRule.isList(typename)) {
			return List.class;
		} else {
			return getThisClass(typename);
		}
	}

	/**
	 * @param object
	 *            对象
	 * @param fullname
	 *            名字
	 * @param paramType
	 *            类型
	 * @return 方法
	 * @throws Exception
	 *             反射异常
	 */
	protected Method getThisMethod(Object object, String fullname, Class<?> paramType) throws Exception {
		// if fullname is setMetadata-setName, paramName is setName
		// if fullname is setMatadata paramName is setMatadata
		String paramName = getParamName(fullname);
		return object.getClass().getDeclaredMethod(paramName, paramType);
	}

	/**
	 * @param name
	 *            名字
	 * @return 对象
	 * @throws Exception
	 *             不支持该操作
	 */
	protected Object getThisObject(String name) throws Exception {
		return getThisClass(name).newInstance();
	}

	/**
	 * @param name
	 *            名字
	 * @return 对象
	 * @throws Exception
	 *             不支持该操作
	 */
	protected Class<?> getThisClass(String name) throws Exception {
		return Class.forName(name);
	}

	/**
	 * @param fullname
	 *            名字
	 * @return 参数名
	 */
	protected String getParamName(String fullname) {
		int idx = fullname.lastIndexOf("-");
		String paramName = (idx == -1) ? fullname : fullname.substring(idx + 1);
		return paramName;
	}

	/**
	 * @param fullname
	 *            名字
	 * @return 对象
	 */
	protected Object getParentObject(String fullname) {
		String methodKey = getParentMethodKey(fullname);
		return (methodKey.equals(fullname)) ? kindModel : objCaches.get(methodKey);
	}

	/**
	 * @param fullname
	 *            名字
	 * @return 父方法名
	 */
	protected String getParentMethodKey(String fullname) {
		int idx = fullname.lastIndexOf("-");
		String methodName = (idx == -1) ? fullname : fullname.substring(0, idx);
		return methodName;
	}

	@Override
	protected Method getCreateMethod(Object client, String kind) throws Exception {
		return null;
	}

	/**
	 * @param fullname
	 *            名字
	 * @return Map中对象
	 */
	protected String getClassNameForMapStyle(String fullname) {
		// Map<String, Object>，需要返回Object的类名
		int start = fullname.indexOf(",");
		int end = fullname.indexOf(">");
		return fullname.substring(start + 2, end); // <String, Object>的,后有一个空格
	}

	/**
	 * @param fullname
	 *            名字
	 * @return List中对象
	 */
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
			Method method = thisObject.getClass().getDeclaredMethod(name);
			thisObject = method.invoke(thisObject);
		}
		return thisObject;
	}

	/**
	 * @param kind
	 *            类型
	 * @return 所有参数
	 */
	protected Map<String, String> getModelParams(String kind) {
		return createParamsType(kind);
	}

	/**
	 * @param paramName
	 *            参数名
	 * @param paramType
	 *            参数类型
	 * @param paramValue
	 *            参数数值
	 * @return 对象
	 * @throws Exception
	 *             反射异常
	 */
	protected Object getPrimitiveInstance(String paramName, String paramType, Object paramValue) throws Exception {
		// valueOf
		String value = String.valueOf(paramValue);
		Constructor<?> csr = Class.forName(paramType).getConstructor(String.class);
		return csr.newInstance(value);
	}

	/**
	 * @param fullname
	 *            名字
	 * @param paramType
	 *            类型
	 * @return 对象
	 * @throws Exception
	 *             反射异常
	 */
	protected Object getObjectInstance(String fullname, String paramType) throws Exception {
		Object obj = objCaches.get(fullname);
		// return (obj == null) ? Class.forName(paramType).newInstance() : obj;
		return (obj == null) ? getThisObject(paramType) : obj;
	}

	/**
	 * 比如，对于
	 * <p>
	 * 
	 * ```<br>
	 * DefaultKubernetesClient client = new DefaultKubernetesClient(); <br>
	 * client.extensions().deployments(). <br>
	 * ``` <br>
	 * 
	 * 在这里，object就是client的对象，desc为extensions-deployments <br>
	 * 
	 * 故需要得到deployments对象，在client基础上，先要执行extension =
	 * client.extensions()，然后是extension.deployments() <br>
	 * 
	 * 以下过程描述的就是该实例化过程 <br>
	 * 
	 * @param client
	 *            客户端
	 * @param desc
	 *            描述
	 * @return 对象
	 * @throws Exception
	 *             反射异常
	 */
	protected Object createKindModelByDesc(Object client, String desc) throws Exception {
		Object thisObject = client;
		for (String name : desc.split("-")) {
			Method method = thisObject.getClass().getDeclaredMethod(name);
			thisObject = method.invoke(thisObject);
		}
		return thisObject;
	}

	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	/**
	 * @param fullname
	 *            名字
	 * @param ignore
	 *            是否忽略
	 * @return 参数栈
	 */
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

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected Object doCreate(Object client, String kind, Map<String, Object> params) throws Exception {
		return null;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected Object doCreateOrReplace(Object client, String kind, Map<String, Object> params) throws Exception {
		return null;
	}

	@Override
	@SuppressWarnings({ "rawtypes" })
	protected Object doScaleTo(Object client, String kind, String namespace, String name, int numbers)
			throws Exception {
		return null;
	}

	@Override
	@SuppressWarnings("rawtypes")
	protected Object doQuery(Object client, String kind, String namespace, String name) throws Exception {
		return null;
	}

	@Override
	@SuppressWarnings("rawtypes")
	protected boolean doDelete(Object client, String kind, String namespace, String name) throws Exception {
		return false;
	}

}
