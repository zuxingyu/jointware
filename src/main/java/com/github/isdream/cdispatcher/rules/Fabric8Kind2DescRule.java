/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.rules;

import java.util.HashMap;
import java.util.Map;

import com.github.isdream.cdispatcher.utils.StringUtils;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 * 
 * 记录单词转换的规则
 */
public class Fabric8Kind2DescRule {

    private final static Map<String, String> rules = new HashMap<String, String>();
	
	static {
		rules.put("Componentstatuses", "Componentstatus");
		rules.put("NetworkPolicies", "NetworkPolicy");
		rules.put("Policies", "Policy");
		rules.put("Ingresses", "Ingress");
	}
	
	public static String getName(String name) {
		return StringUtils.isNull(name) ? null : _getName(name);
	}
	
	public static String _getName(String name) {
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		return rules.get(name) != null ? rules.get(name) : 
			name.substring(0, 1).toUpperCase() + name.substring(1, name.length() - 1);
	}
}
