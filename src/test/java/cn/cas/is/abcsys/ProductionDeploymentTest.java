/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys;

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
public class ProductionDeploymentTest extends TestCase {

	/*******************************************************************************
	 * 
	 * Create Deployment
	 * 
	 ********************************************************************************/
	public static Map<String, Object> params = new HashMap<String, Object>();

	static {
		params.put("setMetadata-setName", "tomcat-43-v1-4dc75");
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
		params.put("setSpec-setStrategy-setRollingUpdate-setMaxSurge-setStrVal", "1");
		params.put("setSpec-setStrategy-setRollingUpdate-setMaxUnavailable-setStrVal", "1");
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
						put("setResources-setRequests", new HashMap<String, Object>() {
							{
								put("setAmount", "400m");
								put("setAmount", "512Mi");
							}
						});
						put("setResources-setLimits", new HashMap<String, Object>() {
							{
								put("setAmount", "800m");
								put("setAmount", "2Gi");
							}
						});
						put("setEnv", new ArrayList<Object>() {
							{
								add(new HashMap<String, Object>() {
									{
										put("setName", "MESSAGE");
										put("setValue", "“hello world”");
										put("setName", "BAD");
										put("setValue", "“bad world”");
									}
								});
							}
						});
						put("setImage", "abcsys.cn:5000/docker:tomcat-centos");
						put("setImagePullPolicy", "IfNotPresent");
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
										put("setName", "emptydir");
										put("setMountPath", "/etc");
									}
								});
							}
						});
						put("setName", "busybox");
						put("setCommand", new ArrayList<String>() {
							{
								add("sleep");
								add("3600");
							}
						});
						put("setImage", "kube-registry:5000/busybox");
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
	
	public void testCreateDeployment() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.create(client, Constants.YAML_DEPLOYMENT, params);
	}
	
//	public void testUpdateDeployment() throws Exception {
//		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
//		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
//		generator.scaleTo(client, Constants.YAML_DEPLOYMENT, "wuheng", "busybox-deployment", 1);
//	}
//	
//	public void testDeleteDeployment() throws Exception {
//		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
//		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
//		generator.delete(client, Constants.YAML_DEPLOYMENT, "wuheng", "busybox-deployment");
//	}
}
