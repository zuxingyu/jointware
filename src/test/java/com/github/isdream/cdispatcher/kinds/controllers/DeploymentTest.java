/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.kinds.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.github.isdream.cdispatcher.Constants;
import com.github.isdream.cdispatcher.generators.KubernetesModelParametersGenerator;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @date   2018年1月10日
 *
 */
@SuppressWarnings("serial")
public class DeploymentTest extends TestCase {

	/*******************************************************************************
	 * 
	 * Create Deployment
	 * 
	 ********************************************************************************/
	public static Map<String, Object> params = new HashMap<String, Object>();

	static {
		params.put("setMetadata-setName", "busybox-dm");
		params.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("app", "busybox-dm");
			}
		});
		params.put("setMetadata-setNamespace", "wuheng");
		params.put("setSpec-setReplicas", 2);
		params.put("setSpec-setTemplate-setMetadata-setName", "busybox-dm");
		params.put("setSpec-setTemplate-setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("app", "busybox-dm");
			}
		});
		params.put("setSpec-setTemplate-setSpec-setContainers", new ArrayList<Object>() {
			{
				add(new HashMap<String, Object>() {
					{
						put("setName", "busybox-dm");
						put("setImage", "dcr.io:5000/busybox:latest");
						put("setCommand", new ArrayList<String>() {
							{
								add("sleep");
								add("3600");
							}
						});
						put("setImagePullPolicy", "IfNotPresent");
					}
				});
			}
		});
	}
	
	public void testCreateDeployment() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.create(client, Constants.YAML_DEPLOYMENT, params);
	}
	
	public void testUpdateDeployment() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.scaleTo(client, Constants.YAML_DEPLOYMENT, "wuheng", "busybox-dm", 1);
	}
	
	public void testDeleteDeployment() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.delete(client, Constants.YAML_DEPLOYMENT, "wuheng", "busybox-dm");
	}
}
