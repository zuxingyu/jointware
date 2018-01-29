/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.kubernetes;

import java.lang.reflect.Method;

import com.github.isdream.cdispatcher.KindsAnalyzer;
import com.github.isdream.cdispatcher.commons.rules.KubernetesKind2DescRule;
import com.github.isdream.cdispatcher.commons.utils.ObjectUtils;
import com.github.isdream.cdispatcher.commons.utils.StringUtils;
import com.github.isdream.cdispatcher.defaultmodle.DefaultKindsAnalyzer;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class KubernetesKindsAnalyzer extends KindsAnalyzer {
	
	private static KubernetesKindsAnalyzer analyzer = null;

	protected static final String KIND_BASIC_TAG = "io.fabric8.kubernetes.client.dsl.NonNamespaceOperation";

	protected static final String KIND_MIXED_TAG = "io.fabric8.kubernetes.client.dsl.MixedOperation";

	protected static final String KIND_GROUP_TAG = "GroupDSL";

	protected KubernetesKindsAnalyzer() throws Exception {
		super();
	}
	
	/**
	 * 对于fabric8的DefaultKubernetesClient而言，如果返回值结果是
	 * io.fabric8.kubernetes.client.dsl.NonNamespaceOperation，或者
	 * 为io.fabric8.kubernetes.client.dsl.MixedOperation， 则说明它是一种kind的类型. <br>
	 * <br>
	 * 
	 * 更进一步，要求这些方法的没有参数，以及不是<code>Deprecated.class</code>的类型
	 */
	@Override
	protected boolean isKind(Method method) {
		return ObjectUtils.isNull(method) ? false
				: ((KIND_MIXED_TAG.equals(method.getReturnType().getName())
						|| KIND_BASIC_TAG.equals(method.getReturnType().getName())) && (method.getParameterCount() == 0)
						&& (!method.isAnnotationPresent(Deprecated.class)));
	}

	/**
	 * 对于fabric8的DefaultKubernetesClient而言，如果返回值是以GroupDSL结尾的， 则说明它是一种kind的类型. <br>
	 * <br>
	 * 
	 * 更进一步，要求这些方法不是<code>Deprecated.class</code>的类型
	 */
	@Override
	protected boolean isKindGroup(Method method) {
		return ObjectUtils.isNull(method) ? false
				: ((method.getReturnType().getName().endsWith(KIND_GROUP_TAG))
						&& (!method.isAnnotationPresent(Deprecated.class)));
	}

	/**
	 * 根据名字方法名返回kind类型，如果不存在，返回null
	 * 
	 */
	@Override
	protected String toKind(String name) {
		return KubernetesKind2DescRule.getName(name);
	}

	/**
	 * 如果传入的名字name不存在，返回null
	 * 
	 */
	@Override
	protected String getDesc(String parent, String name) {
		return StringUtils.isNull(name) ? null : 
				(StringUtils.isNull(parent) ? name : parent + "-" + name);
	}

	@Override
	protected String getClient() {
		return KubernetesConstants.CLIENT;
	}

	/**
	 * @return 单例模式
	 */
	public static KindsAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new KubernetesKindsAnalyzer();
			} catch (Exception e) {
				return DefaultKindsAnalyzer.getAnalyzer();
			}
		}
		return analyzer;
	}
}
