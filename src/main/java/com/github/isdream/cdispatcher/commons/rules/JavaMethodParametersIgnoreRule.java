/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.commons.rules;

import java.util.HashSet;
import java.util.Set;

import com.github.isdream.cdispatcher.commons.utils.StringUtils;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class JavaMethodParametersIgnoreRule {

	private final static Set<String> ignores = new HashSet<String>();
	
	static {
		ignores.add("getProtectionDomain");
		ignores.add("getModifiers");
		ignores.add("getSuperclass");
		ignores.add("getComponentType");
		ignores.add("getAnnotatedInterfaces");
		ignores.add("getAnnotatedSuperclass");
		ignores.add("getCanonicalName");
		ignores.add("getClassLoader");
		ignores.add("getClasses");
		ignores.add("getConstructors");
		ignores.add("getDeclaredAnnotations");
		ignores.add("getDeclaredClasses");
		ignores.add("getDeclaredConstructors");
		ignores.add("getDeclaredFields");
		ignores.add("getDeclaredMethods");
		ignores.add("getDeclaringClass");
		ignores.add("getEnclosingClass");
		ignores.add("getEnclosingConstructor");
		ignores.add("getEnclosingMethod");
		ignores.add("getEnumConstants");
		ignores.add("getFields");
		ignores.add("getGenericInterfaces");
		ignores.add("getGenericSuperclass");
		ignores.add("getInterfaces");
		ignores.add("getMethods");
		ignores.add("getPackage");
		ignores.add("getSigners");
		ignores.add("getSimpleName");
		ignores.add("getTypeName");
		ignores.add("getTypeParameters");
		ignores.add("getClass");
		ignores.add("getBytes");
	}
	
	/**
	 * @param name 名字
	 * @return 是否过滤
	 */
	public static boolean ignore(String name) {
		return StringUtils.isNull(name) ? true : ignores.contains(name);
	}
}
