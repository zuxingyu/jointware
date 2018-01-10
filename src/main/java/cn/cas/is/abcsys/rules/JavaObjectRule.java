/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys.rules;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.cas.is.abcsys.utils.StringUtils;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
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
	}
	
	public static boolean isPrimitive(String name) {
		return StringUtils.isNull(name) ? false : primitive.contains(name);
	}
	
	public static boolean isMap(String name) {
		return StringUtils.isNull(name) ? false : name.startsWith(Map.class.getName());
	}
	
	public static boolean isStringList(String name) {
		return StringUtils.isNull(name) ? false : name.equals(List.class.getName() + "<" + String.class.getName() + ">");
	}
	
	public static boolean isStringMap(String name) {
		return StringUtils.isNull(name) ? false : name.equals(Map.class.getName() + 
								"<" + String.class.getName() + ", " + String.class.getName() +">");
	}
	
	public static boolean isList(String name) {
		return StringUtils.isNull(name) ? false : name.startsWith(List.class.getName());
	}
}
