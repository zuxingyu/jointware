/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.yaml.snakeyaml.Yaml;

import com.github.isdream.cdispatcher.Constants;
import com.github.isdream.cdispatcher.UserMapWriter;
import com.github.isdream.cdispatcher.analyzers.KubernetesKindModelsAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @date 2018年1月14日
 *
 */
public class UserMapWriterTest  {

	public static void main(String[] args) throws Exception {
//		System.out.println(write(Constants.YAML_DEPLOYMENT, "examples/controllers/busybox-dm.yaml"));
//		System.out.println(write(Constants.YAML_PERSISTENTVOLUME, "examples/constructors/persistentvolume.yaml"));
//		System.out.println(write(Constants.YAML_SERVICE, "examples/constructors/service.yaml"));
		System.out.println(write(Constants.YAML_DEPLOYMENT, "examples/controllers/deployment.yaml"));
	}



	protected static String write(String kind, String file) throws ClassNotFoundException, FileNotFoundException, Exception {
		Class<?> clazz = Class.forName(KubernetesKindModelsAnalyzer
							.getAnalyzer().getKindModel(kind));
		
		Object obj = new Yaml().loadAs(new FileInputStream(file), clazz);

		return new UserMapWriter().yamlToMap(obj);
	}
}
