/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.openshift;

import java.lang.reflect.Method;
import java.util.Map;

import com.github.isdream.chameleon.ModelParametersAnalyzer;
import com.github.isdream.chameleon.commons.utils.ObjectUtils;
import com.github.isdream.chameleon.container.Fabric8Kind2ModelFilterRule;
import com.github.isdream.chameleon.container.Fabric8ModelParametersIgnoreRule;
import com.github.isdream.chameleon.defaultimpl.DefaultModelParametersAnalyzer;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class OpenShiftModelParametersAnalyzer extends ModelParametersAnalyzer {

	private static OpenShiftModelParametersAnalyzer analyzer = null;
	
	protected OpenShiftModelParametersAnalyzer() throws Exception {
		super();
	}


	/**
	 * @return 单例模式
	 */
	public static ModelParametersAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new OpenShiftModelParametersAnalyzer();
			} catch (Exception e) {
				return DefaultModelParametersAnalyzer.getAnalyzer();
			}
		}
		return analyzer;
	}

	@Override
	protected Map<String, String> getKindModels() {
		return new OpenShiftKindModelsAnalyzer().getKindModels();
	}


	@Override
	protected boolean canLoop(String typename) {
		return !Fabric8Kind2ModelFilterRule.filter(typename) // 不是基础类型 
				&& typename.split(",").length < 2;      // 不是Map，在fabric8中，Map会通过泛型表示，如Map<String, String>，则通过,划分，长度小于2的不是Map
	}


	@Override
	protected boolean canReflect(Method method) {
		return ObjectUtils.isNull(method) ? false 
				: ( method.getName().startsWith(MODEL_METHOD_SET) // set开头的方法
				&& method.getParameterCount() == 1  //该方法只有一个参数
				&& !Fabric8ModelParametersIgnoreRule.ignore(method.getName())); //可以人工指定过滤哪些方法
	}

}
