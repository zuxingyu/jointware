/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.github.isdream.chameleon.commons.utils.ObjectUtils;
import com.github.isdream.chameleon.commons.utils.StringUtils;


/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月4日
 */
public class KeyValueStyleObject {

	public final static String DEFAULT_KIND = "main";
	
	/**
	 * Here, Object should be primitive, List<String> or Map<String, String>
	 * 
	 * List<Object> and Map<String, Object> would be a new key 
	 */
	protected Map<String, Map<String, Object>> map = new LinkedHashMap<String, Map<String, Object>>();

	/**
	 * @return 所有Key,value信息
	 */
	public Map<String, Map<String, Object>> getMap() {
		return map;
	}

	/**
	 * @param map 设置Map信息
	 */
	public void setMap(Map<String, Map<String, Object>> map) {
		this.map = map;
	}
	
	/**
	 * @param kind 类型，默认为main
	 * @param key  key数值
	 * @param value value should be primitive, List<String> or Map<String, String>
	 * @throws Exception 
	 */
	public void addItemWithKeyValue(String kind, String key, Object value) throws Exception {
		if (StringUtils.isNull(kind) 
				|| StringUtils.isNull(key)
				|| ObjectUtils.isNull(value)) {
			return;
		}
		
		String classname = value.getClass().getTypeName();
		
		if (StringUtils.isObjectList(classname) 
				|| StringUtils.isObjectSet(classname)
				|| StringUtils.isStringObjectMap(classname)) {
			throw new Exception("value should be primitive, List<String> or Map<String, String>");
		}
		
		Map<String, Object> keyValues = (map.get(kind) == null) 
					? new HashMap<String, Object>() : map.get(kind);
		keyValues.put(key, value);
	}
	
	
	public void addItem(String kind) throws Exception {
		if (StringUtils.isNull(kind)) {
			throw new Exception("kind is null.");
		}
		
		if (map.containsKey(kind)) {
			return;
		}
		
		map.put(kind, new HashMap<String, Object>());
		
	}
	
	/**
	 * @param kind 删除的类型
	 * @return 被删除的对象，如果不存在，则返回null
	 */
	public Map<String, Object> removeItem(String kind) {
		if (DEFAULT_KIND.equals(kind) 
				|| StringUtils.isNull(kind)) {
		    return null;
		}
		return map.remove(kind);
	}
	
	/**
	 * @param kind 类型
	 * @param key 主键
	 * @return 返回对象
	 */
	public Object removeItem(String kind, String key) {
		if (StringUtils.isNull(kind)
				|| StringUtils.isNull(key)) {
			return null;
		}
		
		Map<String, Object> subMap = map.get(kind);
		return (subMap == null) ? null : subMap.get(key);
	}
}
