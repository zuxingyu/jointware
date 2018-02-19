/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.docs;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.isdream.chameleon.KeyValueStyleGenerator;
import com.github.isdream.chameleon.commons.rules.IgnoreMethodNameInJavaSDKRule;
import com.github.isdream.chameleon.commons.utils.StringUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月31日
 */
public class KubernetesDocumentKeyValueStyleGenerator extends KeyValueStyleGenerator {

	protected final static String IGNORE_PREFIX = "get";
	
	private final static Set<String> ignores = new HashSet<String>();
	
	static {
		ignores.add("setDeletionTimestamp");
		ignores.add("setResourceVersion");
		ignores.add("setApiVersion");
		ignores.add("setResult");
		ignores.add("setKind");
		ignores.add("setUid");
	}
	
	@Override
	public boolean ignore(Object obj, Method method) {
		return (method.getParameterCount() == 1 
							&& !ignores.contains(method.getName())
							&& !method.getName().startsWith(IGNORE_PREFIX) 
							&& !IgnoreMethodNameInJavaSDKRule.ignore(method.getName())) 
							? false : true;
	}

	@Override
	protected Collection<Object> getListOrSetStyleObjects(Object obj, Method method) {
		List<Object> list = new ArrayList<Object>();
		list.add(new Object());
		list.add(new Object());
		return list;
	}

	@Override
	protected Map<String, Object> getStringObjectMapStyleObjects(Object obj, Method method) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("demokey1", new Object());
		map.put("demokey2", new Object());
		return map;
	}

	@Override
	protected Object getValue(Object obj, Method method) {
		return getTypeName(method);
	}

	@Override
	protected String getTypeName(Method method) {
		return method.getGenericParameterTypes()[0].getTypeName();
	}

	@Override
	protected String getRealKey(String key, Method method) {
		return StringUtils.isNull(key) ? method.getName() 
				: key + "-" + method.getName();
	}

	@Override
	protected Object getTarget(Object obj, Method method) throws Exception {
		String thisTypeName = getTypeName(method);
		return Class.forName(thisTypeName).newInstance();
	}

	@Override
	protected String getRealParent(Method method) {
		return method.getName();
	}

}
