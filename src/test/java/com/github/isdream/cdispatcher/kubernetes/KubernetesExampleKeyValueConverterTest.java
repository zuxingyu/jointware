/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.kubernetes;

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

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 *         2018年2月1日
 */
public class KubernetesExampleKeyValueConverterTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		info("Kubernetes", new ServiceAccount());
		info("Kubernetes", new ThirdPartyResource());
		info("Kubernetes", new ResourceQuota());
		info("Kubernetes", new Node());
		info("Kubernetes", new ConfigMap());
		info("Kubernetes", new NetworkPolicy());
		info("Kubernetes", new CustomResourceDefinition());
		info("Kubernetes", new Ingress());
		info("Kubernetes", new Service());
		info("Kubernetes", new Namespace());
		info("Kubernetes", new Secret());
		info("Kubernetes", new LimitRange());
		info("Kubernetes", new Event());
		info("Kubernetes", new PersistentVolume());
		info("Kubernetes", new StatefulSet());
		info("Kubernetes", new PersistentVolumeClaim());
		info("Kubernetes", new DaemonSet());
		info("Kubernetes", new HorizontalPodAutoscaler());
		info("Kubernetes", new Pod());
		info("Kubernetes", new ReplicaSet());
		info("Kubernetes", new Job());
		info("Kubernetes", new ReplicationController());
		info("Kubernetes", new Deployment());
	}

	protected static void info(String type, Object obj) throws Exception {
		System.out.println("## " + type + " " +  obj.getClass().getSimpleName());
		System.out.println("\n ```");
		KubernetesExampleKeyValueConverter kc = new KubernetesExampleKeyValueConverter();
		System.out.println(kc.fromModelParameters(obj));
		System.out.println("```\n");
	}


}
