/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.openshift;

import java.util.Set;

import com.github.isdream.chameleon.container.kubernetes.KubernetesKindModelsAnalyzer;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class OpenShiftKindModelsAnalyzer extends KubernetesKindModelsAnalyzer {
	
	private static final String MODEL_PACKAHE_OPENSHIFT = "io.fabric8.openshift.api.model";
	
	private static final OpenShiftKindsAnalyzer openshiftAnalyzer = new OpenShiftKindsAnalyzer();

	@Override
	protected void initPackages() {
		packages.add(MODEL_PACKAHE_OPENSHIFT);
		super.initPackages();
	}

	@Override
	protected Set<String> getKinds() {
		return openshiftAnalyzer.getKinds();
	}
	
}
