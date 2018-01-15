/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.yaml.snakeyaml.Yaml;

import cn.cas.is.abcsys.analyzers.KubernetesKindModelsAnalyzer;
import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @date 2018年1月14日
 *
 */
public class UserMapWriterTest extends TestCase {

	public static void main(String[] args) throws Exception {
//		System.out.println(write(Constants.YAML_DEPLOYMENT, "examples/controllers/busybox-dm.yaml"));
//		System.out.println(write(Constants.YAML_PERSISTENTVOLUME, "examples/constructors/persistentvolume.yaml"));
		System.out.println(write(Constants.YAML_SERVICE, "examples/constructors/service.yaml"));
//		System.out.println(write(Constants.YAML_DEPLOYMENT, "examples/controllers/deployment.yaml"));
	}



	protected static String write(String kind, String file) throws ClassNotFoundException, FileNotFoundException, Exception {
		Class<?> clazz = Class.forName(KubernetesKindModelsAnalyzer
							.getAnalyzer().getKindModel(kind));
		
		Object obj = new Yaml().loadAs(new FileInputStream(file), clazz);

		return new UserMapWriter().yamlToMap(obj);
	}
}
