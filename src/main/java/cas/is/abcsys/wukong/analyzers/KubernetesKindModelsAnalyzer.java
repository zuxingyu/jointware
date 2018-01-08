/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cas.is.abcsys.wukong.analyzers;

import java.util.List;
import java.util.Set;

import cas.is.abcsys.wukong.Constants;
import cas.is.abcsys.wukong.KindModelsAnalyzer;

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
	protected List<String> getPackages() {
		packages.add(Constants.MODEL_KUBERNETES_PACKAHE);
		initCommonsPackages();
		return packages;
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
