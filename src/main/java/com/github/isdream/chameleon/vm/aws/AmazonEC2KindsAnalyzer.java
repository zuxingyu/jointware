/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.vm.aws;

import java.lang.reflect.Method;

import com.amazonaws.services.ec2.AmazonEC2Client;
import com.github.isdream.chameleon.KindsAnalyzer;
import com.github.isdream.chameleon.commons.utils.ObjectUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月19日
 */
public class AmazonEC2KindsAnalyzer extends KindsAnalyzer {
	
	protected final static String SUFFIX = "Request";
	
	protected final static String PREFIX = "describe";
	
	@Override
	protected boolean isKind(Method method) {
		return  ObjectUtils.isNull(method) ? false :
			(method.getParameterCount() == 0)
			&& method.getName().startsWith(PREFIX)
			? true : (method.getParameterCount() == 1
			&& method.getParameterTypes()[0].getSimpleName().endsWith(SUFFIX));
	}

	@Override
	protected boolean isKindGroup(Method method) {
		return false;
	}

	@Override
	protected String toKind(Method method) {
		if ((method.getParameterCount() == 0)
			&& method.getName().startsWith(PREFIX)) {
			String fullname = method.getName();
			return fullname.substring(0, 1).toUpperCase() + fullname.substring(1);
		} else if (method.getParameterCount() == 1
			&& method.getParameterTypes()[0].getSimpleName().endsWith(SUFFIX)) {
			String fullname = method.getParameterTypes()[0].getSimpleName();
			return fullname.substring(0, fullname.length() - SUFFIX.length());
		}
		return null;
	}

	@Override
	protected String getDesc(String parent, Method method) {
		return toKind(method);
	}

	@Override
	protected String getClient() {
		return AmazonEC2Client.class.getName();
	}

}
