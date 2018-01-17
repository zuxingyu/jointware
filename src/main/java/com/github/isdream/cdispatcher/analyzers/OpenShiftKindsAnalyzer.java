/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.analyzers;

import com.github.isdream.cdispatcher.Constants;
import com.github.isdream.cdispatcher.KindsAnalyzer;

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
		return Constants.CLIENT_OPENSHIFT;
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
