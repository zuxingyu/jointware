/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.isdream.chameleon.commons.utils.StringUtils;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class Fabric8Kind2ModelFilterRule {

	private final static Set<String> filters = new HashSet<String>();
	
	static {
		filters.add(String.class.getName());
		filters.add(Boolean.class.getName());
		filters.add(Integer.class.getName());
		filters.add(Long.class.getName());
		filters.add(Double.class.getName());
		filters.add(Float.class.getName());
		filters.add(Byte.class.getName());
		filters.add(Map.class.getName());
		filters.add(List.class.getName());
		filters.add(Set.class.getName());
	}
	
	/**
	 * @param name 名字
	 * @return 是否过滤
	 */
	public static boolean filter(String name) {
		return StringUtils.isNull(name) ? true : filters.contains(name);
	}
}
