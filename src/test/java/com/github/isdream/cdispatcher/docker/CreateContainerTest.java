/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.docker;

import java.util.HashMap;
import java.util.Map;

import com.github.dockerjava.netty.DockerCmdExecFactoryImpl;
import com.github.isdream.cdispatcher.docker.adapters.DockerClientImpl;

import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 */
@SuppressWarnings("deprecation")
public class CreateContainerTest extends TestCase {

	final static String dockerUrl = "tcp://118.190.46.58:12375";
	
	public static Map<String, Object> params = new HashMap<String, Object>();

	static {
		params.put("withName", "hello-docker");
		params.put("withImage", "dcr.io:5000/busybox:latest");
		params.put("withLogConfig-setConfig",  new HashMap<String, String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -4885641004887372190L;

			{
				put("app", "busybox-dm");
			}
		});
	}
	
	public void testCreateDeployment() throws Exception {
		DockerClientImpl client = DockerClientImpl.getInstance(dockerUrl)
				.withDockerCmdExecFactory(new DockerCmdExecFactoryImpl());
		DockerModelParametersGenerator generator = new DockerModelParametersGenerator();
		generator.create(client, DockerConstants.KIND_CREATECONTAINER, params);
		
	}
}
