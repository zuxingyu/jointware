/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes.kinds;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.yaml.snakeyaml.Yaml;

import io.fabric8.kubernetes.api.model.Namespace;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月6日
 */
public class NamespaceObject {

	public static String FILE = "examples/namespace.yaml";
	
	public static Namespace createNamespace() {
		try {
			return new Yaml().loadAs(
					new FileInputStream(
							new File(FILE)), Namespace.class);
		} catch (FileNotFoundException e) {
			return new Namespace();
		}
	}
	
}
