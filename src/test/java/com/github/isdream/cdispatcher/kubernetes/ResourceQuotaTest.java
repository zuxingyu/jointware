/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.kubernetes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.github.isdream.cdispatcher.Constants;
import com.github.isdream.cdispatcher.kubernetes.KubernetesModelParametersGenerator;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import junit.framework.TestCase;

@SuppressWarnings("serial")
public class ResourceQuotaTest extends TestCase {

	/*******************************************************************************
	 * 
	 * Create Namespace
	 * 
	 ********************************************************************************/
	public static Map<String, Object> params = new HashMap<String, Object>();

	static {
		params.put("setMetadata-setName", "compute-resources");
		params.put("setMetadata-setNamespace", "wuheng");
		params.put("setSpec-setHard", new HashMap<String, Object>() {
			{
				put("pods", new ArrayList<Object>() {
					{
						add(new HashMap<String, Object>() {
							{
								put("setAmount", "4");
							}
						});
					}
				});
				put("requests.cpu", new ArrayList<Object>() {
					{
						add(new HashMap<String, Object>() {
							{
								put("setAmount", "1");
							}
						});
					}
				});
				put("requests.memory", new ArrayList<Object>() {
					{
						add(new HashMap<String, Object>() {
							{
								put("setAmount", "1Gi");
							}
						});
					}
				});
				put("limits.cpu", new ArrayList<Object>() {
					{
						add(new HashMap<String, Object>() {
							{
								put("setAmount", "2");
							}
						});
					}
				});
				put("limits.memory", new ArrayList<Object>() {
					{
						add(new HashMap<String, Object>() {
							{
								put("setAmount", "2Gi");
							}
						});
					}
				});
			}
		});
	}

	
	public void testCreateResourceQuota() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.create(client, Constants.YAML_RESOURCEQUOTA, params);
		
	}
	
	public void testDeleteResourceQuota() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.delete(client, Constants.YAML_RESOURCEQUOTA, "wuheng", "compute-resources");
		
	}
	
}
