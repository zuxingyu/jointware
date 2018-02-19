/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.kubernetes;

import java.util.HashSet;
import java.util.Set;

import com.github.isdream.chameleon.KindModelsAnalyzer;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class KubernetesKindModelsAnalyzer extends KindModelsAnalyzer {

	public static final String MODEL_PACKAHE_KUBERNETES = "io.fabric8.kubernetes.api.model";
	
	private static KubernetesKindModelsAnalyzer analyzer = null;
	
	@Override
	protected Set<String> getKinds() {
		try {
			return new KubernetesKindsAnalyzer().getKinds();
		} catch (Exception e) {
			return new HashSet<String>();
		}
	}

	@Override
	protected void initPackages() {
		packages.add(MODEL_PACKAHE_KUBERNETES);
		initCommonsPackages();
	}
	
	/**
	 * @return 单例模式
	 */
	public static KindModelsAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new KubernetesKindModelsAnalyzer();
			} catch (Exception e) {
				// ignore here
			}
		}
		return analyzer;
	}

	@Override
	protected void analyse(String pakagesName) {
		for (String kind : getKinds()) {
			 try {
				 Class.forName(pakagesName + "." + kind);
				 models.put(kind, pakagesName + "." + kind);
			} catch (ClassNotFoundException e) {
				// ignore here
			}
		 }
	}

}
