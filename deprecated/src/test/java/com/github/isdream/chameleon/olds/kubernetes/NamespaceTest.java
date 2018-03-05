/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.olds.kubernetes;

import java.util.HashMap;
import java.util.Map;

import com.github.isdream.chameleon.container.kubernetes.KubernetesModelGenerator;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import junit.framework.TestCase;

@SuppressWarnings("serial")
public class NamespaceTest extends TestCase {

	/*******************************************************************************
	 * 
	 * Create Namespace
	 * 
	 ********************************************************************************/
	public static Map<String, Map<String, Object>> params = new HashMap<String, Map<String, Object>>();

	static {
		HashMap<String, Object> main = new HashMap<String, Object>();
		params.put("main", main);
		main.put("setMetadata-setName", "test431");
		main.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("name", "busybox-wuheng");
				put("version", "20180788");
			}
		});
	}

	
	public void testCreateNamespace() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelGenerator generator = new KubernetesModelGenerator();
		generator.create(client, "Namespace", params);
	}
	
	public void testDeleteNamespace() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelGenerator generator = new KubernetesModelGenerator();
		generator.delete(client, "Namespace", "test431");
	}
}
