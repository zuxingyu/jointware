/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.isdream.jointware.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.github.isdream.jointware.core.utils.JavaUtils;
import com.github.isdream.jointware.core.utils.ObjectUtils;

/**
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 * 2018年3月6日
 */
public abstract class ModelGenerator {

	/**
	 * 
	 */
	public final static String GET_METHOD = "get";
	
	/**
	 * 
	 */
	public final static String SET_METHOD = "set";
	
	
	/**
	 * 
	 */
	public final static String DEFAULT_PARENT = "default";
	
	/**
	 * 
	 */
	public final static String DEFAULT_TYPE = "default";
	
	/**
	 * 
	 */
	public final Map<String, Object> objCache = new HashMap<String, Object>();
	
	/**
	 * @return ModelParameter
	 */
	public abstract ModelParameterAnalyzer getModelParameter();
	
	
	/**
	 * 
	 */
	public Map<String, String> params = null;

	/**
	 * @param inputValues
	 * @param kind
	 * @return
	 * @throws Exception 
	 */
	public Object toObject(Map<String, Map<String, Object>> inputValues, 
									String kind) throws Exception {
		
		if (ObjectUtils.isNull(inputValues) || ObjectUtils.isNull(kind)) {
			return null;
		}
		
		params = getModelParameter().getModelParameters(kind);
		objCache.put(DEFAULT_TYPE, getKindObject(kind));
//		params.put(DEFAULT_TYPE, params.get);
		_toObject(inputValues, objCache.get(DEFAULT_TYPE), DEFAULT_PARENT, ModelParameterGenerator.DEFAULT_TYPE);
		return objCache.get(DEFAULT_TYPE);
	}

	@SuppressWarnings("unchecked")
	protected void _toObject(Map<String, Map<String, Object>> inputValues, Object object, String parent, String type)
			throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException,
			InstantiationException {
		
		Map<String, Object> typeValues = inputValues.get(type);
		
		for (String key : typeValues.keySet()) {
			Stack<String> stack = getStack(key);
			while (stack.size() > 1) {
				String fullname = stack.pop();
				int idx = fullname.lastIndexOf("-");
				String mname = (idx == -1) ? fullname : fullname.substring(idx + 1);
				if (objCache.get(getRealFullname(parent, fullname)) == null) {
					Class<?> clazz = objCache.get(getParent(type, 
							getRealFullname(parent, fullname))).getClass();
					System.out.println(getRealFullname(parent, fullname));
					Method method = clazz.getMethod(mname, Class.forName(
							params.get(getRealFullname(parent, fullname))));
					Object newInstance = Class.forName(params.get(
							getRealFullname(parent, fullname))).newInstance();
					method.invoke(objCache.get(getParent(type, 
							getRealFullname(parent, fullname))), 
									newInstance);
					objCache.put(getRealFullname(parent, fullname), newInstance);
				}
			}
			
			String fullname = stack.pop();
			int idx = fullname.indexOf("-");
			String thisKey = getRealKey(parent, fullname, idx);
			String thisMethod = (idx == -1) ? fullname : fullname.substring(idx + 1);
			if (JavaUtils.isPrimitive(params.get(getRealFullname(parent, fullname)))) {
				Object obj = objCache.get(thisKey);
				Method method = obj.getClass().getMethod(
						thisMethod, Class.forName(params.get(getRealFullname(parent, fullname))));
				method.invoke(obj, typeValues.get(fullname));
			} else if (JavaUtils.isList(params.get(getRealFullname(parent, fullname)))
					|| JavaUtils.isSet(params.get(getRealFullname(parent, fullname)))) {
				
				Collection<String> thisValues = (Collection<String>)typeValues.get(fullname);
				if (thisValues == null || thisValues.isEmpty()) {
					continue;
				}

				Object obj = objCache.get(thisKey);
				Method method = obj.getClass().getMethod(thisMethod, List.class);
				if (thisValues.iterator().next()
						.startsWith(ModelParameterGenerator.JOINTWARE)) {
					_toObject(inputValues, 
							object, 
							DEFAULT_PARENT, 
							ModelParameterGenerator.DEFAULT_TYPE);
				} else {
					thisValues.addAll((Collection<String>)typeValues.get(fullname));
					method.invoke(obj, thisValues);
				}
			} else if (JavaUtils.isMap(params.get(getRealFullname(parent, fullname)))) {
				Object obj = objCache.get(thisKey);
				Method method = obj.getClass().getMethod(thisMethod, Map.class);
				Map<String, String> thisValue = new HashMap<String, String>();
				thisValue.putAll((Map<String, String>)typeValues.get(fullname));
				method.invoke(obj, thisValue);
			} else {
				throw new UnsupportedOperationException();
			}
		}
	}

	protected String getName(String name) {
		return GET_METHOD + name.substring(SET_METHOD.length());
	}

	protected String getRealKey(String parent, String fullname, int idx) {
		String realKey = (idx == -1) ? fullname : fullname.substring(0, idx);
		return parent.equals(DEFAULT_PARENT) ? realKey : parent + "-" + realKey;
	}

	
	protected String getRealFullname(String parent, String fullname) {
		return (parent.equals(DEFAULT_PARENT)) ? fullname : parent + "-" + fullname;
	}
	
	protected String getParent(String type, String fullname) {
		int idx = fullname.indexOf("-");
		return (idx == -1) 
				? (type.equals("main")) ? 
						DEFAULT_TYPE : fullname 
							: fullname.substring(0, idx);
	}
	
	protected Stack<String> getStack(String key) {
		String elem = key;
		Stack<String> stack = new Stack<String>();
		stack.push(elem);
		int idx = elem.lastIndexOf("-");
		while (idx != -1) {
			elem = elem.substring(0, idx);
			stack.push(elem);
			idx = elem.lastIndexOf("-");
		}
		return stack;
	}

//	protected void instantiated()
	
	/**
	 * @param kind 
	 * @return
	 */
	protected Object getKindObject(String kind) {
		try {
			return Class.forName(
					getModelParameter()
							.getKindModels().get(kind))
									.newInstance();
		} catch (Exception e) {
			return new Object();
		}
	}
	
}
