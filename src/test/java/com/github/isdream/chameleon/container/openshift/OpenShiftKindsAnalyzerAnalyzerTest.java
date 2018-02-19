/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.openshift;

import java.util.Set;

import com.github.isdream.chameleon.container.FeaturesUtils;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月19日
 */
public class OpenShiftKindsAnalyzerAnalyzerTest extends TestCase {

	Set<String> kinds = null;
	
	@Override
	protected void setUp() throws Exception {
		kinds = new OpenShiftKindsAnalyzer().getKinds();
	}

	public void testFeaturesWithTrueResults() {
		Assert.assertEquals(kinds.contains("Policy"), true);
		Assert.assertEquals(kinds.contains("Group"), true);
		Assert.assertEquals(kinds.contains("ServiceAccount"), true);
		Assert.assertEquals(kinds.contains("User"), true);
		Assert.assertEquals(kinds.contains("OAuthClient"), true);
		Assert.assertEquals(kinds.contains("ThirdPartyResource"), true);
		Assert.assertEquals(kinds.contains("ClusterRoleBinding"), true);
		Assert.assertEquals(kinds.contains("Node"), true);
		Assert.assertEquals(kinds.contains("ImageStreamTag"), true);
		Assert.assertEquals(kinds.contains("Deployment"), true);
		Assert.assertEquals(kinds.contains("ImageStream"), true);
		Assert.assertEquals(kinds.contains("Endpoint"), true);
		Assert.assertEquals(kinds.contains("ResourceQuota"), true);
		Assert.assertEquals(kinds.contains("Build"), true);
		Assert.assertEquals(kinds.contains("ReplicationController"), true);
		Assert.assertEquals(kinds.contains("BuildConfig"), true);
		Assert.assertEquals(kinds.contains("RoleBinding"), true);
		Assert.assertEquals(kinds.contains("Job"), true);
		Assert.assertEquals(kinds.contains("ReplicaSet"), true);
		Assert.assertEquals(kinds.contains("Route"), true);
		Assert.assertEquals(kinds.contains("Pod"), true);
		Assert.assertEquals(kinds.contains("ConfigMap"), true);
		Assert.assertEquals(kinds.contains("NetworkPolicy"), true);
		Assert.assertEquals(kinds.contains("CustomResourceDefinition"), true);
		Assert.assertEquals(kinds.contains("Ingress"), true);
		Assert.assertEquals(kinds.contains("Service"), true);
		Assert.assertEquals(kinds.contains("SecurityContextConstraint"), true);
		Assert.assertEquals(kinds.contains("Namespace"), true);
		Assert.assertEquals(kinds.contains("PolicyBinding"), true);
		Assert.assertEquals(kinds.contains("OAuthAuthorizeToken"), true);
		Assert.assertEquals(kinds.contains("Secret"), true);
		Assert.assertEquals(kinds.contains("Role"), true);
		Assert.assertEquals(kinds.contains("Project"), true);
		Assert.assertEquals(kinds.contains("LimitRange"), true);
		Assert.assertEquals(kinds.contains("HorizontalPodAutoscaler"), true);
		Assert.assertEquals(kinds.contains("Event"), true);
		Assert.assertEquals(kinds.contains("DaemonSet"), true);
		Assert.assertEquals(kinds.contains("PersistentVolumeClaim"), true);
		Assert.assertEquals(kinds.contains("OAuthAccessToken"), true);
		Assert.assertEquals(kinds.contains("PersistentVolume"), true);
		Assert.assertEquals(kinds.contains("Componentstatus"), true);
		Assert.assertEquals(kinds.contains("StatefulSet"), true);
		Assert.assertEquals(kinds.contains("DeploymentConfig"), true);
	}
	
	public void testFeaturesWithFalseResults() {
		Assert.assertEquals(kinds.contains("PolicyFalse"), false);
		Assert.assertEquals(kinds.contains("GroupFalse"), false);
		Assert.assertEquals(kinds.contains("ServiceAccountFalse"), false);
		Assert.assertEquals(kinds.contains("UserFalse"), false);
		Assert.assertEquals(kinds.contains("OAuthClientFalse"), false);
		Assert.assertEquals(kinds.contains("ThirdPartyResourceFalse"), false);
		Assert.assertEquals(kinds.contains("ClusterRoleBindingFalse"), false);
		Assert.assertEquals(kinds.contains("NodeFalse"), false);
		Assert.assertEquals(kinds.contains("ImageStreamTagFalse"), false);
		Assert.assertEquals(kinds.contains("DeploymentFalse"), false);
		Assert.assertEquals(kinds.contains("ImageStreamFalse"), false);
		Assert.assertEquals(kinds.contains("EndpointFalse"), false);
		Assert.assertEquals(kinds.contains("ResourceQuotaFalse"), false);
		Assert.assertEquals(kinds.contains("BuildFalse"), false);
		Assert.assertEquals(kinds.contains("ReplicationControllerFalse"), false);
		Assert.assertEquals(kinds.contains("BuildConfigFalse"), false);
		Assert.assertEquals(kinds.contains("RoleBindingFalse"), false);
		Assert.assertEquals(kinds.contains("JobFalse"), false);
		Assert.assertEquals(kinds.contains("ReplicaSetFalse"), false);
		Assert.assertEquals(kinds.contains("RouteFalse"), false);
		Assert.assertEquals(kinds.contains("PodFalse"), false);
		Assert.assertEquals(kinds.contains("ConfigMapFalse"), false);
		Assert.assertEquals(kinds.contains("NetworkPolicyFalse"), false);
		Assert.assertEquals(kinds.contains("CustomResourceDefinitionFalse"), false);
		Assert.assertEquals(kinds.contains("IngressFalse"), false);
		Assert.assertEquals(kinds.contains("ServiceFalse"), false);
		Assert.assertEquals(kinds.contains("SecurityContextConstraintFalse"), false);
		Assert.assertEquals(kinds.contains("NamespaceFalse"), false);
		Assert.assertEquals(kinds.contains("PolicyBindingFalse"), false);
		Assert.assertEquals(kinds.contains("OAuthAuthorizeTokenFalse"), false);
		Assert.assertEquals(kinds.contains("SecretFalse"), false);
		Assert.assertEquals(kinds.contains("RoleFalse"), false);
		Assert.assertEquals(kinds.contains("ProjectFalse"), false);
		Assert.assertEquals(kinds.contains("LimitRangeFalse"), false);
		Assert.assertEquals(kinds.contains("HorizontalPodAutoscalerFalse"), false);
		Assert.assertEquals(kinds.contains("EventFalse"), false);
		Assert.assertEquals(kinds.contains("DaemonSetFalse"), false);
		Assert.assertEquals(kinds.contains("PersistentVolumeClaimFalse"), false);
		Assert.assertEquals(kinds.contains("OAuthAccessTokenFalse"), false);
		Assert.assertEquals(kinds.contains("PersistentVolumeFalse"), false);
		Assert.assertEquals(kinds.contains("ComponentstatusFalse"), false);
		Assert.assertEquals(kinds.contains("StatefulSetFalse"), false);
		Assert.assertEquals(kinds.contains("DeploymentConfigFalse"), false);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OpenShiftKindsAnalyzer oka = new OpenShiftKindsAnalyzer();
		FeaturesUtils.showAll("OpenShift", oka.getKinds());
		FeaturesUtils.testFeaturesWithTrueResults(oka.getKinds());
		FeaturesUtils.testFeaturesWithFalseResults(oka.getKinds());
	}


}
