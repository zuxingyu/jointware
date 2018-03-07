/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.isdream.jointware.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
	public final static String DEFAULT_PARENT = "default";
	
	/**
	 * @return ModelParameter
	 */
	public abstract ModelParameterAnalyzer getModelParameter();
	
	
	/**
	 * 
	 */
	public Map<String, Object> objCache = new HashMap<String, Object>();
	
	
	/**
	 * 
	 */
	public Map<String, String> params = null;

	/**
	 * @param map
	 * @param kind
	 * @return
	 * @throws Exception 
	 */
	public Object toObject(Map<String, Map<String, Object>> map, 
									String kind) throws Exception {
		
		if (ObjectUtils.isNull(map) || ObjectUtils.isNull(kind)) {
			return null;
		}
		
		params = getModelParameter().getModelParameters(kind);
		Object thisObj = getKindObject(kind);
		objCache.put(DEFAULT_PARENT, thisObj);
		Map<String, Object> values = map.get(ModelParameterGenerator.DEFAULT_TYPE);
		for (String key : values.keySet()) {
			Stack<String> stack = getStack(key);
			while (stack.size() > 1) {
				String fullname = stack.pop();
				int idx = fullname.indexOf("-");
				String mname = (idx == -1) ? fullname : fullname.substring(0, idx);
				if (objCache.get(fullname) == null) {
					Method method = thisObj.getClass()
							.getMethod(mname, Class.forName(params.get(fullname)));
					Object newObject = method.invoke(thisObj);
					objCache.put(fullname, newObject);
				}
			}
			
			String fullname = stack.pop();
			int idx = fullname.indexOf("-");
			String realKey = (idx == -1) ? fullname : fullname.substring(0, idx);
			String realMethod = (idx == -1) ? fullname : fullname.substring(idx + 1);
			if (JavaUtils.isPrimitive(params.get(realKey))) {
				Object obj = objCache.get(realKey);
				Method method = obj.getClass().getMethod(realMethod, Class.forName(params.get(realKey)));
				method.invoke(obj);
			} else if (JavaUtils.isStringList(params.get(realKey))) {
				Object obj = objCache.get(realKey);
				Method method = obj.getClass().getMethod(realMethod, List.class);
				method.invoke(obj);
			} else if (JavaUtils.isStringSet(params.get(realKey))) {
				Object obj = objCache.get(realKey);
				Method method = obj.getClass().getMethod(realMethod, Set.class);
				method.invoke(obj);
			} else if (JavaUtils.isStringStringMap(params.get(realKey))) {
				Object obj = objCache.get(realKey);
				Method method = obj.getClass().getMethod(realMethod, Map.class);
				method.invoke(obj);
			} else if (JavaUtils.isObjectList(params.get(realKey))) {
				
			} else if (JavaUtils.isObjectSet(params.get(realKey))) {
				
			} else if (JavaUtils.isStringObjectMap(params.get(realKey))) {
				
			}
		}
		
		return objCache.get(DEFAULT_PARENT);
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
