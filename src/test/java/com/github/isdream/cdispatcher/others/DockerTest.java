/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.others;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 2018-1-27
 */
public class DockerTest {

	final static String dockerUrl = "http://118.190.46.58:12375";
	
	private final static Set<String> cfilters = new HashSet<String>();
	
	private final static Set<String> mfilters = new HashSet<String>();
	
	static {
		cfilters.add(String.class.getName());
		cfilters.add(Boolean.class.getName());
		cfilters.add(Integer.class.getName());
		cfilters.add(Long.class.getName());
		cfilters.add(Double.class.getName());
		cfilters.add(Float.class.getName());
		cfilters.add(Byte.class.getName());
		cfilters.add(Map.class.getName());
		cfilters.add(List.class.getName());
		cfilters.add(Set.class.getName());
		cfilters.add(Void.class.getName());
	}
	
	static {
		mfilters.add("getProtectionDomain");
		mfilters.add("getModifiers");
		mfilters.add("getSuperclass");
		mfilters.add("getComponentType");
		mfilters.add("getAnnotatedInterfaces");
		mfilters.add("getAnnotatedSuperclass");
		mfilters.add("getCanonicalName");
		mfilters.add("getClassLoader");
		mfilters.add("getClasses");
		mfilters.add("getConstructors");
		mfilters.add("getDeclaredAnnotations");
		mfilters.add("getDeclaredClasses");
		mfilters.add("getDeclaredConstructors");
		mfilters.add("getDeclaredFields");
		mfilters.add("getDeclaredMethods");
		mfilters.add("getDeclaringClass");
		mfilters.add("getEnclosingClass");
		mfilters.add("getEnclosingConstructor");
		mfilters.add("getEnclosingMethod");
		mfilters.add("getEnumConstants");
		mfilters.add("getFields");
		mfilters.add("getGenericInterfaces");
		mfilters.add("getGenericSuperclass");
		mfilters.add("getInterfaces");
		mfilters.add("getMethods");
		mfilters.add("getPackage");
		mfilters.add("getSigners");
		mfilters.add("getSimpleName");
		mfilters.add("getTypeName");
		mfilters.add("getTypeParameters");
		mfilters.add("getClass");
		mfilters.add("getBytes");
		mfilters.add("wait");
		mfilters.add("hashCode");
		mfilters.add("notify");
		mfilters.add("notifyAll");
		mfilters.add("close");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}


}
