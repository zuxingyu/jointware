/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.kubernetes;

import java.util.HashMap;

import io.fabric8.kubernetes.api.model.Namespace;
import io.fabric8.kubernetes.api.model.ObjectMeta;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月1日
 */
public class KubernetesObjects {

	public final static Namespace createNamespace () {
		Namespace ns = new Namespace();
		ObjectMeta metadata = new ObjectMeta();
		metadata.setName("test431");
		HashMap<String, String> labels = new HashMap<String, String>();
		labels.put("name", "busybox");
		labels.put("version", "20180201");
		metadata.setLabels(labels);
		ns.setMetadata(metadata );
		return ns;
	}
}
