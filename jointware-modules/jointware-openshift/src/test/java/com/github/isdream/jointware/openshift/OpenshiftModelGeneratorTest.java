/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.openshift;

import com.github.isdream.jointware.kubernetes.OpenshiftModelGenerator;
import com.github.isdream.jointware.kubernetes.OpenshiftModelParameterGenerator;
import com.github.isdream.jointware.openshift.kind.NamespaceObject;
import com.github.isdream.jointware.openshift.maps.MapUtils;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月8日
 */
public class OpenshiftModelGeneratorTest extends TestCase {

	public static void main(String[] args) throws Exception {
		OpenshiftModelParameterGenerator kmpgenerator = new OpenshiftModelParameterGenerator();
//		testNamespace(kmpgenerator);
		OpenshiftModelGenerator kmgenerator = new OpenshiftModelGenerator();
		System.out.println(kmgenerator.toObject(MapUtils.mockBOCOFrontend(), "Deployment"));
	}

	protected static void testNamespace(OpenshiftModelParameterGenerator kmpgenerator) throws Exception {
		OpenshiftModelGenerator kmgenerator = new OpenshiftModelGenerator();
		System.out.println(kmgenerator.toObject(
				kmpgenerator.ToNestedStyle(
						new NamespaceObject().create()), "Namespace"));
	}
}
