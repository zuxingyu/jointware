/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.containers;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.github.isdream.jointware.containers.impl.KubernetesDispatcherService;

import io.fabric8.kubernetes.api.model.Namespace;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月11日
 */
public class SampleTest {

	public final static String MASTER_URL = "http://118.190.46.58:9888";
	
	public final static String NAMESPACE = "{\"main\":{\"setMetadata-setName\":\"development\",\"setMetadata-setLabels\":{\"name\":\"development\",\"version\":\"1.7.1\"}}}\r\n";
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		DispatcherService dp = new KubernetesDispatcherService();
//		dp.create(createClient(), Namespace.class.getSimpleName(), getParams(NAMESPACE));
		System.out.println(dp.query(createClient(), Namespace.class.getSimpleName(), "development"));
	}
	
	protected static DefaultKubernetesClient createClient() {
		Config config = new ConfigBuilder()
							.withMasterUrl(MASTER_URL)
							.build();
		return new DefaultKubernetesClient(config);
	}

	@SuppressWarnings("unchecked")
	protected static Map<String, Map<String, Object>> getParams(String text) {
		return (Map<String, Map<String, Object>>) JSON.parse(text);
	}
}
