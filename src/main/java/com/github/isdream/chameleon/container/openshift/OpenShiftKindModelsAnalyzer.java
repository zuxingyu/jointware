/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.openshift;

import java.util.Set;

import com.github.isdream.chameleon.KindModelsAnalyzer;

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
		packages.add(OpenShiftConstants.MODEL_OPENSHIFT_PACKAHE);
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
