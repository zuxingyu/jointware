/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys.analyzers;

import java.util.Map;

import cn.cas.is.abcsys.ModelParametersAnalyzer;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public class KubernetesModelParametersAnalyzer extends ModelParametersAnalyzer {

	private static KubernetesModelParametersAnalyzer analyzer = null;
	
	protected KubernetesModelParametersAnalyzer() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}


	public static ModelParametersAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new KubernetesModelParametersAnalyzer();
			} catch (Exception e) {
				return DefaultModelParametersAnalyzer.getAnalyzer();
			}
		}
		return analyzer;
	}

	@Override
	protected Map<String, String> getKindModels() {
		return KubernetesKindModelsAnalyzer.getAnalyzer().getKindModels();
	}

}
