####  Docker AttachContainer

```
withContainerId=java.lang.String
withFollowStream=java.lang.Boolean
withTimestamps=java.lang.Boolean
withStdOut=java.lang.Boolean
withStdErr=java.lang.Boolean
withStdIn=java.io.InputStream
withLogs=java.lang.Boolean

```


####  Docker ExecCreate

```
withAttachStderr=java.lang.Boolean
withAttachStdin=java.lang.Boolean
withAttachStdout=java.lang.Boolean
withTty=java.lang.Boolean
withUser=java.lang.String
withContainerId=java.lang.String

```


####  Docker PauseContainer

```
withContainerId=java.lang.String

```


####  Docker PullImage

```
withRepository=java.lang.String
withRegistry=java.lang.String
withAuthConfig=com.github.dockerjava.api.model.AuthConfig
  withRegistryAddress=java.lang.String
  withUsername=java.lang.String
  withPassword=java.lang.String
  withEmail=java.lang.String
  withAuth=java.lang.String
  withRegistrytoken=java.lang.String
withTag=java.lang.String

```


####  Docker KillContainer

```
withContainerId=java.lang.String
withSignal=java.lang.String

```


####  Docker SaveImage

```
withName=java.lang.String
withTag=java.lang.String

```


####  Docker ListContainers

```
withExitcodeFilter=java.lang.Integer
withBefore=java.lang.String
withStatusFilter=java.lang.String
withLabelFilter=java.util.Map<java.lang.String, java.lang.String>
withLimit=java.lang.Integer
withShowAll=java.lang.Boolean
withShowSize=java.lang.Boolean
withSince=java.lang.String

```


####  Docker Version

```

```


####  Docker CreateNetwork

```
withLabels=java.util.Map<java.lang.String, java.lang.String>
withName=java.lang.String
withIpam=com.github.dockerjava.api.model.Network$Ipam
  withConfig=java.util.List<com.github.dockerjava.api.model.Network$Ipam$Config>
    withSubnet=java.lang.String
    withIpRange=java.lang.String
    withGateway=java.lang.String
    setNetworkID=java.lang.String
withOptions=java.util.Map<java.lang.String, java.lang.String>
withInternal=boolean
withEnableIpv6=boolean
withAttachable=java.lang.Boolean
withDriver=java.lang.String
withCheckDuplicate=boolean

```


####  Docker UnpauseContainer

```
withContainerId=java.lang.String

```


####  Docker CopyFileFromContainer

```
withContainerId=java.lang.String
withHostPath=java.lang.String
withResource=java.lang.String

```


####  Docker TagImage

```
withForce=java.lang.Boolean
withRepository=java.lang.String
withImageId=java.lang.String
withTag=java.lang.String

```


####  Docker SearchImages

```
withTerm=java.lang.String

```


####  Docker RemoveVolume

```
withName=java.lang.String

```


####  Docker InspectImage

```
withImageId=java.lang.String

```


####  Docker BuildImage

```
withTarInputStream=java.io.InputStream
withLabels=java.util.Map<java.lang.String, java.lang.String>
withMemory=java.lang.Long
withTag=java.lang.String
withBaseDirectory=java.io.File
  setExecutable=boolean
  setLastModified=long
  setReadable=boolean
  setWritable=boolean
withDockerfilePath=java.lang.String
withBuildAuthConfigs=com.github.dockerjava.api.model.AuthConfigurations
  addConfig=com.github.dockerjava.api.model.AuthConfig
    withRegistryAddress=java.lang.String
    withUsername=java.lang.String
    withPassword=java.lang.String
    withEmail=java.lang.String
    withAuth=java.lang.String
    withRegistrytoken=java.lang.String
withTags=java.util.Set<java.lang.String>
withCacheFrom=java.util.Set<java.lang.String>
withRemote=java.net.URI
withDockerfile=java.io.File
  setExecutable=boolean
  setLastModified=long
  setReadable=boolean
  setWritable=boolean
withNoCache=java.lang.Boolean
withRemove=java.lang.Boolean
withForcerm=java.lang.Boolean
withQuiet=java.lang.Boolean
withPull=java.lang.Boolean
withMemswap=java.lang.Long
withCpushares=java.lang.String
withCpusetcpus=java.lang.String
withShmsize=java.lang.Long

```


####  Docker RemoveImage

```
withForce=java.lang.Boolean
withImageId=java.lang.String
withNoPrune=java.lang.Boolean

```


####  Docker InspectVolume

```
withName=java.lang.String

```


####  Docker RemoveNetwork

```
withNetworkId=java.lang.String

```


####  Docker PushImage

```
withName=java.lang.String
withAuthConfig=com.github.dockerjava.api.model.AuthConfig
  withRegistryAddress=java.lang.String
  withUsername=java.lang.String
  withPassword=java.lang.String
  withEmail=java.lang.String
  withAuth=java.lang.String
  withRegistrytoken=java.lang.String
withTag=java.lang.String

```


####  Docker WaitContainer

```
withContainerId=java.lang.String

```


####  Docker CopyArchiveToContainer

```
withTarInputStream=java.io.InputStream
withNoOverwriteDirNonDir=boolean
withDirChildrenOnly=boolean
withContainerId=java.lang.String
withHostResource=java.lang.String
withRemotePath=java.lang.String

```


####  Docker Ping

```

```


####  Docker Stats

```
withContainerId=java.lang.String

```


####  Docker ExecStart

```
withTty=java.lang.Boolean
withStdIn=java.io.InputStream
withDetach=java.lang.Boolean
withExecId=java.lang.String

```


####  Docker TopContainer

```
withContainerId=java.lang.String
withPsArgs=java.lang.String

```


####  Docker StopContainer

```
withContainerId=java.lang.String
withTimeout=java.lang.Integer

```


####  Docker RemoveContainer

```
withContainerId=java.lang.String
withForce=java.lang.Boolean
withRemoveVolumes=java.lang.Boolean

```


####  Docker ListNetworks

```

```


####  Docker ListImages

```
withLabelFilter=java.util.Map<java.lang.String, java.lang.String>
withShowAll=java.lang.Boolean
withImageNameFilter=java.lang.String
withDanglingFilter=java.lang.Boolean

```


####  Docker ListVolumes

```
withDanglingFilter=java.lang.Boolean

```


####  Docker ContainerDiff

```
withContainerId=java.lang.String

```


####  Docker Events

```
withLabelFilter=java.util.Map<java.lang.String, java.lang.String>
withSince=java.lang.String
withUntil=java.lang.String

```


####  Docker Auth

```
withAuthConfig=com.github.dockerjava.api.model.AuthConfig
  withRegistryAddress=java.lang.String
  withUsername=java.lang.String
  withPassword=java.lang.String
  withEmail=java.lang.String
  withAuth=java.lang.String
  withRegistrytoken=java.lang.String

```


####  Docker CreateImage

```
withRepository=java.lang.String
withImageStream=java.io.InputStream
withTag=java.lang.String

```


####  Docker LogContainer

```
withContainerId=java.lang.String
withFollowStream=java.lang.Boolean
withTimestamps=java.lang.Boolean
withStdOut=java.lang.Boolean
withStdErr=java.lang.Boolean
withTail=java.lang.Integer
withSince=java.lang.Integer

```


####  Docker ConnectToNetwork

```
withContainerNetwork=com.github.dockerjava.api.model.ContainerNetwork
  withAliases=java.util.List<java.lang.String>
  withIpv4Address=java.lang.String
  withLinks=java.util.List<com.github.dockerjava.api.model.Link>
  withMacAddress=java.lang.String
  withGlobalIPv6PrefixLen=java.lang.Integer
  withGateway=java.lang.String
  withEndpointId=java.lang.String
  withIpPrefixLen=java.lang.Integer
  withIpV6Gateway=java.lang.String
  withNetworkID=java.lang.String
  withIpamConfig=com.github.dockerjava.api.model.ContainerNetwork$Ipam
    withIpv4Address=java.lang.String
    withIpv6Address=java.lang.String
  withGlobalIPv6Address=java.lang.String
withContainerId=java.lang.String
withNetworkId=java.lang.String

```


####  Docker DisconnectFromNetwork

```
withContainerId=java.lang.String
withForce=java.lang.Boolean
withNetworkId=java.lang.String

```


####  Docker Info

```

```


####  Docker CopyArchiveFromContainer

```
withContainerId=java.lang.String
withHostPath=java.lang.String
withResource=java.lang.String

```


####  Docker RenameContainer

```
withName=java.lang.String
withContainerId=java.lang.String

```


####  Docker Commit

```
withAttachStderr=java.lang.Boolean
withAttachStdin=java.lang.Boolean
withAttachStdout=java.lang.Boolean
withExposedPorts=com.github.dockerjava.api.model.ExposedPorts
withLabels=java.util.Map<java.lang.String, java.lang.String>
withMemory=java.lang.Integer
withMemorySwap=java.lang.Integer
withTty=java.lang.Boolean
withUser=java.lang.String
withVolumes=com.github.dockerjava.api.model.Volumes
withWorkingDir=java.lang.String
withContainerId=java.lang.String
withRepository=java.lang.String
withTag=java.lang.String
withDisableNetwork=java.lang.Boolean
withAuthor=java.lang.String
withHostname=java.lang.String
withMessage=java.lang.String
withOpenStdin=java.lang.Boolean
withPause=java.lang.Boolean
withStdinOnce=java.lang.Boolean

```


####  Docker InspectExec

```
withExecId=java.lang.String

```


####  Docker StartContainer

```
withContainerId=java.lang.String

```


####  Docker UpdateContainer

```
withMemoryReservation=java.lang.Long
withBlkioWeight=java.lang.Integer
withCpuPeriod=java.lang.Integer
withCpusetCpus=java.lang.String
withCpusetMems=java.lang.String
withCpuShares=java.lang.Integer
withMemory=java.lang.Long
withMemorySwap=java.lang.Long
withContainerId=java.lang.String
withCpuQuota=java.lang.Integer
withKernelMemory=java.lang.Long

```


####  Docker LoadImage

```
withImageStream=java.io.InputStream

```


####  Docker CreateContainer

```
withAliases=java.util.List<java.lang.String>
withAttachStderr=java.lang.Boolean
withAttachStdin=java.lang.Boolean
withAttachStdout=java.lang.Boolean
withBinds=java.util.List<com.github.dockerjava.api.model.Bind>
withBlkioWeight=java.lang.Integer
withCapAdd=java.util.List<com.github.dockerjava.api.model.Capability>
withCapDrop=java.util.List<com.github.dockerjava.api.model.Capability>
withCmd=java.util.List<java.lang.String>
withCpuPeriod=java.lang.Integer
withCpusetCpus=java.lang.String
withCpusetMems=java.lang.String
withCpuShares=java.lang.Integer
withDevices=java.util.List<com.github.dockerjava.api.model.Device>
withDns=java.util.List<java.lang.String>
withDnsSearch=java.util.List<java.lang.String>
withDomainName=java.lang.String
withEntrypoint=java.util.List<java.lang.String>
withEnv=java.util.List<java.lang.String>
withExposedPorts=java.util.List<com.github.dockerjava.api.model.ExposedPort>
withStopSignal=java.lang.String
withExtraHosts=java.util.List<java.lang.String>
withHostName=java.lang.String
withImage=java.lang.String
withIpv4Address=java.lang.String
withIpv6Address=java.lang.String
withLabels=java.util.Map<java.lang.String, java.lang.String>
withLinks=java.util.List<com.github.dockerjava.api.model.Link>
withLogConfig=com.github.dockerjava.api.model.LogConfig
  setConfig=java.util.Map<java.lang.String, java.lang.String>
  setType=com.github.dockerjava.api.model.LogConfig$LoggingType
withLxcConf=java.util.List<com.github.dockerjava.api.model.LxcConf>
  setValue=java.lang.String
  setKey=java.lang.String
withMacAddress=java.lang.String
withMemory=java.lang.Long
withMemorySwap=java.lang.Long
withName=java.lang.String
withNetworkMode=java.lang.String
withPortBindings=com.github.dockerjava.api.model.Ports
withPortSpecs=java.util.List<java.lang.String>
withPrivileged=java.lang.Boolean
withStdInOnce=java.lang.Boolean
withStdinOpen=java.lang.Boolean
withTty=java.lang.Boolean
withUlimits=java.util.List<com.github.dockerjava.api.model.Ulimit>
withUser=java.lang.String
withVolumes=java.util.List<com.github.dockerjava.api.model.Volume>
withVolumesFrom=java.util.List<com.github.dockerjava.api.model.VolumesFrom>
withWorkingDir=java.lang.String
withCgroupParent=java.lang.String
withPidMode=java.lang.String
withHostConfig=com.github.dockerjava.api.model.HostConfig
  withMemoryReservation=java.lang.Long
  withBinds=com.github.dockerjava.api.model.Binds
  withBlkioWeight=java.lang.Integer
  withCpuPeriod=java.lang.Integer
  withCpusetCpus=java.lang.String
  withCpusetMems=java.lang.String
  withCpuShares=java.lang.Integer
  withLinks=com.github.dockerjava.api.model.Links
  withLogConfig=com.github.dockerjava.api.model.LogConfig
    setConfig=java.util.Map<java.lang.String, java.lang.String>
    setType=com.github.dockerjava.api.model.LogConfig$LoggingType
  withMemory=java.lang.Long
  withMemorySwap=java.lang.Long
  withNetworkMode=java.lang.String
  withPortBindings=com.github.dockerjava.api.model.Ports
  withPrivileged=java.lang.Boolean
  withCgroupParent=java.lang.String
  withPidMode=java.lang.String
  withCpuQuota=java.lang.Integer
  withKernelMemory=java.lang.Long
  withContainerIDFile=java.lang.String
  withOomKillDisable=java.lang.Boolean
  withPublishAllPorts=java.lang.Boolean
  withReadonlyRootfs=java.lang.Boolean
  withRestartPolicy=com.github.dockerjava.api.model.RestartPolicy
  withOomScoreAdj=java.lang.Boolean
  withSecurityOpts=java.util.List<java.lang.String>
  withShmSize=java.lang.Long
  withVolumeDriver=java.lang.String
  withPidsLimit=java.lang.Long
  withBlkioDeviceReadBps=java.util.List<java.lang.Object>
  withBlkioDeviceReadIOps=java.util.List<java.lang.Object>
  withBlkioDeviceWriteBps=java.util.List<java.lang.Object>
  withBlkioDeviceWriteIOps=java.util.List<java.lang.Object>
  withBlkioWeightDevice=java.util.List<java.lang.Object>
  withMemorySwappiness=java.lang.Integer
withContainerIDFile=java.lang.String
withNetworkDisabled=java.lang.Boolean
withOomKillDisable=java.lang.Boolean
withPublishAllPorts=java.lang.Boolean
withReadonlyRootfs=java.lang.Boolean
withRestartPolicy=com.github.dockerjava.api.model.RestartPolicy

```


####  Docker InspectContainer

```
withContainerId=java.lang.String
withSize=java.lang.Boolean

```


####  Docker CreateVolume

```
withName=java.lang.String
withDriver=java.lang.String
withDriverOpts=java.util.Map<java.lang.String, java.lang.String>

```


####  Docker RestartContainer

```
withContainerId=java.lang.String
withtTimeout=java.lang.Integer

```
