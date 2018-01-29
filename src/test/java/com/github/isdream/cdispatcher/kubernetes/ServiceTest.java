/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.kubernetes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.github.isdream.cdispatcher.kubernetes.KubernetesModelParametersGenerator;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import junit.framework.TestCase;

@SuppressWarnings("serial")
public class ServiceTest extends TestCase {

	/*******************************************************************************
	 * 
	 * Create Namespace
	 * 
	 ********************************************************************************/
	public static Map<String, Object> params = new HashMap<String, Object>();

	static {
		params.put("setMetadata-setName", "service-tomcat");
		params.put("setMetadata-setNamespace", "wuheng");
		params.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("name", "label-tomcat");
			}
		});
		params.put("setSpec-setType", "NodePort");
		params.put("setSpec-setSelector", new HashMap<String, String>() {
			{
				put("name", "label-tomcat");
				put("version", "v1");
			}
		});
		params.put("setSpec-setPorts", new ArrayList<Object>() {
			{
				add(new HashMap<String, Object>() {
					{
						put("setPort", 8080);
						put("setNodePort", 31234);
						put("setTargetPort-setIntVal", 8080);
					}
				});
			}
		});
	}
	
	public void testCreateSVC() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		System.out.println(generator.create(client, KubernetesConstants.KIND_SERVICE, params));
	}
	
//	public void testDeleteNode() throws Exception {
//		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
//		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
//		generator.delete(client, Constants.YAML_NODE, "izm5e5tgjv84bevngsmq1az");
//	}
}
