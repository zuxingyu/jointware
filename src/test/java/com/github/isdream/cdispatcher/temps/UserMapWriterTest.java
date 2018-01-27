/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.temps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.yaml.snakeyaml.Yaml;

import com.github.isdream.cdispatcher.Constants;
import com.github.isdream.cdispatcher.UserMapWriter;
import com.github.isdream.cdispatcher.openshift.OpenShiftKindModelsAnalyzer;

public class UserMapWriterTest  {

	public static void main(String[] args) throws Exception {
//		System.out.println(write(Constants.YAML_DEPLOYMENT, "examples/controllers/busybox-dm.yaml"));
//		System.out.println(write(Constants.YAML_PERSISTENTVOLUME, "examples/constructors/persistentvolume.yaml"));
//		System.out.println(write(Constants.YAML_SERVICE, "examples/constructors/service.yaml"));
//		System.out.println(write(Constants.YAML_DEPLOYMENT, "examples/controllers/deployment.yaml"));
		System.out.println(write(Constants.YAML_BUILDCONFIG, "examples/openshift/buildconfig.yaml"));
	}



	protected static String write(String kind, String file) throws ClassNotFoundException, FileNotFoundException, Exception {
		Class<?> clazz = Class.forName(OpenShiftKindModelsAnalyzer
							.getAnalyzer().getKindModel(kind));
		
		Object obj = new Yaml().loadAs(new FileInputStream(file), clazz);

		return new UserMapWriter().yamlToMap(obj);
	}
}
