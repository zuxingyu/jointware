## Kubernetes ServiceAccount

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setSecrets": ["ref-io.fabric8.kubernetes.api.model.ObjectReference-0", "ref-io.fabric8.kubernetes.api.model.ObjectReference-1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setImagePullSecrets": ["ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0", "ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1"],
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setAutomountServiceAccountToken": "java.lang.Boolean",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ObjectReference-0": {
		"setName": "java.lang.String",
		"setFieldPath": "java.lang.String",
		"setNamespace": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ObjectReference-1": {
		"setName": "java.lang.String",
		"setFieldPath": "java.lang.String",
		"setNamespace": "java.lang.String"
	}
}
```

## Kubernetes ThirdPartyResource

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setDescription": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setVersions": ["ref-io.fabric8.kubernetes.api.model.extensions.APIVersion-0", "ref-io.fabric8.kubernetes.api.model.extensions.APIVersion-1"],
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.APIVersion-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.APIVersion-1": {
		"setName": "java.lang.String"
	}
}
```

## Kubernetes ResourceQuota

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setStatus-setHard-demokey2": "ref-setStatus-setHard-demokey2",
		"setStatus-setHard-demokey1": "ref-setStatus-setHard-demokey1",
		"setSpec-setHard-demokey2": "ref-setSpec-setHard-demokey2",
		"setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setHard-demokey1": "ref-setSpec-setHard-demokey1",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setStatus-setUsed-demokey2": "ref-setStatus-setUsed-demokey2",
		"setSpec-setScopes": "java.util.List<java.lang.String>",
		"setStatus-setUsed-demokey1": "ref-setStatus-setUsed-demokey1",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-setStatus-setHard-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setStatus-setHard-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setStatus-setUsed-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setStatus-setUsed-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-setSpec-setHard-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setSpec-setHard-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	}
}
```

## Kubernetes Node

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setSpec-setExternalID": "java.lang.String",
		"setNodeInfo-setContainerRuntimeVersion": "java.lang.String",
		"setStatus-setCapacity-demokey1": "ref-setStatus-setCapacity-demokey1",
		"setStatus-setConditions": ["ref-io.fabric8.kubernetes.api.model.NodeCondition-0", "ref-io.fabric8.kubernetes.api.model.NodeCondition-1"],
		"setStatus-setPhase": "java.lang.String",
		"setStatus-setAllocatable-demokey1": "ref-setStatus-setAllocatable-demokey1",
		"setStatus-setImages": ["ref-io.fabric8.kubernetes.api.model.ContainerImage-0", "ref-io.fabric8.kubernetes.api.model.ContainerImage-1"],
		"setStatus-setAllocatable-demokey2": "ref-setStatus-setAllocatable-demokey2",
		"setMetadata-setGeneration": "java.lang.Long",
		"setNodeInfo-setOperatingSystem": "java.lang.String",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setNodeInfo-setKubeProxyVersion": "java.lang.String",
		"setNodeInfo-setMachineID": "java.lang.String",
		"setNodeInfo-setOsImage": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setUnschedulable": "java.lang.Boolean",
		"setKubeletEndpoint-setPort": "java.lang.Integer",
		"setNodeInfo-setKernelVersion": "java.lang.String",
		"setSpec-setProviderID": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setStatus-setVolumesAttached": ["ref-io.fabric8.kubernetes.api.model.AttachedVolume-0", "ref-io.fabric8.kubernetes.api.model.AttachedVolume-1"],
		"setNodeInfo-setSystemUUID": "java.lang.String",
		"setNodeInfo-setKubeletVersion": "java.lang.String",
		"setSpec-setPodCIDR": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setNodeInfo-setArchitecture": "java.lang.String",
		"setNodeInfo-setBootID": "java.lang.String",
		"setStatus-setAddresses": ["ref-io.fabric8.kubernetes.api.model.NodeAddress-0", "ref-io.fabric8.kubernetes.api.model.NodeAddress-1"],
		"setMetadata-setClusterName": "java.lang.String",
		"setSpec-setTaints": ["ref-io.fabric8.kubernetes.api.model.Taint-0", "ref-io.fabric8.kubernetes.api.model.Taint-1"],
		"setStatus-setCapacity-demokey2": "ref-setStatus-setCapacity-demokey2",
		"setMetadata-setName": "java.lang.String",
		"setStatus-setVolumesInUse": "java.util.List<java.lang.String>",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.AttachedVolume-0": {
		"setName": "java.lang.String",
		"setDevicePath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.AttachedVolume-1": {
		"setName": "java.lang.String",
		"setDevicePath": "java.lang.String"
	},
	"ref-setStatus-setCapacity-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setStatus-setCapacity-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setStatus-setAllocatable-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setStatus-setAllocatable-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.NodeAddress-0": {
		"setAddress": "java.lang.String",
		"setType": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.NodeAddress-1": {
		"setAddress": "java.lang.String",
		"setType": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.NodeCondition-0": {
		"setLastHeartbeatTime": "java.lang.String",
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.NodeCondition-1": {
		"setLastHeartbeatTime": "java.lang.String",
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerImage-0": {
		"setNames": "java.util.List<java.lang.String>",
		"setSizeBytes": "java.lang.Long"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerImage-1": {
		"setNames": "java.util.List<java.lang.String>",
		"setSizeBytes": "java.lang.Long"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Taint-0": {
		"setEffect": "java.lang.String",
		"setTimeAdded": "java.lang.String",
		"setValue": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Taint-1": {
		"setEffect": "java.lang.String",
		"setTimeAdded": "java.lang.String",
		"setValue": "java.lang.String",
		"setKey": "java.lang.String"
	}
}
```

## Kubernetes ConfigMap

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setData": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	}
}
```

## Kubernetes NetworkPolicy

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setIngress": ["ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyIngressRule-0", "ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyIngressRule-1"],
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setPodSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setPodSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyIngressRule-0": {
		"setFrom": ["ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer-0", "ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer-1"],
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPort-0", "ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPort-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer-0": {
		"setPodSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setNamespaceSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaceSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setPodSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer-1": {
		"setPodSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setNamespaceSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaceSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setPodSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPort-0": {
		"setPort-setIntVal": "java.lang.Integer",
		"setPort-setStrVal": "java.lang.String",
		"setProtocol": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPort-1": {
		"setPort-setIntVal": "java.lang.Integer",
		"setPort-setStrVal": "java.lang.String",
		"setProtocol": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyIngressRule-1": {
		"setFrom": ["ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer-0", "ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer-1"],
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPort-0", "ref-io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPort-1"]
	}
}
```

## Kubernetes CustomResourceDefinition

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setSpec-setScope": "java.lang.String",
		"setAcceptedNames-setSingular": "java.lang.String",
		"setNames-setShortNames": "java.util.List<java.lang.String>",
		"setStatus-setConditions": ["ref-io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition-0", "ref-io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition-1"],
		"setAcceptedNames-setListKind": "java.lang.String",
		"setAcceptedNames-setPlural": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setNames-setSingular": "java.lang.String",
		"setNames-setPlural": "java.lang.String",
		"setNames-setListKind": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setGroup": "java.lang.String",
		"setAcceptedNames-setShortNames": "java.util.List<java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setSpec-setVersion": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition-0": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition-1": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	}
}
```

## Kubernetes Ingress

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setSpec-setTls": ["ref-io.fabric8.kubernetes.api.model.extensions.IngressTLS-0", "ref-io.fabric8.kubernetes.api.model.extensions.IngressTLS-1"],
		"setServicePort-setIntVal": "java.lang.Integer",
		"setMetadata-setGenerateName": "java.lang.String",
		"setServicePort-setStrVal": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setRules": ["ref-io.fabric8.kubernetes.api.model.extensions.IngressRule-0", "ref-io.fabric8.kubernetes.api.model.extensions.IngressRule-1"],
		"setLoadBalancer-setIngress": ["ref-io.fabric8.kubernetes.api.model.LoadBalancerIngress-0", "ref-io.fabric8.kubernetes.api.model.LoadBalancerIngress-1"],
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setBackend-setServiceName": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.LoadBalancerIngress-0": {
		"setHostname": "java.lang.String",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LoadBalancerIngress-1": {
		"setHostname": "java.lang.String",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.IngressTLS-0": {
		"setHosts": "java.util.List<java.lang.String>",
		"setSecretName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.IngressTLS-1": {
		"setHosts": "java.util.List<java.lang.String>",
		"setSecretName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.IngressRule-0": {
		"setHost": "java.lang.String",
		"setHttp-setPaths": ["ref-io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath-0", "ref-io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath-0": {
		"setServicePort-setIntVal": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setBackend-setServiceName": "java.lang.String",
		"setServicePort-setStrVal": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath-1": {
		"setServicePort-setIntVal": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setBackend-setServiceName": "java.lang.String",
		"setServicePort-setStrVal": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.IngressRule-1": {
		"setHost": "java.lang.String",
		"setHttp-setPaths": ["ref-io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath-0", "ref-io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath-1"]
	}
}
```

## Kubernetes Service

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setSpec-setType": "java.lang.String",
		"setSpec-setLoadBalancerIP": "java.lang.String",
		"setSpec-setSelector": "java.util.Map<java.lang.String, java.lang.String>",
		"setSpec-setExternalTrafficPolicy": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setSpec-setPorts": ["ref-io.fabric8.kubernetes.api.model.ServicePort-0", "ref-io.fabric8.kubernetes.api.model.ServicePort-1"],
		"setSpec-setExternalIPs": "java.util.List<java.lang.String>",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setSpec-setSessionAffinity": "java.lang.String",
		"setSpec-setClusterIP": "java.lang.String",
		"setSpec-setLoadBalancerSourceRanges": "java.util.List<java.lang.String>",
		"setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setHealthCheckNodePort": "java.lang.Integer",
		"setSpec-setExternalName": "java.lang.String",
		"setLoadBalancer-setIngress": ["ref-io.fabric8.kubernetes.api.model.LoadBalancerIngress-0", "ref-io.fabric8.kubernetes.api.model.LoadBalancerIngress-1"],
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.LoadBalancerIngress-0": {
		"setHostname": "java.lang.String",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LoadBalancerIngress-1": {
		"setHostname": "java.lang.String",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ServicePort-0": {
		"setName": "java.lang.String",
		"setNodePort": "java.lang.Integer",
		"setTargetPort-setIntVal": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setTargetPort-setStrVal": "java.lang.String",
		"setPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.ServicePort-1": {
		"setName": "java.lang.String",
		"setNodePort": "java.lang.Integer",
		"setTargetPort-setIntVal": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setTargetPort-setStrVal": "java.lang.String",
		"setPort": "java.lang.Integer"
	}
}
```

## Kubernetes Namespace

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setStatus-setPhase": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	}
}
```

## Kubernetes Secret

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setData": "java.util.Map<java.lang.String, java.lang.String>",
		"setStringData": "java.util.Map<java.lang.String, java.lang.String>",
		"setType": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	}
}
```

## Kubernetes LimitRange

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setLimits": ["ref-io.fabric8.kubernetes.api.model.LimitRangeItem-0", "ref-io.fabric8.kubernetes.api.model.LimitRangeItem-1"],
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LimitRangeItem-0": {
		"setMax-demokey1": "ref-setMax-demokey1",
		"setDefaultRequest-demokey1": "ref-setDefaultRequest-demokey1",
		"setMax-demokey2": "ref-setMax-demokey2",
		"setDefaultRequest-demokey2": "ref-setDefaultRequest-demokey2",
		"setMin-demokey2": "ref-setMin-demokey2",
		"setMin-demokey1": "ref-setMin-demokey1",
		"setDefault-demokey1": "ref-setDefault-demokey1",
		"setDefault-demokey2": "ref-setDefault-demokey2",
		"setType": "java.lang.String",
		"setMaxLimitRequestRatio-demokey1": "ref-setMaxLimitRequestRatio-demokey1",
		"setMaxLimitRequestRatio-demokey2": "ref-setMaxLimitRequestRatio-demokey2"
	},
	"ref-setDefault-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setDefault-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setMin-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setMin-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setMax-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setMax-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setDefaultRequest-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setDefaultRequest-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setMaxLimitRequestRatio-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setMaxLimitRequestRatio-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LimitRangeItem-1": {
		"setMax-demokey1": "ref-setMax-demokey1",
		"setDefaultRequest-demokey1": "ref-setDefaultRequest-demokey1",
		"setMax-demokey2": "ref-setMax-demokey2",
		"setDefaultRequest-demokey2": "ref-setDefaultRequest-demokey2",
		"setMin-demokey2": "ref-setMin-demokey2",
		"setMin-demokey1": "ref-setMin-demokey1",
		"setDefault-demokey1": "ref-setDefault-demokey1",
		"setDefault-demokey2": "ref-setDefault-demokey2",
		"setType": "java.lang.String",
		"setMaxLimitRequestRatio-demokey1": "ref-setMaxLimitRequestRatio-demokey1",
		"setMaxLimitRequestRatio-demokey2": "ref-setMaxLimitRequestRatio-demokey2"
	}
}
```

## Kubernetes Event

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setSource-setComponent": "java.lang.String",
		"setInvolvedObject-setNamespace": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setFirstTimestamp": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setInvolvedObject-setName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setSource-setHost": "java.lang.String",
		"setLastTimestamp": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setReason": "java.lang.String",
		"setMetadata-setClusterName": "java.lang.String",
		"setInvolvedObject-setFieldPath": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setCount": "java.lang.Integer",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	}
}
```

## Kubernetes PersistentVolume

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setScaleIO-setStoragePool": "java.lang.String",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setStatus-setReason": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setStatus-setMessage": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setNamespace": "java.lang.String",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setFlocker-setDatasetName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setSpec-setAccessModes": "java.util.List<java.lang.String>",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setLocal-setPath": "java.lang.String",
		"setStatus-setPhase": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setQuobyte-setUser": "java.lang.String",
		"setSecretRef-setFieldPath": "java.lang.String",
		"setSpec-setPersistentVolumeReclaimPolicy": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setClaimRef-setFieldPath": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setSpec-setCapacity-demokey1": "ref-setSpec-setCapacity-demokey1",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setSpec-setCapacity-demokey2": "ref-setSpec-setCapacity-demokey2",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setClaimRef-setNamespace": "java.lang.String",
		"setSpec-setStorageClassName": "java.lang.String",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setClaimRef-setName": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setMetadata-setClusterName": "java.lang.String",
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-setSpec-setCapacity-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setSpec-setCapacity-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	}
}
```

## Kubernetes StatefulSet

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setStatus-setCurrentRevision": "java.lang.String",
		"setSpec-setVolumeClaimTemplates": ["ref-io.fabric8.kubernetes.api.model.PersistentVolumeClaim-0", "ref-io.fabric8.kubernetes.api.model.PersistentVolumeClaim-1"],
		"setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setTerminationGracePeriodSeconds": "java.lang.Long",
		"setSpec-setInitContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSecurityContext-setSupplementalGroups": ["ref-java.lang.Long-0", "ref-java.lang.Long-1"],
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setSubdomain": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setStatus-setCurrentReplicas": "java.lang.Integer",
		"setSpec-setHostNetwork": "java.lang.Boolean",
		"setMetadata-setSelfLink": "java.lang.String",
		"setSpec-setReplicas": "java.lang.Integer",
		"setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1"],
		"setSpec-setRevisionHistoryLimit": "java.lang.Integer",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setStatus-setUpdateRevision": "java.lang.String",
		"setSpec-setRestartPolicy": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setHostPID": "java.lang.Boolean",
		"setSpec-setServiceName": "java.lang.String",
		"setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setMetadata-setName": "java.lang.String",
		"setSpec-setServiceAccountName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setSpec-setVolumes": ["ref-io.fabric8.kubernetes.api.model.Volume-0", "ref-io.fabric8.kubernetes.api.model.Volume-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setSpec-setImagePullSecrets": ["ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0", "ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1"],
		"setStatus-setObservedGeneration": "java.lang.Long",
		"setSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setSchedulerName": "java.lang.String",
		"setSpec-setDnsPolicy": "java.lang.String",
		"setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setHostAliases": ["ref-io.fabric8.kubernetes.api.model.HostAlias-0", "ref-io.fabric8.kubernetes.api.model.HostAlias-1"],
		"setSpec-setHostname": "java.lang.String",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setSecurityContext-setFsGroup": "java.lang.Long",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setStatus-setReadyReplicas": "java.lang.Integer",
		"setSpec-setNodeName": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0", "ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1"],
		"setUpdateStrategy-setType": "java.lang.String",
		"setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setTolerations": ["ref-io.fabric8.kubernetes.api.model.Toleration-0", "ref-io.fabric8.kubernetes.api.model.Toleration-1"],
		"setStatus-setUpdatedReplicas": "java.lang.Integer",
		"setSpec-setPodManagementPolicy": "java.lang.String",
		"setRollingUpdate-setPartition": "java.lang.Integer",
		"setSpec-setServiceAccount": "java.lang.String",
		"setStatus-setReplicas": "java.lang.Integer",
		"setSpec-setNodeSelector": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PersistentVolumeClaim-0": {
		"setMetadata-setNamespace": "java.lang.String",
		"setStatus-setAccessModes": "java.util.List<java.lang.String>",
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setStatus-setCapacity-demokey1": "ref-setStatus-setCapacity-demokey1",
		"setSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setStatus-setPhase": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setSpec-setStorageClassName": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setSpec-setVolumeName": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setAccessModes": "java.util.List<java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setStatus-setCapacity-demokey2": "ref-setStatus-setCapacity-demokey2",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-setStatus-setCapacity-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setStatus-setCapacity-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PersistentVolumeClaim-1": {
		"setMetadata-setNamespace": "java.lang.String",
		"setStatus-setAccessModes": "java.util.List<java.lang.String>",
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setStatus-setCapacity-demokey1": "ref-setStatus-setCapacity-demokey1",
		"setSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setStatus-setPhase": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setSpec-setStorageClassName": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setSpec-setVolumeName": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setAccessModes": "java.util.List<java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setStatus-setCapacity-demokey2": "ref-setStatus-setCapacity-demokey2",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-0": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setWorkingDir": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-0": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-1": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-0": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-1": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-0": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-1": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-0": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-1": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-0": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-1": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-1": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setWorkingDir": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-0": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-1": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-0": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-1": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-0": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setOptional": "java.lang.Boolean",
		"setFlocker-setDatasetName": "java.lang.String",
		"setSecret-setSecretName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-0": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-1": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-0": {
		"setConfigMap-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setName": "java.lang.String",
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-1": {
		"setConfigMap-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setName": "java.lang.String",
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-1": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setOptional": "java.lang.Boolean",
		"setFlocker-setDatasetName": "java.lang.String",
		"setSecret-setSecretName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	}
}
```

## Kubernetes PersistentVolumeClaim

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setStatus-setAccessModes": "java.util.List<java.lang.String>",
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setStatus-setCapacity-demokey1": "ref-setStatus-setCapacity-demokey1",
		"setSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setStatus-setPhase": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setSpec-setStorageClassName": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setSpec-setVolumeName": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setAccessModes": "java.util.List<java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setStatus-setCapacity-demokey2": "ref-setStatus-setCapacity-demokey2",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-setStatus-setCapacity-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setStatus-setCapacity-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	}
}
```

## Kubernetes DaemonSet

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setTerminationGracePeriodSeconds": "java.lang.Long",
		"setSpec-setInitContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSecurityContext-setSupplementalGroups": ["ref-java.lang.Long-0", "ref-java.lang.Long-1"],
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMaxUnavailable-setIntVal": "java.lang.Integer",
		"setSpec-setTemplateGeneration": "java.lang.Long",
		"setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setMinReadySeconds": "java.lang.Integer",
		"setSpec-setSubdomain": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setHostNetwork": "java.lang.Boolean",
		"setStatus-setNumberMisscheduled": "java.lang.Integer",
		"setMetadata-setSelfLink": "java.lang.String",
		"setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1"],
		"setSpec-setRevisionHistoryLimit": "java.lang.Integer",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setRestartPolicy": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setStatus-setCurrentNumberScheduled": "java.lang.Integer",
		"setSpec-setHostPID": "java.lang.Boolean",
		"setStatus-setNumberReady": "java.lang.Integer",
		"setStatus-setCollisionCount": "java.lang.Long",
		"setMaxUnavailable-setStrVal": "java.lang.String",
		"setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setStatus-setNumberUnavailable": "java.lang.Integer",
		"setMetadata-setName": "java.lang.String",
		"setSpec-setServiceAccountName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setSpec-setVolumes": ["ref-io.fabric8.kubernetes.api.model.Volume-0", "ref-io.fabric8.kubernetes.api.model.Volume-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setSpec-setImagePullSecrets": ["ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0", "ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1"],
		"setStatus-setNumberAvailable": "java.lang.Integer",
		"setStatus-setObservedGeneration": "java.lang.Long",
		"setStatus-setDesiredNumberScheduled": "java.lang.Integer",
		"setSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setSchedulerName": "java.lang.String",
		"setStatus-setUpdatedNumberScheduled": "java.lang.Integer",
		"setSpec-setDnsPolicy": "java.lang.String",
		"setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setHostAliases": ["ref-io.fabric8.kubernetes.api.model.HostAlias-0", "ref-io.fabric8.kubernetes.api.model.HostAlias-1"],
		"setSpec-setHostname": "java.lang.String",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setSecurityContext-setFsGroup": "java.lang.Long",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setSpec-setNodeName": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0", "ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1"],
		"setUpdateStrategy-setType": "java.lang.String",
		"setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setTolerations": ["ref-io.fabric8.kubernetes.api.model.Toleration-0", "ref-io.fabric8.kubernetes.api.model.Toleration-1"],
		"setSpec-setServiceAccount": "java.lang.String",
		"setSpec-setNodeSelector": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-0": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setWorkingDir": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-0": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-1": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-0": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-1": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-0": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-1": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-0": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-1": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-0": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-1": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-1": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setWorkingDir": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-0": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-1": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-0": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-1": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-0": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setOptional": "java.lang.Boolean",
		"setFlocker-setDatasetName": "java.lang.String",
		"setSecret-setSecretName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-0": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-1": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-0": {
		"setConfigMap-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setName": "java.lang.String",
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-1": {
		"setConfigMap-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setName": "java.lang.String",
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-1": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setOptional": "java.lang.Boolean",
		"setFlocker-setDatasetName": "java.lang.String",
		"setSecret-setSecretName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	}
}
```

## Kubernetes HorizontalPodAutoscaler

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setStatus-setObservedGeneration": "java.lang.Long",
		"setSpec-setMaxReplicas": "java.lang.Integer",
		"setStatus-setLastScaleTime": "java.lang.String",
		"setScaleTargetRef-setName": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setSpec-setTargetCPUUtilizationPercentage": "java.lang.Integer",
		"setSpec-setMinReplicas": "java.lang.Integer",
		"setStatus-setCurrentCPUUtilizationPercentage": "java.lang.Integer",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setStatus-setCurrentReplicas": "java.lang.Integer",
		"setMetadata-setClusterName": "java.lang.String",
		"setStatus-setDesiredReplicas": "java.lang.Integer",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	}
}
```

## Kubernetes Pod

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setTerminationGracePeriodSeconds": "java.lang.Long",
		"setSpec-setInitContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSecurityContext-setSupplementalGroups": ["ref-java.lang.Long-0", "ref-java.lang.Long-1"],
		"setStatus-setPhase": "java.lang.String",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setStatus-setStartTime": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setStatus-setQosClass": "java.lang.String",
		"setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setSubdomain": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setHostNetwork": "java.lang.Boolean",
		"setMetadata-setSelfLink": "java.lang.String",
		"setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1"],
		"setSeLinuxOptions-setType": "java.lang.String",
		"setStatus-setPodIP": "java.lang.String",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setStatus-setHostIP": "java.lang.String",
		"setSpec-setRestartPolicy": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setHostPID": "java.lang.Boolean",
		"setStatus-setReason": "java.lang.String",
		"setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setMetadata-setName": "java.lang.String",
		"setSpec-setServiceAccountName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setSpec-setVolumes": ["ref-io.fabric8.kubernetes.api.model.Volume-0", "ref-io.fabric8.kubernetes.api.model.Volume-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setStatus-setInitContainerStatuses": ["ref-io.fabric8.kubernetes.api.model.ContainerStatus-0", "ref-io.fabric8.kubernetes.api.model.ContainerStatus-1"],
		"setSpec-setImagePullSecrets": ["ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0", "ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1"],
		"setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setStatus-setConditions": ["ref-io.fabric8.kubernetes.api.model.PodCondition-0", "ref-io.fabric8.kubernetes.api.model.PodCondition-1"],
		"setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setSchedulerName": "java.lang.String",
		"setSpec-setDnsPolicy": "java.lang.String",
		"setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setHostAliases": ["ref-io.fabric8.kubernetes.api.model.HostAlias-0", "ref-io.fabric8.kubernetes.api.model.HostAlias-1"],
		"setSpec-setHostname": "java.lang.String",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setStatus-setContainerStatuses": ["ref-io.fabric8.kubernetes.api.model.ContainerStatus-0", "ref-io.fabric8.kubernetes.api.model.ContainerStatus-1"],
		"setSecurityContext-setFsGroup": "java.lang.Long",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setStatus-setMessage": "java.lang.String",
		"setSpec-setNodeName": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0", "ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1"],
		"setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setTolerations": ["ref-io.fabric8.kubernetes.api.model.Toleration-0", "ref-io.fabric8.kubernetes.api.model.Toleration-1"],
		"setSpec-setServiceAccount": "java.lang.String",
		"setSpec-setNodeSelector": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long"
	},
	"ref-io.fabric8.kubernetes.api.model.PodCondition-0": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setLastProbeTime": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PodCondition-1": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setLastProbeTime": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerStatus-0": {
		"setName": "java.lang.String",
		"setImageID": "java.lang.String",
		"setReady": "java.lang.Boolean",
		"setContainerID": "java.lang.String",
		"setRestartCount": "java.lang.Integer",
		"setTerminated-setStartedAt": "java.lang.String",
		"setTerminated-setFinishedAt": "java.lang.String",
		"setWaiting-setReason": "java.lang.String",
		"setTerminated-setSignal": "java.lang.Integer",
		"setTerminated-setContainerID": "java.lang.String",
		"setTerminated-setExitCode": "java.lang.Integer",
		"setWaiting-setMessage": "java.lang.String",
		"setRunning-setStartedAt": "java.lang.String",
		"setTerminated-setMessage": "java.lang.String",
		"setTerminated-setReason": "java.lang.String",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerStatus-1": {
		"setName": "java.lang.String",
		"setImageID": "java.lang.String",
		"setReady": "java.lang.Boolean",
		"setContainerID": "java.lang.String",
		"setRestartCount": "java.lang.Integer",
		"setTerminated-setStartedAt": "java.lang.String",
		"setTerminated-setFinishedAt": "java.lang.String",
		"setWaiting-setReason": "java.lang.String",
		"setTerminated-setSignal": "java.lang.Integer",
		"setTerminated-setContainerID": "java.lang.String",
		"setTerminated-setExitCode": "java.lang.Integer",
		"setWaiting-setMessage": "java.lang.String",
		"setRunning-setStartedAt": "java.lang.String",
		"setTerminated-setMessage": "java.lang.String",
		"setTerminated-setReason": "java.lang.String",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-0": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setWorkingDir": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-0": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-1": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-0": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-1": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-0": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-1": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-0": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-1": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-0": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-1": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-1": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setWorkingDir": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-0": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-1": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-0": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-1": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-0": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setOptional": "java.lang.Boolean",
		"setFlocker-setDatasetName": "java.lang.String",
		"setSecret-setSecretName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-0": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-1": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-0": {
		"setConfigMap-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setName": "java.lang.String",
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-1": {
		"setConfigMap-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setName": "java.lang.String",
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-1": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setOptional": "java.lang.Boolean",
		"setFlocker-setDatasetName": "java.lang.String",
		"setSecret-setSecretName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	}
}
```

## Kubernetes ReplicaSet

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setTerminationGracePeriodSeconds": "java.lang.Long",
		"setSpec-setInitContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSecurityContext-setSupplementalGroups": ["ref-java.lang.Long-0", "ref-java.lang.Long-1"],
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setMinReadySeconds": "java.lang.Integer",
		"setSpec-setSubdomain": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setHostNetwork": "java.lang.Boolean",
		"setStatus-setAvailableReplicas": "java.lang.Integer",
		"setMetadata-setSelfLink": "java.lang.String",
		"setSpec-setReplicas": "java.lang.Integer",
		"setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1"],
		"setSeLinuxOptions-setType": "java.lang.String",
		"setSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setStatus-setFullyLabeledReplicas": "java.lang.Integer",
		"setSpec-setRestartPolicy": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setHostPID": "java.lang.Boolean",
		"setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setMetadata-setName": "java.lang.String",
		"setSpec-setServiceAccountName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setSpec-setVolumes": ["ref-io.fabric8.kubernetes.api.model.Volume-0", "ref-io.fabric8.kubernetes.api.model.Volume-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setSpec-setImagePullSecrets": ["ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0", "ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1"],
		"setStatus-setObservedGeneration": "java.lang.Long",
		"setSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setStatus-setConditions": ["ref-io.fabric8.kubernetes.api.model.extensions.ReplicaSetCondition-0", "ref-io.fabric8.kubernetes.api.model.extensions.ReplicaSetCondition-1"],
		"setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setSchedulerName": "java.lang.String",
		"setSpec-setDnsPolicy": "java.lang.String",
		"setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setHostAliases": ["ref-io.fabric8.kubernetes.api.model.HostAlias-0", "ref-io.fabric8.kubernetes.api.model.HostAlias-1"],
		"setSpec-setHostname": "java.lang.String",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setSecurityContext-setFsGroup": "java.lang.Long",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setStatus-setReadyReplicas": "java.lang.Integer",
		"setSpec-setNodeName": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0", "ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1"],
		"setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setTolerations": ["ref-io.fabric8.kubernetes.api.model.Toleration-0", "ref-io.fabric8.kubernetes.api.model.Toleration-1"],
		"setSpec-setServiceAccount": "java.lang.String",
		"setStatus-setReplicas": "java.lang.Integer",
		"setSpec-setNodeSelector": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.ReplicaSetCondition-0": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.ReplicaSetCondition-1": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-0": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setWorkingDir": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-0": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-1": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-0": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-1": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-0": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-1": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-0": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-1": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-0": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-1": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-1": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setWorkingDir": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-0": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-1": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-0": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-1": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-0": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setOptional": "java.lang.Boolean",
		"setFlocker-setDatasetName": "java.lang.String",
		"setSecret-setSecretName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-0": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-1": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-0": {
		"setConfigMap-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setName": "java.lang.String",
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-1": {
		"setConfigMap-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setName": "java.lang.String",
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-1": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setOptional": "java.lang.Boolean",
		"setFlocker-setDatasetName": "java.lang.String",
		"setSecret-setSecretName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	}
}
```

## Kubernetes Job

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setSpec-setParallelism": "java.lang.Integer",
		"setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setTerminationGracePeriodSeconds": "java.lang.Long",
		"setSpec-setInitContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSecurityContext-setSupplementalGroups": ["ref-java.lang.Long-0", "ref-java.lang.Long-1"],
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setStatus-setStartTime": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setSubdomain": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setHostNetwork": "java.lang.Boolean",
		"setMetadata-setSelfLink": "java.lang.String",
		"setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1"],
		"setSeLinuxOptions-setType": "java.lang.String",
		"setSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setSpec-setRestartPolicy": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setHostPID": "java.lang.Boolean",
		"setSpec-setManualSelector": "java.lang.Boolean",
		"setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setMetadata-setName": "java.lang.String",
		"setSpec-setServiceAccountName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setSpec-setVolumes": ["ref-io.fabric8.kubernetes.api.model.Volume-0", "ref-io.fabric8.kubernetes.api.model.Volume-1"],
		"setStatus-setCompletionTime": "java.lang.String",
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setSpec-setImagePullSecrets": ["ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0", "ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1"],
		"setSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setStatus-setConditions": ["ref-io.fabric8.kubernetes.api.model.JobCondition-0", "ref-io.fabric8.kubernetes.api.model.JobCondition-1"],
		"setStatus-setSucceeded": "java.lang.Integer",
		"setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setSchedulerName": "java.lang.String",
		"setSpec-setDnsPolicy": "java.lang.String",
		"setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setHostAliases": ["ref-io.fabric8.kubernetes.api.model.HostAlias-0", "ref-io.fabric8.kubernetes.api.model.HostAlias-1"],
		"setStatus-setFailed": "java.lang.Integer",
		"setSpec-setHostname": "java.lang.String",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setSecurityContext-setFsGroup": "java.lang.Long",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setSpec-setNodeName": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0", "ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1"],
		"setStatus-setActive": "java.lang.Integer",
		"setSpec-setCompletions": "java.lang.Integer",
		"setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setTolerations": ["ref-io.fabric8.kubernetes.api.model.Toleration-0", "ref-io.fabric8.kubernetes.api.model.Toleration-1"],
		"setSpec-setServiceAccount": "java.lang.String",
		"setSpec-setNodeSelector": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long"
	},
	"ref-io.fabric8.kubernetes.api.model.JobCondition-0": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setLastProbeTime": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.JobCondition-1": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setLastProbeTime": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-0": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setWorkingDir": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-0": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-1": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-0": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-1": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-0": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-1": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-0": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-1": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-0": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-1": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-1": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setWorkingDir": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-0": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-1": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-0": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-1": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-0": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setOptional": "java.lang.Boolean",
		"setFlocker-setDatasetName": "java.lang.String",
		"setSecret-setSecretName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-0": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-1": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-0": {
		"setConfigMap-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setName": "java.lang.String",
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-1": {
		"setConfigMap-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setName": "java.lang.String",
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-1": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setOptional": "java.lang.Boolean",
		"setFlocker-setDatasetName": "java.lang.String",
		"setSecret-setSecretName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	}
}
```

## Kubernetes ReplicationController

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setTerminationGracePeriodSeconds": "java.lang.Long",
		"setSpec-setSelector": "java.util.Map<java.lang.String, java.lang.String>",
		"setSpec-setInitContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSecurityContext-setSupplementalGroups": ["ref-java.lang.Long-0", "ref-java.lang.Long-1"],
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setMinReadySeconds": "java.lang.Integer",
		"setSpec-setSubdomain": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setHostNetwork": "java.lang.Boolean",
		"setStatus-setAvailableReplicas": "java.lang.Integer",
		"setMetadata-setSelfLink": "java.lang.String",
		"setSpec-setReplicas": "java.lang.Integer",
		"setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1"],
		"setSeLinuxOptions-setType": "java.lang.String",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setStatus-setFullyLabeledReplicas": "java.lang.Integer",
		"setSpec-setRestartPolicy": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setHostPID": "java.lang.Boolean",
		"setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setMetadata-setName": "java.lang.String",
		"setSpec-setServiceAccountName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setSpec-setVolumes": ["ref-io.fabric8.kubernetes.api.model.Volume-0", "ref-io.fabric8.kubernetes.api.model.Volume-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setSpec-setImagePullSecrets": ["ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0", "ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1"],
		"setStatus-setObservedGeneration": "java.lang.Long",
		"setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setStatus-setConditions": ["ref-io.fabric8.kubernetes.api.model.ReplicationControllerCondition-0", "ref-io.fabric8.kubernetes.api.model.ReplicationControllerCondition-1"],
		"setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setSchedulerName": "java.lang.String",
		"setSpec-setDnsPolicy": "java.lang.String",
		"setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setHostAliases": ["ref-io.fabric8.kubernetes.api.model.HostAlias-0", "ref-io.fabric8.kubernetes.api.model.HostAlias-1"],
		"setSpec-setHostname": "java.lang.String",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setSecurityContext-setFsGroup": "java.lang.Long",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setStatus-setReadyReplicas": "java.lang.Integer",
		"setSpec-setNodeName": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0", "ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1"],
		"setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setTolerations": ["ref-io.fabric8.kubernetes.api.model.Toleration-0", "ref-io.fabric8.kubernetes.api.model.Toleration-1"],
		"setSpec-setServiceAccount": "java.lang.String",
		"setStatus-setReplicas": "java.lang.Integer",
		"setSpec-setNodeSelector": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long"
	},
	"ref-io.fabric8.kubernetes.api.model.ReplicationControllerCondition-0": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ReplicationControllerCondition-1": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-0": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setWorkingDir": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-0": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-1": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-0": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-1": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-0": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-1": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-0": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-1": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-0": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-1": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-1": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setWorkingDir": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-0": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-1": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-0": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-1": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-0": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setOptional": "java.lang.Boolean",
		"setFlocker-setDatasetName": "java.lang.String",
		"setSecret-setSecretName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-0": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-1": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-0": {
		"setConfigMap-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setName": "java.lang.String",
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-1": {
		"setConfigMap-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setName": "java.lang.String",
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-1": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setOptional": "java.lang.Boolean",
		"setFlocker-setDatasetName": "java.lang.String",
		"setSecret-setSecretName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	}
}
```

## Kubernetes Deployment

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setTerminationGracePeriodSeconds": "java.lang.Long",
		"setSpec-setInitContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSecurityContext-setSupplementalGroups": ["ref-java.lang.Long-0", "ref-java.lang.Long-1"],
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMaxUnavailable-setIntVal": "java.lang.Integer",
		"setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setMinReadySeconds": "java.lang.Integer",
		"setSpec-setSubdomain": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setHostNetwork": "java.lang.Boolean",
		"setStatus-setAvailableReplicas": "java.lang.Integer",
		"setMetadata-setSelfLink": "java.lang.String",
		"setSpec-setReplicas": "java.lang.Integer",
		"setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1"],
		"setSpec-setRevisionHistoryLimit": "java.lang.Integer",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setMaxSurge-setStrVal": "java.lang.String",
		"setSpec-setRestartPolicy": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setSpec-setHostPID": "java.lang.Boolean",
		"setStatus-setCollisionCount": "java.lang.Long",
		"setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setMaxUnavailable-setStrVal": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setSpec-setProgressDeadlineSeconds": "java.lang.Integer",
		"setSpec-setServiceAccountName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setSpec-setVolumes": ["ref-io.fabric8.kubernetes.api.model.Volume-0", "ref-io.fabric8.kubernetes.api.model.Volume-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setSpec-setImagePullSecrets": ["ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0", "ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1"],
		"setStatus-setObservedGeneration": "java.lang.Long",
		"setSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setMaxSurge-setIntVal": "java.lang.Integer",
		"setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setStatus-setConditions": ["ref-io.fabric8.kubernetes.api.model.extensions.DeploymentCondition-0", "ref-io.fabric8.kubernetes.api.model.extensions.DeploymentCondition-1"],
		"setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setSchedulerName": "java.lang.String",
		"setSpec-setPaused": "java.lang.Boolean",
		"setSpec-setDnsPolicy": "java.lang.String",
		"setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setHostAliases": ["ref-io.fabric8.kubernetes.api.model.HostAlias-0", "ref-io.fabric8.kubernetes.api.model.HostAlias-1"],
		"setSpec-setHostname": "java.lang.String",
		"setStrategy-setType": "java.lang.String",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setSpec-setContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setRollbackTo-setRevision": "java.lang.Long",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setSecurityContext-setFsGroup": "java.lang.Long",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setStatus-setReadyReplicas": "java.lang.Integer",
		"setSpec-setNodeName": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0", "ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1"],
		"setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setTolerations": ["ref-io.fabric8.kubernetes.api.model.Toleration-0", "ref-io.fabric8.kubernetes.api.model.Toleration-1"],
		"setStatus-setUpdatedReplicas": "java.lang.Integer",
		"setSpec-setServiceAccount": "java.lang.String",
		"setStatus-setReplicas": "java.lang.Integer",
		"setSpec-setNodeSelector": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setStatus-setUnavailableReplicas": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.DeploymentCondition-0": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String",
		"setLastUpdateTime": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.extensions.DeploymentCondition-1": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String",
		"setLastUpdateTime": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-0": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setWorkingDir": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-0": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-1": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setProtocol": "java.lang.String",
		"setHostIP": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-0": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-1": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-0": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-1": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-0": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-1": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-0": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-1": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-1": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setWorkingDir": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-0": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-1": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-0": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-1": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-0": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setOptional": "java.lang.Boolean",
		"setFlocker-setDatasetName": "java.lang.String",
		"setSecret-setSecretName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-0": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-1": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-0": {
		"setConfigMap-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setName": "java.lang.String",
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-1": {
		"setConfigMap-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setName": "java.lang.String",
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-1": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setLun": "java.lang.Integer",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setOptional": "java.lang.Boolean",
		"setFlocker-setDatasetName": "java.lang.String",
		"setSecret-setSecretName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	}
}
```


## OpenShift Policy

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setRoles": ["ref-io.fabric8.openshift.api.model.NamedRole-0", "ref-io.fabric8.openshift.api.model.NamedRole-1"],
		"setLastModified": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.openshift.api.model.NamedRole-0": {
		"setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setRole-setRules": ["ref-io.fabric8.openshift.api.model.PolicyRule-0", "ref-io.fabric8.openshift.api.model.PolicyRule-1"],
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.openshift.api.model.PolicyRule-0": {
		"setNonResourceURLs": "java.util.List<java.lang.String>",
		"setVerbs": "java.util.List<java.lang.String>",
		"setResourceNames": "java.util.List<java.lang.String>",
		"setResources": "java.util.List<java.lang.String>",
		"setApiGroups": "java.util.List<java.lang.String>"
	},
	"ref-io.fabric8.openshift.api.model.PolicyRule-1": {
		"setNonResourceURLs": "java.util.List<java.lang.String>",
		"setVerbs": "java.util.List<java.lang.String>",
		"setResourceNames": "java.util.List<java.lang.String>",
		"setResources": "java.util.List<java.lang.String>",
		"setApiGroups": "java.util.List<java.lang.String>"
	},
	"ref-io.fabric8.openshift.api.model.NamedRole-1": {
		"setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setRole-setRules": ["ref-io.fabric8.openshift.api.model.PolicyRule-0", "ref-io.fabric8.openshift.api.model.PolicyRule-1"],
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	}
}
```

## OpenShift Group

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setUsers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	}
}
```

## OpenShift User

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setIdentities": "java.util.List<java.lang.String>",
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setFullName": "java.lang.String",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setGroups": "java.util.List<java.lang.String>",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	}
}
```

## OpenShift OAuthClient

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setRespondWithChallenges": "java.lang.Boolean",
		"setScopeRestrictions": ["ref-io.fabric8.openshift.api.model.ScopeRestriction-0", "ref-io.fabric8.openshift.api.model.ScopeRestriction-1"],
		"setRedirectURIs": "java.util.List<java.lang.String>",
		"setMetadata-setGenerateName": "java.lang.String",
		"setAdditionalSecrets": "java.util.List<java.lang.String>",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setSecret": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setGrantMethod": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.openshift.api.model.ScopeRestriction-0": {
		"setLiterals": "java.util.List<java.lang.String>",
		"setClusterRole-setRoleNames": "java.util.List<java.lang.String>",
		"setClusterRole-setAllowEscalation": "java.lang.Boolean",
		"setClusterRole-setNamespaces": "java.util.List<java.lang.String>"
	},
	"ref-io.fabric8.openshift.api.model.ScopeRestriction-1": {
		"setLiterals": "java.util.List<java.lang.String>",
		"setClusterRole-setRoleNames": "java.util.List<java.lang.String>",
		"setClusterRole-setAllowEscalation": "java.lang.Boolean",
		"setClusterRole-setNamespaces": "java.util.List<java.lang.String>"
	}
}
```

## OpenShift ClusterRoleBinding

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setRoleRef-setName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setGroupNames": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setRoleRef-setFieldPath": "java.lang.String",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setSubjects": ["ref-io.fabric8.kubernetes.api.model.ObjectReference-0", "ref-io.fabric8.kubernetes.api.model.ObjectReference-1"],
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setRoleRef-setNamespace": "java.lang.String",
		"setUserNames": "java.util.List<java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.ObjectReference-0": {
		"setName": "java.lang.String",
		"setFieldPath": "java.lang.String",
		"setNamespace": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ObjectReference-1": {
		"setName": "java.lang.String",
		"setFieldPath": "java.lang.String",
		"setNamespace": "java.lang.String"
	}
}
```

## OpenShift ImageStreamTag

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setTag-setName": "java.lang.String",
		"setImage-setDockerImageLayers": ["ref-io.fabric8.openshift.api.model.ImageLayer-0", "ref-io.fabric8.openshift.api.model.ImageLayer-1"],
		"setGeneration": "java.lang.Long",
		"setImage-setDockerImageMetadataVersion": "java.lang.String",
		"setFrom-setFieldPath": "java.lang.String",
		"setTag-setGeneration": "java.lang.Long",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setConditions": ["ref-io.fabric8.openshift.api.model.TagEventCondition-0", "ref-io.fabric8.openshift.api.model.TagEventCondition-1"],
		"setFrom-setName": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setLookupPolicy-setLocal": "java.lang.Boolean",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setTag-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setImage-setSignatures": ["ref-io.fabric8.openshift.api.model.ImageSignature-0", "ref-io.fabric8.openshift.api.model.ImageSignature-1"],
		"setImage-setDockerImageConfig": "java.lang.String",
		"setImage-setDockerImageManifest": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setImage-setDockerImageManifestMediaType": "java.lang.String",
		"setTag-setReference": "java.lang.Boolean",
		"setImage-setDockerImageReference": "java.lang.String",
		"setImportPolicy-setScheduled": "java.lang.Boolean",
		"setImage-setDockerImageSignatures": "java.util.List<java.lang.String>",
		"setImportPolicy-setInsecure": "java.lang.Boolean",
		"setFrom-setNamespace": "java.lang.String",
		"setReferencePolicy-setType": "java.lang.String",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.openshift.api.model.ImageSignature-0": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setIssuedTo-setOrganization": "java.lang.String",
		"setContent": "java.lang.String",
		"setIssuedTo-setCommonName": "java.lang.String",
		"setIssuedBy-setCommonName": "java.lang.String",
		"setCreated": "java.lang.String",
		"setType": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setSignedClaims": "java.util.Map<java.lang.String, java.lang.String>",
		"setIssuedTo-setPublicKeyID": "java.lang.String",
		"setConditions": ["ref-io.fabric8.openshift.api.model.SignatureCondition-0", "ref-io.fabric8.openshift.api.model.SignatureCondition-1"],
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setImageIdentity": "java.lang.String",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setIssuedBy-setOrganization": "java.lang.String",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.openshift.api.model.SignatureCondition-0": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setLastProbeTime": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.SignatureCondition-1": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setLastProbeTime": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.ImageSignature-1": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setIssuedTo-setOrganization": "java.lang.String",
		"setContent": "java.lang.String",
		"setIssuedTo-setCommonName": "java.lang.String",
		"setIssuedBy-setCommonName": "java.lang.String",
		"setCreated": "java.lang.String",
		"setType": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setSignedClaims": "java.util.Map<java.lang.String, java.lang.String>",
		"setIssuedTo-setPublicKeyID": "java.lang.String",
		"setConditions": ["ref-io.fabric8.openshift.api.model.SignatureCondition-0", "ref-io.fabric8.openshift.api.model.SignatureCondition-1"],
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setImageIdentity": "java.lang.String",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setIssuedBy-setOrganization": "java.lang.String",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.openshift.api.model.ImageLayer-0": {
		"setName": "java.lang.String",
		"setSize": "java.lang.Long",
		"setMediaType": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.ImageLayer-1": {
		"setName": "java.lang.String",
		"setSize": "java.lang.Long",
		"setMediaType": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.TagEventCondition-0": {
		"setLastTransitionTime": "java.lang.String",
		"setGeneration": "java.lang.Long",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.TagEventCondition-1": {
		"setLastTransitionTime": "java.lang.String",
		"setGeneration": "java.lang.Long",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	}
}
```

## OpenShift ImageStream

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setSpec-setDockerImageRepository": "java.lang.String",
		"setSpec-setTags": ["ref-io.fabric8.openshift.api.model.TagReference-0", "ref-io.fabric8.openshift.api.model.TagReference-1"],
		"setStatus-setDockerImageRepository": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setStatus-setTags": ["ref-io.fabric8.openshift.api.model.NamedTagEventList-0", "ref-io.fabric8.openshift.api.model.NamedTagEventList-1"],
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setLookupPolicy-setLocal": "java.lang.Boolean",
		"setStatus-setPublicDockerImageRepository": "java.lang.String",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.openshift.api.model.NamedTagEventList-0": {
		"setConditions": ["ref-io.fabric8.openshift.api.model.TagEventCondition-0", "ref-io.fabric8.openshift.api.model.TagEventCondition-1"],
		"setItems": ["ref-io.fabric8.openshift.api.model.TagEvent-0", "ref-io.fabric8.openshift.api.model.TagEvent-1"],
		"setTag": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.TagEventCondition-0": {
		"setLastTransitionTime": "java.lang.String",
		"setGeneration": "java.lang.Long",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.TagEventCondition-1": {
		"setLastTransitionTime": "java.lang.String",
		"setGeneration": "java.lang.Long",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.TagEvent-0": {
		"setGeneration": "java.lang.Long",
		"setDockerImageReference": "java.lang.String",
		"setCreated": "java.lang.String",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.TagEvent-1": {
		"setGeneration": "java.lang.Long",
		"setDockerImageReference": "java.lang.String",
		"setCreated": "java.lang.String",
		"setImage": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.NamedTagEventList-1": {
		"setConditions": ["ref-io.fabric8.openshift.api.model.TagEventCondition-0", "ref-io.fabric8.openshift.api.model.TagEventCondition-1"],
		"setItems": ["ref-io.fabric8.openshift.api.model.TagEvent-0", "ref-io.fabric8.openshift.api.model.TagEvent-1"],
		"setTag": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.TagReference-0": {
		"setName": "java.lang.String",
		"setImportPolicy-setScheduled": "java.lang.Boolean",
		"setFrom-setName": "java.lang.String",
		"setReference": "java.lang.Boolean",
		"setImportPolicy-setInsecure": "java.lang.Boolean",
		"setFrom-setNamespace": "java.lang.String",
		"setReferencePolicy-setType": "java.lang.String",
		"setGeneration": "java.lang.Long",
		"setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setFrom-setFieldPath": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.TagReference-1": {
		"setName": "java.lang.String",
		"setImportPolicy-setScheduled": "java.lang.Boolean",
		"setFrom-setName": "java.lang.String",
		"setReference": "java.lang.Boolean",
		"setImportPolicy-setInsecure": "java.lang.Boolean",
		"setFrom-setNamespace": "java.lang.String",
		"setReferencePolicy-setType": "java.lang.String",
		"setGeneration": "java.lang.Long",
		"setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setFrom-setFieldPath": "java.lang.String"
	}
}
```

## OpenShift Build

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setSource-setContextDir": "java.lang.String",
		"setStatus-setStages": ["ref-io.fabric8.openshift.api.model.StageInfo-0", "ref-io.fabric8.openshift.api.model.StageInfo-1"],
		"setGit-setUri": "java.lang.String",
		"setJenkinsPipelineStrategy-setJenkinsfile": "java.lang.String",
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPostCommit-setCommand": "java.util.List<java.lang.String>",
		"setBinary-setAsFile": "java.lang.String",
		"setPushSecret-setName": "java.lang.String",
		"setTo-setName": "java.lang.String",
		"setStatus-setPhase": "java.lang.String",
		"setAuthor-setEmail": "java.lang.String",
		"setJenkinsPipelineStrategy-setJenkinsfilePath": "java.lang.String",
		"setPullSecret-setName": "java.lang.String",
		"setCustomStrategy-setBuildAPIVersion": "java.lang.String",
		"setSourceStrategy-setScripts": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setGit-setHttpProxy": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setPostCommit-setScript": "java.lang.String",
		"setDockerStrategy-setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setMetadata-setSelfLink": "java.lang.String",
		"setSourceStrategy-setForcePull": "java.lang.Boolean",
		"setRuntimeImage-setFieldPath": "java.lang.String",
		"setSpec-setTriggeredBy": ["ref-io.fabric8.openshift.api.model.BuildTriggerCause-0", "ref-io.fabric8.openshift.api.model.BuildTriggerCause-1"],
		"setConfig-setName": "java.lang.String",
		"setGit-setNoProxy": "java.lang.String",
		"setCustomStrategy-setSecrets": ["ref-io.fabric8.openshift.api.model.SecretSpec-0", "ref-io.fabric8.openshift.api.model.SecretSpec-1"],
		"setGit-setRef": "java.lang.String",
		"setRuntimeImage-setName": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setTo-setFieldPath": "java.lang.String",
		"setStatus-setOutputDockerImageReference": "java.lang.String",
		"setSource-setDockerfile": "java.lang.String",
		"setCustomStrategy-setForcePull": "java.lang.Boolean",
		"setDockerStrategy-setForcePull": "java.lang.Boolean",
		"setDockerStrategy-setBuildArgs": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setRuntimeImage-setNamespace": "java.lang.String",
		"setSource-setSecrets": ["ref-io.fabric8.openshift.api.model.SecretBuildSource-0", "ref-io.fabric8.openshift.api.model.SecretBuildSource-1"],
		"setStatus-setDuration": "java.lang.Long",
		"setOutput-setImageLabels": ["ref-io.fabric8.openshift.api.model.ImageLabel-0", "ref-io.fabric8.openshift.api.model.ImageLabel-1"],
		"setStatus-setReason": "java.lang.String",
		"setSpec-setCompletionDeadlineSeconds": "java.lang.Long",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setCommitter-setName": "java.lang.String",
		"setGit-setMessage": "java.lang.String",
		"setSourceStrategy-setIncremental": "java.lang.Boolean",
		"setConfig-setFieldPath": "java.lang.String",
		"setDockerStrategy-setNoCache": "java.lang.Boolean",
		"setCustomStrategy-setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setTo-setImageDigest": "java.lang.String",
		"setFrom-setFieldPath": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setStrategy-setType": "java.lang.String",
		"setTo-setNamespace": "java.lang.String",
		"setDockerStrategy-setDockerfilePath": "java.lang.String",
		"setFrom-setName": "java.lang.String",
		"setAuthor-setName": "java.lang.String",
		"setPostCommit-setArgs": "java.util.List<java.lang.String>",
		"setStatus-setLogSnippet": "java.lang.String",
		"setStatus-setCompletionTimestamp": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setStatus-setMessage": "java.lang.String",
		"setConfig-setNamespace": "java.lang.String",
		"setSource-setType": "java.lang.String",
		"setRevision-setType": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setStatus-setCancelled": "java.lang.Boolean",
		"setStatus-setStartTimestamp": "java.lang.String",
		"setGit-setCommit": "java.lang.String",
		"setSourceStrategy-setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommitter-setEmail": "java.lang.String",
		"setCustomStrategy-setExposeDockerSocket": "java.lang.Boolean",
		"setSourceSecret-setName": "java.lang.String",
		"setGit-setHttpsProxy": "java.lang.String",
		"setJenkinsPipelineStrategy-setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setDockerStrategy-setImageOptimizationPolicy": "java.lang.String",
		"setFrom-setNamespace": "java.lang.String",
		"setSpec-setServiceAccount": "java.lang.String",
		"setSpec-setNodeSelector": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setSource-setImages": ["ref-io.fabric8.openshift.api.model.ImageSource-0", "ref-io.fabric8.openshift.api.model.ImageSource-1"],
		"setSourceStrategy-setRuntimeArtifacts": ["ref-io.fabric8.openshift.api.model.ImageSourcePath-0", "ref-io.fabric8.openshift.api.model.ImageSourcePath-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.openshift.api.model.StageInfo-0": {
		"setName": "java.lang.String",
		"setSteps": ["ref-io.fabric8.openshift.api.model.StepInfo-0", "ref-io.fabric8.openshift.api.model.StepInfo-1"],
		"setStartTime": "java.lang.String",
		"setDurationMilliseconds": "java.lang.Long"
	},
	"ref-io.fabric8.openshift.api.model.StepInfo-0": {
		"setName": "java.lang.String",
		"setStartTime": "java.lang.String",
		"setDurationMilliseconds": "java.lang.Long"
	},
	"ref-io.fabric8.openshift.api.model.StepInfo-1": {
		"setName": "java.lang.String",
		"setStartTime": "java.lang.String",
		"setDurationMilliseconds": "java.lang.Long"
	},
	"ref-io.fabric8.openshift.api.model.StageInfo-1": {
		"setName": "java.lang.String",
		"setSteps": ["ref-io.fabric8.openshift.api.model.StepInfo-0", "ref-io.fabric8.openshift.api.model.StepInfo-1"],
		"setStartTime": "java.lang.String",
		"setDurationMilliseconds": "java.lang.Long"
	},
	"ref-setResources-setLimits-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.ImageLabel-0": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.ImageLabel-1": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.ImageSource-0": {
		"setFrom-setName": "java.lang.String",
		"setFrom-setNamespace": "java.lang.String",
		"setPullSecret-setName": "java.lang.String",
		"setFrom-setFieldPath": "java.lang.String",
		"setPaths": ["ref-io.fabric8.openshift.api.model.ImageSourcePath-0", "ref-io.fabric8.openshift.api.model.ImageSourcePath-1"]
	},
	"ref-io.fabric8.openshift.api.model.ImageSourcePath-0": {
		"setSourcePath": "java.lang.String",
		"setDestinationDir": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.ImageSourcePath-1": {
		"setSourcePath": "java.lang.String",
		"setDestinationDir": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.ImageSource-1": {
		"setFrom-setName": "java.lang.String",
		"setFrom-setNamespace": "java.lang.String",
		"setPullSecret-setName": "java.lang.String",
		"setFrom-setFieldPath": "java.lang.String",
		"setPaths": ["ref-io.fabric8.openshift.api.model.ImageSourcePath-0", "ref-io.fabric8.openshift.api.model.ImageSourcePath-1"]
	},
	"ref-io.fabric8.openshift.api.model.SecretBuildSource-0": {
		"setSecret-setName": "java.lang.String",
		"setDestinationDir": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.SecretBuildSource-1": {
		"setSecret-setName": "java.lang.String",
		"setDestinationDir": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.BuildTriggerCause-0": {
		"setCommitter-setName": "java.lang.String",
		"setGitlabWebHook-setSecret": "java.lang.String",
		"setGit-setMessage": "java.lang.String",
		"setGit-setCommit": "java.lang.String",
		"setCommitter-setEmail": "java.lang.String",
		"setFromRef-setFieldPath": "java.lang.String",
		"setBitbucketWebHook-setSecret": "java.lang.String",
		"setMessage": "java.lang.String",
		"setAuthor-setEmail": "java.lang.String",
		"setAuthor-setName": "java.lang.String",
		"setFromRef-setName": "java.lang.String",
		"setGenericWebHook-setSecret": "java.lang.String",
		"setFromRef-setNamespace": "java.lang.String",
		"setImageChangeBuild-setImageID": "java.lang.String",
		"setRevision-setType": "java.lang.String",
		"setGithubWebHook-setSecret": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.BuildTriggerCause-1": {
		"setCommitter-setName": "java.lang.String",
		"setGitlabWebHook-setSecret": "java.lang.String",
		"setGit-setMessage": "java.lang.String",
		"setGit-setCommit": "java.lang.String",
		"setCommitter-setEmail": "java.lang.String",
		"setFromRef-setFieldPath": "java.lang.String",
		"setBitbucketWebHook-setSecret": "java.lang.String",
		"setMessage": "java.lang.String",
		"setAuthor-setEmail": "java.lang.String",
		"setAuthor-setName": "java.lang.String",
		"setFromRef-setName": "java.lang.String",
		"setGenericWebHook-setSecret": "java.lang.String",
		"setFromRef-setNamespace": "java.lang.String",
		"setImageChangeBuild-setImageID": "java.lang.String",
		"setRevision-setType": "java.lang.String",
		"setGithubWebHook-setSecret": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.SecretSpec-0": {
		"setMountPath": "java.lang.String",
		"setSecretSource-setName": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.SecretSpec-1": {
		"setMountPath": "java.lang.String",
		"setSecretSource-setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-0": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-1": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	}
}
```

## OpenShift BuildConfig

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setSource-setContextDir": "java.lang.String",
		"setGit-setUri": "java.lang.String",
		"setJenkinsPipelineStrategy-setJenkinsfile": "java.lang.String",
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPostCommit-setCommand": "java.util.List<java.lang.String>",
		"setBinary-setAsFile": "java.lang.String",
		"setPushSecret-setName": "java.lang.String",
		"setTo-setName": "java.lang.String",
		"setAuthor-setEmail": "java.lang.String",
		"setJenkinsPipelineStrategy-setJenkinsfilePath": "java.lang.String",
		"setPullSecret-setName": "java.lang.String",
		"setCustomStrategy-setBuildAPIVersion": "java.lang.String",
		"setSourceStrategy-setScripts": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setGit-setHttpProxy": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setPostCommit-setScript": "java.lang.String",
		"setDockerStrategy-setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setMetadata-setSelfLink": "java.lang.String",
		"setSourceStrategy-setForcePull": "java.lang.Boolean",
		"setRuntimeImage-setFieldPath": "java.lang.String",
		"setGit-setNoProxy": "java.lang.String",
		"setSpec-setFailedBuildsHistoryLimit": "java.lang.Integer",
		"setCustomStrategy-setSecrets": ["ref-io.fabric8.openshift.api.model.SecretSpec-0", "ref-io.fabric8.openshift.api.model.SecretSpec-1"],
		"setGit-setRef": "java.lang.String",
		"setRuntimeImage-setName": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setTo-setFieldPath": "java.lang.String",
		"setStatus-setLastVersion": "java.lang.Long",
		"setSource-setDockerfile": "java.lang.String",
		"setCustomStrategy-setForcePull": "java.lang.Boolean",
		"setDockerStrategy-setForcePull": "java.lang.Boolean",
		"setDockerStrategy-setBuildArgs": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setRuntimeImage-setNamespace": "java.lang.String",
		"setSource-setSecrets": ["ref-io.fabric8.openshift.api.model.SecretBuildSource-0", "ref-io.fabric8.openshift.api.model.SecretBuildSource-1"],
		"setOutput-setImageLabels": ["ref-io.fabric8.openshift.api.model.ImageLabel-0", "ref-io.fabric8.openshift.api.model.ImageLabel-1"],
		"setSpec-setCompletionDeadlineSeconds": "java.lang.Long",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setCommitter-setName": "java.lang.String",
		"setGit-setMessage": "java.lang.String",
		"setSourceStrategy-setIncremental": "java.lang.Boolean",
		"setSpec-setRunPolicy": "java.lang.String",
		"setSpec-setTriggers": ["ref-io.fabric8.openshift.api.model.BuildTriggerPolicy-0", "ref-io.fabric8.openshift.api.model.BuildTriggerPolicy-1"],
		"setDockerStrategy-setNoCache": "java.lang.Boolean",
		"setCustomStrategy-setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setFrom-setFieldPath": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setStrategy-setType": "java.lang.String",
		"setTo-setNamespace": "java.lang.String",
		"setDockerStrategy-setDockerfilePath": "java.lang.String",
		"setFrom-setName": "java.lang.String",
		"setAuthor-setName": "java.lang.String",
		"setPostCommit-setArgs": "java.util.List<java.lang.String>",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setSource-setType": "java.lang.String",
		"setRevision-setType": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setGit-setCommit": "java.lang.String",
		"setSourceStrategy-setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setCommitter-setEmail": "java.lang.String",
		"setCustomStrategy-setExposeDockerSocket": "java.lang.Boolean",
		"setSpec-setSuccessfulBuildsHistoryLimit": "java.lang.Integer",
		"setSourceSecret-setName": "java.lang.String",
		"setGit-setHttpsProxy": "java.lang.String",
		"setJenkinsPipelineStrategy-setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setDockerStrategy-setImageOptimizationPolicy": "java.lang.String",
		"setFrom-setNamespace": "java.lang.String",
		"setSpec-setServiceAccount": "java.lang.String",
		"setSpec-setNodeSelector": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setSource-setImages": ["ref-io.fabric8.openshift.api.model.ImageSource-0", "ref-io.fabric8.openshift.api.model.ImageSource-1"],
		"setSourceStrategy-setRuntimeArtifacts": ["ref-io.fabric8.openshift.api.model.ImageSourcePath-0", "ref-io.fabric8.openshift.api.model.ImageSourcePath-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-setResources-setLimits-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.ImageLabel-0": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.ImageLabel-1": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.ImageSource-0": {
		"setFrom-setName": "java.lang.String",
		"setFrom-setNamespace": "java.lang.String",
		"setPullSecret-setName": "java.lang.String",
		"setFrom-setFieldPath": "java.lang.String",
		"setPaths": ["ref-io.fabric8.openshift.api.model.ImageSourcePath-0", "ref-io.fabric8.openshift.api.model.ImageSourcePath-1"]
	},
	"ref-io.fabric8.openshift.api.model.ImageSourcePath-0": {
		"setSourcePath": "java.lang.String",
		"setDestinationDir": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.ImageSourcePath-1": {
		"setSourcePath": "java.lang.String",
		"setDestinationDir": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.ImageSource-1": {
		"setFrom-setName": "java.lang.String",
		"setFrom-setNamespace": "java.lang.String",
		"setPullSecret-setName": "java.lang.String",
		"setFrom-setFieldPath": "java.lang.String",
		"setPaths": ["ref-io.fabric8.openshift.api.model.ImageSourcePath-0", "ref-io.fabric8.openshift.api.model.ImageSourcePath-1"]
	},
	"ref-io.fabric8.openshift.api.model.SecretBuildSource-0": {
		"setSecret-setName": "java.lang.String",
		"setDestinationDir": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.SecretBuildSource-1": {
		"setSecret-setName": "java.lang.String",
		"setDestinationDir": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.SecretSpec-0": {
		"setMountPath": "java.lang.String",
		"setSecretSource-setName": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.SecretSpec-1": {
		"setMountPath": "java.lang.String",
		"setSecretSource-setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-0": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-1": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.BuildTriggerPolicy-0": {
		"setGithub-setSecret": "java.lang.String",
		"setGitlab-setAllowEnv": "java.lang.Boolean",
		"setType": "java.lang.String",
		"setFrom-setFieldPath": "java.lang.String",
		"setImageChange-setLastTriggeredImageID": "java.lang.String",
		"setBitbucket-setSecret": "java.lang.String",
		"setGitlab-setSecret": "java.lang.String",
		"setFrom-setName": "java.lang.String",
		"setGeneric-setSecret": "java.lang.String",
		"setBitbucket-setAllowEnv": "java.lang.Boolean",
		"setFrom-setNamespace": "java.lang.String",
		"setGithub-setAllowEnv": "java.lang.Boolean",
		"setGeneric-setAllowEnv": "java.lang.Boolean"
	},
	"ref-io.fabric8.openshift.api.model.BuildTriggerPolicy-1": {
		"setGithub-setSecret": "java.lang.String",
		"setGitlab-setAllowEnv": "java.lang.Boolean",
		"setType": "java.lang.String",
		"setFrom-setFieldPath": "java.lang.String",
		"setImageChange-setLastTriggeredImageID": "java.lang.String",
		"setBitbucket-setSecret": "java.lang.String",
		"setGitlab-setSecret": "java.lang.String",
		"setFrom-setName": "java.lang.String",
		"setGeneric-setSecret": "java.lang.String",
		"setBitbucket-setAllowEnv": "java.lang.Boolean",
		"setFrom-setNamespace": "java.lang.String",
		"setGithub-setAllowEnv": "java.lang.Boolean",
		"setGeneric-setAllowEnv": "java.lang.Boolean"
	}
}
```

## OpenShift RoleBinding

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setRoleRef-setName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setGroupNames": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setRoleRef-setFieldPath": "java.lang.String",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setSubjects": ["ref-io.fabric8.kubernetes.api.model.ObjectReference-0", "ref-io.fabric8.kubernetes.api.model.ObjectReference-1"],
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setRoleRef-setNamespace": "java.lang.String",
		"setUserNames": "java.util.List<java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.ObjectReference-0": {
		"setName": "java.lang.String",
		"setFieldPath": "java.lang.String",
		"setNamespace": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ObjectReference-1": {
		"setName": "java.lang.String",
		"setFieldPath": "java.lang.String",
		"setNamespace": "java.lang.String"
	}
}
```

## OpenShift Route

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setTo-setWeight": "java.lang.Integer",
		"setTo-setName": "java.lang.String",
		"setTls-setInsecureEdgeTerminationPolicy": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setTls-setTermination": "java.lang.String",
		"setStatus-setIngress": ["ref-io.fabric8.openshift.api.model.RouteIngress-0", "ref-io.fabric8.openshift.api.model.RouteIngress-1"],
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setTls-setCertificate": "java.lang.String",
		"setTargetPort-setIntVal": "java.lang.Integer",
		"setMetadata-setSelfLink": "java.lang.String",
		"setTls-setKey": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setTls-setCaCertificate": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setSpec-setAlternateBackends": ["ref-io.fabric8.openshift.api.model.RouteTargetReference-0", "ref-io.fabric8.openshift.api.model.RouteTargetReference-1"],
		"setSpec-setWildcardPolicy": "java.lang.String",
		"setTargetPort-setStrVal": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setTls-setDestinationCACertificate": "java.lang.String",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setSpec-setPath": "java.lang.String",
		"setSpec-setHost": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.openshift.api.model.RouteIngress-0": {
		"setRouterName": "java.lang.String",
		"setHost": "java.lang.String",
		"setConditions": ["ref-io.fabric8.openshift.api.model.RouteIngressCondition-0", "ref-io.fabric8.openshift.api.model.RouteIngressCondition-1"],
		"setWildcardPolicy": "java.lang.String",
		"setRouterCanonicalHostname": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.RouteIngressCondition-0": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.RouteIngressCondition-1": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.RouteIngress-1": {
		"setRouterName": "java.lang.String",
		"setHost": "java.lang.String",
		"setConditions": ["ref-io.fabric8.openshift.api.model.RouteIngressCondition-0", "ref-io.fabric8.openshift.api.model.RouteIngressCondition-1"],
		"setWildcardPolicy": "java.lang.String",
		"setRouterCanonicalHostname": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.RouteTargetReference-0": {
		"setName": "java.lang.String",
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.openshift.api.model.RouteTargetReference-1": {
		"setName": "java.lang.String",
		"setWeight": "java.lang.Integer"
	}
}
```

## OpenShift PolicyBinding

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setPolicyRef-setFieldPath": "java.lang.String",
		"setPolicyRef-setName": "java.lang.String",
		"setRoleBindings": ["ref-io.fabric8.openshift.api.model.NamedRoleBinding-0", "ref-io.fabric8.openshift.api.model.NamedRoleBinding-1"],
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setLastModified": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPolicyRef-setNamespace": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.openshift.api.model.NamedRoleBinding-0": {
		"setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setRoleBinding-setUserNames": "java.util.List<java.lang.String>",
		"setRoleBinding-setGroupNames": "java.util.List<java.lang.String>",
		"setRoleBinding-setSubjects": ["ref-io.fabric8.kubernetes.api.model.ObjectReference-0", "ref-io.fabric8.kubernetes.api.model.ObjectReference-1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setRoleRef-setName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setRoleRef-setFieldPath": "java.lang.String",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setRoleRef-setNamespace": "java.lang.String",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.ObjectReference-0": {
		"setName": "java.lang.String",
		"setFieldPath": "java.lang.String",
		"setNamespace": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.ObjectReference-1": {
		"setName": "java.lang.String",
		"setFieldPath": "java.lang.String",
		"setNamespace": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.NamedRoleBinding-1": {
		"setName": "java.lang.String",
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setRoleBinding-setUserNames": "java.util.List<java.lang.String>",
		"setRoleBinding-setGroupNames": "java.util.List<java.lang.String>",
		"setRoleBinding-setSubjects": ["ref-io.fabric8.kubernetes.api.model.ObjectReference-0", "ref-io.fabric8.kubernetes.api.model.ObjectReference-1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setRoleRef-setName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setRoleRef-setFieldPath": "java.lang.String",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setRoleRef-setNamespace": "java.lang.String",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	}
}
```

## OpenShift OAuthAuthorizeToken

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setClientName": "java.lang.String",
		"setCodeChallengeMethod": "java.lang.String",
		"setRedirectURI": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setCodeChallenge": "java.lang.String",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setScopes": "java.util.List<java.lang.String>",
		"setUserName": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setState": "java.lang.String",
		"setMetadata-setClusterName": "java.lang.String",
		"setUserUID": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setExpiresIn": "java.lang.Long",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	}
}
```

## OpenShift Role

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setRules": ["ref-io.fabric8.openshift.api.model.PolicyRule-0", "ref-io.fabric8.openshift.api.model.PolicyRule-1"],
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.openshift.api.model.PolicyRule-0": {
		"setNonResourceURLs": "java.util.List<java.lang.String>",
		"setVerbs": "java.util.List<java.lang.String>",
		"setResourceNames": "java.util.List<java.lang.String>",
		"setResources": "java.util.List<java.lang.String>",
		"setApiGroups": "java.util.List<java.lang.String>"
	},
	"ref-io.fabric8.openshift.api.model.PolicyRule-1": {
		"setNonResourceURLs": "java.util.List<java.lang.String>",
		"setVerbs": "java.util.List<java.lang.String>",
		"setResourceNames": "java.util.List<java.lang.String>",
		"setResources": "java.util.List<java.lang.String>",
		"setApiGroups": "java.util.List<java.lang.String>"
	}
}
```

## OpenShift Project

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setStatus-setPhase": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setFinalizers": "java.util.List<java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	}
}
```

## OpenShift OAuthAccessToken

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setClientName": "java.lang.String",
		"setAuthorizeToken": "java.lang.String",
		"setRedirectURI": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setScopes": "java.util.List<java.lang.String>",
		"setUserName": "java.lang.String",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setMetadata-setClusterName": "java.lang.String",
		"setUserUID": "java.lang.String",
		"setMetadata-setName": "java.lang.String",
		"setMetadata-setSelfLink": "java.lang.String",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setExpiresIn": "java.lang.Long",
		"setRefreshToken": "java.lang.String",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	}
}
```

## OpenShift DeploymentConfig

```
{
	"main": {
		"setMetadata-setNamespace": "java.lang.String",
		"setExecNewPod-setCommand": "java.util.List<java.lang.String>",
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setRollingParams-setTimeoutSeconds": "java.lang.Long",
		"setPre-setTagImages": ["ref-io.fabric8.openshift.api.model.TagImageHook-0", "ref-io.fabric8.openshift.api.model.TagImageHook-1"],
		"setStrategy-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setHostIPC": "java.lang.Boolean",
		"setSpec-setTerminationGracePeriodSeconds": "java.lang.Long",
		"setSpec-setSelector": "java.util.Map<java.lang.String, java.lang.String>",
		"setSpec-setInitContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSecurityContext-setSupplementalGroups": ["ref-java.lang.Long-0", "ref-java.lang.Long-1"],
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setMetadata-setGeneration": "java.lang.Long",
		"setMetadata-setFinalizers": "java.util.List<java.lang.String>",
		"setMaxUnavailable-setIntVal": "java.lang.Integer",
		"setRollingParams-setIntervalSeconds": "java.lang.Long",
		"setSpec-setAutomountServiceAccountToken": "java.lang.Boolean",
		"setSpec-setSubdomain": "java.lang.String",
		"setSpec-setMinReadySeconds": "java.lang.Integer",
		"setMetadata-setDeletionGracePeriodSeconds": "java.lang.Long",
		"setSpec-setHostNetwork": "java.lang.Boolean",
		"setMetadata-setSelfLink": "java.lang.String",
		"setStatus-setAvailableReplicas": "java.lang.Integer",
		"setSpec-setReplicas": "java.lang.Integer",
		"setRequiredDuringSchedulingIgnoredDuringExecution-setNodeSelectorTerms": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1"],
		"setSpec-setRevisionHistoryLimit": "java.lang.Integer",
		"setDetails-setMessage": "java.lang.String",
		"setCustomParams-setImage": "java.lang.String",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setMaxSurge-setStrVal": "java.lang.String",
		"setSpec-setRestartPolicy": "java.lang.String",
		"setMetadata-setGenerateName": "java.lang.String",
		"setCustomParams-setCommand": "java.util.List<java.lang.String>",
		"setStatus-setLatestVersion": "java.lang.Long",
		"setRecreateParams-setTimeoutSeconds": "java.lang.Long",
		"setSpec-setHostPID": "java.lang.Boolean",
		"setCustomParams-setEnvironment": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setMaxUnavailable-setStrVal": "java.lang.String",
		"setPodAntiAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setMetadata-setName": "java.lang.String",
		"setSpec-setServiceAccountName": "java.lang.String",
		"setStrategy-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setAnnotations": "java.util.Map<java.lang.String, java.lang.String>",
		"setSpec-setVolumes": ["ref-io.fabric8.kubernetes.api.model.Volume-0", "ref-io.fabric8.kubernetes.api.model.Volume-1"],
		"setInitializers-setPending": ["ref-io.fabric8.kubernetes.api.model.Initializer-0", "ref-io.fabric8.kubernetes.api.model.Initializer-1"],
		"setMetadata-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setStrategy-setLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setSpec-setImagePullSecrets": ["ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0", "ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1"],
		"setStatus-setObservedGeneration": "java.lang.Long",
		"setRollingParams-setUpdatePeriodSeconds": "java.lang.Long",
		"setMaxSurge-setIntVal": "java.lang.Integer",
		"setExecNewPod-setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setExecNewPod-setVolumes": "java.util.List<java.lang.String>",
		"setPodAffinity-setRequiredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1"],
		"setStatus-setConditions": ["ref-io.fabric8.openshift.api.model.DeploymentCondition-0", "ref-io.fabric8.openshift.api.model.DeploymentCondition-1"],
		"setMid-setTagImages": ["ref-io.fabric8.openshift.api.model.TagImageHook-0", "ref-io.fabric8.openshift.api.model.TagImageHook-1"],
		"setPodAntiAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setSchedulerName": "java.lang.String",
		"setSpec-setTriggers": ["ref-io.fabric8.openshift.api.model.DeploymentTriggerPolicy-0", "ref-io.fabric8.openshift.api.model.DeploymentTriggerPolicy-1"],
		"setSpec-setPaused": "java.lang.Boolean",
		"setSpec-setDnsPolicy": "java.lang.String",
		"setPodAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0", "ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1"],
		"setSpec-setHostAliases": ["ref-io.fabric8.kubernetes.api.model.HostAlias-0", "ref-io.fabric8.kubernetes.api.model.HostAlias-1"],
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setStrategy-setType": "java.lang.String",
		"setSpec-setHostname": "java.lang.String",
		"setPost-setTagImages": ["ref-io.fabric8.openshift.api.model.TagImageHook-0", "ref-io.fabric8.openshift.api.model.TagImageHook-1"],
		"setSpec-setContainers": ["ref-io.fabric8.kubernetes.api.model.Container-0", "ref-io.fabric8.kubernetes.api.model.Container-1"],
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setDetails-setCauses": ["ref-io.fabric8.openshift.api.model.DeploymentCause-0", "ref-io.fabric8.openshift.api.model.DeploymentCause-1"],
		"setSecurityContext-setFsGroup": "java.lang.Long",
		"setMetadata-setCreationTimestamp": "java.lang.String",
		"setStatus-setReadyReplicas": "java.lang.Integer",
		"setSpec-setNodeName": "java.lang.String",
		"setMetadata-setOwnerReferences": ["ref-io.fabric8.kubernetes.api.model.OwnerReference-0", "ref-io.fabric8.kubernetes.api.model.OwnerReference-1"],
		"setNodeAffinity-setPreferredDuringSchedulingIgnoredDuringExecution": ["ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0", "ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1"],
		"setPre-setFailurePolicy": "java.lang.String",
		"setSpec-setTest": "java.lang.Boolean",
		"setPost-setFailurePolicy": "java.lang.String",
		"setSpec-setActiveDeadlineSeconds": "java.lang.Long",
		"setSpec-setTolerations": ["ref-io.fabric8.kubernetes.api.model.Toleration-0", "ref-io.fabric8.kubernetes.api.model.Toleration-1"],
		"setStatus-setUpdatedReplicas": "java.lang.Integer",
		"setMid-setFailurePolicy": "java.lang.String",
		"setSpec-setServiceAccount": "java.lang.String",
		"setStatus-setReplicas": "java.lang.Integer",
		"setSpec-setNodeSelector": "java.util.Map<java.lang.String, java.lang.String>",
		"setMetadata-setClusterName": "java.lang.String",
		"setExecNewPod-setContainerName": "java.lang.String",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setStatus-setUnavailableReplicas": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Initializer-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-0": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.OwnerReference-1": {
		"setName": "java.lang.String",
		"setBlockOwnerDeletion": "java.lang.Boolean",
		"setController": "java.lang.Boolean"
	},
	"ref-io.fabric8.openshift.api.model.DeploymentCause-0": {
		"setFrom-setName": "java.lang.String",
		"setFrom-setNamespace": "java.lang.String",
		"setType": "java.lang.String",
		"setFrom-setFieldPath": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.DeploymentCause-1": {
		"setFrom-setName": "java.lang.String",
		"setFrom-setNamespace": "java.lang.String",
		"setType": "java.lang.String",
		"setFrom-setFieldPath": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.DeploymentCondition-0": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String",
		"setLastUpdateTime": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.DeploymentCondition-1": {
		"setLastTransitionTime": "java.lang.String",
		"setReason": "java.lang.String",
		"setMessage": "java.lang.String",
		"setType": "java.lang.String",
		"setStatus": "java.lang.String",
		"setLastUpdateTime": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setLimits-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey1": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-setResources-setRequests-demokey2": {
		"setFormat": "java.lang.String",
		"setAmount": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-0": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvVar-1": {
		"setName": "java.lang.String",
		"setResourceFieldRef-setResource": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setSecretKeyRef-setKey": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String",
		"setConfigMapKeyRef-setOptional": "java.lang.Boolean",
		"setConfigMapKeyRef-setName": "java.lang.String",
		"setSecretKeyRef-setName": "java.lang.String",
		"setConfigMapKeyRef-setKey": "java.lang.String",
		"setSecretKeyRef-setOptional": "java.lang.Boolean",
		"setDivisor-setAmount": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.TagImageHook-0": {
		"setTo-setNamespace": "java.lang.String",
		"setTo-setFieldPath": "java.lang.String",
		"setTo-setName": "java.lang.String",
		"setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.TagImageHook-1": {
		"setTo-setNamespace": "java.lang.String",
		"setTo-setFieldPath": "java.lang.String",
		"setTo-setName": "java.lang.String",
		"setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-0": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setIscsi-setLun": "java.lang.Integer",
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setSecret-setOptional": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setSecretName": "java.lang.String",
		"setFlocker-setDatasetName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-0": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.KeyToPath-1": {
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1": {
		"setResourceFieldRef-setResource": "java.lang.String",
		"setDivisor-setAmount": "java.lang.String",
		"setFieldRef-setFieldPath": "java.lang.String",
		"setMode": "java.lang.Integer",
		"setPath": "java.lang.String",
		"setDivisor-setFormat": "java.lang.String",
		"setResourceFieldRef-setContainerName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-0": {
		"setConfigMap-setName": "java.lang.String",
		"setSecret-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeProjection-1": {
		"setConfigMap-setName": "java.lang.String",
		"setSecret-setName": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setSecret-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.Volume-1": {
		"setVsphereVolume-setStoragePolicyName": "java.lang.String",
		"setAzureDisk-setDiskURI": "java.lang.String",
		"setStorageos-setVolumeName": "java.lang.String",
		"setPortworxVolume-setReadOnly": "java.lang.Boolean",
		"setDownwardAPI-setItems": ["ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-0", "ref-io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile-1"],
		"setIscsi-setLun": "java.lang.Integer",
		"setScaleIO-setStoragePool": "java.lang.String",
		"setRbd-setReadOnly": "java.lang.Boolean",
		"setSecretRef-setName": "java.lang.String",
		"setHostPath-setPath": "java.lang.String",
		"setEmptyDir-setMedium": "java.lang.String",
		"setIscsi-setChapAuthSession": "java.lang.Boolean",
		"setRbd-setUser": "java.lang.String",
		"setScaleIO-setVolumeName": "java.lang.String",
		"setCephfs-setUser": "java.lang.String",
		"setGlusterfs-setPath": "java.lang.String",
		"setScaleIO-setSystem": "java.lang.String",
		"setSizeLimit-setFormat": "java.lang.String",
		"setScaleIO-setFsType": "java.lang.String",
		"setPersistentVolumeClaim-setClaimName": "java.lang.String",
		"setStorageos-setReadOnly": "java.lang.Boolean",
		"setFc-setFsType": "java.lang.String",
		"setIscsi-setReadOnly": "java.lang.Boolean",
		"setRbd-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setDefaultMode": "java.lang.Integer",
		"setConfigMap-setOptional": "java.lang.Boolean",
		"setName": "java.lang.String",
		"setVsphereVolume-setStoragePolicyID": "java.lang.String",
		"setPhotonPersistentDisk-setPdID": "java.lang.String",
		"setRbd-setKeyring": "java.lang.String",
		"setNfs-setServer": "java.lang.String",
		"setGitRepo-setRepository": "java.lang.String",
		"setAzureDisk-setFsType": "java.lang.String",
		"setIscsi-setChapAuthDiscovery": "java.lang.Boolean",
		"setVsphereVolume-setVolumePath": "java.lang.String",
		"setAwsElasticBlockStore-setPartition": "java.lang.Integer",
		"setSizeLimit-setAmount": "java.lang.String",
		"setAwsElasticBlockStore-setVolumeID": "java.lang.String",
		"setAzureFile-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setReadOnly": "java.lang.Boolean",
		"setScaleIO-setReadOnly": "java.lang.Boolean",
		"setSecret-setOptional": "java.lang.Boolean",
		"setCephfs-setMonitors": "java.util.List<java.lang.String>",
		"setSecret-setSecretName": "java.lang.String",
		"setFlocker-setDatasetName": "java.lang.String",
		"setGlusterfs-setEndpoints": "java.lang.String",
		"setStorageos-setFsType": "java.lang.String",
		"setAzureFile-setShareName": "java.lang.String",
		"setCephfs-setReadOnly": "java.lang.Boolean",
		"setFc-setReadOnly": "java.lang.Boolean",
		"setFc-setTargetWWNs": "java.util.List<java.lang.String>",
		"setScaleIO-setProtectionDomain": "java.lang.String",
		"setCinder-setVolumeID": "java.lang.String",
		"setGitRepo-setRevision": "java.lang.String",
		"setQuobyte-setGroup": "java.lang.String",
		"setFc-setLun": "java.lang.Integer",
		"setCephfs-setPath": "java.lang.String",
		"setIscsi-setPortals": "java.util.List<java.lang.String>",
		"setRbd-setPool": "java.lang.String",
		"setScaleIO-setStorageMode": "java.lang.String",
		"setCinder-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setFsType": "java.lang.String",
		"setFlexVolume-setOptions": "java.util.Map<java.lang.String, java.lang.String>",
		"setGcePersistentDisk-setPdName": "java.lang.String",
		"setAzureFile-setSecretName": "java.lang.String",
		"setDownwardAPI-setDefaultMode": "java.lang.Integer",
		"setQuobyte-setUser": "java.lang.String",
		"setAzureDisk-setCachingMode": "java.lang.String",
		"setGlusterfs-setReadOnly": "java.lang.Boolean",
		"setProjected-setSources": ["ref-io.fabric8.kubernetes.api.model.VolumeProjection-0", "ref-io.fabric8.kubernetes.api.model.VolumeProjection-1"],
		"setFlexVolume-setDriver": "java.lang.String",
		"setFlocker-setDatasetUUID": "java.lang.String",
		"setRbd-setFsType": "java.lang.String",
		"setConfigMap-setDefaultMode": "java.lang.Integer",
		"setGcePersistentDisk-setPartition": "java.lang.Integer",
		"setConfigMap-setName": "java.lang.String",
		"setGitRepo-setDirectory": "java.lang.String",
		"setNfs-setPath": "java.lang.String",
		"setIscsi-setIscsiInterface": "java.lang.String",
		"setGcePersistentDisk-setReadOnly": "java.lang.Boolean",
		"setPortworxVolume-setFsType": "java.lang.String",
		"setProjected-setDefaultMode": "java.lang.Integer",
		"setAzureDisk-setDiskName": "java.lang.String",
		"setCinder-setFsType": "java.lang.String",
		"setAzureDisk-setReadOnly": "java.lang.Boolean",
		"setFlexVolume-setReadOnly": "java.lang.Boolean",
		"setIscsi-setIqn": "java.lang.String",
		"setPersistentVolumeClaim-setReadOnly": "java.lang.Boolean",
		"setRbd-setImage": "java.lang.String",
		"setIscsi-setTargetPortal": "java.lang.String",
		"setStorageos-setVolumeNamespace": "java.lang.String",
		"setNfs-setReadOnly": "java.lang.Boolean",
		"setQuobyte-setRegistry": "java.lang.String",
		"setQuobyte-setVolume": "java.lang.String",
		"setCephfs-setSecretFile": "java.lang.String",
		"setScaleIO-setSslEnabled": "java.lang.Boolean",
		"setVsphereVolume-setFsType": "java.lang.String",
		"setScaleIO-setGateway": "java.lang.String",
		"setAwsElasticBlockStore-setReadOnly": "java.lang.Boolean",
		"setAwsElasticBlockStore-setFsType": "java.lang.String",
		"setGcePersistentDisk-setFsType": "java.lang.String",
		"setIscsi-setFsType": "java.lang.String",
		"setConfigMap-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setSecret-setItems": ["ref-io.fabric8.kubernetes.api.model.KeyToPath-0", "ref-io.fabric8.kubernetes.api.model.KeyToPath-1"],
		"setPortworxVolume-setVolumeID": "java.lang.String",
		"setPhotonPersistentDisk-setFsType": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-0": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PreferredSchedulingTerm-1": {
		"setWeight": "java.lang.Integer",
		"setPreference-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-0": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.NodeSelectorTerm-1": {
		"setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.NodeSelectorRequirement-1"]
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-0": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1": {
		"setValues": "java.util.List<java.lang.String>",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm-1": {
		"setPodAffinityTerm-setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setPodAffinityTerm-setTopologyKey": "java.lang.String",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setWeight": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-0": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.PodAffinityTerm-1": {
		"setLabelSelector-setMatchLabels": "java.util.Map<java.lang.String, java.lang.String>",
		"setNamespaces": "java.util.List<java.lang.String>",
		"setLabelSelector-setMatchExpressions": ["ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-0", "ref-io.fabric8.kubernetes.api.model.LabelSelectorRequirement-1"],
		"setTopologyKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-0": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setWorkingDir": "java.lang.String",
		"setImage": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-0": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HTTPHeader-1": {
		"setName": "java.lang.String",
		"setValue": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-0": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.EnvFromSource-1": {
		"setSecretRef-setName": "java.lang.String",
		"setPrefix": "java.lang.String",
		"setConfigMapRef-setName": "java.lang.String",
		"setSecretRef-setOptional": "java.lang.Boolean",
		"setConfigMapRef-setOptional": "java.lang.Boolean"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-0": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setHostIP": "java.lang.String",
		"setProtocol": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.ContainerPort-1": {
		"setName": "java.lang.String",
		"setContainerPort": "java.lang.Integer",
		"setHostIP": "java.lang.String",
		"setProtocol": "java.lang.String",
		"setHostPort": "java.lang.Integer"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-0": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.VolumeMount-1": {
		"setName": "java.lang.String",
		"setMountPath": "java.lang.String",
		"setReadOnly": "java.lang.Boolean",
		"setSubPath": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Container-1": {
		"setName": "java.lang.String",
		"setLivenessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setVolumeMounts": ["ref-io.fabric8.kubernetes.api.model.VolumeMount-0", "ref-io.fabric8.kubernetes.api.model.VolumeMount-1"],
		"setResources-setLimits-demokey2": "ref-setResources-setLimits-demokey2",
		"setResources-setLimits-demokey1": "ref-setResources-setLimits-demokey1",
		"setPort-setStrVal": "java.lang.String",
		"setTcpSocket-setHost": "java.lang.String",
		"setReadinessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setUser": "java.lang.String",
		"setResources-setRequests-demokey1": "ref-setResources-setRequests-demokey1",
		"setResources-setRequests-demokey2": "ref-setResources-setRequests-demokey2",
		"setLivenessProbe-setPeriodSeconds": "java.lang.Integer",
		"setSeLinuxOptions-setLevel": "java.lang.String",
		"setHttpGet-setHttpHeaders": ["ref-io.fabric8.kubernetes.api.model.HTTPHeader-0", "ref-io.fabric8.kubernetes.api.model.HTTPHeader-1"],
		"setArgs": "java.util.List<java.lang.String>",
		"setSeLinuxOptions-setRole": "java.lang.String",
		"setReadinessProbe-setPeriodSeconds": "java.lang.Integer",
		"setPorts": ["ref-io.fabric8.kubernetes.api.model.ContainerPort-0", "ref-io.fabric8.kubernetes.api.model.ContainerPort-1"],
		"setEnvFrom": ["ref-io.fabric8.kubernetes.api.model.EnvFromSource-0", "ref-io.fabric8.kubernetes.api.model.EnvFromSource-1"],
		"setReadinessProbe-setInitialDelaySeconds": "java.lang.Integer",
		"setSecurityContext-setReadOnlyRootFilesystem": "java.lang.Boolean",
		"setSeLinuxOptions-setType": "java.lang.String",
		"setLivenessProbe-setSuccessThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsNonRoot": "java.lang.Boolean",
		"setPort-setIntVal": "java.lang.Integer",
		"setCapabilities-setAdd": "java.util.List<java.lang.String>",
		"setLivenessProbe-setTimeoutSeconds": "java.lang.Integer",
		"setCapabilities-setDrop": "java.util.List<java.lang.String>",
		"setEnv": ["ref-io.fabric8.kubernetes.api.model.EnvVar-0", "ref-io.fabric8.kubernetes.api.model.EnvVar-1"],
		"setSecurityContext-setPrivileged": "java.lang.Boolean",
		"setCommand": "java.util.List<java.lang.String>",
		"setStdin": "java.lang.Boolean",
		"setStdinOnce": "java.lang.Boolean",
		"setHttpGet-setHost": "java.lang.String",
		"setReadinessProbe-setSuccessThreshold": "java.lang.Integer",
		"setTerminationMessagePath": "java.lang.String",
		"setTty": "java.lang.Boolean",
		"setReadinessProbe-setFailureThreshold": "java.lang.Integer",
		"setHttpGet-setScheme": "java.lang.String",
		"setTerminationMessagePolicy": "java.lang.String",
		"setHttpGet-setPath": "java.lang.String",
		"setImagePullPolicy": "java.lang.String",
		"setLivenessProbe-setFailureThreshold": "java.lang.Integer",
		"setSecurityContext-setRunAsUser": "java.lang.Long",
		"setWorkingDir": "java.lang.String",
		"setImage": "java.lang.String",
		"setExec-setCommand": "java.util.List<java.lang.String>"
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-0": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.HostAlias-1": {
		"setHostnames": "java.util.List<java.lang.String>",
		"setIp": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-0": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.Toleration-1": {
		"setEffect": "java.lang.String",
		"setValue": "java.lang.String",
		"setTolerationSeconds": "java.lang.Long",
		"setOperator": "java.lang.String",
		"setKey": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-0": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.kubernetes.api.model.LocalObjectReference-1": {
		"setName": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.DeploymentTriggerPolicy-0": {
		"setFrom-setName": "java.lang.String",
		"setImageChangeParams-setAutomatic": "java.lang.Boolean",
		"setFrom-setNamespace": "java.lang.String",
		"setImageChangeParams-setContainerNames": "java.util.List<java.lang.String>",
		"setType": "java.lang.String",
		"setFrom-setFieldPath": "java.lang.String",
		"setImageChangeParams-setLastTriggeredImage": "java.lang.String"
	},
	"ref-io.fabric8.openshift.api.model.DeploymentTriggerPolicy-1": {
		"setFrom-setName": "java.lang.String",
		"setImageChangeParams-setAutomatic": "java.lang.Boolean",
		"setFrom-setNamespace": "java.lang.String",
		"setImageChangeParams-setContainerNames": "java.util.List<java.lang.String>",
		"setType": "java.lang.String",
		"setFrom-setFieldPath": "java.lang.String",
		"setImageChangeParams-setLastTriggeredImage": "java.lang.String"
	}
}
```


