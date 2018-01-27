/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.temps;

import io.fabric8.docker.api.model.ContainerCreateRequest;
import io.fabric8.docker.client.Config;
import io.fabric8.docker.client.ConfigBuilder;
import io.fabric8.docker.client.DefaultDockerClient;
import io.fabric8.docker.client.DockerClient;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 2018-1-27
 */
public class DockerTest {

	final static String dockerUrl = "http://118.190.46.58:12375";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Config config = new ConfigBuilder()
	            .withDockerUrl(dockerUrl)
	            .build();
		DockerClient client = new DefaultDockerClient(config);
//		ContainerCreateRequest c = new ContainerCreateRequest();
//		client.container().create(c );
	}

}
