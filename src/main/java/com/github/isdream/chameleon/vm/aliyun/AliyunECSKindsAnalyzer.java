/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.vm.aliyun;

import java.lang.reflect.Method;

import com.github.isdream.chameleon.KindsAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月19日
 */
public class AliyunECSKindsAnalyzer extends KindsAnalyzer {

	@Override
	protected boolean isKind(Method method) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean isKindGroup(Method method) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected String toKind(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getDesc(String parent, String name) {
		return null;
	}

	@Override
	protected String getClient() {
		return null;
	}

}
