/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.kinds.constructors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.github.isdream.cdispatcher.Constants;
import com.github.isdream.cdispatcher.kubernetes.KubernetesModelParametersGenerator;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import junit.framework.TestCase;

@SuppressWarnings("serial")
public class NodeTest extends TestCase {

	/*******************************************************************************
	 * 
	 * Create Namespace
	 * 
	 ********************************************************************************/
	public static Map<String, Object> createNodeParams = new HashMap<String, Object>();

	static {
		createNodeParams.put("setMetadata-setName", "izm5e5tgjv84bevngsmq1az");
		createNodeParams.put("setSpec-setTaints", new ArrayList<Object>() {
			{
				add(new HashMap<String, Object>() {
					{
					put("setKey", "node-role.kubernetes.io/salve");
					put("setEffect", "NoSchedule");
					}
				});
			}
		});
		createNodeParams.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("name", "izm5e5tgjv84bevngsmq1az");
				put("node-role.kubernetes.io/salve", "");
			}
		});
	}

	
	public void testCreateNode() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		System.out.println(generator.create(client, Constants.YAML_NODE, createNodeParams));
	}
	
	public void testDeleteNode() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.delete(client, Constants.YAML_NODE, "izm5e5tgjv84bevngsmq1az");
	}
}
