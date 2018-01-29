/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class Constants {

	//
	public static final String CLIENT_KUBERNETES = "io.fabric8.kubernetes.client.DefaultKubernetesClient";

	public static final String CLIENT_OPENSHIFT = "io.fabric8.openshift.client.DefaultOpenShiftClient";
	
	public static final String CLIENT_Docker = "com.github.dockerjava.core.DockerClientImpl";
	
	//
	public static final String MODEL_KUBERNETES_PACKAHE = "io.fabric8.kubernetes.api.model";
	
	public static final String MODEL_OPENSHIFT_PACKAHE = "io.fabric8.openshift.api.model";
	
	public static final String MODEL_COMMON_EXTENSION_PACKAHE = "io.fabric8.kubernetes.api.model.extensions";
	
	public static final String MODEL_COMMON_API_PACKAHE = "io.fabric8.kubernetes.api.model.apiextensions";
	
	public static final String MODEL_COMMON_AUTH_PACKAHE = "io.fabric8.kubernetes.api.model.authentication";
	
	//
	public static final String MODEL_SET_TAG = "set";
	
	public static final String MODEL_ADD_TAG = "add";
	
	//
	public static final String YAML_POLICY = "Policy";

	public static final String YAML_GROUP = "Group";

	public static final String YAML_SERVICEACCOUNT = "ServiceAccount";

	public static final String YAML_USER = "User";

	public static final String YAML_OAUTHCLIENT = "OAuthClient";

	public static final String YAML_THIRDPARTYRESOURCE = "ThirdPartyResource";

	public static final String YAML_CLUSTERROLEBINDING = "ClusterRoleBinding";

	public static final String YAML_NODE = "Node";

	public static final String YAML_IMAGESTREAMTAG = "ImageStreamTag";

	public static final String YAML_DEPLOYMENT = "Deployment";

	public static final String YAML_IMAGESTREAM = "ImageStream";

	public static final String YAML_ENDPOINT = "Endpoint";

	public static final String YAML_RESOURCEQUOTA = "ResourceQuota";

	public static final String YAML_BUILD = "Build";

	public static final String YAML_REPLICATIONCONTROLLER = "ReplicationController";

	public static final String YAML_BUILDCONFIG = "BuildConfig";

	public static final String YAML_ROLEBINDING = "RoleBinding";

	public static final String YAML_JOB = "Job";

	public static final String YAML_REPLICASET = "ReplicaSet";

	public static final String YAML_ROUTE = "Route";

	public static final String YAML_POD = "Pod";

	public static final String YAML_CONFIGMAP = "ConfigMap";

	public static final String YAML_NETWORKPOLICY = "NetworkPolicy";

	public static final String YAML_CUSTOMRESOURCEDEFINITION = "CustomResourceDefinition";

	public static final String YAML_INGRESS = "Ingress";

	public static final String YAML_SECURITYCONTEXTCONSTRAINT = "SecurityContextConstraint";

	public static final String YAML_SERVICE = "Service";

	public static final String YAML_NAMESPACE = "Namespace";

	public static final String YAML_POLICYBINDING = "PolicyBinding";

	public static final String YAML_OAUTHAUTHORIZETOKEN = "OAuthAuthorizeToken";

	public static final String YAML_SECRET = "Secret";

	public static final String YAML_ROLE = "Role";

	public static final String YAML_PROJECT = "Project";

	public static final String YAML_LIMITRANGE = "LimitRange";

	public static final String YAML_HORIZONTALPODAUTOSCALER = "HorizontalPodAutoscaler";

	public static final String YAML_EVENT = "Event";

	public static final String YAML_DAEMONSET = "DaemonSet";

	public static final String YAML_PERSISTENTVOLUMECLAIM = "PersistentVolumeClaim";

	public static final String YAML_OAUTHACCESSTOKEN = "OAuthAccessToken";

	public static final String YAML_PERSISTENTVOLUME = "PersistentVolume";

	public static final String YAML_COMPONENTSTATUS = "Componentstatus";

	public static final String YAML_DEPLOYMENTCONFIG = "DeploymentConfig";

	public static final String YAML_STATEFULSET = "StatefulSet";
	
	//
	public final static String CMD_TAGIMAGECMD = "tagImageCmd";

	public final static String CMD_STATSCMD = "statsCmd";

	public final static String CMD_AUTHCMD = "authCmd";

	public final static String CMD_REMOVECONTAINERCMD = "removeContainerCmd";

	public final static String CMD_CREATENETWORKCMD = "createNetworkCmd";

	public final static String CMD_RENAMECONTAINERCMD = "renameContainerCmd";

	public final static String CMD_EVENTSCMD = "eventsCmd";

	public final static String CMD_LISTVOLUMESCMD = "listVolumesCmd";

	public final static String CMD_SAVEIMAGECMD = "saveImageCmd";

	public final static String CMD_BUILDIMAGECMD = "buildImageCmd";

	public final static String CMD_SEARCHIMAGESCMD = "searchImagesCmd";

	public final static String CMD_INSPECTEXECCMD = "inspectExecCmd";

	public final static String CMD_COMMITCMD = "commitCmd";

	public final static String CMD_REMOVEVOLUMECMD = "removeVolumeCmd";

	public final static String CMD_WITHDOCKERCMDEXECFACTORY = "withDockerCmdExecFactory";

	public final static String CMD_RESTARTCONTAINERCMD = "restartContainerCmd";

	public final static String CMD_UNPAUSECONTAINERCMD = "unpauseContainerCmd";

	public final static String CMD_INSPECTNETWORKCMD = "inspectNetworkCmd";

	public final static String CMD_PAUSECONTAINERCMD = "pauseContainerCmd";

	public final static String CMD_LOADIMAGECMD = "loadImageCmd";

	public final static String CMD_ATTACHCONTAINERCMD = "attachContainerCmd";

	public final static String CMD_INSPECTIMAGECMD = "inspectImageCmd";

	public final static String CMD_WAITCONTAINERCMD = "waitContainerCmd";

	public final static String CMD_TOPCONTAINERCMD = "topContainerCmd";

	public final static String CMD_KILLCONTAINERCMD = "killContainerCmd";

	public final static String CMD_EXECSTARTCMD = "execStartCmd";

	public final static String CMD_LOGCONTAINERCMD = "logContainerCmd";

	public final static String CMD_EXECCREATECMD = "execCreateCmd";

	public final static String CMD_REMOVEIMAGECMD = "removeImageCmd";

	public final static String CMD_CREATEIMAGECMD = "createImageCmd";

	public final static String CMD_LISTCONTAINERSCMD = "listContainersCmd";

	public final static String CMD_PUSHIMAGECMD = "pushImageCmd";

	public final static String CMD_AUTHCONFIG = "authConfig";

	public final static String CMD_VERSIONCMD = "versionCmd";

	public final static String CMD_PINGCMD = "pingCmd";

	public final static String CMD_COPYARCHIVEFROMCONTAINERCMD = "copyArchiveFromContainerCmd";

	public final static String CMD_COPYARCHIVETOCONTAINERCMD = "copyArchiveToContainerCmd";

	public final static String CMD_INFOCMD = "infoCmd";

	public final static String CMD_CONNECTTONETWORKCMD = "connectToNetworkCmd";

	public final static String CMD_LISTNETWORKSCMD = "listNetworksCmd";

	public final static String CMD_UPDATECONTAINERCMD = "updateContainerCmd";

	public final static String CMD_REMOVENETWORKCMD = "removeNetworkCmd";

	public final static String CMD_STARTCONTAINERCMD = "startContainerCmd";

	public final static String CMD_LISTIMAGESCMD = "listImagesCmd";

	public final static String CMD_COPYFILEFROMCONTAINERCMD = "copyFileFromContainerCmd";

	public final static String CMD_PULLIMAGECMD = "pullImageCmd";

	public final static String CMD_CREATEVOLUMECMD = "createVolumeCmd";

	public final static String CMD_INSPECTCONTAINERCMD = "inspectContainerCmd";

	public final static String CMD_CREATECONTAINERCMD = "createContainerCmd";

	public final static String CMD_STOPCONTAINERCMD = "stopContainerCmd";

	public final static String CMD_INSPECTVOLUMECMD = "inspectVolumeCmd";

	public final static String CMD_CONTAINERDIFFCMD = "containerDiffCmd";

	public final static String CMD_DISCONNECTFROMNETWORKCMD = "disconnectFromNetworkCmd";

}
