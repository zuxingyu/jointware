/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.kubernetes;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.github.isdream.chameleon.KeyValueStyleGenerator;
import com.github.isdream.chameleon.commons.rules.IgnoreMethodNameInJavaSDKRule;
import com.github.isdream.chameleon.commons.utils.ObjectUtils;
import com.github.isdream.chameleon.commons.utils.StringUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月5日
 */
public class KubernetesKeyValueStyleGenerator extends KeyValueStyleGenerator {

	protected final static String IGNORE_PREFIX = "set";
	
	protected final static String GET_PREFIX = "get";
	
	protected final static String SET_PREFIX = "set";
	
	private final static Set<String> ignores = new HashSet<String>();
	
	static {
		ignores.add("getDeletionTimestamp");
		ignores.add("getResourceVersion");
		ignores.add("getApiVersion");
		ignores.add("getResult");
		ignores.add("getKind");
		ignores.add("getUid");
		ignores.add("getAdditionalProperties");
	}
	
	@Override
	protected boolean ignore(Object obj, Method method) {
		try {
			return (method.getParameterCount() == 0
					&& !ignores.contains(method.getName())
					&& !method.getName().startsWith(IGNORE_PREFIX) 
					&& !IgnoreMethodNameInJavaSDKRule.ignore(method.getName())) 
					? (ObjectUtils.isNull(method.invoke(obj)) ? true : false) : true;
		} catch (Exception e) {
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Collection<Object> getListOrSetStyleObjects(Object obj, Method method) {
		try {
			return (Collection<Object>) method.invoke(obj);
		} catch (Exception e) {
			return null;
		} 
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Map<String, Object> getStringObjectMapStyleObjects(Object obj, Method method) {
		try {
			return  (Map<String, Object>) method.invoke(obj);
		} catch (Exception e) {
			return null;
		} 
	}

	@Override
	protected Object getValue(Object obj, Method method) {
		try {
			return method.invoke(obj);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	protected String getTypeName(Method method) {
		return method.getGenericReturnType().getTypeName();
	}

	@Override
	protected String getRealKey(String key, Method method) {
		return StringUtils.isNull(key) ? SET_PREFIX + method.getName().substring(GET_PREFIX.length()) 
				: key + "-" + SET_PREFIX + method.getName().substring(GET_PREFIX.length());
	}

	@Override
	protected Object getTarget(Object obj, Method method) throws Exception {
		return method.invoke(obj);
	}

	@Override
	protected String getRealParent(Method method) {
		return SET_PREFIX + method.getName().substring(GET_PREFIX.length());
	}

}
