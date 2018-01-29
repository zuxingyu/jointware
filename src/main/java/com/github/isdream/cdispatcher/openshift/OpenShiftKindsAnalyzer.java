/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.openshift;

import com.github.isdream.cdispatcher.KindsAnalyzer;
import com.github.isdream.cdispatcher.defaultmodle.DefaultKindsAnalyzer;
import com.github.isdream.cdispatcher.kubernetes.KubernetesKindsAnalyzer;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class OpenShiftKindsAnalyzer extends KubernetesKindsAnalyzer {

	private static OpenShiftKindsAnalyzer analyzer = null;
	
	protected OpenShiftKindsAnalyzer() throws Exception {
		super();
	}

	@Override
	protected String getClient() {
		return OpenShiftConstants.CLIENT;
	}

	/**
	 * @return 单例模式
	 */
	public static KindsAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new OpenShiftKindsAnalyzer();
			} catch (Exception e) {
				return DefaultKindsAnalyzer.getAnalyzer();
			}
		}
		return analyzer;
	}
}
