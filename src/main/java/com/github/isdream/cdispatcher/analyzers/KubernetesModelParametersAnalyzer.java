/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.analyzers;

import java.util.Map;

import com.github.isdream.cdispatcher.ModelParametersAnalyzer;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class KubernetesModelParametersAnalyzer extends ModelParametersAnalyzer {

	private static KubernetesModelParametersAnalyzer analyzer = null;
	
	protected KubernetesModelParametersAnalyzer() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}


	/** 
	 * @return 单例模式
	 */
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
