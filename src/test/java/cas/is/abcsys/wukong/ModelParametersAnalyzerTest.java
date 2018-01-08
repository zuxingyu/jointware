/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cas.is.abcsys.wukong;

import cas.is.abcsys.wukong.analyzers.KubernetesModelParameterssAnalyzer;
import cas.is.abcsys.wukong.analyzers.OpenShiftModelParametersAnalyzer;
import junit.framework.TestCase;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public class ModelParametersAnalyzerTest extends TestCase {

	public void testKubernetesModelsAnalyzer() throws Exception {
		ModelParametersAnalyzer analyzer = KubernetesModelParameterssAnalyzer.getAnalyzer();
		System.out.println(analyzer.printModel1("Deployment"));
	}
	
	public void testOpenShiftAnalyzer() throws Exception {
//		ModelsAnalyzer analyzer = OpenShiftModelsAnalyzer.getAnalyzer();
//		System.out.println(analyzer.printModel2("DeploymentConfig"));
	}
}
