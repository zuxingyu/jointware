/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.docs;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.isdream.cdispatcher.KeyValueStyleGenerator;
import com.github.isdream.cdispatcher.commons.rules.JavaMethodParametersIgnoreRule;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月31日
 */
public class KubernetesDocumentKeyValueConverter extends KeyValueStyleGenerator {

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
	public boolean ignore(Method method) {
		return (method.getParameterCount() == 1 
							&& !ignores.contains(method.getName())
							&& !method.getName().startsWith(IGNORE_PREFIX) 
							&& !JavaMethodParametersIgnoreRule.ignore(method.getName())) 
							? false : true;
	}

	@Override
	protected List<Object> getListOrSetStyleObjects(Method method) {
		List<Object> list = new ArrayList<Object>();
		list.add(new Object());
		list.add(new Object());
		return list;
	}

	@Override
	protected Map<String, Object> getStringObjectMapStyleObjects(Method method) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("demokey1", new Object());
		map.put("demokey2", new Object());
		return map;
	}

}
