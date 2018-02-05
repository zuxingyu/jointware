/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.temps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.dockerjava.netty.DockerCmdExecFactoryImpl;
import com.github.isdream.cdispatcher.docker.DockerConstants;
import com.github.isdream.cdispatcher.docker.DockerKindModelsAnalyzer;
import com.github.isdream.cdispatcher.docker.DockerKindsAnalyzer;
import com.github.isdream.cdispatcher.docker.DockerModelParametersAnalyzer;
import com.github.isdream.cdispatcher.docker.adapters.DockerClientImpl;

/**
 * @author wuheng@otcaix.iscas.ac.cn 2018-1-27
 */
@SuppressWarnings("deprecation")
public class DockerTest {

	final static String dockerUrl = "tcp://118.190.46.58:12375";

	private final static Set<String> cfilters = new HashSet<String>();

	private final static Set<String> mfilters = new HashSet<String>();

	static {
		cfilters.add(String.class.getName());
		cfilters.add(Boolean.class.getName());
		cfilters.add(Integer.class.getName());
		cfilters.add(Long.class.getName());
		cfilters.add(Double.class.getName());
		cfilters.add(Float.class.getName());
		cfilters.add(Byte.class.getName());
		cfilters.add(Map.class.getName());
		cfilters.add(List.class.getName());
		cfilters.add(Set.class.getName());
		cfilters.add(Void.class.getName());
	}

	static {
		mfilters.add("getProtectionDomain");
		mfilters.add("getModifiers");
		mfilters.add("getSuperclass");
		mfilters.add("getComponentType");
		mfilters.add("getAnnotatedInterfaces");
		mfilters.add("getAnnotatedSuperclass");
		mfilters.add("getCanonicalName");
		mfilters.add("getClassLoader");
		mfilters.add("getClasses");
		mfilters.add("getConstructors");
		mfilters.add("getDeclaredAnnotations");
		mfilters.add("getDeclaredClasses");
		mfilters.add("getDeclaredConstructors");
		mfilters.add("getDeclaredFields");
		mfilters.add("getDeclaredMethods");
		mfilters.add("getDeclaringClass");
		mfilters.add("getEnclosingClass");
		mfilters.add("getEnclosingConstructor");
		mfilters.add("getEnclosingMethod");
		mfilters.add("getEnumConstants");
		mfilters.add("getFields");
		mfilters.add("getGenericInterfaces");
		mfilters.add("getGenericSuperclass");
		mfilters.add("getInterfaces");
		mfilters.add("getMethods");
		mfilters.add("getPackage");
		mfilters.add("getSigners");
		mfilters.add("getSimpleName");
		mfilters.add("getTypeName");
		mfilters.add("getTypeParameters");
		mfilters.add("getClass");
		mfilters.add("getBytes");
		mfilters.add("wait");
		mfilters.add("hashCode");
		mfilters.add("notify");
		mfilters.add("notifyAll");
		mfilters.add("close");
		mfilters.add("toString");
		mfilters.add("equals");
		mfilters.add("getInstance");

	}

	/***
	 * 
	 * 
	 */
	public static Map<String, Object> params = new HashMap<String, Object>();

	static {
		// params.put("setMetadata-setLabels-Map0-asd", "abvs");
		// params.put("setSpec-setTemplate-setSpec-setContainers-Map1-setCommand-List0",
		// "sleep");
		// params.put("setSpec-setTemplate-setSpec-setContainers-Map1-setCommand-List0",
		// "3");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setName",
		// "tomcat1");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setResources-setLimits-Map1-cpu-List1-Map1-setAmount",
		// "800m");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setResources-setLimits-Map1-memory-List1-Map1-setAmount",
		// "2Gi");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setRequests-setLimits-Map1-cpu-List1-Map1-setAmount",
		// "800m");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setRequests-setLimits-Map1-memory-List1-Map1-setAmount",
		// "2Gi");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setEnv-List1-Map1-setName",
		// "MESSAGE");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setEnv-List1-Map1-setValue",
		// "hello world");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setEnv-List1-Map1-setName",
		// "BAD");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setEnv-List1-Map1-setValue",
		// "bad world");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setEnv-List1-Map1-setImage",
		// "dcr.io:5000/tomcat:latest");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setEnv-List1-Map1-setPorts-List1-Map1-setContainerPort",
		// "8080");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setEnv-List1-Map1-setVolumeMounts-List1-Map1-setName",
		// "hostpath");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setEnv-List1-Map1-setVolumeMounts-List1-Map1-setMountPath",
		// "/opt");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setEnv-List1-Map1-setVolumeMounts-List1-Map1-setName",
		// "emptydir");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setEnv-List1-Map1-setVolumeMounts-List1-Map1-setMountPath",
		// "/etc");
		// params.put("setSpec-setTemplate-setSpec-setContainers-List1-Map1-setEnv-List1-Map1-setImagePullPolicy",
		// "IfNotPresent");
		// params.put("setSpec-setTemplate-setSpec-setContainers-Map1-setName",
		// "busybox");

		// params.put("setSpec-setTemplate-setSpec-setContainers", new
		// ArrayList<Object>() {
		// {
		// add(new HashMap<String, Object>() {
		// {
		// put("setName", "tomcat1");
		// put("setResources-setLimits", new HashMap<String, Object>() {
		// {
		// put("cpu", new ArrayList<Object>() {
		// {
		// add(new HashMap<String, Object>() {
		// {
		// put("setAmount", "800m");
		// }
		// });
		// }
		// });
		// put("memory", new ArrayList<Object>() {
		// {
		// add(new HashMap<String, Object>() {
		// {
		// put("setAmount", "2Gi");
		// }
		// });
		// }
		// });
		// }
		// });
		// put("setResources-setRequests", new HashMap<String, Object>() {
		// {
		// put("cpu", new ArrayList<Object>() {
		// {
		// add(new HashMap<String, Object>() {
		// {
		// put("setAmount", "400m");
		// }
		// });
		// }
		// });
		// put("memory", new ArrayList<Object>() {
		// {
		// add(new HashMap<String, Object>() {
		// {
		// put("setAmount", "512Mi");
		// }
		// });
		// }
		// });
		// }
		// });
		// put("setEnv", new ArrayList<Object>() {
		// {
		// add(new HashMap<String, Object>() {
		// {
		// put("setName", "MESSAGE");
		// put("setValue", "“hello world”");
		// }
		// });
		// add(new HashMap<String, Object>() {
		// {
		// put("setName", "BAD");
		// put("setValue", "bad world");
		// }
		// });
		// }
		// });
		// put("setImage", "dcr.io:5000/tomcat:latest");
		// put("setPorts", new ArrayList<Object>() {
		// {
		// add(new HashMap<String, Object>() {
		// {
		// put("setContainerPort", 8080);
		// }
		// });
		// }
		// });
		// put("setVolumeMounts", new ArrayList<Object>() {
		// {
		// add(new HashMap<String, Object>() {
		// {
		// put("setName", "hostpath");
		// put("setMountPath", "/opt");
		// }
		// });
		// add(new HashMap<String, Object>() {
		// {
		// put("setName", "emptydir");
		// put("setMountPath", "/etc");
		// }
		// });
		// }
		// });
		// put("setImagePullPolicy", "IfNotPresent");
		// }
		// });
		// add(new HashMap<String, Object>() {
		// {
		// put("setName", "busybox");
		// put("setCommand", new ArrayList<String>() {
		// {
		// add("sleep");
		// add("3600");
		// }
		// });
		// put("setImage", "dci.io:5000/busybox:latest");
		// put("setImagePullPolicy", "IfNotPresent");
		// }
		// });
		// }
		// });
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// URI.create(dockerUrl), null, null, null, "", "", "", null);
		DockerClientImpl client = DockerClientImpl.getInstance(dockerUrl)
				.withDockerCmdExecFactory(new DockerCmdExecFactoryImpl());
		// client.createContainerCmd()
		//// System.out.println(client.listImagesCmd().exec().size());
		// kindAnalyser();
		// kindModelAnalyser();
		kindModelParametersAnalyser();

	}

	protected static void kindModelParametersAnalyser() {
		DockerKindsAnalyzer kinds = (DockerKindsAnalyzer) DockerKindsAnalyzer.getAnalyzer();
		DockerModelParametersAnalyzer parameters = (DockerModelParametersAnalyzer) DockerModelParametersAnalyzer
				.getAnalyzer();

//		ModelParamtersViewer viewer = new ModelParamtersViewer(parameters);
//		for (String kind : kinds.getKinds()) {
//			
//			try {
//				String printModel2 = viewer.printModel2(kind, DockerConstants.MODEL_METHOD_WITH.length());
//				System.out.println("####  Docker " + kind);
//				System.out.println("\n```");
//				System.out.println(printModel2);
//				System.out.println("```");
//				System.out.println("\n");
//			} catch (Exception e) {
//				continue;
//			}
//		}
	}

	protected static void kindModelAnalyser() {
		DockerKindModelsAnalyzer analyzer = (DockerKindModelsAnalyzer) DockerKindModelsAnalyzer.getAnalyzer();
		for (String kind : analyzer.getKindModels().keySet()) {
			System.out.println("- " + kind + "=" + analyzer.getKindModels().get(kind));
		}
	}

	protected static void kindAnalyser() {
		DockerKindsAnalyzer analyzer = (DockerKindsAnalyzer) DockerKindsAnalyzer.getAnalyzer();
		for (String kind : analyzer.getKinds()) {
			System.out.println("- " + kind);
			// System.out.println("public final static String KIND_" + kind.toUpperCase() +
			// " = \"" + kind + "\";\n");
		}
	}

}
