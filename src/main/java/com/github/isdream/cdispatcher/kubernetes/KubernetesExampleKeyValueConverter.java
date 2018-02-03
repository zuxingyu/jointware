/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.kubernetes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.isdream.cdispatcher.KeyValueStyleGenerator;
import com.github.isdream.cdispatcher.commons.rules.JavaMethodParametersIgnoreRule;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月31日
 */
public class KubernetesExampleKeyValueConverter extends KeyValueStyleGenerator {

	protected final static String IGNORE_PREFIX = "get";
	
	@Override
	public boolean ignore(Method method) {
		return (method.getParameterCount() == 1 
							&& !method.getName().startsWith(IGNORE_PREFIX) 
							&& !JavaMethodParametersIgnoreRule.ignore(method.getName())) ? false : true;
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
		map.put("key1", new Object());
		map.put("key2", new Object());
		return map;
	}

}
