/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.kubernetes;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class KubernetesConstants {

	//
	public static final String CLIENT = "io.fabric8.kubernetes.client.DefaultKubernetesClient";

	
	//
	public static final String MODEL_PACKAHE_KUBERNETES = "io.fabric8.kubernetes.api.model";
	
	public static final String MODEL_PACKAHE_COMMON_EXTENSION = "io.fabric8.kubernetes.api.model.extensions";
	
	public static final String MODEL_PACKAHE_COMMON_API = "io.fabric8.kubernetes.api.model.apiextensions";
	
	public static final String MODEL_PACKAHE_COMMON_AUTH = "io.fabric8.kubernetes.api.model.authentication";
	
	public static final String MODEL_METHOD_SET = "set";
	
	public static final String MODEL_METHOD_ADD = "add";
	
	//

	public static final String KIND_SERVICEACCOUNT = "ServiceAccount";

	public static final String KIND_THIRDPARTYRESOURCE = "ThirdPartyResource";

	public static final String KIND_NODE = "Node";

	public static final String KIND_DEPLOYMENT = "Deployment";

	public static final String KIND_RESOURCEQUOTA = "ResourceQuota";

	public static final String KIND_REPLICATIONCONTROLLER = "ReplicationController";

	public static final String KIND_JOB = "Job";

	public static final String KIND_REPLICASET = "ReplicaSet";

	public static final String KIND_POD = "Pod";

	public static final String KIND_CONFIGMAP = "ConfigMap";

	public static final String KIND_NETWORKPOLICY = "NetworkPolicy";

	public static final String KIND_CUSTOMRESOURCEDEFINITION = "CustomResourceDefinition";

	public static final String KIND_INGRESS = "Ingress";

	public static final String KIND_SERVICE = "Service";

	public static final String KIND_NAMESPACE = "Namespace";

	public static final String KIND_SECRET = "Secret";

	public static final String KIND_ROLE = "Role";

	public static final String KIND_LIMITRANGE = "LimitRange";

	public static final String KIND_HORIZONTALPODAUTOSCALER = "HorizontalPodAutoscaler";

	public static final String KIND_EVENT = "Event";

	public static final String KIND_DAEMONSET = "DaemonSet";

	public static final String KIND_PERSISTENTVOLUMECLAIM = "PersistentVolumeClaim";

	public static final String KIND_PERSISTENTVOLUME = "PersistentVolume";

	public static final String KIND_STATEFULSET = "StatefulSet";
	
}
