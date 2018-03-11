/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package v3.application;

import com.github.isdream.jointware.core.ModelParameterGenerator;
import com.github.isdream.jointware.kubernetes.KubernetesModelParameterGenerator;
import junit.framework.TestCase;
import v3.application.kinds.DeploymentObject;
import v3.application.kinds.NamespaceObject;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月6日
 */
public class DmGeneratorTest extends TestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KubernetesModelParameterGenerator generator = new KubernetesModelParameterGenerator(
				ModelParameterGenerator.JOINTWARE);
		System.out.println(generator.toJson(
				generator.toMap(
						new DeploymentObject().create())));
		
//		System.out.println(generator.toJson(
//				generator.toMap(
//						new DeploymentObject().create())));
////
//		System.out.println(generator.toJson(
//				generator.toMap(
//						new UBOCObject().create())));
	}

}
