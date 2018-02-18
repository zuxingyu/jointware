/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.olds.kubernetes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.github.isdream.chameleon.container.kubernetes.KubernetesConstants;
import com.github.isdream.chameleon.container.kubernetes.KubernetesModelGenerator;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import junit.framework.TestCase;

@SuppressWarnings("serial")
public class DeploymentTest extends TestCase {

	/*******************************************************************************
	 * 
	 * Create Deployment
	 * 
	 ********************************************************************************/
	public static Map<String, Map<String, Object>> params = new HashMap<String, Map<String, Object>>();

	static {
		
		HashMap<String, Object> main = new HashMap<String, Object>();
		params.put("main", main);
		main.put("setMetadata-setName", "busybox-dm");
		main.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("app", "busybox-dm");
			}
		});
		main.put("setMetadata-setNamespace", "test1234");
		main.put("setSpec-setReplicas", 2);
		main.put("setSpec-setTemplate-setMetadata-setName", "busybox-dm");
		main.put("setSpec-setTemplate-setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("app", "busybox-dm");
			}
		});
		
		
//		params.put("setSpec-setTemplate-setSpec-setContainers", new ArrayList<Object>() {
//			{
//				add(new HashMap<String, Object>() {
//					{
//						put("setName", "busybox-dm");
//						put("setImage", "dcr.io:5000/busybox:latest");
//						put("setCommand", new ArrayList<String>() {
//							{
//								add("sleep");
//								add("3600");
//							}
//						});
//						put("setImagePullPolicy", "IfNotPresent");
//					}
//				});
//			}
//		});
	}
	
//	public void testCreateDeployment() throws Exception {
//		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
//		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
//		generator.create(client, KubernetesConstants.KIND_DEPLOYMENT, params);
//		
//	}
	
	public void testUpdateDeployment() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelGenerator generator = new KubernetesModelGenerator();
		generator.scaleTo(client, KubernetesConstants.KIND_DEPLOYMENT, "default", "busybox-dm", 4);
	}
	
	public void testDeleteDeployment() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelGenerator generator = new KubernetesModelGenerator();
		generator.delete(client, KubernetesConstants.KIND_DEPLOYMENT, "default", "busybox-dm");
	}
}
