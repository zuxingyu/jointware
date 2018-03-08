/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import com.github.isdream.jointware.kubernetes.kinds.NamespaceObject;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月8日
 */
public class KubernetesModelGeneratorTest extends TestCase {

	public static void main(String[] args) throws Exception {
		KubernetesModelParameterGenerator kmpgenerator = new KubernetesModelParameterGenerator();
		KubernetesModelGenerator kmgenerator = new KubernetesModelGenerator();
		System.out.println(kmgenerator.toObject(
				kmpgenerator.ToNestedStyle(
						new NamespaceObject().create()), "Namespace"));
	}
}
