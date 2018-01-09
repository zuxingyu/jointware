/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys.analyzers;

import cn.cas.is.abcsys.Constants;
import cn.cas.is.abcsys.KindsAnalyzer;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
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
