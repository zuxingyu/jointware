/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.docker;

import com.spotify.docker.client.DefaultDockerClient;
import com.spotify.docker.client.DockerClient;
import com.spotify.docker.client.messages.swarm.ServiceSpec;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月20日
 */
public class DockerMain {

	final static String URL = "http://118.190.46.58:12375";
	
	public static void main(String[] args) throws Exception {
		DockerClient docker = DefaultDockerClient.fromEnv().uri(URL).build();
		ServiceSpec spec = null;
		docker.createService(spec );
		System.out.println(docker.listContainers());
		docker.close();
	}
}
