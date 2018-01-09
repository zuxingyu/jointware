/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys.analyzers;

import java.util.Set;

import cn.cas.is.abcsys.Constants;
import cn.cas.is.abcsys.KindModelsAnalyzer;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public class KubernetesKindModelsAnalyzer extends KindModelsAnalyzer {

	private static KubernetesKindModelsAnalyzer analyzer = null;
	
	@Override
	protected Set<String> getKinds() {
		return KubernetesKindsAnalyzer.getAnalyzer().getKinds();
	}

	@Override
	protected void initPackages() {
		packages.add(Constants.MODEL_KUBERNETES_PACKAHE);
		initCommonsPackages();
	}
	
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

}
