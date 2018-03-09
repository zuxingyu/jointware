/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import java.lang.reflect.Method;
import java.util.Map;

import com.github.isdream.jointware.core.ModelParameterAnalyzer;
import com.github.isdream.jointware.core.utils.JavaUtils;
import com.github.isdream.jointware.core.utils.ObjectUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 *         2018年3月3日
 */
public class OpenshiftModelParameterAnalyzer extends ModelParameterAnalyzer {

	protected final static String MODEL_METHOD_SET = "set";
	
	protected final static OpenshiftKindModelAnalyzer analyzer = new OpenshiftKindModelAnalyzer();

	public OpenshiftModelParameterAnalyzer() {
		super();
	}

	@Override
	public Map<String, String> getKindModels() {
		return analyzer.getKindModels();
	}

	@Override
	protected boolean canLoop(String typename) {
		return !JavaUtils.isPrimitive(typename) // 不是基础类型
				&& !JavaUtils.isStringList(typename) //不是List<String>
				&& !JavaUtils.isStringSet(typename) //不是Set<String>
				&& !JavaUtils.isStringStringMap(typename) //不是Map<String, String>
				&& typename.split(",").length < 2; // 不是Map，在fabric8中，Map会通过泛型表示，如Map<String, String>，则通过,划分，长度小于2的不是Map
	}

	@Override
	protected boolean canReflect(Method method) {
		return ObjectUtils.isNull(method) ? false
				: (method.getName().startsWith(MODEL_METHOD_SET) // set开头的方法
						&& method.getParameterCount() == 1 // 该方法只有一个参数
						&& !JavaUtils.ignoreMethod(method.getName())); // 可以人工指定过滤哪些方法
	}
}
