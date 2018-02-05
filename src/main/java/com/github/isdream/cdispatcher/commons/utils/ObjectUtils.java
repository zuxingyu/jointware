/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.commons.utils;

import java.util.Collection;
import java.util.Map;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class ObjectUtils {

	/**
	 * 判断对象是否为空
	 * 
	 * @param obj 对象
	 * @return 是否为空
	 */
	public static boolean isNull(Object obj) {
		return (obj == null) ? true : false;
	}
	
	/**
	 * @param col 集合
	 * @return 返回是否会空
	 */
	public static boolean isNull(Collection<?> col) {
		return (col == null || col.isEmpty()) ? true : false;
	}
	
	/**
	 * @param col 集合
	 * @return 返回是否会空
	 */
	public static boolean isNull(Map<?,?> map) {
		return (map == null || map.isEmpty()) ? true : false;
	}
}
