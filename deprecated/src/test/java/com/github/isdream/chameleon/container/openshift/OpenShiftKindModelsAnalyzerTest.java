/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.openshift;

import java.util.Collection;
import java.util.Map;

import org.junit.Assert;

import com.github.isdream.chameleon.ModelsUtils;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月20日
 */
public class OpenShiftKindModelsAnalyzerTest extends TestCase {

	Map<String, String> kindModels = null;
	
	@Override
	protected void setUp() throws Exception {
		kindModels = new OpenShiftKindModelsAnalyzer().getKindModels();
	}

	public void testEuqalFeatures() {
		Assert.assertEquals(ModelsUtils.testGreatAndEuqalFeatures(
						new OpenShiftKindsAnalyzer().getKinds(), 
						kindModels.keySet()), true);
	}
	
	public void testModelsWithTrueResults() {
		Collection<String> models = kindModels.values();
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.Policy"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.Group"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ServiceAccount"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.User"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.OAuthClient"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.ClusterRoleBinding"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.ThirdPartyResource"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.Node"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.ImageStreamTag"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.ImageStream"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.Deployment"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ResourceQuota"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.Build"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ReplicationController"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.BuildConfig"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.RoleBinding"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.Job"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.ReplicaSet"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.Route"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.Pod"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ConfigMap"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.NetworkPolicy"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.Service"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.Ingress"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.PolicyBinding"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.Namespace"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.OAuthAuthorizeToken"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.Role"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.Secret"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.Project"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.LimitRange"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.HorizontalPodAutoscaler"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.Event"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.OAuthAccessToken"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.PersistentVolumeClaim"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.DaemonSet"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.PersistentVolume"), true);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.DeploymentConfig"), true);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.StatefulSet"), true);
	}
	
	public void testModelsWithFalseResults() {
		Collection<String> models = kindModels.values();
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.PolicyFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.GroupFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ServiceAccountFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.UserFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.OAuthClientFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.ClusterRoleBindingFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.ThirdPartyResourceFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.NodeFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.ImageStreamTagFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.ImageStreamFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.DeploymentFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ResourceQuotaFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.BuildFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ReplicationControllerFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.BuildConfigFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.RoleBindingFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.JobFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.ReplicaSetFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.RouteFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.PodFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ConfigMapFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.NetworkPolicyFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.ServiceFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.IngressFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.PolicyBindingFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.NamespaceFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.OAuthAuthorizeTokenFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.RoleFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.SecretFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.ProjectFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.LimitRangeFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.EventFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.OAuthAccessTokenFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.PersistentVolumeClaimFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.DaemonSetFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.PersistentVolumeFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.openshift.api.model.DeploymentConfigFalse"), false);
		Assert.assertEquals(models.contains("io.fabric8.kubernetes.api.model.extensions.StatefulSetFalse"), false);

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OpenShiftKindModelsAnalyzer kkma = new OpenShiftKindModelsAnalyzer();
		ModelsUtils.showAllModels("OpenShift", kkma.getKindModels());
		ModelsUtils.testModelsWithTrueResults(kkma.getKindModels().values());
		ModelsUtils.testModelsWithFalseResults(kkma.getKindModels().values());
	}

}
