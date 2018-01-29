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
import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 */
@SuppressWarnings("serial")
public class BuildConfig extends TestCase {

	public static Map<String, Object> params = new HashMap<String, Object>();

	static {
		params.put("setStatus-setLastVersion", 0);
		params.put("setMetadata-setName", "testing-pipeline");
		params.put("setMetadata-setNamespace", "jenkins");
		params.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("app", "jenkins-pipeline-testing");
				put("name", "testing-pipeline");
				put("template", "application-template-testing-pipeline");
			}
		});
		params.put("setSpec-setRunPolicy", "Serial");
		params.put("setSpec-setSource-setType", "None");
		params.put("setSpec-setStrategy-setType", "JenkinsPipeline");
		params.put("setSpec-setStrategy-setJenkinsPipelineStrategy-setJenkinsfile", "node {"
	         + "stage 'tag'"
	         + "openshiftTag(namespace: 'development', sourceStream: 'nodejs-example', sourceTag: 'latest', destinationNamespace: 'testing', destinationStream: 'nodejs-example', destinationTag: 'latest')"
	         + "stage 'deploy'"
	         + "openshiftDeploy(deploymentConfig: 'nodejs-example', namespace: 'testing')"
	         + "}");
		params.put("setSpec-setTriggers", new ArrayList<Object>() {
			{
				add(new HashMap<String, Object>() {
					{
						put("setType", "GitHub");
						put("setGithub-setSecret", "secret101");
					}
				});
				add(new HashMap<String, Object>() {
					{
						put("setType", "Generic");
						put("setGeneric-setSecret", "secret101");
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
		generator.create(client, OpenShiftConstants.KIND_BUILDCONFIG, params);
		
	}
}
