/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.vm.aliyun;

import java.lang.reflect.Method;

import com.github.isdream.chameleon.KindsAnalyzer;
import com.github.isdream.chameleon.commons.utils.ObjectUtils;
import com.github.isdream.chameleon.commons.utils.StringUtils;
import com.github.isdream.chameleon.vm.aliyun.adapters.DefaultAcsClient;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月19日
 */
public class AliyunECSKindsAnalyzer extends KindsAnalyzer {

	protected final static String SUFFIX = "Request";
	
	protected final static String STARTWITH = "proxy";
	
	@Override
	protected boolean isKind(Method method) {
		return  ObjectUtils.isNull(method) ? false :
			(method.getParameterCount() == 0
			&& method.getName().startsWith(STARTWITH)
			&& method.getName().endsWith(SUFFIX));
	}

	@Override
	protected boolean isKindGroup(Method method) {
		return false;
	}

	@Override
	protected String toKind(Method method) {
		return StringUtils.isNull(method.getName()) ? null 
				: method.getName().substring(STARTWITH.length(), 
						method.getName().length() - SUFFIX.length());
	}


	@Override
	protected String getDesc(String parent, Method method) {
		return toKind(method);
	}

	@Override
	protected String getClient() {
		return DefaultAcsClient.class.getName();
	}

}
