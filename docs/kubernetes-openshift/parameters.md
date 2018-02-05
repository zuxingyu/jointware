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

