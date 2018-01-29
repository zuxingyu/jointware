/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.others;

import com.github.isdream.cdispatcher.openshift.OpenShiftConstants;

public class ReflectTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
//		System.out.println(UserMapWriterTest.write(Constants.YAML_SERVICE, "examples/constructors/service.yaml"));
//		System.out.println(UserMapWriterTest.write(Constants.YAML_RESOURCEQUOTA, "examples/generators/ResourceQuota.yaml"));
//		System.out.println(UserMapWriterTest.write(Constants.YAML_DEPLOYMENT, "examples/controllers/busybox-dm.yaml"));
		System.out.println(UserMapWriterTest.write(OpenShiftConstants.KIND_BUILDCONFIG, "examples/openshift/buildconfig.yaml"));
	}
	
}
