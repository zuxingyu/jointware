####  Docker AttachContainer

```
ContainerId=java.lang.String
FollowStream=java.lang.Boolean
Timestamps=java.lang.Boolean
StdOut=java.lang.Boolean
StdErr=java.lang.Boolean
StdIn=java.io.InputStream
Logs=java.lang.Boolean

```


####  Docker ExecCreate

```
AttachStderr=java.lang.Boolean
AttachStdin=java.lang.Boolean
AttachStdout=java.lang.Boolean
Tty=java.lang.Boolean
User=java.lang.String
ContainerId=java.lang.String

```


####  Docker PauseContainer

```
ContainerId=java.lang.String

```


####  Docker PullImage

```
AuthConfig=com.github.dockerjava.api.model.AuthConfig
  RegistryAddress=java.lang.String
  Username=java.lang.String
  Password=java.lang.String
  Email=java.lang.String
  Auth=java.lang.String
  Registrytoken=java.lang.String
Tag=java.lang.String
Repository=java.lang.String
Registry=java.lang.String

```


####  Docker KillContainer

```
ContainerId=java.lang.String
Signal=java.lang.String

```


####  Docker SaveImage

```
Tag=java.lang.String
Name=java.lang.String

```


####  Docker ListContainers

```
ExitcodeFilter=java.lang.Integer
Before=java.lang.String
StatusFilter=java.lang.String
LabelFilter=java.util.Map<java.lang.String, java.lang.String>
Limit=java.lang.Integer
ShowAll=java.lang.Boolean
ShowSize=java.lang.Boolean
Since=java.lang.String

```


####  Docker Version

```

```


####  Docker CreateNetwork

```
Labels=java.util.Map<java.lang.String, java.lang.String>
Name=java.lang.String
CheckDuplicate=boolean
Driver=java.lang.String
Ipam=com.github.dockerjava.api.model.Network$Ipam
  Config=java.util.List<com.github.dockerjava.api.model.Network$Ipam$Config>
    Subnet=java.lang.String
    IpRange=java.lang.String
    Gateway=java.lang.String
Options=java.util.Map<java.lang.String, java.lang.String>
Internal=boolean
EnableIpv6=boolean
Attachable=java.lang.Boolean

```


####  Docker UnpauseContainer

```
ContainerId=java.lang.String

```


####  Docker CopyFileFromContainer

```
ContainerId=java.lang.String
HostPath=java.lang.String
Resource=java.lang.String

```


####  Docker TagImage

```
Tag=java.lang.String
Repository=java.lang.String
Force=java.lang.Boolean
ImageId=java.lang.String

```


####  Docker SearchImages

```
Term=java.lang.String

```


####  Docker RemoveVolume

```
Name=java.lang.String

```


####  Docker InspectImage

```
ImageId=java.lang.String

```


####  Docker BuildImage

```
Tag=java.lang.String
Labels=java.util.Map<java.lang.String, java.lang.String>
Memory=java.lang.Long
BaseDirectory=java.io.File
DockerfilePath=java.lang.String
BuildAuthConfigs=com.github.dockerjava.api.model.AuthConfigurations
Forcerm=java.lang.Boolean
Quiet=java.lang.Boolean
Pull=java.lang.Boolean
Memswap=java.lang.Long
Cpushares=java.lang.String
Cpusetcpus=java.lang.String
Shmsize=java.lang.Long
Tags=java.util.Set<java.lang.String>
CacheFrom=java.util.Set<java.lang.String>
Remote=java.net.URI
Dockerfile=java.io.File
NoCache=java.lang.Boolean
Remove=java.lang.Boolean
TarInputStream=java.io.InputStream

```


####  Docker RemoveImage

```
Force=java.lang.Boolean
ImageId=java.lang.String
NoPrune=java.lang.Boolean

```


####  Docker InspectVolume

```
Name=java.lang.String

```


####  Docker RemoveNetwork

```
NetworkId=java.lang.String

```


####  Docker PushImage

```
AuthConfig=com.github.dockerjava.api.model.AuthConfig
  RegistryAddress=java.lang.String
  Username=java.lang.String
  Password=java.lang.String
  Email=java.lang.String
  Auth=java.lang.String
  Registrytoken=java.lang.String
Tag=java.lang.String
Name=java.lang.String

```


####  Docker WaitContainer

```
ContainerId=java.lang.String

```


####  Docker CopyArchiveToContainer

```
ContainerId=java.lang.String
HostResource=java.lang.String
RemotePath=java.lang.String
TarInputStream=java.io.InputStream
NoOverwriteDirNonDir=boolean
DirChildrenOnly=boolean

```


####  Docker Ping

```

```


####  Docker Stats

```
ContainerId=java.lang.String

```


####  Docker ExecStart

```
Tty=java.lang.Boolean
StdIn=java.io.InputStream
Detach=java.lang.Boolean
ExecId=java.lang.String

```


####  Docker TopContainer

```
ContainerId=java.lang.String
PsArgs=java.lang.String

```


####  Docker StopContainer

```
ContainerId=java.lang.String
Timeout=java.lang.Integer

```


####  Docker RemoveContainer

```
ContainerId=java.lang.String
Force=java.lang.Boolean
RemoveVolumes=java.lang.Boolean

```


####  Docker ListNetworks

```

```


####  Docker ListImages

```
LabelFilter=java.util.Map<java.lang.String, java.lang.String>
ShowAll=java.lang.Boolean
ImageNameFilter=java.lang.String
DanglingFilter=java.lang.Boolean

```


####  Docker ListVolumes

```
DanglingFilter=java.lang.Boolean

```


####  Docker ContainerDiff

```
ContainerId=java.lang.String

```


####  Docker Events

```
Until=java.lang.String
LabelFilter=java.util.Map<java.lang.String, java.lang.String>
Since=java.lang.String

```


####  Docker Auth

```
AuthConfig=com.github.dockerjava.api.model.AuthConfig
  RegistryAddress=java.lang.String
  Username=java.lang.String
  Password=java.lang.String
  Email=java.lang.String
  Auth=java.lang.String
  Registrytoken=java.lang.String

```


####  Docker CreateImage

```
Tag=java.lang.String
Repository=java.lang.String
ImageStream=java.io.InputStream

```


####  Docker LogContainer

```
ContainerId=java.lang.String
FollowStream=java.lang.Boolean
Timestamps=java.lang.Boolean
StdOut=java.lang.Boolean
StdErr=java.lang.Boolean
Tail=java.lang.Integer
Since=java.lang.Integer

```


####  Docker ConnectToNetwork

```
ContainerId=java.lang.String
ContainerNetwork=com.github.dockerjava.api.model.ContainerNetwork
  Aliases=java.util.List<java.lang.String>
  Ipv4Address=java.lang.String
  Links=java.util.List<com.github.dockerjava.api.model.Link>
  MacAddress=java.lang.String
  GlobalIPv6PrefixLen=java.lang.Integer
  IpamConfig=com.github.dockerjava.api.model.ContainerNetwork$Ipam
    Ipv4Address=java.lang.String
    Ipv6Address=java.lang.String
  Gateway=java.lang.String
  EndpointId=java.lang.String
  IpPrefixLen=java.lang.Integer
  IpV6Gateway=java.lang.String
  NetworkID=java.lang.String
  GlobalIPv6Address=java.lang.String
NetworkId=java.lang.String

```


####  Docker DisconnectFromNetwork

```
ContainerId=java.lang.String
Force=java.lang.Boolean
NetworkId=java.lang.String

```


####  Docker Info

```

```


####  Docker CopyArchiveFromContainer

```
ContainerId=java.lang.String
HostPath=java.lang.String
Resource=java.lang.String

```


####  Docker RenameContainer

```
Name=java.lang.String
ContainerId=java.lang.String

```


####  Docker Commit

```
Tag=java.lang.String
Repository=java.lang.String
AttachStderr=java.lang.Boolean
AttachStdin=java.lang.Boolean
AttachStdout=java.lang.Boolean
ExposedPorts=com.github.dockerjava.api.model.ExposedPorts
Labels=java.util.Map<java.lang.String, java.lang.String>
Memory=java.lang.Integer
MemorySwap=java.lang.Integer
Tty=java.lang.Boolean
User=java.lang.String
Volumes=com.github.dockerjava.api.model.Volumes
WorkingDir=java.lang.String
ContainerId=java.lang.String
DisableNetwork=java.lang.Boolean
Author=java.lang.String
Hostname=java.lang.String
Message=java.lang.String
OpenStdin=java.lang.Boolean
Pause=java.lang.Boolean
StdinOnce=java.lang.Boolean

```


####  Docker InspectExec

```
ExecId=java.lang.String

```


####  Docker StartContainer

```
ContainerId=java.lang.String

```


####  Docker UpdateContainer

```
BlkioWeight=java.lang.Integer
CpuPeriod=java.lang.Integer
CpusetCpus=java.lang.String
CpusetMems=java.lang.String
CpuShares=java.lang.Integer
Memory=java.lang.Long
MemorySwap=java.lang.Long
ContainerId=java.lang.String
CpuQuota=java.lang.Integer
KernelMemory=java.lang.Long
MemoryReservation=java.lang.Long

```


####  Docker LoadImage

```
ImageStream=java.io.InputStream

```


####  Docker CreateContainer

```
Aliases=java.util.List<java.lang.String>
AttachStderr=java.lang.Boolean
AttachStdin=java.lang.Boolean
AttachStdout=java.lang.Boolean
Binds=java.util.List<com.github.dockerjava.api.model.Bind>
BlkioWeight=java.lang.Integer
CapAdd=java.util.List<com.github.dockerjava.api.model.Capability>
CapDrop=java.util.List<com.github.dockerjava.api.model.Capability>
Cmd=java.util.List<java.lang.String>
CpuPeriod=java.lang.Integer
CpusetCpus=java.lang.String
CpusetMems=java.lang.String
CpuShares=java.lang.Integer
Devices=java.util.List<com.github.dockerjava.api.model.Device>
Dns=java.util.List<java.lang.String>
DnsSearch=java.util.List<java.lang.String>
DomainName=java.lang.String
Entrypoint=java.util.List<java.lang.String>
Env=java.util.List<java.lang.String>
ExposedPorts=java.util.List<com.github.dockerjava.api.model.ExposedPort>
StopSignal=java.lang.String
ExtraHosts=java.util.List<java.lang.String>
HostName=java.lang.String
Image=java.lang.String
Ipv4Address=java.lang.String
Ipv6Address=java.lang.String
Labels=java.util.Map<java.lang.String, java.lang.String>
Links=java.util.List<com.github.dockerjava.api.model.Link>
LogConfig=com.github.dockerjava.api.model.LogConfig
LxcConf=java.util.List<com.github.dockerjava.api.model.LxcConf>
MacAddress=java.lang.String
Memory=java.lang.Long
MemorySwap=java.lang.Long
Name=java.lang.String
NetworkMode=java.lang.String
PortBindings=com.github.dockerjava.api.model.Ports
PortSpecs=java.util.List<java.lang.String>
Privileged=java.lang.Boolean
StdInOnce=java.lang.Boolean
StdinOpen=java.lang.Boolean
Tty=java.lang.Boolean
Ulimits=java.util.List<com.github.dockerjava.api.model.Ulimit>
User=java.lang.String
Volumes=java.util.List<com.github.dockerjava.api.model.Volume>
VolumesFrom=java.util.List<com.github.dockerjava.api.model.VolumesFrom>
WorkingDir=java.lang.String
CgroupParent=java.lang.String
PidMode=java.lang.String
HostConfig=com.github.dockerjava.api.model.HostConfig
  Binds=com.github.dockerjava.api.model.Binds
  BlkioWeight=java.lang.Integer
  CpuPeriod=java.lang.Integer
  CpusetCpus=java.lang.String
  CpusetMems=java.lang.String
  CpuShares=java.lang.Integer
  Links=com.github.dockerjava.api.model.Links
  LogConfig=com.github.dockerjava.api.model.LogConfig
  Memory=java.lang.Long
  MemorySwap=java.lang.Long
  NetworkMode=java.lang.String
  PortBindings=com.github.dockerjava.api.model.Ports
  Privileged=java.lang.Boolean
  CgroupParent=java.lang.String
  PidMode=java.lang.String
  CpuQuota=java.lang.Integer
  KernelMemory=java.lang.Long
  ContainerIDFile=java.lang.String
  OomKillDisable=java.lang.Boolean
  PublishAllPorts=java.lang.Boolean
  ReadonlyRootfs=java.lang.Boolean
  RestartPolicy=com.github.dockerjava.api.model.RestartPolicy
  MemoryReservation=java.lang.Long
  OomScoreAdj=java.lang.Boolean
  SecurityOpts=java.util.List<java.lang.String>
  ShmSize=java.lang.Long
  VolumeDriver=java.lang.String
  PidsLimit=java.lang.Long
  BlkioDeviceReadBps=java.util.List<java.lang.Object>
  BlkioDeviceReadIOps=java.util.List<java.lang.Object>
  BlkioDeviceWriteBps=java.util.List<java.lang.Object>
  BlkioDeviceWriteIOps=java.util.List<java.lang.Object>
  BlkioWeightDevice=java.util.List<java.lang.Object>
  MemorySwappiness=java.lang.Integer
ContainerIDFile=java.lang.String
NetworkDisabled=java.lang.Boolean
OomKillDisable=java.lang.Boolean
PublishAllPorts=java.lang.Boolean
ReadonlyRootfs=java.lang.Boolean
RestartPolicy=com.github.dockerjava.api.model.RestartPolicy

```


####  Docker InspectContainer

```
ContainerId=java.lang.String
Size=java.lang.Boolean

```


####  Docker CreateVolume

```
Name=java.lang.String
Driver=java.lang.String
DriverOpts=java.util.Map<java.lang.String, java.lang.String>

```


####  Docker RestartContainer

```
tTimeout=java.lang.Integer
ContainerId=java.lang.String

```
