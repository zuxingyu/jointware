/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.isdream.jointware.core.impl;

import java.lang.reflect.Method;

import com.github.isdream.jointware.core.KindAnalyzer;

/**
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 * 2018年3月2日
 */
public class DefaultKindAnalyzer extends KindAnalyzer {

	@Override
	protected boolean isKind(Method method) {
		return false;
	}

	@Override
	protected boolean isKindGroup(Method method) {
		return false;
	}

	@Override
	protected String toKind(Method method) {
		return null;
	}

	@Override
	protected String getDesc(String parent, Method method) {
		return null;
	}

	@Override
	protected String getClient() {
		return DefaultClient.class.getName();
	}

}
