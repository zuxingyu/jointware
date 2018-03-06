/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import com.github.isdream.jointware.core.ParametersUtils;
import com.github.isdream.jointware.kubernetes.KubernetesModelParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月3日
 */
public class KubernetesModelParameterAnalyzerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KubernetesModelParameterAnalyzer analyzer = new KubernetesModelParameterAnalyzer();
//		showModelParametersWithKeyValueStyle(analyzer);
//		showModelParametersWithNetstedStyle(analyzer);
		showModelParametersWithJsonStyle(analyzer);
	}

	protected static void showModelParametersWithJsonStyle(KubernetesModelParameterAnalyzer analyzer) {
		for (String kind : analyzer.getKindModels().keySet()) {
			ParametersUtils.showModelParametersWithJsonStyle("Kubernetes", kind, analyzer.getModelParameters(kind));
		}
	}
	
	protected static void showModelParametersWithNetstedStyle(KubernetesModelParameterAnalyzer analyzer) {
		for (String kind : analyzer.getKindModels().keySet()) {
			ParametersUtils.showModelParametersWithNetstedStyle("Kubernetes", kind, analyzer.getModelParameters(kind));
		}
	}

	protected static void showModelParametersWithKeyValueStyle(KubernetesModelParameterAnalyzer analyzer) {
		for (String kind : analyzer.getKindModels().keySet()) {
			ParametersUtils.showModelParametersWithKeyValueStyle("Kubernetes", kind, analyzer.getModelParameters(kind));
		}
	}

}
