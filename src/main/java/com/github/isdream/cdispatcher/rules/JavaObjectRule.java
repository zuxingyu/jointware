/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.rules;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.isdream.cdispatcher.utils.StringUtils;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 * 
 * 记录单词转换的规则
 */
public class JavaObjectRule {

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
	 * @param name 名字
	 * @return 是否是Map
	 */
	public static boolean isMap(String name) {
		return StringUtils.isNull(name) ? false : name.startsWith(Map.class.getName());
	}
	
	/**
	 * @param name 名字
	 * @return 是否是String类型的List
	 */
	public static boolean isStringList(String name) {
		return StringUtils.isNull(name) ? false : name.equals(List.class.getName() + "<" + String.class.getName() + ">");
	}
	
	/**
	 * @param name 名字
	 * @return 是否是String，Object类型的Map
	 */
	public static boolean isObjectMap(String name) {
		return isMap(name) && !isStringMap(name);
	}
	
	/**
	 * @param name 名字
	 * @return 是否是String类型的Map
	 */
	public static boolean isStringMap(String name) {
		return StringUtils.isNull(name) ? false : name.equals(Map.class.getName() + 
								"<" + String.class.getName() + ", " + String.class.getName() +">");
	}
	
	/**
	 * @param name 名字
	 * @return 是否是List
	 */
	public static boolean isList(String name) {
		return StringUtils.isNull(name) ? false : name.startsWith(List.class.getName());
	}
	
	/**
	 * @param name 名字
	 * @return 是否是Object类型的List
	 */
	public static boolean isObjectList(String name) {
		return isList(name) && !isStringList(name);
	}
}
