/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.analyzers;

import java.util.Map;

import com.github.isdream.cdispatcher.ModelParametersAnalyzer;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public class OpenShiftModelParametersAnalyzer extends ModelParametersAnalyzer {

	private static OpenShiftModelParametersAnalyzer analyzer = null;
	
	protected OpenShiftModelParametersAnalyzer() throws Exception {
		super();
	}


	public static ModelParametersAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new OpenShiftModelParametersAnalyzer();
			} catch (Exception e) {
				return DefaultModelParametersAnalyzer.getAnalyzer();
			}
		}
		return analyzer;
	}

	@Override
	protected Map<String, String> getKindModels() {
		return OpenShiftKindModelsAnalyzer.getAnalyzer().getKindModels();
	}

}
