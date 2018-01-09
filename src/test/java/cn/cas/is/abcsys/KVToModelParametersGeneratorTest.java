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

	public static Map<String, Object> params = new HashMap<String, Object>();
	
	static {
		params.put("setMetadata-setName", "busybox-dmdx");
		params.put("setMetadata-setNamespace", "default");
		params.put("setMetadata-setLabels", new HashMap<String,String>(){
			{
				put("app","busybox-dmdx");
				put("name","busybox-dmdx");
			}
		});
		params.put("setSpec-setReplicas", 3);
//		params.put("setSpec-setTemplate-setMetadata-setNamespace", "default");
		params.put("setSpec-setTemplate-setMetadata-setName", "busybox-dmdx");
		params.put("setSpec-setTemplate-setMetadata-setLabels", new HashMap<String,String>(){
			{
				put("app","busybox-dmdx");
			}
		});
		params.put("setSpec-setTemplate-setSpec-setContainers", new ArrayList<Object>() {
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
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		client.inNamespace("default");
//		client.extensions().daemonSets().inNamespace(null).
//		MixedOperation<Deployment, DeploymentList, DoneableDeployment, ScalableResource<Deployment, DoneableDeployment>> deployments = client.extensions().deployments();
//		Method method = deployments.getClass().getMethod("create", new Object[] {}.getClass());
//		System.out.println(deployments instanceof Createable);
//		method.invoke(deployments, new Deployment());
		
//		for (Method method : deployments.getClass().getMethods()) {
//			if ("create".equals(method.getName())) {
//				System.out.println(method + ":" + method.getParameterTypes()[0].getTypeName());
//				method.invoke(client.extensions().deployments(), new Object[] {new Deployment()});
//			}
//		}
		
//		deployments.create(new Deployment());
//		Object[] allParams = new Object[] {"123243"};
//		System.out.println(allParams.getClass().getTypeName());
//		System.out.println(new Deployment());
//		System.out.println(client.extensions().deployments());
//		
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.generate(client, "Deployment", params);
	}

}
