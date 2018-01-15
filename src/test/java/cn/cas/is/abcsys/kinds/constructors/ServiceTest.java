/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys.kinds.constructors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import cn.cas.is.abcsys.Constants;
import cn.cas.is.abcsys.generators.KubernetesModelParametersGenerator;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @date   2018年1月9日
 *
 */
@SuppressWarnings("serial")
public class ServiceTest extends TestCase {

	/*******************************************************************************
	 * 
	 * Create Namespace
	 * 
	 ********************************************************************************/
	public static Map<String, Object> params = new HashMap<String, Object>();

	static {
		params.put("setMetadata-setName", "service-tomcat");
		params.put("setMetadata-setNamespace", "xuyuanjia-namespace");
		params.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("name", "label-tomcat");
			}
		});
		params.put("setSpec-setType", "NodePort");
		params.put("setSpec-setSelector", new HashMap<String, String>() {
			{
				put("name", "label-tomcat");
				put("version", "v1");
			}
		});
		params.put("setSpec-setPorts", new ArrayList<Object>() {
			{
				add(new HashMap<String, Object>() {
					{
						put("setPort", 8080);
						put("setNodePort", 31234);
						put("setTargetPort-setStrVal", "8080");
					}
				});
			}
		});
	}

	
	public void testCreateSVC() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		System.out.println(generator.create(client, Constants.YAML_SERVICE, params));
	}
	
//	public void testDeleteNode() throws Exception {
//		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
//		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
//		generator.delete(client, Constants.YAML_NODE, "izm5e5tgjv84bevngsmq1az");
//	}
}
