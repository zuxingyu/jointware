/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

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
		toKeyValue(obj, KeyValueStyleObject.DEFAULT_KIND, DEFAULT_KEY);
		return kvso.getMap();
	}

	protected void toKeyValue(Object obj, String kind, String key) throws Exception {
		for(Method method : obj.getClass().getMethods()) {
			if (ignore(obj, method)) {
				continue;
			}

			kvso.addItem(kind);
			String thisTypeName = getTypeName(method);
			if (StringUtils.isPrimitive(thisTypeName)) {
				try {
					kvso.addItemWithKeyValue(kind, 
							getRealKey(key, method), getValue(obj, method));
				} catch (Exception e) {
					// ignore here
				}
			} else if (StringUtils.isStringList(thisTypeName)
						|| StringUtils.isStringSet(thisTypeName)) {
				try {
					Collection<?> value = (Collection<?>) getValue(obj, method);
					if (ObjectUtils.isNull(value)) {
						continue;
					}
					kvso.addItemWithKeyValue(kind, 
							getRealKey(key, method), value);
				} catch (Exception e) {
					// ignore here
				}
			} else if (StringUtils.isStringStringMap(thisTypeName)) {
				try {
					Map<?, ?> value = (Map<?, ?>) getValue(obj, method);
					if (ObjectUtils.isNull(value)) {
						continue;
					}
					kvso.addItemWithKeyValue(kind, 
							getRealKey(key, method), value);
				} catch (Exception e) {
					// ignore here
				}
			} else if (StringUtils.isObjectList(thisTypeName)
					|| StringUtils.isObjectSet(thisTypeName)) {
				List<String> newValues = new ArrayList<String>();
				Collection<Object> objects = getListOrSetStyleObjects(obj, method);
				for (int i =0; i<objects.toArray().length; i++) {
					try {
						String classname = StringUtils.getClassNameForListOrSetStyle(thisTypeName);
						newValues.add("ref-" + classname + "-" + i);
						toKeyValue(objects.toArray()[i], "ref-" + classname + "-" + i, DEFAULT_KEY);
					} catch (Exception e) {
						// ignore here
					}
				}
				if (!ObjectUtils.isNull(objects)) {
					kvso.addItemWithKeyValue(kind, getRealKey(key, method), newValues);
				}
			} else if (StringUtils.isStringObjectMap(thisTypeName)) {
				Map<String, Object> objects = getStringObjectMapStyleObjects(obj, method);
				for (String extrakey : objects.keySet()) {
					try {
						kvso.addItemWithKeyValue(kind, getRealKey(key, method) + "-" + extrakey, 
								"ref-" + getRealKey(key, method) + "-" + extrakey);
						toKeyValue(objects.get(extrakey), 
								"ref-" + getRealKey(key, method) + "-" + extrakey, DEFAULT_KEY);
					} catch (Exception e) {
						// ignore here
					}
					
				}
				
			} else {
				try {
					toKeyValue(getTarget(obj, method), kind, getRealParent(method));
				} catch (Exception e) {
					//ignore here
				}
			}
		}
	}

	/**
	 * @param method 方法名
	 * @return 真实的方法名
	 */
	protected abstract String getRealParent(Method method);

	
	/**
	 * @param obj 对象
	 * @param method 方法名
	 * @return 对象调用方法后对象
	 */
	protected abstract Object getTarget(Object obj, Method method) throws Exception;
	/**
	 * @param obj 对象
	 * @param method 方法
	 * @return 数值
	 */
	protected abstract Object getValue(Object obj, Method method);

	/**
	 * @param key 主键
	 * @param method 方法名
	 * @return 新的主键
	 */
	protected abstract String getRealKey(String key, Method method);

	/**
	 * @param method 方法名
	 * @return 类型
	 */
	protected abstract String getTypeName(Method method);

	/**
	 * @param name 方法名
	 * @return 是否不分析
	 */
	protected abstract boolean ignore(Object obj, Method method);
	
	/**
	 * @param method 方法
	 * @return 对象
	 */
	protected abstract Collection<Object> getListOrSetStyleObjects(Object obj, Method method);
	
	/**
	 * @param method 方法
	 * @return 对象
	 */
	protected abstract Map<String, Object> getStringObjectMapStyleObjects(Object obj, Method method);

}
