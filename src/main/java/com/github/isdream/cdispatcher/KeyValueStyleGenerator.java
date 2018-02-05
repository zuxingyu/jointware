/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.github.isdream.cdispatcher.commons.rules.JavaObjectRule;
import com.github.isdream.cdispatcher.commons.utils.ObjectUtils;
import com.github.isdream.cdispatcher.commons.utils.StringUtils;
import com.github.isdream.cdispatcher.defaultmodle.DefaultObject;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月31日
 */
public abstract class KeyValueStyleGenerator {

	protected KeyValueStyleObject kvso = new KeyValueStyleObject();
	
	protected final static String DEFAULT_KEY = "";
	
	/**
	 * @param obj target object
	 * @return Key and value
	 * @throws Exception 
	 */
	public Map<String, Map<String, Object>> fromModelParameters(Object obj) throws Exception {
		obj = ObjectUtils.isNull(obj) ? new DefaultObject() : obj;
		toKayValue(obj, KeyValueStyleObject.DEFAULT_KIND, DEFAULT_KEY);
		return kvso.getMap();
	}

	protected void toKayValue(Object obj, String kind, String key) throws Exception {
		for(Method method : obj.getClass().getMethods()) {
			if (ignore(method)) {
				continue;
			}

			kvso.addItem(kind);
			String typeName = getTypeName(method);
			if (JavaObjectRule.isPrimitive(typeName)
					|| StringUtils.isStringList(typeName)
					|| StringUtils.isStringSet(typeName)
					|| StringUtils.isStringStringMap(typeName)) {
				kvso.addItemWithKeyValue(kind, getKey(key, method), typeName);
			} else if (StringUtils.isObjectList(typeName)
					|| StringUtils.isObjectSet(typeName)) {
				List<String> thisValues = new ArrayList<String>();
				kvso.addItemWithKeyValue(kind, getKey(key, method), thisValues);
				for (int i =0; i<getListOrSetStyleObjects(method).size(); i++) {
					try {
						String classname = StringUtils.getClassNameForListOrSetStyle(typeName);
						thisValues.add("ref-" + classname + "-" + i);
						toKayValue(Class.forName(classname).newInstance(), "ref-" + classname + "-" + i, DEFAULT_KEY);
					} catch (Exception e) {
						// ignore here
					}
				}
			} else if (StringUtils.isStringObjectMap(typeName)) {
				for (String extrakey : getStringObjectMapStyleObjects(method).keySet()) {
					kvso.addItemWithKeyValue(kind, getKey(key, method) + "-" + extrakey, 
							"ref-" + getKey(key, method) + "-" + extrakey);
					String classname = StringUtils.getClassNameForMapStyle(typeName);
					toKayValue(Class.forName(classname).newInstance(), 
							"ref-" + getKey(key, method) + "-" + extrakey, DEFAULT_KEY);
				}
			} else {
				try {
					toKayValue(Class.forName(typeName).newInstance(), kind, method.getName());
				} catch (Exception e) {
					//ignore here
				}
			}
		}
	}

	/**
	 * @param key 主键
	 * @param method 方法名
	 * @return 新的主键
	 */
	protected String getKey(String key, Method method) {
		return StringUtils.isNull(key) ? method.getName() 
									: key + "-" + method.getName();
	}

	/**
	 * @param method 方法名
	 * @return 类型
	 */
	protected String getTypeName(Method method) {
		return method.getGenericParameterTypes()[0].getTypeName();
	}

	/**
	 * @param name 方法名
	 * @return 是否不分析
	 */
	protected abstract boolean ignore(Method method);
	
	/**
	 * @param method 方法
	 * @return 对象
	 */
	protected abstract List<Object> getListOrSetStyleObjects(Method method);
	
	/**
	 * @param method 方法
	 * @return 对象
	 */
	protected abstract Map<String, Object> getStringObjectMapStyleObjects(Method method);

}
