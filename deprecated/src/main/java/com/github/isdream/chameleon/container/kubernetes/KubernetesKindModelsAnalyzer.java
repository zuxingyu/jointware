/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.kubernetes;

import java.util.Set;

import com.github.isdream.chameleon.KindModelsAnalyzer;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class KubernetesKindModelsAnalyzer extends KindModelsAnalyzer {

	protected static final String MODEL_PACKAHE_COMMON_EXTENSION = "io.fabric8.kubernetes.api.model.extensions";
	
	protected static final String MODEL_PACKAHE_COMMON_API = "io.fabric8.kubernetes.api.model.apiextensions";
	
	protected static final String MODEL_PACKAHE_COMMON_AUTH = "io.fabric8.kubernetes.api.model.authentication";
	
	protected static final String MODEL_PACKAHE_KUBERNETES = "io.fabric8.kubernetes.api.model";
	
	private static final KubernetesKindsAnalyzer kubernetesAnalyzer = new KubernetesKindsAnalyzer();

	@Override
	protected void initPackages() {
		packages.add(MODEL_PACKAHE_KUBERNETES);
		packages.add(MODEL_PACKAHE_COMMON_AUTH);
		packages.add(MODEL_PACKAHE_COMMON_EXTENSION);
		packages.add(MODEL_PACKAHE_COMMON_API);
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

	@Override
	protected Set<String> getKinds() {
		return kubernetesAnalyzer.getKinds();
	}

}
