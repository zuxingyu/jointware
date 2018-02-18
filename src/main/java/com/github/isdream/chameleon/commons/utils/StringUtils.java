/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.commons.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 *         2018年1月3日
 */
public class StringUtils {

private final static Set<String> primitive = new HashSet<String>();
	
	static {
		primitive.add(String.class.getName());
		primitive.add(Boolean.class.getName());
		primitive.add(Integer.class.getName());
		primitive.add(Long.class.getName());
		primitive.add(Double.class.getName());
		primitive.add(Float.class.getName());
		primitive.add(Byte.class.getName());
		primitive.add("boolean");
		primitive.add("int");
		primitive.add("long");
		primitive.add("double");
		primitive.add("float");
		primitive.add("byte");
	}
	
	/**
	 * @param name 名 字
	 * @return 是否是基本类型
	 */
	public static boolean isPrimitive(String name) {
		return StringUtils.isNull(name) ? false : primitive.contains(name);
	}
	
	/**
	 * Check whether a string is null
	 * 
	 * @param str
	 *            string
	 * @return return true of the string is null. otherwise return false
	 */
	public static boolean isNull(String str) {
		return (str == null || "".equals(str)) ? true : false;
	}
	
	/**
	 * @param name
	 *            名字
	 * @return 是否是Map
	 */
	public static boolean isMap(String name) {
		return StringUtils.isNull(name) ? false : name.startsWith(Map.class.getName());
	}

	/**
	 * @param name
	 *            名字
	 * @return 是否是String，Object类型的Map
	 */
	public static boolean isStringObjectMap(String name) {
		return isMap(name) && !isStringStringMap(name);
	}

	/**
	 * @param name
	 *            名字
	 * @return 是否是String类型的Map
	 */
	public static boolean isStringStringMap(String name) {
		return StringUtils.isNull(name) ? false
				: name.equals(Map.class.getName() + "<" + String.class.getName() + ", " + String.class.getName() + ">");
	}
	
	/**
	 * @param name
	 *            名字
	 * @return 是否是String类型的List
	 */
	public static boolean isStringList(String name) {
		return StringUtils.isNull(name) ? false
				: name.equals(List.class.getName() + "<" + String.class.getName() + ">");
	}


	/**
	 * @param name
	 *            名字
	 * @return 是否是List
	 */
	public static boolean isList(String name) {
		return StringUtils.isNull(name) ? false : name.startsWith(List.class.getName());
	}

	/**
	 * @param name
	 *            名字
	 * @return 是否是Object类型的List
	 */
	public static boolean isObjectList(String name) {
		return isList(name) && !isStringList(name);
	}
	
	/**
	 * @param name
	 *            名字
	 * @return 是否是String类型的Set
	 */
	public static boolean isStringSet(String name) {
		return StringUtils.isNull(name) ? false
				: name.equals(Set.class.getName() + "<" + String.class.getName() + ">");
	}


	/**
	 * @param name
	 *            名字
	 * @return 是否是Set
	 */
	public static boolean isSet(String name) {
		return StringUtils.isNull(name) ? false : name.startsWith(Set.class.getName());
	}

	/**
	 * @param name
	 *            名字
	 * @return 是否是Object类型的Set
	 */
	public static boolean isObjectSet(String name) {
		return isSet(name) && !isStringSet(name);
	}

	/**
	 * @param fullname
	 *            名字
	 * @return Map中对象
	 */
	public static String getClassNameForMapStyle(String fullname) {
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
	public static String getClassNameForListOrSetStyle(String fullname) {
		// List<Object>，需要返回Object的类名
		int start = fullname.indexOf("<");
		int end = fullname.indexOf(">");
		return fullname.substring(start + 1, end);
	}
}
