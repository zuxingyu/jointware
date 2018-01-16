/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.Namespace;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.Quantity;
import io.fabric8.kubernetes.api.model.ResourceQuota;
import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.api.model.ServicePort;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;

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
		
//		Map<String, String> labels = new HashMap<String, String>();
//		labels.put("name", "label-tomcat");
//		
//		List<ServicePort> ports = new ArrayList<ServicePort>();
//		ServicePort port = new ServicePort();
//		port.setPort(8080);
//		port.setTargetPort(new IntOrString((int)8080));
//		port.setNodePort(31234);
//		
//		ports.add(port);
//		
//		Map<String, String> selector = new HashMap<String, String>();
//		selector.put("name", "label-tomcat");
//		selector.put("version", "v1");
//		
//		Service service = client.services().createNew().withApiVersion("v1")
//									.withKind("Service")
//									.withNewMetadata()
//										.withName("service-tomcat")
//										.withNamespace("wuheng")
//										.withLabels(labels )
//									.endMetadata()
//									.withNewSpec()
//										.withType("NodePort")
//										.withPorts(ports)
//										.withSelector(selector )
//									.endSpec()
//									.done();
//		
//		System.out.println(service);
		
//		Object kindModel = getKindModel(client, KubernetesKindsAnalyzer
//				.getAnalyzer().getKindDesc(Constants.YAML_DEPLOYMENT));
//		System.out.println(kindModel);
//		for (Method method : kindModel.getClass().getMethods()) {
//			if (method.getName().equals("create")) {
//				System.out.println(method.getName() + ":" + method.getParameterCount() + "-" + method.getParameterTypes()[0]);
//			}
//		}
//		System.out.println(UserMapWriterTest.write(Constants.YAML_SERVICE, "examples/constructors/service.yaml"));
		System.out.println(UserMapWriterTest.write(Constants.YAML_RESOURCEQUOTA, "examples/generators/ResourceQuota.yaml"));
		
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
