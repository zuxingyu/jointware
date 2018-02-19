/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.openshift;

import com.github.isdream.chameleon.container.kubernetes.KubernetesKindsAnalyzer;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class OpenShiftKindsAnalyzer extends KubernetesKindsAnalyzer {

	public OpenShiftKindsAnalyzer() {
		super();
	}

	@Override
	protected String getClient() {
		return OpenShiftConstants.CLIENT;
	}

}
