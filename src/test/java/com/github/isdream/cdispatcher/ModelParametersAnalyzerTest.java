/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

import com.github.isdream.cdispatcher.ModelParametersAnalyzer;
import com.github.isdream.cdispatcher.ModelParamtersViewer;
import com.github.isdream.cdispatcher.analyzers.KubernetesModelParametersAnalyzer;
import com.github.isdream.cdispatcher.analyzers.OpenShiftModelParametersAnalyzer;

import junit.framework.TestCase;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class ModelParametersAnalyzerTest extends TestCase {

	public void testKubernetesModelsAnalyzer() throws Exception {
		ModelParametersAnalyzer analyzer = KubernetesModelParametersAnalyzer.getAnalyzer();
		System.out.println(new ModelParamtersViewer(analyzer).printModel1("Deployment"));
	}
	
	public void testOpenShiftAnalyzer() throws Exception {
		ModelParametersAnalyzer analyzer = OpenShiftModelParametersAnalyzer.getAnalyzer();
		System.out.println(new ModelParamtersViewer(analyzer).printModel2("DeploymentConfig"));
	}
}
