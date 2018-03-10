/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.isdream.jointware.core;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.github.isdream.jointware.core.utils.JavaUtils;
import com.github.isdream.jointware.core.utils.ObjectUtils;

/**
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 *         2018年3月5日
 */
public abstract class ModelParameterGenerator {

	/************************************************************************************
	 * 
	 *                             Cores
	 * 
	 ************************************************************************************/
	
	protected final static String JOINTWARE = "jointwareRef";

	protected final static String SET = "set";

	protected final static String DEFAULT_TYPE = "main";

	protected int id = 0;

	/**
	 * 
	 * @param fromObj
	 * @return Json
	 */
	public Map<String, Map<String, Object>> toMap(Object fromObj) {

		if (fromObj == null) {
			throw new NullPointerException();
		}

		return _toMap(fromObj, DEFAULT_TYPE, null);
	}

	protected Map<String, Map<String, Object>> _toMap(Object thisObject, String type, String parent) {
		
		Map<String, Map<String, Object>> json = new LinkedHashMap<String, Map<String, Object>>();
		
		for (Method m : thisObject.getClass().getMethods()) {

			if (JavaUtils.ignoreMethod(m.getName()) 
					|| ignoreMethod(m.getName())) {
				continue;
			}

			Map<String, Object> values = getValue(type, json);

			try {
				Object newObject = m.invoke(thisObject);

				if (ObjectUtils.isNull(newObject)) {
					continue;
				}

				if (JavaUtils.isPrimitive(getTypeName(m)) 
						|| JavaUtils.isStringList(getTypeName(m))
						|| JavaUtils.isStringSet(getTypeName(m)) 
						|| JavaUtils.isStringStringMap(getTypeName(m))) {
					values.put(getRealKey(parent, m.getName()), newObject);
				} else if (JavaUtils.isObjectList(getTypeName(m)) 
						|| JavaUtils.isObjectSet(getTypeName(m))) {
					Collection<?> objects = (Collection<?>) newObject;
					
					if (ObjectUtils.isNull(objects) || objects.isEmpty()) {
						continue;
					}
					
					List<String> list = new ArrayList<String>();
					values.put(getRealKey(parent, m.getName()), list);
					for (Object obj : objects) {
						list.add(getNewValue(++id, obj.getClass().getName()));
						json.putAll(_toMap(obj, getNewValue(id, obj.getClass().getName()), null));
					}
				} else if (JavaUtils.isStringObjectMap(getTypeName(m))) {
					@SuppressWarnings("unchecked")
					Map<String, Object> objects = (Map<String, Object>) newObject;
					
					if (ObjectUtils.isNull(objects) || objects.isEmpty()) {
						continue;
					}
					
					List<String> list = new ArrayList<String>();
					values.put(getRealKey(parent, m.getName()), list);
					for (String key : objects.keySet()) {
						list.add(getRealType(++id, key, objects.get(key).getClass().getName()));
						json.putAll(_toMap(objects.get(key),
										getRealType(id, key, 
												objects.get(key).getClass().getName()), null));
					}
				} else {
					if (parent == null) {
						json.putAll(_toMap(newObject, type, getRealName(m.getName())));
					} else {
						json.putAll(_toMap(newObject, type, parent + "-" + getRealName(m.getName())));
					}
				}
			} catch (Exception e) {
				// ignore here
			}
		}
		
		return json;
	}

	/**
	 * @param type
	 * @param json
	 * @return
	 */
	protected Map<String, Object> getValue(String type, Map<String, Map<String, Object>> json) {
		Map<String, Object> content = json.get(type);
		if (content == null) {
			content = new LinkedHashMap<String, Object>();
			json.put(type, content);
		}
		return content;
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
	private String getNewValue(int id, String name) {
		return getObjectRef() + id + "-" + name;
	}

	private String getRealType(int id, String key, String name) {
		return getObjectRef() + id + "-" + key + "-" + name;
	}

	/**
	 * @param prefix
	 * @param name
	 * @return
	 */
	private String getRealKey(String prefix, String name) {
		return (prefix == null) ? getRealName(name) : prefix + "-" + getRealName(name);
	}

	private String getRealName(String name) {
		return SET + name.substring(SET.length());
	}

	/**
	 * @param map
	 * @return
	 */
	public String toJson(Map<String, Map<String, Object>> map) {
		return JSON.toJSONString(map);
	}


	/************************************************************************************
	 * 
	 *                   You should implement it by yourself
	 * 
	 ************************************************************************************/
	
	/**
	 * @param name
	 *            名字
	 * @return 是否过滤
	 */
	public abstract boolean ignoreMethod(String name);

	public abstract String getObjectRef();
}
