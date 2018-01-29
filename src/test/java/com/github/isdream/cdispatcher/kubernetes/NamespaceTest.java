/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.kubernetes;

import java.util.HashMap;
import java.util.Map;

import com.github.isdream.cdispatcher.kubernetes.KubernetesModelParametersGenerator;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import junit.framework.TestCase;

@SuppressWarnings("serial")
public class NamespaceTest extends TestCase {

	/*******************************************************************************
	 * 
	 * Create Namespace
	 * 
	 ********************************************************************************/
	public static Map<String, Object> createNSParams = new HashMap<String, Object>();

	static {
		createNSParams.put("setMetadata-setName", "test431");
		createNSParams.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("name", "busybox-wuheng");
				put("version", "20180788");
			}
		});
	}

	
	public void testCreateNamespace() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.create(client, KubernetesConstants.KIND_NAMESPACE, createNSParams);
	}
	
//	public void testDeleteNamespace() throws Exception {
//		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
//		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
//		generator.delete(client, Constants.YAML_NAMESPACE, "wuheng");
//	}
}
