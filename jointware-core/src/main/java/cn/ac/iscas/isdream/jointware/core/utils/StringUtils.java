/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package cn.ac.iscas.isdream.jointware.core.utils;

/**
 * The {@code StringUtils} class provides some common String processing functions.
 * <p>
 * 
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 * 2018年3月2日
 */
public class StringUtils {
	
	/**
	 * Check whether a string is null
	 * 
	 * @param str string
	 * @return return true of the string is null, otherwise return false
	 */
	public static boolean isNull(String str) {
		return (str == null || "".equals(str)) ? true : false;
	}
	
}
