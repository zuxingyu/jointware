/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cas.is.abcsys.wukong.analyzers;

import java.util.Map;

import cas.is.abcsys.wukong.ModelParametersAnalyzer;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public class KubernetesModelParameterssAnalyzer extends ModelParametersAnalyzer {

	private static KubernetesModelParameterssAnalyzer analyzer = null;
	
	protected KubernetesModelParameterssAnalyzer() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}


	public static ModelParametersAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new KubernetesModelParameterssAnalyzer();
			} catch (Exception e) {
				return DefaultModelParametersAnalyzer.getAnalyzer();
			}
		}
		return analyzer;
	}

	@Override
	protected Map<String, String> getKindModels() {
		return KubernetesKindModelsAnalyzer.getAnalyzer().getModels();
	}

}
