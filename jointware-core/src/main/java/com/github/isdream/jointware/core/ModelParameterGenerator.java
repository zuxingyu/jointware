/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.isdream.jointware.core;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.github.isdream.jointware.core.utils.JavaUtils;


/**
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 *         2018年3月5日
 */
public abstract class ModelParameterGenerator {

	/**
	 * 
	 * @param fromObj
	 * @return Json
	 */
	public Map<String, Map<String, Object>> ToNestedStyle(Object fromObj) {
		Map<String, Map<String, Object>> json = new LinkedHashMap<String, Map<String, Object>>();
		if (fromObj == null) {
			return json;
		}

		_ToNestedStyle(fromObj, 0, "main", null, json);
		return json;
	}
	
	
	/**
	 * @param thisObject
	 * @param id
	 * @param type
	 * @param prefix
	 * @param json
	 */
	protected void _ToNestedStyle(Object thisObject,
										int id, String type, String prefix,
										Map<String, Map<String, Object>> json) {
		for (Method m : thisObject.getClass().getMethods()) {
			
			if (JavaUtils.ignoreMethod(m.getName())
					|| ignoreMethod(m.getName())) {
				continue;
			}
			
			Map<String, Object> content = json.get(type);
			
			if (content == null) {
				content = new LinkedHashMap<String, Object>();
				json.put(type, content);
			}
			
			try {
				Object newObject =  m.invoke(thisObject);
				if (newObject == null) {
					continue;
				}
				
				if (m.getName().equals("getFinalizers")) {
					System.out.println("setMetadata-setFinalizers");
				}
				
				if (JavaUtils.isPrimitive(getTypeName(m))
						|| JavaUtils.isStringList(getTypeName(m))
						|| JavaUtils.isStringSet(getTypeName(m))
						|| JavaUtils.isStringStringMap(getTypeName(m))) {
					content.put(getRealKey(prefix, m.getName()), newObject);
				} else if (JavaUtils.isObjectList(getTypeName(m))
						|| JavaUtils.isObjectSet(getTypeName(m))) {
					Collection<?> objects = (Collection<?>) newObject;
					for (Object obj : objects) {
						content.put(getRealKey(prefix, m.getName()), 
								getRealType(++id, obj.getClass().getName()));
						_ToNestedStyle(obj,
								id, 
								getRealType(id, obj.getClass().getName()), 
								null,
								json);
					}
				} else if (JavaUtils.isStringObjectMap(getTypeName(m))) {
					@SuppressWarnings("unchecked")
					Map<String, Object> objects = (Map<String, Object>) newObject;
					for (String key : objects.keySet()) {
						content.put(getRealKey(prefix, m.getName() + key), 
								getRealType(++id, objects.get(key).getClass().getName()));
						_ToNestedStyle(objects.get(key),
								id, 
								getRealType(id, objects.get(key).getClass().getName()), 
								null,
								json);
					}
				} else {
					_ToNestedStyle(newObject,
							id, 
							type, 
							getRealName(m.getName()),
							json);
				}
			} catch (Exception e) {
				continue;
			}
		}
	}


	/**
	 * @param m
	 * @return
	 */
	protected String getTypeName(Method m) {
		return m.getGenericReturnType().getTypeName();
	}

	
	/**
	 * @param id
	 * @param name
	 * @return
	 */
	private String getRealType(int id, String name) {
		return "ref" + id + "-" + JavaUtils.getClassNameForListOrSetStyle(name);
	}
	
	/**
	 * @param prefix
	 * @param name
	 * @return
	 */
	private String getRealKey(String prefix, String name) {
		return (prefix == null) ? getRealName(name) 
							: prefix + "-" + getRealName(name);
	}
	
	
	private String getRealName(String name) {
		return "set" + name.substring("set".length());
	}
	/********************************************************
	 * 
	 * 
	 * 
	 ********************************************************/
	
	/**
	 * @param fromObj
	 * @return
	 */
	public String toJavaCode(Object fromObj) {
		StringBuffer sb = new StringBuffer();
		return sb.toString();
	}
	
	public String toJson(Map<String, Map<String, Object>> map) {
		return JSON.toJSONString(map);
	}
	
	/********************************************************
	 * 
	 * 
	 * 
	 ********************************************************/
	/**
	 * @param name 名字
	 * @return 是否过滤
	 */
	public abstract boolean ignoreMethod(String name);
	
}
