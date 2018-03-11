/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package v3.application.kinds;

import io.fabric8.kubernetes.api.model.Namespace;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月6日
 */
public class NamespaceObject extends KubernetesObject {

	public static String FILE = "D:\\bad\\jointware\\jointware-services\\jointware-bocloud\\src\\main\\resources\\example\\ns.yaml";

	@Override
	public String getTargetFile() {
		return FILE;
	}

	@Override
	public Class<?> getTargetClass() {
		return Namespace.class;
	}
	
}
