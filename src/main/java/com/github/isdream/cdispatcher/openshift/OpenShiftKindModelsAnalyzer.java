/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.openshift;

import java.util.Set;

import com.github.isdream.cdispatcher.Constants;
import com.github.isdream.cdispatcher.KindModelsAnalyzer;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class OpenShiftKindModelsAnalyzer extends KindModelsAnalyzer {

	private static OpenShiftKindModelsAnalyzer analyzer = null;
	
	@Override
	protected Set<String> getKinds() {
		return OpenShiftKindsAnalyzer.getAnalyzer().getKinds();
	}

	@Override
	protected void initPackages() {
		packages.add(Constants.MODEL_OPENSHIFT_PACKAHE);
		this.initCommonsPackages();
	}
	
	/**
	 * @return 单例模式
	 */
	public static KindModelsAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new OpenShiftKindModelsAnalyzer();
			} catch (Exception e) {
			}
		}
		return analyzer;
	}

}
