/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.kubernetes.olds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.github.isdream.cdispatcher.kubernetes.KubernetesConstants;
import com.github.isdream.cdispatcher.kubernetes.KubernetesModelParametersGenerator;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import junit.framework.TestCase;

@SuppressWarnings("serial")
public class JobTest extends TestCase {

	/*******************************************************************************
	 * 
	 * Create Deployment
	 * 
	 ********************************************************************************/
	public static Map<String, Object> createDMParams = new HashMap<String, Object>();

	static {
		createDMParams.put("setMetadata-setName", "busybox-job");
		createDMParams.put("setMetadata-setNamespace", "wuheng");
		createDMParams.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("app", "busybox-job");
				put("version", "20180109");
			}
		});
		createDMParams.put("setSpec-setReplicas", 3);
		createDMParams.put("setSpec-setTemplate-setMetadata-setName", "busybox-job");
		createDMParams.put("setSpec-setTemplate-setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("app", "busybox-job");
				put("version", "20180109");
			}
		});
		createDMParams.put("setSpec-setTemplate-setSpec-setContainers", new ArrayList<Object>() {
			{
				add(new HashMap<String, Object>() {
					{
						put("setImage", "dcr.io:5000/busybox:latest");
						put("setImagePullPolicy", "IfNotPresent");
						put("setName", "busybox-job");
						put("setCommand", new ArrayList<String>() {
							{
								add("sleep");
								add("3600");
							}
						});
					}
				});
			}
		});
	}
	
	public void testCreateJob() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.create(client, KubernetesConstants.KIND_STATEFULSET, createDMParams);
	}
	
	public void testUpdateJob() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.scaleTo(client, KubernetesConstants.KIND_STATEFULSET, "wuheng", "busybox-job", 1);
	}
	
	public void testDeleteJob() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.delete(client, KubernetesConstants.KIND_STATEFULSET, "wuheng", "busybox-job");
	}
}