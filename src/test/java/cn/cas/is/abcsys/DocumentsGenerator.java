/**
 * 
 */
package cn.cas.is.abcsys;

import cn.cas.is.abcsys.analyzers.KubernetesKindModelsAnalyzer;
import cn.cas.is.abcsys.analyzers.KubernetesKindsAnalyzer;
import cn.cas.is.abcsys.analyzers.KubernetesModelParametersAnalyzer;
import cn.cas.is.abcsys.analyzers.OpenShiftKindModelsAnalyzer;
import cn.cas.is.abcsys.analyzers.OpenShiftKindsAnalyzer;
import cn.cas.is.abcsys.analyzers.OpenShiftModelParametersAnalyzer;
import junit.framework.TestCase;

/**
 * @author Henry
 *
 */
public class DocumentsGenerator extends TestCase {

	public void testGeneratorKinds() {
		KindsAnalyzer kubeAnalyzer = KubernetesKindsAnalyzer.getAnalyzer();
		
		System.out.println("## Kubernetes features");
		System.out.println();
		System.out.println("```");
		for (String kind : kubeAnalyzer.getKinds()) {
			System.out.println("- " + kind);
		}
		System.out.println("```");
		
		System.out.println();
		System.out.println();
		System.out.println();
		KindsAnalyzer ocp3Analyzer = OpenShiftKindsAnalyzer.getAnalyzer();
		System.out.println("## OpenShift features");
		System.out.println();
		System.out.println("```");
		ocp3Analyzer.getKinds().removeAll((kubeAnalyzer.getKinds()));
		for (String kind : ocp3Analyzer.getKinds()) {
			System.out.println("- " + kind);
		}
		System.out.println("```");
	}
	
	public void testGeneratorKindModels() {
		KindsAnalyzer kubeKindsAnalyzer = KubernetesKindsAnalyzer.getAnalyzer();
		KindModelsAnalyzer kubeKindModelsAnalyzer = KubernetesKindModelsAnalyzer.getAnalyzer();
		System.out.println("## Kubernetes kind models");
		System.out.println();
		System.out.println("```");
		for (String kind : kubeKindsAnalyzer.getKinds()) {
			System.out.println("- " + kind + "=" + kubeKindModelsAnalyzer.getKindModel(kind));
		}
		System.out.println("```");
		
		System.out.println();
		System.out.println();
		System.out.println();
		KindsAnalyzer ocp3KindsAnalyzer = OpenShiftKindsAnalyzer.getAnalyzer();
		KindModelsAnalyzer ocp3KindModelsAnalyzer = OpenShiftKindModelsAnalyzer.getAnalyzer();
		System.out.println("## OpenShift features");
		System.out.println();
		System.out.println("```");
		ocp3KindsAnalyzer.getKinds().removeAll((kubeKindsAnalyzer.getKinds()));
		for (String kind : ocp3KindsAnalyzer.getKinds()) {
			System.out.println("- " + kind + "=" + ocp3KindModelsAnalyzer.getKindModel(kind));
		}
		System.out.println("```");
	}
	
	public void testGeneratorModelParameters() {
		KindsAnalyzer kubeKindsAnalyzer = KubernetesKindsAnalyzer.getAnalyzer();
		ModelParametersAnalyzer kubeModelParametersAnalyzer = KubernetesModelParametersAnalyzer.getAnalyzer();
		System.out.println("## Kubernetes YAMLs");
		System.out.println();
		for (String kind : kubeKindsAnalyzer.getKinds()) {
			if(kubeModelParametersAnalyzer.getModelParameters(kind) == null) {
				System.out.println("#### Unsupport Kubernetes " + kind);
				System.out.println();
				continue;
			}
			System.out.println("#### Kubernetes " + kind);
			System.out.println();
			System.out.println("```");
			System.out.println(new ModelParamtersViewer(kubeModelParametersAnalyzer).printModel2(kind));
			System.out.println("```");
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		KindsAnalyzer ocp3KindsAnalyzer = OpenShiftKindsAnalyzer.getAnalyzer();
		ModelParametersAnalyzer ocp3ModelParametersAnalyzer = OpenShiftModelParametersAnalyzer.getAnalyzer();
		System.out.println("## OpenShift YAMLs");
		System.out.println();
		ocp3KindsAnalyzer.getKinds().removeAll((kubeKindsAnalyzer.getKinds()));
		for (String kind : ocp3KindsAnalyzer.getKinds()) {
			if(ocp3ModelParametersAnalyzer.getModelParameters(kind) == null) {
				System.out.println("#### Unsupport OpenShift " + kind);
				System.out.println();
				continue;
			}
			System.out.println("#### OpenShift " + kind);
			System.out.println();
			System.out.println("```");
			System.out.println(new ModelParamtersViewer(ocp3ModelParametersAnalyzer).printModel2(kind));
			System.out.println("```");
			System.out.println();
		}
	}
	
	public void testConstants() {
		KindsAnalyzer ocp3Analyzer = OpenShiftKindsAnalyzer.getAnalyzer();
		for (String kind : ocp3Analyzer.getKinds()) {
			System.out.println("\tpublic static final String YAML_" + kind.toUpperCase() + " = \"" + kind + "\";");
			System.out.println();
		}
	}
}
