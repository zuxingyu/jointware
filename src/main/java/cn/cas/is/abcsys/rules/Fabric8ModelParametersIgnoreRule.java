/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys.rules;

import java.util.HashSet;
import java.util.Set;

import cn.cas.is.abcsys.utils.StringUtils;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public class Fabric8ModelParametersIgnoreRule {

	private final static Set<String> ignores = new HashSet<String>();
	
	static {
		ignores.add("setStatus");
		ignores.add("setResult");
		ignores.add("setApiVersion");
		ignores.add("setKind");
		ignores.add("setPaused");
		ignores.add("setInitContainers");
		ignores.add("setUid");
		ignores.add("setSelfLink");
		ignores.add("setCreationTimestamp");
	}
	
	public static boolean ignore(String name) {
		return StringUtils.isNull(name) ? true : ignores.contains(name);
	}
}
