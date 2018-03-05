/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package cn.ac.iscas.isdream.jointware.kubernetes;

import cn.ac.iscas.isdream.jointware.core.ParametersUtils;

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
//		showModelParametersWithJsonStyle(analyzer);
		ParametersUtils.showModelParametersWithJsonStyle("Kubernetes", "Deployment", analyzer.getModelParameters("Deployment"));
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
