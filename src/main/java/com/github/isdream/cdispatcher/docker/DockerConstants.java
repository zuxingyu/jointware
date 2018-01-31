/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.docker;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class DockerConstants {

	//
	public static final String CLIENT = "com.github.isdream.cdispatcher.docker.adapters.DockerClientImpl";

	
	//
	public static final String MODEL_PACKAGE_BASE = "com.github.dockerjava.core.command";
	
	public static final String MODEL_PACKAGE_EXTENSION = "com.github.isdream.cdispatcher.docker.adapters";
	
	public static final String MODEL_METHOD_WITH = "with";
	
	public static final String MODEL_METHOD_ADD = "add";
	
	public static final String MODEL_METHOD_SET = "set";
	
	public final static String KIND_WITHDOCKERCMDEXECFACT = "WithDockerCmdExecFact";

	public final static String KIND_ATTACHCONTAINER = "AttachContainer";

	public final static String KIND_EXECCREATE = "ExecCreate";

	public final static String KIND_PAUSECONTAINER = "PauseContainer";

	public final static String KIND_PULLIMAGE = "PullImage";

	public final static String KIND_KILLCONTAINER = "KillContainer";

	public final static String KIND_SAVEIMAGE = "SaveImage";

	public final static String KIND_LISTCONTAINERS = "ListContainers";

	public final static String KIND_VERSION = "Version";

	public final static String KIND_CREATENETWORK = "CreateNetwork";

	public final static String KIND_UNPAUSECONTAINER = "UnpauseContainer";

	public final static String KIND_COPYFILEFROMCONTAINER = "CopyFileFromContainer";

	public final static String KIND_TAGIMAGE = "TagImage";

	public final static String KIND_SEARCHIMAGES = "SearchImages";

	public final static String KIND_REMOVEVOLUME = "RemoveVolume";

	public final static String KIND_INSPECTIMAGE = "InspectImage";

	public final static String KIND_BUILDIMAGE = "BuildImage";

	public final static String KIND_REMOVEIMAGE = "RemoveImage";

	public final static String KIND_INSPECTVOLUME = "InspectVolume";

	public final static String KIND_REMOVENETWORK = "RemoveNetwork";

	public final static String KIND_PUSHIMAGE = "PushImage";

	public final static String KIND_WAITCONTAINER = "WaitContainer";

	public final static String KIND_AUTHCON = "AuthCon";

	public final static String KIND_COPYARCHIVETOCONTAINER = "CopyArchiveToContainer";

	public final static String KIND_PING = "Ping";

	public final static String KIND_STATS = "Stats";

	public final static String KIND_EXECSTART = "ExecStart";

	public final static String KIND_TOPCONTAINER = "TopContainer";

	public final static String KIND_STOPCONTAINER = "StopContainer";

	public final static String KIND_REMOVECONTAINER = "RemoveContainer";

	public final static String KIND_LISTNETWORKS = "ListNetworks";

	public final static String KIND_LISTIMAGES = "ListImages";

	public final static String KIND_LISTVOLUMES = "ListVolumes";

	public final static String KIND_CONTAINERDIFF = "ContainerDiff";

	public final static String KIND_EVENTS = "Events";

	public final static String KIND_AUTH = "Auth";

	public final static String KIND_CREATEIMAGE = "CreateImage";

	public final static String KIND_LOGCONTAINER = "LogContainer";

	public final static String KIND_CONNECTTONETWORK = "ConnectToNetwork";

	public final static String KIND_INSPECTNETWORK = "InspectNetwork";

	public final static String KIND_DISCONNECTFROMNETWORK = "DisconnectFromNetwork";

	public final static String KIND_INFO = "Info";

	public final static String KIND_COPYARCHIVEFROMCONTAINER = "CopyArchiveFromContainer";

	public final static String KIND_RENAMECONTAINER = "RenameContainer";

	public final static String KIND_COMMIT = "Commit";

	public final static String KIND_INSPECTEXEC = "InspectExec";

	public final static String KIND_STARTCONTAINER = "StartContainer";

	public final static String KIND_UPDATECONTAINER = "UpdateContainer";

	public final static String KIND_LOADIMAGE = "LoadImage";

	public final static String KIND_CREATECONTAINER = "CreateContainer";

	public final static String KIND_INSPECTCONTAINER = "InspectContainer";

	public final static String KIND_CREATEVOLUME = "CreateVolume";

	public final static String KIND_RESTARTCONTAINER = "RestartContainer";

}
