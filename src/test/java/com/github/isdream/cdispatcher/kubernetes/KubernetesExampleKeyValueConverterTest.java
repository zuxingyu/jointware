/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.kubernetes;

import io.fabric8.kubernetes.api.model.Namespace;
import io.fabric8.kubernetes.api.model.ResourceQuota;
import io.fabric8.kubernetes.api.model.extensions.Deployment;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 *         2018年2月1日
 */
public class KubernetesExampleKeyValueConverterTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
//		testNamespace();
//		testResourceQuota();
		KubernetesExampleKeyValueConverter kc = new KubernetesExampleKeyValueConverter();
		System.out.println(kc.fromModelParameters(new Deployment()));
	}

	protected static void testResourceQuota() throws Exception {
		KubernetesExampleKeyValueConverter kc = new KubernetesExampleKeyValueConverter();
		System.out.println(kc.fromModelParameters(new ResourceQuota()));
	}

	protected static void testNamespace() throws Exception {
		KubernetesExampleKeyValueConverter kc = new KubernetesExampleKeyValueConverter();
		System.out.println(kc.fromModelParameters(new Namespace()));
	}

}
