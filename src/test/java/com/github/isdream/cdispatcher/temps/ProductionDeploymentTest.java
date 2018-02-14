/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.temps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.github.isdream.cdispatcher.kubernetes.KubernetesConstants;
import com.github.isdream.cdispatcher.kubernetes.KubernetesModelGenerator;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import junit.framework.TestCase;

@SuppressWarnings("serial")
public class ProductionDeploymentTest extends TestCase {

	/*******************************************************************************
	 * 
	 * Create Deployment
	 * 
	 ********************************************************************************/
	public static Map<String, Object> params = new HashMap<String, Object>();

	static {
		params.put("setMetadata-setName", "tomcat-45-v1-4dc75");
		params.put("setMetadata-setNamespace", "default");
		params.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("application-real-name", "tomcat-20180103115009290");
				put("image-group-name", "tomcat-43-v1-4dc75");
				put("version-id", "version-id-50000019");
			}
		});
		params.put("setSpec-setReplicas", 2);
		params.put("setSpec-setStrategy-setType", "RollingUpdate");
		params.put("setSpec-setStrategy-setRollingUpdate-setMaxUnavailable-setIntVal", 1);
		params.put("setSpec-setStrategy-setRollingUpdate-setMaxSurge-setIntVal", 1);
		params.put("setSpec-setTemplate-setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("application-real-name", "tomcat-20180103115009290");
				put("image-group-name", "tomcat-43-v1-4dc75");
				put("version-id", "version-id-50000019");
			}
		});
		params.put("setSpec-setTemplate-setSpec-setContainers", new ArrayList<Object>() {
			{
				add(new HashMap<String, Object>() {
					{
						put("setName", "tomcat1");
						put("setResources-setLimits", new HashMap<String, Object>() {
							{
								put("cpu", new ArrayList<Object>() {
									{
										add(new HashMap<String, Object>() {
											{
												put("setAmount", "800m");
											}
										});
									}
								});
								put("memory", new ArrayList<Object>() {
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
						put("setResources-setRequests", new HashMap<String, Object>() {
							{
								put("cpu", new ArrayList<Object>() {
									{
										add(new HashMap<String, Object>() {
											{
												put("setAmount", "400m");
											}
										});
									}
								});
								put("memory", new ArrayList<Object>() {
									{
										add(new HashMap<String, Object>() {
											{
												put("setAmount", "512Mi");
											}
										});
									}
								});
							}
						});
						put("setEnv", new ArrayList<Object>() {
							{
								add(new HashMap<String, Object>() {
									{
										put("setName", "MESSAGE");
										put("setValue", "“hello world”");
									}
								});
								add(new HashMap<String, Object>() {
									{
										put("setName", "BAD");
										put("setValue", "“bad world”");
									}
								});
							}
						});
						put("setImage", "dcr.io:5000/tomcat:latest");
						put("setPorts", new ArrayList<Object>() {
							{
								add(new HashMap<String, Object>() {
									{
										put("setContainerPort", 8080);
									}
								});
							}
						});
						put("setVolumeMounts", new ArrayList<Object>() {
							{
								add(new HashMap<String, Object>() {
									{
										put("setName", "hostpath");
										put("setMountPath", "/opt");
									}
								});
								add(new HashMap<String, Object>() {
									{
										put("setName", "emptydir");
										put("setMountPath", "/etc");
									}
								});
							}
						});
						put("setImagePullPolicy", "IfNotPresent");
					}
				});
				add(new HashMap<String, Object>() {
					{
						put("setName", "busybox");
						put("setCommand", new ArrayList<String>() {
							{
								add("sleep");
								add("3600");
							}
						});
						put("setImage", "dci.io:5000/busybox:latest");
						put("setImagePullPolicy", "IfNotPresent");
					}
				});
			}
		});
		params.put("setSpec-setTemplate-setSpec-setDnsPolicy", "ClusterFirst");
		params.put("setSpec-setTemplate-setSpec-setRestartPolicy", "Always");
		params.put("setSpec-setTemplate-setSpec-setSchedulerName", "default-scheduler");
		params.put("setSpec-setTemplate-setSpec-setVolumes", new ArrayList<Object>() {
			{
				add(new HashMap<String, Object>() {
					{
						put("setName", "hostpath");
						put("setHostPath-setPath", "/opt");
					}
				});
				add(new HashMap<String, Object>() {
					{
						put("setName", "emptydir");
					}
				});
			}
		});
		params.put("setSpec-setTemplate-setSpec-setTerminationGracePeriodSeconds", 30);
		params.put("setSpec-setSelector-setMatchLabels", new HashMap<String, String>() {
			{
				put("image-group-name", "tomcat-43-v1-4dc75");
			}
		});
	}
	
//	public void testCreateDeployment() throws Exception {
//		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
//		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
//		generator.create(client, KubernetesConstants.KIND_DEPLOYMENT, params);
//	}
	
//	public void testUpdateDeployment() throws Exception {
//		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
//		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
//		generator.scaleTo(client, Constants.YAML_DEPLOYMENT, "default", "tomcat-45-v1-4dc75", 1);
//	}
//	
//	public void testDeleteDeployment() throws Exception {
//		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
//		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
//		generator.delete(client, Constants.YAML_DEPLOYMENT, "default", "tomcat-45-v1-4dc75");
//	}
}
