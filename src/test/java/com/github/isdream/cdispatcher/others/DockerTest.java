/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.others;

import com.github.isdream.cdispatcher.docker.models.ContainerCreateRequest;

import io.fabric8.docker.api.model.Container;
import io.fabric8.docker.api.model.Image;
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
		DockerClient client = getClient();
//		createConatiner(client);
//		listContainer(client);
//		deleteConatiner(client);
		listImages(client);
//		client.image().load("");
	}

	protected static void listImages(DockerClient client) {
		for (Image image : client.image().list().allImages()) {
			System.out.println(image);
		}
	}
	
	protected static void deleteConatiner(DockerClient client) {
		client.container().withName("docker-test").remove();
	}

	protected static void listContainers(DockerClient client) {
		for (Container conatiner : client.container().list().all()) {
			System.out.println(conatiner);
		}
	}

	protected static void createConatiner(DockerClient client) {
		ContainerCreateRequest c = new ContainerCreateRequest();
		c.setName("docker-test");
		c.setImage("dcr.io:5000/busybox:latest");
		client.container().create(c );
	}

	protected static DockerClient getClient() {
		Config config = new ConfigBuilder()
	            .withDockerUrl(dockerUrl)
	            .build();
		DockerClient client = new DefaultDockerClient(config);
		return client;
	}

}
