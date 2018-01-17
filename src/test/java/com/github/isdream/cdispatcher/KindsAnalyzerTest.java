/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

import com.github.isdream.cdispatcher.KindsAnalyzer;
import com.github.isdream.cdispatcher.analyzers.KubernetesKindsAnalyzer;
import com.github.isdream.cdispatcher.analyzers.OpenShiftKindsAnalyzer;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class KindsAnalyzerTest extends TestCase {

	public void testKubernetesKindsAnalyzer() throws Exception {
		KindsAnalyzer analyzer = KubernetesKindsAnalyzer.getAnalyzer();
		Assert.assertEquals(analyzer.getKinds().contains("Namespace"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Secret"), true);
		Assert.assertEquals(analyzer.getKinds().contains("NetworkPolicy"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ConfigMap"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Deployment"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Pod"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ResourceQuota"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ReplicaSet"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Componentstatus"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Endpoint"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ServiceAccount"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Job"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Event"), true);
		Assert.assertEquals(analyzer.getKinds().contains("PersistentVolume"), true);
		Assert.assertEquals(analyzer.getKinds().contains("LimitRange"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ReplicationController"), true);
		Assert.assertEquals(analyzer.getKinds().contains("SecurityContextConstraint"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ThirdPartyResource"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Node"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Service"), true);
		Assert.assertEquals(analyzer.getKinds().contains("HorizontalPodAutoscaler"), true);
		Assert.assertEquals(analyzer.getKinds().contains("PersistentVolumeClaim"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Ingress"), true);
		Assert.assertEquals(analyzer.getKinds().contains("DaemonSet"), true);
		Assert.assertEquals(analyzer.getKinds().contains("CustomResourceDefinition"), true);
		Assert.assertEquals(analyzer.getKinds().contains("StatefulSet"), true);
		
		Assert.assertEquals(analyzer.getKinds().contains("DeploymentConfig"), false);
		Assert.assertEquals(analyzer.getKinds().contains("OAuthAuthorizeToken"), false);
		
	}
	
	public void testOpenShiftKindsAnalyzer() throws Exception {
		KindsAnalyzer analyzer = OpenShiftKindsAnalyzer.getAnalyzer();
		Assert.assertEquals(analyzer.getKinds().contains("PolicyBinding"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Namespace"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Policy"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Secret"), true);
		Assert.assertEquals(analyzer.getKinds().contains("OAuthClient"), true);
		Assert.assertEquals(analyzer.getKinds().contains("NetworkPolicy"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ConfigMap"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Deployment"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Pod"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Project"), true);
		Assert.assertEquals(analyzer.getKinds().contains("User"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ResourceQuota"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ReplicaSet"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Componentstatus"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Endpoint"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ServiceAccount"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Job"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Event"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Group"), true);
		Assert.assertEquals(analyzer.getKinds().contains("PersistentVolume"), true);
		Assert.assertEquals(analyzer.getKinds().contains("LimitRange"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ClusterRoleBinding"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ImageStreamTag"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ReplicationController"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Build"), true);
		Assert.assertEquals(analyzer.getKinds().contains("SecurityContextConstraint"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Role"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Route"), true);
		Assert.assertEquals(analyzer.getKinds().contains("RoleBinding"), true);
		Assert.assertEquals(analyzer.getKinds().contains("BuildConfig"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ThirdPartyResource"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Node"), true);
		Assert.assertEquals(analyzer.getKinds().contains("ImageStream"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Service"), true);
		Assert.assertEquals(analyzer.getKinds().contains("HorizontalPodAutoscaler"), true);
		Assert.assertEquals(analyzer.getKinds().contains("PersistentVolumeClaim"), true);
		Assert.assertEquals(analyzer.getKinds().contains("Ingress"), true);
		Assert.assertEquals(analyzer.getKinds().contains("OAuthAccessToken"), true);
		Assert.assertEquals(analyzer.getKinds().contains("DaemonSet"), true);
		Assert.assertEquals(analyzer.getKinds().contains("CustomResourceDefinition"), true);
		Assert.assertEquals(analyzer.getKinds().contains("DeploymentConfig"), true);
		Assert.assertEquals(analyzer.getKinds().contains("OAuthAuthorizeToken"), true);
		Assert.assertEquals(analyzer.getKinds().contains("StatefulSet"), true);
		
		Assert.assertEquals(analyzer.getKinds().contains("Pod2"), false);
	}
}
