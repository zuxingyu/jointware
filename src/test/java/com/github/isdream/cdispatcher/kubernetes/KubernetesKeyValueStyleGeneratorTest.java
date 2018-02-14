/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.kubernetes;

import com.alibaba.fastjson.JSONObject;
import com.github.isdream.cdispatcher.KeyValueStyleGenerator;
import com.github.isdream.cdispatcher.docs.KubernetesDocumentKeyValueStyleGenerator;
import com.github.isdream.cdispatcher.docs.OpenShiftDocumentKeyValueStyleGenerator;

import io.fabric8.kubernetes.api.model.ConfigMap;
import io.fabric8.kubernetes.api.model.Event;
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscaler;
import io.fabric8.kubernetes.api.model.Job;
import io.fabric8.kubernetes.api.model.LimitRange;
import io.fabric8.kubernetes.api.model.Namespace;
import io.fabric8.kubernetes.api.model.Node;
import io.fabric8.kubernetes.api.model.PersistentVolume;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.kubernetes.api.model.ReplicationController;
import io.fabric8.kubernetes.api.model.ResourceQuota;
import io.fabric8.kubernetes.api.model.Secret;
import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.api.model.ServiceAccount;
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition;
import io.fabric8.kubernetes.api.model.extensions.DaemonSet;
import io.fabric8.kubernetes.api.model.extensions.Deployment;
import io.fabric8.kubernetes.api.model.extensions.Ingress;
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicy;
import io.fabric8.kubernetes.api.model.extensions.ReplicaSet;
import io.fabric8.kubernetes.api.model.extensions.StatefulSet;
import io.fabric8.kubernetes.api.model.extensions.ThirdPartyResource;
import io.fabric8.openshift.api.model.Build;
import io.fabric8.openshift.api.model.BuildConfig;
import io.fabric8.openshift.api.model.ClusterRoleBinding;
import io.fabric8.openshift.api.model.DeploymentConfig;
import io.fabric8.openshift.api.model.Group;
import io.fabric8.openshift.api.model.ImageStream;
import io.fabric8.openshift.api.model.ImageStreamTag;
import io.fabric8.openshift.api.model.OAuthAccessToken;
import io.fabric8.openshift.api.model.OAuthAuthorizeToken;
import io.fabric8.openshift.api.model.OAuthClient;
import io.fabric8.openshift.api.model.Policy;
import io.fabric8.openshift.api.model.PolicyBinding;
import io.fabric8.openshift.api.model.Project;
import io.fabric8.openshift.api.model.Role;
import io.fabric8.openshift.api.model.RoleBinding;
import io.fabric8.openshift.api.model.Route;
import io.fabric8.openshift.api.model.User;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 *         2018年2月1日
 */
public class KubernetesKeyValueStyleGeneratorTest {

	public final static String OPENSHIFT_KIND = "OpenShift";
	
	public final static String KUBERNETES_KIND = "Kubernetes";
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		testKubernetesWithAllKind();
//		testOpenShiftWithAllKind();
//		info(KUBERNETES_KIND, KubernetesKeyValueStyleGenerator.class.getName(), KubernetesExampleObjects.createNamespace());
	}

	protected static void testOpenShiftWithAllKind() throws Exception {
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new Policy());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new Group());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new User());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new OAuthClient());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new ClusterRoleBinding());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new ImageStreamTag());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new ImageStream());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new Build());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new BuildConfig());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new RoleBinding());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new Route());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new PolicyBinding());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new OAuthAuthorizeToken());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new Role());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new Project());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new OAuthAccessToken());
		info(OPENSHIFT_KIND, OpenShiftDocumentKeyValueStyleGenerator.class.getName(), new DeploymentConfig());
	}

	protected static void testKubernetesWithAllKind() throws Exception {
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new ServiceAccount());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new ThirdPartyResource());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new ResourceQuota());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new Node());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new ConfigMap());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new NetworkPolicy());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new CustomResourceDefinition());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new Ingress());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new Service());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new Namespace());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new Secret());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new LimitRange());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new Event());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new PersistentVolume());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new StatefulSet());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new PersistentVolumeClaim());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new DaemonSet());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new HorizontalPodAutoscaler());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new Pod());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new ReplicaSet());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new Job());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new ReplicationController());
		info(KUBERNETES_KIND, KubernetesDocumentKeyValueStyleGenerator.class.getName(), new Deployment());
	}

	protected static void info(String type, String classname, Object obj) throws Exception {
		System.out.println("## " + type + " " +  obj.getClass().getSimpleName());
		System.out.println("\n```");
		KeyValueStyleGenerator kvsg = (KeyValueStyleGenerator) Class.forName(classname).newInstance();
		System.out.println(JSONObject.toJSONString(kvsg.fromModelParameters(obj)));
		System.out.println("```\n");
	}


}
