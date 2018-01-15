/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

import java.lang.reflect.Method;

import io.fabric8.kubernetes.api.model.Namespace;
import io.fabric8.kubernetes.api.model.ObjectMeta;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @date   2018年1月15日
 *
 */
public class ReflectTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
//		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
//		Object kindModel = getKindModel(client, KubernetesKindsAnalyzer
//				.getAnalyzer().getKindDesc(Constants.YAML_DEPLOYMENT));
//		System.out.println(kindModel);
//		for (Method method : kindModel.getClass().getMethods()) {
//			if (method.getName().equals("create")) {
//				System.out.println(method.getName() + ":" + method.getParameterCount() + "-" + method.getParameterTypes()[0]);
//			}
//		}
//		System.out.println(kindModel.getClass().getMethod("create", new Object[] {}.getClass()));
		
		Namespace ns = new Namespace();
		System.out.println(ns.getClass().getMethod("setMetadata", ObjectMeta.class));
//		System.out.println(ns.setMetadata(metadata););
		System.out.println(UserMapWriterTest.write(Constants.YAML_DEPLOYMENT, "examples/controllers/busybox-dm.yaml"));
	}
	
	public static Object getKindModel(Object client, String desc) throws Exception {
		Object obj = client;
		for (String name : desc.split("-")) {
			Method method = obj.getClass().getMethod(name);
			obj = method.invoke(obj);
		}
		return obj;
	}

}
