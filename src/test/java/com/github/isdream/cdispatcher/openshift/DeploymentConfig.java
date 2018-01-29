/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.openshift;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.github.isdream.cdispatcher.openshift.OpenShiftModelParametersGenerator;

import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.openshift.client.DefaultOpenShiftClient;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 */
@SuppressWarnings("serial")
public class DeploymentConfig {

	public static Map<String, Object> params = new HashMap<String, Object>();

	static {
		params.put("setMetadata-setName", "jenkins1");
		params.put("setMetadata-setNamespace", "jenkins");
		params.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("app", "jenkins-ephemeral");
				put("template", "jenkins-ephemeral-template");
			}
		});
		params.put("setSpec-setReplicas", 1);
		params.put("setSpec-setTemplate-setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("name", "jenkins");
			}
		});
		params.put("setSpec-setTemplate-setSpec-setServiceAccount", "jenkins");
		params.put("setSpec-setTemplate-setSpec-setServiceAccountName", "jenkins");
		params.put("setSpec-setTemplate-setSpec-setTerminationGracePeriodSeconds", 30);
		params.put("setSpec-setTemplate-setSpec-setContainers", new ArrayList<Object>() {
			{
				add(new HashMap<String, Object>() {
					{
						put("setName", "jenkins");
						put("setResources-setLimits", new HashMap<String, Object>() {
							{
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
						put("setSecurityContext-setPrivileged", false);
						put("setImage", "registry.example.com:5000/openshift3/jenkins-2-rhel7@sha256:35c6d6ff8645928b10f41293c20a005cd704a0ac8222600cc069313966cf535d");
						put("setImagePullPolicy", "IfNotPresent");
						put("setReadinessProbe-setTimeoutSeconds", 3);
						put("setReadinessProbe-setFailureThreshold", 3);
						put("setReadinessProbe-setInitialDelaySeconds", 3);
						put("setReadinessProbe-setSuccessThreshold", 1);
						put("setReadinessProbe-setHttpGet-setPath", "/login");
						put("setReadinessProbe-setHttpGet-setScheme", "HTTP");
						put("setReadinessProbe-setHttpGet-setPort-setIntVal", 8080);
						put("setReadinessProbe-setPeriodSeconds", 10);
						put("setEnv", new ArrayList<Object>() {
							{
								add(new HashMap<String, Object>() {
									{
										put("setName", "OPENSHIFT_ENABLE_OAUTH");
										put("setValue", "true");
									}
								});
								add(new HashMap<String, Object>() {
									{
										put("setName", "OPENSHIFT_ENABLE_REDIRECT_PROMPT");
										put("setValue", "true");
									}
								});
								add(new HashMap<String, Object>() {
									{
										put("setName", "KUBERNETES_MASTER");
										put("setValue", "https://kubernetes.default:443");
									}
								});
								add(new HashMap<String, Object>() {
									{
										put("setName", "KUBERNETES_TRUST_CERTIFICATES");
										put("setValue", "true");
									}
								});
								add(new HashMap<String, Object>() {
									{
										put("setName", "JNLP_SERVICE_NAME");
										put("setValue", "jenkins-jnlp");
									}
								});
							}
						});
						put("setLivenessProbe-setTimeoutSeconds", 3);
						put("setLivenessProbe-setFailureThreshold", 30);
						put("setLivenessProbe-setInitialDelaySeconds", 420);
						put("setLivenessProbe-setSuccessThreshold", 1);
						put("setLivenessProbe-setHttpGet-setPath", "/login");
						put("setLivenessProbe-setHttpGet-setScheme", "HTTP");
						put("setLivenessProbe-setHttpGet-setPort-setIntVal", 8080);
						put("setLivenessProbe-setPeriodSeconds", 10);
						put("setVolumeMounts", new ArrayList<Object>() {
							{
								add(new HashMap<String, Object>() {
									{
										put("setName", "jenkins-data");
										put("setMountPath", "/var/lib/jenkins");
									}
								});
							}
						});
						put("setTerminationMessagePath", "/dev/termination-log");
					}
				});
			}
		});
		params.put("setSpec-setTemplate-setSpec-setDnsPolicy", "ClusterFirst");
		params.put("setSpec-setTemplate-setSpec-setRestartPolicy", "Always");
		params.put("setSpec-setTemplate-setSpec-setVolumes", new ArrayList<Object>() {
			{
				add(new HashMap<String, Object>() {
					{
						put("setName", "jenkins-data");
					}
				});
			}
		});
		params.put("setSpec-setStrategy-setType", "Recreate");
		params.put("setSpec-setStrategy-setRecreateParams-setTimeoutSeconds", 600);
		params.put("setSpec-setSelector", new HashMap<String, String>() {
			{
				put("name", "jenkins");
			}
		});
		params.put("setSpec-setTest", false);
		params.put("setSpec-setTriggers", new ArrayList<Object>() {
			{
				add(new HashMap<String, Object>() {
					{
						put("setType", "ImageChange");
						put("setImageChangeParams-setContainerNames", new ArrayList<String>() {
							{
								add("jenkins");
							}
						});
						put("setImageChangeParams-setLastTriggeredImage", "registry.example.com:5000/openshift3/jenkins-2-rhel7@sha256:35c6d6ff8645928b10f41293c20a005cd704a0ac8222600cc069313966cf535d");
						put("setImageChangeParams-setAutomatic", true);
						put("setImageChangeParams-setFrom-setName", "jenkins:latest");
						put("setImageChangeParams-setFrom-setNamespace", "openshift");
					}
				});
				add(new HashMap<String, Object>() {
					{
						put("setType", "ConfigChange");
					}
				});
			}
		});
	}
	
	public void testCreateDeployment() throws Exception {
		Config config = new ConfigBuilder().withMasterUrl("https://192.168.1.191:8443").build();
		config.setTrustCerts(true);
		config.setOauthToken("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJrdWJlcm5ldGVzL3NlcnZpY2VhY2NvdW50Iiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9uYW1lc3BhY2UiOiJtYW5hZ2VtZW50LWluZnJhIiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9zZWNyZXQubmFtZSI6Im1hbmFnZW1lbnQtYWRtaW4tdG9rZW4tMTFsZmciLCJrdWJlcm5ldGVzLmlvL3NlcnZpY2VhY2NvdW50L3NlcnZpY2UtYWNjb3VudC5uYW1lIjoibWFuYWdlbWVudC1hZG1pbiIsImt1YmVybmV0ZXMuaW8vc2VydmljZWFjY291bnQvc2VydmljZS1hY2NvdW50LnVpZCI6IjA5NmNkMDEzLWY2ZDctMTFlNy05MzhiLTAwNTA1NjljMzZlYiIsInN1YiI6InN5c3RlbTpzZXJ2aWNlYWNjb3VudDptYW5hZ2VtZW50LWluZnJhOm1hbmFnZW1lbnQtYWRtaW4ifQ.mCS-c-BjzpTZo9qPKbLavV-pP9Rhw6ex-NpruvLxG7RUJsVkCVQ_MU6n08g3zyj22lmFgFNOvsGqL_YGwe9xJ3572cHNJalrsoGgv676qeNbpXFBQ5B9mdc2nW6IdpDtdZUxrF_5Ov9X1l6hB4I3A2LPWsLi9SV_27VeE74_PGIFbvRjK6ZkyYJgv71cARDo2EV_Rv_S1XsYfMH_8oa_KFJ7hHRyAhzIRkspIrnI4mPAEij_q0FpIC73qIb4uKBsrjBwp7LjDalMMuOs7_3tpAEIJbS4ELtKpfGSCvIyxEz9KZg-h25pSLF4zoWiaxnFWk8TcBItIWTbbpzC5c_SDg");
		DefaultOpenShiftClient client  = new DefaultOpenShiftClient(config);
		OpenShiftModelParametersGenerator generator = new OpenShiftModelParametersGenerator();
		generator.create(client, OpenShiftConstants.KIND_DEPLOYMENTCONFIG, params);
		
	}
}
