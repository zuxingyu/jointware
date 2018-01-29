/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.docker;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import com.github.dockerjava.api.command.DockerCmd;
import com.github.isdream.cdispatcher.KindsAnalyzer;
import com.github.isdream.cdispatcher.commons.utils.ObjectUtils;
import com.github.isdream.cdispatcher.commons.utils.StringUtils;
import com.github.isdream.cdispatcher.defaultmodle.DefaultKindsAnalyzer;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class DockerKindsAnalyzer extends KindsAnalyzer {
	
	private static DockerKindsAnalyzer analyzer = null;


	protected final static Set<String> mfilters = new HashSet<String>();
	
	static {
		mfilters.add("getProtectionDomain");
		mfilters.add("getModifiers");
		mfilters.add("getSuperclass");
		mfilters.add("getComponentType");
		mfilters.add("getAnnotatedInterfaces");
		mfilters.add("getAnnotatedSuperclass");
		mfilters.add("getCanonicalName");
		mfilters.add("getClassLoader");
		mfilters.add("getClasses");
		mfilters.add("getConstructors");
		mfilters.add("getDeclaredAnnotations");
		mfilters.add("getDeclaredClasses");
		mfilters.add("getDeclaredConstructors");
		mfilters.add("getDeclaredFields");
		mfilters.add("getDeclaredMethods");
		mfilters.add("getDeclaringClass");
		mfilters.add("getEnclosingClass");
		mfilters.add("getEnclosingConstructor");
		mfilters.add("getEnclosingMethod");
		mfilters.add("getEnumConstants");
		mfilters.add("getFields");
		mfilters.add("getGenericInterfaces");
		mfilters.add("getGenericSuperclass");
		mfilters.add("getInterfaces");
		mfilters.add("getMethods");
		mfilters.add("getPackage");
		mfilters.add("getSigners");
		mfilters.add("getSimpleName");
		mfilters.add("getTypeName");
		mfilters.add("getTypeParameters");
		mfilters.add("getClass");
		mfilters.add("getBytes");
		mfilters.add("wait");
		mfilters.add("hashCode");
		mfilters.add("notify");
		mfilters.add("notifyAll");
		mfilters.add("close");
		mfilters.add("toString");
		mfilters.add("equals");
		mfilters.add("getInstance");
		
	}
	
	protected DockerKindsAnalyzer() throws Exception {
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
				: (method.getGenericReturnType().getClass()
						.isInstance(DockerCmd.class) && !mfilters.contains(method.getName()));
	}

	@Override
	protected boolean isKindGroup(Method method) {
		return false;
	}
	
	/**
	 * 根据名字方法名返回kind类型，如果不存在，返回null
	 * 
	 */
	@Override
	protected String toKind(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1, name.length() -3 );
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
		return DockerConstants.CLIENT;
	}

	/**
	 * @return 单例模式
	 */
	public static KindsAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new DockerKindsAnalyzer();
			} catch (Exception e) {
				return DefaultKindsAnalyzer.getAnalyzer();
			}
		}
		return analyzer;
	}

}
