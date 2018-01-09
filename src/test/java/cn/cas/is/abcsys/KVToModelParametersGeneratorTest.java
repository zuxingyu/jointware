/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import cn.cas.is.abcsys.generators.KubernetesModelParametersGenerator;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public class KVToModelParametersGeneratorTest {

	public static Map<String, Object> createNSParams = new HashMap<String, Object>();
	
	static {
		createNSParams.put("setMetadata-setName", "wuheng");
		createNSParams.put("setMetadata-setLabels", new HashMap<String,String>(){
			{
				put("name","busybox-wuheng");
			}
		});
	}
	
	public static Map<String, Object> createParams = new HashMap<String, Object>();
	
	static {
		createParams.put("setMetadata-setName", "busybox-dmdx");
		createParams.put("setMetadata-setNamespace", "wuheng");
		createParams.put("setMetadata-setLabels", new HashMap<String,String>(){
			{
				put("app","busybox-dmdx");
				put("name","busybox-dmdx");
			}
		});
		createParams.put("setSpec-setReplicas", 3);
		createParams.put("setSpec-setTemplate-setMetadata-setName", "busybox-dmdx");
		createParams.put("setSpec-setTemplate-setMetadata-setLabels", new HashMap<String,String>(){
			{
				put("app","busybox-dmdx");
			}
		});
		createParams.put("setSpec-setTemplate-setSpec-setContainers", new ArrayList<Object>() {
			{
				add(new HashMap<String,Object>(){
					{
						put("setImage","dcr.io:5000/busybox:latest");
						put("setImagePullPolicy","IfNotPresent");
						put("setName","busybox-dmdx");
					}
				});
			}
		});
	}
	
	public static Map<String, Object> deleteParams = new HashMap<String, Object>();
	
	static {
		deleteParams.put("setMetadata-setName", "busybox-dmdx");
		deleteParams.put("setMetadata-setNamespace", "wuheng");
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		System.out.println(generator.create(client, "Namespace", createNSParams));
//		System.out.println(generator.create(client, "Deployment", createParams));
//		System.out.println(generator.delete(client, "Deployment", deleteParams));
	}

}
