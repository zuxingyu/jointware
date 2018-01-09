/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys.kinds;

import java.util.HashMap;
import java.util.Map;

import cn.cas.is.abcsys.generators.KubernetesModelParametersGenerator;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @date   2018年1月9日
 *
 */
@SuppressWarnings("serial")
public class NamespaceTest extends TestCase {

	/*******************************************************************************
	 * 
	 * Create Namespace
	 * 
	 ********************************************************************************/
	public static Map<String, Object> createNSParams = new HashMap<String, Object>();

	static {
		createNSParams.put("setMetadata-setName", "wuheng");
		createNSParams.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("name", "busybox-wuheng");
				put("version", "20180788");
			}
		});
	}

	/*******************************************************************************
	 * 
	 * Delete Namespace
	 * 
	 ********************************************************************************/
	public static Map<String, Object> deleteNSParams = new HashMap<String, Object>();

	static {
		deleteNSParams.put("setMetadata-setName", "wuheng");
	}
	
	public void testCreateNamespace() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.create(client, "Namespace", createNSParams);
	}
	
	public void testDeleteNamespace() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.delete(client, "Namespace", deleteNSParams);
	}
}
