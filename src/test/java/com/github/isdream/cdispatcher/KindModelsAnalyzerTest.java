/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

import com.github.isdream.cdispatcher.KindModelsAnalyzer;
import com.github.isdream.cdispatcher.analyzers.KubernetesKindModelsAnalyzer;
import com.github.isdream.cdispatcher.analyzers.OpenShiftKindModelsAnalyzer;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 * 
 * for(String key : analyzer.getModels().keySet()) {
 *			System.out.println("Assert.assertEquals(analyzer.getModels().values().contains(\"" + analyzer.getModel(key) + "\"), true);");
 *		}
 */
public class KindModelsAnalyzerTest extends TestCase {

	public void testKubernetesKindModelsAnalyzer() throws Exception {
		KindModelsAnalyzer analyzer = KubernetesKindModelsAnalyzer.getAnalyzer();
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.ServiceAccount"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.ConfigMap"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.Pod"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.extensions.ThirdPartyResource"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.extensions.NetworkPolicy"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.Node"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.extensions.Deployment"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.extensions.Ingress"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.Service"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.Namespace"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.Secret"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.LimitRange"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.ResourceQuota"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.ReplicationController"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.HorizontalPodAutoscaler"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.Event"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.extensions.DaemonSet"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.PersistentVolumeClaim"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.PersistentVolume"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.extensions.StatefulSet"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.Job"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.extensions.ReplicaSet"), true);
	}
	
	public void testOpenShiftKindModelsAnalyzer() throws Exception {
		KindModelsAnalyzer analyzer = OpenShiftKindModelsAnalyzer.getAnalyzer();
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.Policy"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.Group"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.User"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.OAuthClient"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.ClusterRoleBinding"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.extensions.ThirdPartyResource"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.ImageStreamTag"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.ImageStream"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.extensions.Deployment"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.Build"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.BuildConfig"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.RoleBinding"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.extensions.ReplicaSet"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.Route"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.extensions.NetworkPolicy"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.extensions.Ingress"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.PolicyBinding"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.OAuthAuthorizeToken"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.Role"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.Project"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.OAuthAccessToken"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.extensions.DaemonSet"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.openshift.api.model.DeploymentConfig"), true);
		Assert.assertEquals(analyzer.getKindModels().values().contains("io.fabric8.kubernetes.api.model.extensions.StatefulSet"), true);
	}
}
