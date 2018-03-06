/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.isdream.jointware.core.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *  The {@code StringUtils} class provides some common functions.
 * <p>
 * 
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 * 2018年3月2日
 */
public class JavaUtils {

	/**
	 * primitive type in Java
	 */
	protected final static Set<String> primitive = new HashSet<String>();
	
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
	 * @param name classname
	 * @return return true if the classname in Set named primitive, otherwise return false
	 */
	public static boolean isPrimitive(String name) {
		return StringUtils.isNull(name) ? false : primitive.contains(name);
	}
	
	/**
	 * @param name classname
	 * @return return true if the classname is starts with java.util.Map, otherwise return false
	 */
	public static boolean isMap(String name) {
		return StringUtils.isNull(name) ? false : name.startsWith(Map.class.getName());
	}

	/**
	 * @param name classname
	 * @return 是否是String，Object类型的Map
	 */
	public static boolean isStringObjectMap(String name) {
		return isMap(name) && !isStringStringMap(name);
	}

	/**
	 * @param name
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
		int start = fullname.indexOf("<");
		int end = fullname.indexOf(">");
		return fullname.substring(start + 1, end);
	}
	
	/*********************************************************************
	 * 
	 *********************************************************************/
	
	protected final static Set<String> ignoreMethods = new HashSet<String>();
	
	static {
		ignoreMethods.add("setResult");
		ignoreMethods.add("setApiVersion");
		ignoreMethods.add("setKind");
		ignoreMethods.add("setPaused");
		ignoreMethods.add("setInitContainers");
		ignoreMethods.add("setUid");
		ignoreMethods.add("setSelfLink");
		ignoreMethods.add("setCreationTimestamp");
		ignoreMethods.add("setMetadatasetClasssetModifiers");
		ignoreMethods.add("getApiVersion");
		ignoreMethods.add("getKind");
		
		ignoreMethods.add("getProtectionDomain");
		ignoreMethods.add("getModifiers");
		ignoreMethods.add("getSuperclass");
		ignoreMethods.add("getComponentType");
		ignoreMethods.add("getAnnotatedInterfaces");
		ignoreMethods.add("getAnnotatedSuperclass");
		ignoreMethods.add("getCanonicalName");
		ignoreMethods.add("getClassLoader");
		ignoreMethods.add("getClasses");
		ignoreMethods.add("getConstructors");
		ignoreMethods.add("getDeclaredAnnotations");
		ignoreMethods.add("getDeclaredClasses");
		ignoreMethods.add("getDeclaredConstructors");
		ignoreMethods.add("getDeclaredFields");
		ignoreMethods.add("getDeclaredMethods");
		ignoreMethods.add("getDeclaringClass");
		ignoreMethods.add("getEnclosingClass");
		ignoreMethods.add("getEnclosingConstructor");
		ignoreMethods.add("getEnclosingMethod");
		ignoreMethods.add("getEnumConstants");
		ignoreMethods.add("getFields");
		ignoreMethods.add("getGenericInterfaces");
		ignoreMethods.add("getGenericSuperclass");
		ignoreMethods.add("getInterfaces");
		ignoreMethods.add("getMethods");
		ignoreMethods.add("getPackage");
		ignoreMethods.add("getSigners");
		ignoreMethods.add("getSimpleName");
		ignoreMethods.add("getTypeName");
		ignoreMethods.add("getTypeParameters");
		ignoreMethods.add("getClass");
		ignoreMethods.add("getBytes");
	}
	
	/**
	 * @param name 名字
	 * @return 是否过滤
	 */
	public static boolean ignoreMethod(String name) {
		return StringUtils.isNull(name) ? true : ignoreMethods.contains(name);
	}
}
