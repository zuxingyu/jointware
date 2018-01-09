/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import cn.cas.is.abcsys.generators.KubernetesModelParametersGenerator;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;

/**
 * @author henry
 * @email wuheng@otcaix.iscas.ac.cn
 *
 * @date 2018年1月3日
 */
@SuppressWarnings("serial")
public class KVToModelParametersGeneratorTest {

	/*******************************************************************************
	 * 
	 * Create Namespace
	 * 
	 ********************************************************************************/
	public static Map<String, Object> createNSParams = new HashMap<String, Object>();

	static {
		createNSParams.put("setMetadata-setName", "wuheng");
		createNSParams.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("name", "busybox-wuheng");
				put("version", "20180788");
			}
		});
	}

	/*******************************************************************************
	 * 
	 * Delete Namespace
	 * 
	 ********************************************************************************/
	public static Map<String, Object> deleteNSParams = new HashMap<String, Object>();

	static {
		deleteNSParams.put("setMetadata-setName", "wuheng");
	}

	/*******************************************************************************
	 * 
	 * Create Deployment
	 * 
	 ********************************************************************************/
	public static Map<String, Object> createDMParams = new HashMap<String, Object>();

	static {
		createDMParams.put("setMetadata-setName", "busybox-dmdx");
		createDMParams.put("setMetadata-setNamespace", "wuheng");
		createDMParams.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("app", "busybox-dmdx");
				put("version", "20180109");
			}
		});
		createDMParams.put("setSpec-setReplicas", 3);
		createDMParams.put("setSpec-setTemplate-setMetadata-setName", "busybox-dmdx");
		createDMParams.put("setSpec-setTemplate-setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("app", "busybox-dmdx");
			}
		});
		createDMParams.put("setSpec-setTemplate-setSpec-setContainers", new ArrayList<Object>() {
			{
				add(new HashMap<String, Object>() {
					{
						put("setImage", "dcr.io:5000/busybox:latest");
						put("setImagePullPolicy", "IfNotPresent");
						put("setName", "busybox-dmdx");
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

	/*******************************************************************************
	 * 
	 * Delete Deployment
	 * 
	 ********************************************************************************/
	public static Map<String, Object> deleteDMParams = new HashMap<String, Object>();

	static {
		deleteDMParams.put("setMetadata-setName", "busybox-dmdx");
		deleteDMParams.put("setMetadata-setNamespace", "wuheng");
	}

	/*******************************************************************************
	 * 
	 * Update Deployment
	 * 
	 ********************************************************************************/
	public static Map<String, Object> updateDMParams = new HashMap<String, Object>();

	static {
		updateDMParams.put("setMetadata-setName", "busybox-dmdx");
		updateDMParams.put("setMetadata-setNamespace", "wuheng");
		updateDMParams.put("setSpec-setReplicas", 1);
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		// System.out.println(generator.delete(client, "Namespace", deleteNSParams));
		// System.out.println(generator.create(client, "Namespace", createNSParams));
		// System.out.println(generator.create(client, "Deployment", createDMParams));
		// System.out.println(generator.delete(client, "Deployment", deleteDMParams));
		System.out.println(generator.scaleTo(client, "Deployment", "wuheng", "busybox-dmdx", 8));

		// DefaultKubernetesClient client = new
		// DefaultKubernetesClient("http://127.0.0.1:9888");
		//
		// MixedOperation<Deployment, DeploymentList, DoneableDeployment,
		// ScalableResource<Deployment, DoneableDeployment>> deployments =
		// client.extensions().deployments();
		// Deployment deployment = new Deployment();
		//
		// // create
		// deployments.create(deployment );
		// // update
		// deployments.inNamespace("").withName("").scale(2);
		// // delete
		// deployments.delete(deployment);

	}

}
