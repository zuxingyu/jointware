/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

import java.lang.reflect.Method;
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

	protected StringBuffer sb = new StringBuffer();
	
	protected final static String DEFAULT_PARENT = "";
	
	protected final static String DEFAULT_INDENT = "  ";
	
	/**
	 * @param obj target object
	 * @return Key and value
	 * @throws Exception 
	 */
	public String fromModelParameters(Object obj) throws Exception {
		obj = ObjectUtils.isNull(obj) ? new DefaultObject() : obj;
		toKayValue(obj, DEFAULT_PARENT, DEFAULT_INDENT);
		return sb.toString();
	}

	protected void toKayValue(Object obj, String parent, String indent) throws Exception {
		for(Method method : obj.getClass().getMethods()) {
			if (ignore(method)) {
				continue;
			}
			
			String typeName = method.getGenericParameterTypes()[0].getTypeName();
			String key = StringUtils.isNull(parent) ? method.getName() 
												: parent + "-" + method.getName();
			if (JavaObjectRule.isPrimitive(typeName)
					|| StringUtils.isStringList(typeName)
					|| StringUtils.isStringSet(typeName)
					|| StringUtils.isStringStringMap(typeName)) {
				sb.append(indent).append(key + "=" + typeName).append("\n");
			} else if (StringUtils.isObjectList(typeName)
					|| StringUtils.isObjectSet(typeName)) {
				for (int i =0; i<getListOrSetStyleObjects(method).size(); i++) {
					try {
						sb.append(indent).append(key + "-" + i + "=" + typeName).append("\n");
						String classname = StringUtils.getClassNameForListOrSetStyle(typeName);
						toKayValue(Class.forName(classname).newInstance(), DEFAULT_PARENT, indent + DEFAULT_INDENT);
					} catch (Exception e) {
						// ignore here
					}
				}
			} else if (StringUtils.isStringObjectMap(typeName)) {
				for (String extrakey : getStringObjectMapStyleObjects(method).keySet()) {
					sb.append(indent).append(key + "-" + extrakey + "=" + typeName).append("\n");
					String classname = StringUtils.getClassNameForMapStyle(typeName);
					toKayValue(Class.forName(classname).newInstance(), DEFAULT_PARENT, indent + DEFAULT_INDENT);
				}
			} else {
				toKayValue(Class.forName(typeName).newInstance(), method.getName(), indent);
			}
		}
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
