/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.defaultimpl;

import java.lang.reflect.Method;

import com.github.isdream.chameleon.KindsAnalyzer;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 * 2018年1月3日
 */
public class DefaultKindsAnalyzer extends KindsAnalyzer {

	private static DefaultKindsAnalyzer analyzer = null;
	
	protected DefaultKindsAnalyzer() throws Exception {
		super();
	}

	@Override
	protected boolean isKind(Method method) {
		return false;
	}

	@Override
	protected boolean isKindGroup(Method method) {
		return false;
	}

	@Override
	protected String toKind(String name) {
		return "";
	}

	@Override
	protected String getDesc(String parent, String name) {
		return "";
	}

	@Override
	protected String getClient() {
		return "";
	}
	
	/** 
	 * @return 单例模式
	 */
	public static KindsAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new DefaultKindsAnalyzer();
			} catch (Exception e) {
				// ignore here
			}
		}
		return analyzer;
	}

}
