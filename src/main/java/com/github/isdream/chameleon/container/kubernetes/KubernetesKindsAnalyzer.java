/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.kubernetes;

import java.lang.reflect.Method;

import com.github.isdream.chameleon.KindsAnalyzer;
import com.github.isdream.chameleon.commons.utils.ObjectUtils;
import com.github.isdream.chameleon.commons.utils.StringUtils;
import com.github.isdream.chameleon.container.Fabric8Kind2DescRule;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.NonNamespaceOperation;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class KubernetesKindsAnalyzer extends KindsAnalyzer {
	
	protected static final String KIND_BASIC_TAG = NonNamespaceOperation.class.getName();

	protected static final String KIND_MIXED_TAG = MixedOperation.class.getName();

	protected static final String KIND_GROUP_TAG = "GroupDSL";

	public KubernetesKindsAnalyzer() {
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
		return Fabric8Kind2DescRule.getName(name);
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
		return DefaultKubernetesClient.class.getName();
	}


}
