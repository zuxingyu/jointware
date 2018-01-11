/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys.kinds.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import cn.cas.is.abcsys.Constants;
import cn.cas.is.abcsys.generators.KubernetesModelParametersGenerator;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @date   2018年1月10日
 *
 */
@SuppressWarnings("serial")
public class DaemonSetTest extends TestCase {

	/*******************************************************************************
	 * 
	 * Create Deployment
	 * 
	 ********************************************************************************/
	public static Map<String, Object> createDMParams = new HashMap<String, Object>();

	static {
		createDMParams.put("setMetadata-setName", "busybox-daemonset");
		createDMParams.put("setMetadata-setNamespace", "wuheng");
		createDMParams.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("app", "busybox-daemonset");
				put("version", "20180109");
			}
		});
		createDMParams.put("setSpec-setTemplate-setMetadata-setName", "busybox-daemonset");
		createDMParams.put("setSpec-setTemplate-setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("app", "busybox-daemonset");
				put("version", "20180109");
			}
		});
		createDMParams.put("setSpec-setTemplate-setSpec-setContainers", new ArrayList<Object>() {
			{
				add(new HashMap<String, Object>() {
					{
						put("setImage", "dcr.io:5000/busybox:latest");
						put("setImagePullPolicy", "IfNotPresent");
						put("setName", "busybox-daemonset");
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
	
	public void testCreateDaemonSet() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.create(client, Constants.YAML_DAEMONSET, createDMParams);
	}
	
	
	public void testDeleteDaemonSet() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.delete(client, Constants.YAML_DAEMONSET, "wuheng", "busybox-daemonset");
	}
}
