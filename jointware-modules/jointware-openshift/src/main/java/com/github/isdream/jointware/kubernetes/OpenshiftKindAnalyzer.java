/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.github.isdream.jointware.core.KindAnalyzer;
import com.github.isdream.jointware.core.utils.ObjectUtils;
import com.github.isdream.jointware.core.utils.StringUtils;

import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.NonNamespaceOperation;
import io.fabric8.openshift.client.DefaultOpenShiftClient;

/**
 * The {@code KubernetesKindAnalyzer} class represents the relationship between kind name and kind description.
 * All kind object literals in Java programs can be instantiated by kind description.
 * <p>
 * 
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月2日
 */
public class OpenshiftKindAnalyzer extends KindAnalyzer {

	protected static final String KIND_BASIC_TAG = NonNamespaceOperation.class.getName();

	protected static final String KIND_MIXED_TAG = MixedOperation.class.getName();

	protected static final String KIND_GROUP_TAG = "GroupDSL";
	
	protected final static Map<String, String> rules = new HashMap<String, String>();
	
	static {
		rules.put("Componentstatuses", "Componentstatus");
		rules.put("NetworkPolicies", "NetworkPolicy");
		rules.put("Policies", "Policy");
		rules.put("Ingresses", "Ingress");
	}

	public OpenshiftKindAnalyzer() {
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
	protected String toKind(Method method) {
		String name = method.getName()
						.substring(0, 1).toUpperCase() 
						+ method.getName().substring(1);
		return rules.get(name) != null 
						? rules.get(name) 
						: name.substring(0, name.length() - 1);
	}

	/**
	 * 如果传入的名字name不存在，返回null
	 * 
	 */
	@Override
	protected String getDesc(String parent, Method method) {
		return StringUtils.isNull(method.getName()) ? null : 
				(StringUtils.isNull(parent) ? method.getName() : parent + "-" + method.getName());
	}

	@Override
	protected String getClient() {
		return DefaultOpenShiftClient.class.getName();
	}

}
