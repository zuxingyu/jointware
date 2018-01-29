/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.kubernetes;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 *         2018-1-25
 */
public class FastKubernetesModelParametersGenerator extends KubernetesModelParametersGenerator {

	protected final static Map<String, Method> methodCached = new HashMap<String, Method>();

	@SuppressWarnings("rawtypes")
	protected final static Map<String, Class> classCached = new HashMap<String, Class>();

	static {
		try {
			classCached.put("io.fabric8.kubernetes.api.model.ObjectMeta",
					Class.forName("io.fabric8.kubernetes.api.model.ObjectMeta"));
			classCached.put("io.fabric8.kubernetes.api.model.Initializers",
					Class.forName("io.fabric8.kubernetes.api.model.Initializers"));
			classCached.put("io.fabric8.openshift.api.model.Role",
					Class.forName("io.fabric8.openshift.api.model.Role"));
			classCached.put("io.fabric8.kubernetes.api.model.HasMetadata",
					Class.forName("io.fabric8.kubernetes.api.model.HasMetadata"));
			classCached.put("io.fabric8.openshift.api.model.ClusterRoleScopeRestriction",
					Class.forName("io.fabric8.openshift.api.model.ClusterRoleScopeRestriction"));
			classCached.put("io.fabric8.kubernetes.api.model.ObjectReference",
					Class.forName("io.fabric8.kubernetes.api.model.ObjectReference"));
			classCached.put("io.fabric8.openshift.api.model.TagReference",
					Class.forName("io.fabric8.openshift.api.model.TagReference"));
			classCached.put("io.fabric8.openshift.api.model.TagImportPolicy",
					Class.forName("io.fabric8.openshift.api.model.TagImportPolicy"));
			classCached.put("io.fabric8.openshift.api.model.TagReferencePolicy",
					Class.forName("io.fabric8.openshift.api.model.TagReferencePolicy"));
			classCached.put("io.fabric8.openshift.api.model.Image",
					Class.forName("io.fabric8.openshift.api.model.Image"));
			classCached.put("io.fabric8.openshift.api.model.SignatureIssuer",
					Class.forName("io.fabric8.openshift.api.model.SignatureIssuer"));
			classCached.put("io.fabric8.openshift.api.model.SignatureSubject",
					Class.forName("io.fabric8.openshift.api.model.SignatureSubject"));
			classCached.put("io.fabric8.openshift.api.model.ImageLookupPolicy",
					Class.forName("io.fabric8.openshift.api.model.ImageLookupPolicy"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.DeploymentSpec",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.DeploymentSpec"));
			classCached.put("io.fabric8.kubernetes.api.model.LabelSelector",
					Class.forName("io.fabric8.kubernetes.api.model.LabelSelector"));
			classCached.put("io.fabric8.kubernetes.api.model.PodTemplateSpec",
					Class.forName("io.fabric8.kubernetes.api.model.PodTemplateSpec"));
			classCached.put("io.fabric8.kubernetes.api.model.PodSpec",
					Class.forName("io.fabric8.kubernetes.api.model.PodSpec"));
			classCached.put("io.fabric8.kubernetes.api.model.AWSElasticBlockStoreVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.AWSElasticBlockStoreVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.GCEPersistentDiskVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.GCEPersistentDiskVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.PersistentVolumeClaimVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.PersistentVolumeClaimVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.PhotonPersistentDiskVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.PhotonPersistentDiskVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.PortworxVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.PortworxVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.SecretVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.SecretVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.AzureDiskVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.AzureDiskVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.AzureFileVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.AzureFileVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.CephFSVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.CephFSVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.LocalObjectReference",
					Class.forName("io.fabric8.kubernetes.api.model.LocalObjectReference"));
			classCached.put("io.fabric8.kubernetes.api.model.CinderVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.CinderVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.ConfigMapVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.ConfigMapVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.DownwardAPIVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.DownwardAPIVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.ResourceFieldSelector",
					Class.forName("io.fabric8.kubernetes.api.model.ResourceFieldSelector"));
			classCached.put("io.fabric8.kubernetes.api.model.Quantity",
					Class.forName("io.fabric8.kubernetes.api.model.Quantity"));
			classCached.put("io.fabric8.kubernetes.api.model.ObjectFieldSelector",
					Class.forName("io.fabric8.kubernetes.api.model.ObjectFieldSelector"));
			classCached.put("io.fabric8.kubernetes.api.model.EmptyDirVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.EmptyDirVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.FCVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.FCVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.FlexVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.FlexVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.FlockerVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.FlockerVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.GitRepoVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.GitRepoVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.GlusterfsVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.GlusterfsVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.HostPathVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.HostPathVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.ISCSIVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.ISCSIVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.NFSVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.NFSVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.ProjectedVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.ProjectedVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.SecretProjection",
					Class.forName("io.fabric8.kubernetes.api.model.SecretProjection"));
			classCached.put("io.fabric8.kubernetes.api.model.ConfigMapProjection",
					Class.forName("io.fabric8.kubernetes.api.model.ConfigMapProjection"));
			classCached.put("io.fabric8.kubernetes.api.model.DownwardAPIProjection",
					Class.forName("io.fabric8.kubernetes.api.model.DownwardAPIProjection"));
			classCached.put("io.fabric8.kubernetes.api.model.QuobyteVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.QuobyteVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.RBDVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.RBDVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.ScaleIOVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.ScaleIOVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.StorageOSVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.StorageOSVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.VsphereVirtualDiskVolumeSource",
					Class.forName("io.fabric8.kubernetes.api.model.VsphereVirtualDiskVolumeSource"));
			classCached.put("io.fabric8.kubernetes.api.model.PodSecurityContext",
					Class.forName("io.fabric8.kubernetes.api.model.PodSecurityContext"));
			classCached.put("io.fabric8.kubernetes.api.model.SELinuxOptions",
					Class.forName("io.fabric8.kubernetes.api.model.SELinuxOptions"));
			classCached.put("io.fabric8.kubernetes.api.model.Affinity",
					Class.forName("io.fabric8.kubernetes.api.model.Affinity"));
			classCached.put("io.fabric8.kubernetes.api.model.PodAntiAffinity",
					Class.forName("io.fabric8.kubernetes.api.model.PodAntiAffinity"));
			classCached.put("io.fabric8.kubernetes.api.model.PodAffinityTerm",
					Class.forName("io.fabric8.kubernetes.api.model.PodAffinityTerm"));
			classCached.put("io.fabric8.kubernetes.api.model.NodeAffinity",
					Class.forName("io.fabric8.kubernetes.api.model.NodeAffinity"));
			classCached.put("io.fabric8.kubernetes.api.model.NodeSelectorTerm",
					Class.forName("io.fabric8.kubernetes.api.model.NodeSelectorTerm"));
			classCached.put("io.fabric8.kubernetes.api.model.NodeSelector",
					Class.forName("io.fabric8.kubernetes.api.model.NodeSelector"));
			classCached.put("io.fabric8.kubernetes.api.model.PodAffinity",
					Class.forName("io.fabric8.kubernetes.api.model.PodAffinity"));
			classCached.put("io.fabric8.kubernetes.api.model.ResourceRequirements",
					Class.forName("io.fabric8.kubernetes.api.model.ResourceRequirements"));
			classCached.put("io.fabric8.kubernetes.api.model.SecurityContext",
					Class.forName("io.fabric8.kubernetes.api.model.SecurityContext"));
			classCached.put("io.fabric8.kubernetes.api.model.Capabilities",
					Class.forName("io.fabric8.kubernetes.api.model.Capabilities"));
			classCached.put("io.fabric8.kubernetes.api.model.Probe",
					Class.forName("io.fabric8.kubernetes.api.model.Probe"));
			classCached.put("io.fabric8.kubernetes.api.model.HTTPGetAction",
					Class.forName("io.fabric8.kubernetes.api.model.HTTPGetAction"));
			classCached.put("io.fabric8.kubernetes.api.model.IntOrString",
					Class.forName("io.fabric8.kubernetes.api.model.IntOrString"));
			classCached.put("io.fabric8.kubernetes.api.model.TCPSocketAction",
					Class.forName("io.fabric8.kubernetes.api.model.TCPSocketAction"));
			classCached.put("io.fabric8.kubernetes.api.model.ExecAction",
					Class.forName("io.fabric8.kubernetes.api.model.ExecAction"));
			classCached.put("io.fabric8.kubernetes.api.model.EnvVarSource",
					Class.forName("io.fabric8.kubernetes.api.model.EnvVarSource"));
			classCached.put("io.fabric8.kubernetes.api.model.ConfigMapKeySelector",
					Class.forName("io.fabric8.kubernetes.api.model.ConfigMapKeySelector"));
			classCached.put("io.fabric8.kubernetes.api.model.SecretKeySelector",
					Class.forName("io.fabric8.kubernetes.api.model.SecretKeySelector"));
			classCached.put("io.fabric8.kubernetes.api.model.SecretEnvSource",
					Class.forName("io.fabric8.kubernetes.api.model.SecretEnvSource"));
			classCached.put("io.fabric8.kubernetes.api.model.ConfigMapEnvSource",
					Class.forName("io.fabric8.kubernetes.api.model.ConfigMapEnvSource"));
			classCached.put("io.fabric8.kubernetes.api.model.Lifecycle",
					Class.forName("io.fabric8.kubernetes.api.model.Lifecycle"));
			classCached.put("io.fabric8.kubernetes.api.model.Handler",
					Class.forName("io.fabric8.kubernetes.api.model.Handler"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.DeploymentStrategy",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.DeploymentStrategy"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.RollingUpdateDeployment",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.RollingUpdateDeployment"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.RollbackConfig",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.RollbackConfig"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.DeploymentStatus",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.DeploymentStatus"));

			classCached.put("io.fabric8.openshift.api.model.ImageStreamSpec",
					Class.forName("io.fabric8.openshift.api.model.ImageStreamSpec"));
			classCached.put("io.fabric8.openshift.api.model.ImageStreamStatus",
					Class.forName("io.fabric8.openshift.api.model.ImageStreamStatus"));

			classCached.put("io.fabric8.openshift.api.model.BuildSpec",
					Class.forName("io.fabric8.openshift.api.model.BuildSpec"));
			classCached.put("io.fabric8.openshift.api.model.BuildOutput",
					Class.forName("io.fabric8.openshift.api.model.BuildOutput"));
			classCached.put("io.fabric8.openshift.api.model.BitbucketWebHookCause",
					Class.forName("io.fabric8.openshift.api.model.BitbucketWebHookCause"));
			classCached.put("io.fabric8.openshift.api.model.SourceRevision",
					Class.forName("io.fabric8.openshift.api.model.SourceRevision"));
			classCached.put("io.fabric8.openshift.api.model.GitSourceRevision",
					Class.forName("io.fabric8.openshift.api.model.GitSourceRevision"));
			classCached.put("io.fabric8.openshift.api.model.SourceControlUser",
					Class.forName("io.fabric8.openshift.api.model.SourceControlUser"));
			classCached.put("io.fabric8.openshift.api.model.GenericWebHookCause",
					Class.forName("io.fabric8.openshift.api.model.GenericWebHookCause"));
			classCached.put("io.fabric8.openshift.api.model.ImageChangeCause",
					Class.forName("io.fabric8.openshift.api.model.ImageChangeCause"));
			classCached.put("io.fabric8.openshift.api.model.GitHubWebHookCause",
					Class.forName("io.fabric8.openshift.api.model.GitHubWebHookCause"));
			classCached.put("io.fabric8.openshift.api.model.GitLabWebHookCause",
					Class.forName("io.fabric8.openshift.api.model.GitLabWebHookCause"));
			classCached.put("io.fabric8.openshift.api.model.BuildPostCommitSpec",
					Class.forName("io.fabric8.openshift.api.model.BuildPostCommitSpec"));
			classCached.put("io.fabric8.openshift.api.model.BuildSource",
					Class.forName("io.fabric8.openshift.api.model.BuildSource"));
			classCached.put("io.fabric8.openshift.api.model.BinaryBuildSource",
					Class.forName("io.fabric8.openshift.api.model.BinaryBuildSource"));
			classCached.put("io.fabric8.openshift.api.model.GitBuildSource",
					Class.forName("io.fabric8.openshift.api.model.GitBuildSource"));
			classCached.put("io.fabric8.openshift.api.model.BuildStrategy",
					Class.forName("io.fabric8.openshift.api.model.BuildStrategy"));
			classCached.put("io.fabric8.openshift.api.model.CustomBuildStrategy",
					Class.forName("io.fabric8.openshift.api.model.CustomBuildStrategy"));
			classCached.put("io.fabric8.openshift.api.model.DockerBuildStrategy",
					Class.forName("io.fabric8.openshift.api.model.DockerBuildStrategy"));
			classCached.put("io.fabric8.openshift.api.model.JenkinsPipelineBuildStrategy",
					Class.forName("io.fabric8.openshift.api.model.JenkinsPipelineBuildStrategy"));
			classCached.put("io.fabric8.openshift.api.model.SourceBuildStrategy",
					Class.forName("io.fabric8.openshift.api.model.SourceBuildStrategy"));
			classCached.put("io.fabric8.openshift.api.model.BuildStatus",
					Class.forName("io.fabric8.openshift.api.model.BuildStatus"));
			classCached.put("io.fabric8.openshift.api.model.BuildStatusOutput",
					Class.forName("io.fabric8.openshift.api.model.BuildStatusOutput"));
			classCached.put("io.fabric8.openshift.api.model.BuildStatusOutputTo",
					Class.forName("io.fabric8.openshift.api.model.BuildStatusOutputTo"));

			classCached.put("io.fabric8.openshift.api.model.BuildConfigSpec",
					Class.forName("io.fabric8.openshift.api.model.BuildConfigSpec"));
			classCached.put("io.fabric8.openshift.api.model.WebHookTrigger",
					Class.forName("io.fabric8.openshift.api.model.WebHookTrigger"));
			classCached.put("io.fabric8.openshift.api.model.ImageChangeTrigger",
					Class.forName("io.fabric8.openshift.api.model.ImageChangeTrigger"));
			classCached.put("io.fabric8.openshift.api.model.BuildConfigStatus",
					Class.forName("io.fabric8.openshift.api.model.BuildConfigStatus"));

			classCached.put("io.fabric8.kubernetes.api.model.extensions.ReplicaSetSpec",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.ReplicaSetSpec"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.ReplicaSetStatus",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.ReplicaSetStatus"));

			classCached.put("io.fabric8.openshift.api.model.RouteSpec",
					Class.forName("io.fabric8.openshift.api.model.RouteSpec"));
			classCached.put("io.fabric8.openshift.api.model.TLSConfig",
					Class.forName("io.fabric8.openshift.api.model.TLSConfig"));
			classCached.put("io.fabric8.openshift.api.model.RouteTargetReference",
					Class.forName("io.fabric8.openshift.api.model.RouteTargetReference"));
			classCached.put("io.fabric8.openshift.api.model.RoutePort",
					Class.forName("io.fabric8.openshift.api.model.RoutePort"));
			classCached.put("io.fabric8.openshift.api.model.RouteStatus",
					Class.forName("io.fabric8.openshift.api.model.RouteStatus"));

			classCached.put("io.fabric8.kubernetes.api.model.extensions.NetworkPolicySpec",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.NetworkPolicySpec"));

			classCached.put("io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec",
					Class.forName("io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec"));
			classCached.put("io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames",
					Class.forName("io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames"));
			classCached.put("io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatus",
					Class.forName("io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatus"));

			classCached.put("io.fabric8.kubernetes.api.model.extensions.IngressSpec",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.IngressSpec"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValue",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValue"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.IngressBackend",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.IngressBackend"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.IngressStatus",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.IngressStatus"));
			classCached.put("io.fabric8.kubernetes.api.model.LoadBalancerStatus",
					Class.forName("io.fabric8.kubernetes.api.model.LoadBalancerStatus"));

			classCached.put("io.fabric8.openshift.api.model.RoleBinding",
					Class.forName("io.fabric8.openshift.api.model.RoleBinding"));

			classCached.put("io.fabric8.openshift.api.model.ProjectSpec",
					Class.forName("io.fabric8.openshift.api.model.ProjectSpec"));
			classCached.put("io.fabric8.openshift.api.model.ProjectStatus",
					Class.forName("io.fabric8.openshift.api.model.ProjectStatus"));

			classCached.put("io.fabric8.kubernetes.api.model.extensions.DaemonSetSpec",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.DaemonSetSpec"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.DaemonSetUpdateStrategy",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.DaemonSetUpdateStrategy"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.RollingUpdateDaemonSet",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.RollingUpdateDaemonSet"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.DaemonSetStatus",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.DaemonSetStatus"));

			classCached.put("io.fabric8.openshift.api.model.DeploymentConfigSpec",
					Class.forName("io.fabric8.openshift.api.model.DeploymentConfigSpec"));
			classCached.put("io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParams",
					Class.forName("io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParams"));
			classCached.put("io.fabric8.openshift.api.model.DeploymentStrategy",
					Class.forName("io.fabric8.openshift.api.model.DeploymentStrategy"));
			classCached.put("io.fabric8.openshift.api.model.RollingDeploymentStrategyParams",
					Class.forName("io.fabric8.openshift.api.model.RollingDeploymentStrategyParams"));
			classCached.put("io.fabric8.openshift.api.model.LifecycleHook",
					Class.forName("io.fabric8.openshift.api.model.LifecycleHook"));
			classCached.put("io.fabric8.openshift.api.model.ExecNewPodHook",
					Class.forName("io.fabric8.openshift.api.model.ExecNewPodHook"));
			classCached.put("io.fabric8.openshift.api.model.CustomDeploymentStrategyParams",
					Class.forName("io.fabric8.openshift.api.model.CustomDeploymentStrategyParams"));
			classCached.put("io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams",
					Class.forName("io.fabric8.openshift.api.model.RecreateDeploymentStrategyParams"));
			classCached.put("io.fabric8.openshift.api.model.DeploymentConfigStatus",
					Class.forName("io.fabric8.openshift.api.model.DeploymentConfigStatus"));
			classCached.put("io.fabric8.openshift.api.model.DeploymentDetails",
					Class.forName("io.fabric8.openshift.api.model.DeploymentDetails"));
			classCached.put("io.fabric8.openshift.api.model.DeploymentCauseImageTrigger",
					Class.forName("io.fabric8.openshift.api.model.DeploymentCauseImageTrigger"));

			classCached.put("io.fabric8.kubernetes.api.model.extensions.StatefulSetSpec",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.StatefulSetSpec"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.StatefulSetUpdateStrategy",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.StatefulSetUpdateStrategy"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.RollingUpdateStatefulSetStrategy",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.RollingUpdateStatefulSetStrategy"));
			classCached.put("io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec",
					Class.forName("io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec"));
			classCached.put("io.fabric8.kubernetes.api.model.PersistentVolumeClaimStatus",
					Class.forName("io.fabric8.kubernetes.api.model.PersistentVolumeClaimStatus"));
			classCached.put("io.fabric8.kubernetes.api.model.extensions.StatefulSetStatus",
					Class.forName("io.fabric8.kubernetes.api.model.extensions.StatefulSetStatus"));
		} catch (ClassNotFoundException e) {
			// ignore here
		}
	}

	@Override
	protected Method getThisMethod(Object object, String fullname, Class<?> paramType) throws Exception {

		if (methodCached.get(fullname + paramType.getName()) == null) {
			String paramName = getParamName(fullname);
			methodCached.put(fullname + paramType.getName(), object.getClass().getDeclaredMethod(paramName, paramType));
		}

		return methodCached.get(fullname + paramType.getName());
	}

	@Override
	protected Class<?> getThisClass(String name) throws Exception {
		if (classCached.get(name) == null) {
			classCached.put(name, getClass().getClassLoader().loadClass(name));
		}
		return classCached.get(name);
	}

	@Override
	protected Object createKindModel(String kind) throws Exception {

		Class<?> clazz = getThisClass(KubernetesKindModelsAnalyzer.getAnalyzer().getKindModel(kind));
		return clazz.newInstance();
	}

}
