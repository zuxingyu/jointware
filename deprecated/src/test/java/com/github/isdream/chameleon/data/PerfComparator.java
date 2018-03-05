/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.isdream.chameleon.container.kubernetes.FastKubernetesModelGenerator;
import com.github.isdream.chameleon.container.kubernetes.KubernetesKindModelsAnalyzer;
import com.github.isdream.chameleon.container.kubernetes.KubernetesModelParametersAnalyzer;

import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.PodSpec;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.extensions.Deployment;
import io.fabric8.kubernetes.api.model.extensions.DeploymentSpec;

@SuppressWarnings("serial")
public class PerfComparator {

	public static Map<String, Object> params = new HashMap<String, Object>();
	
	static {
		params.put("setMetadata-setName", "busybox-dm");
		params.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("app", "busybox-dm");
			}
		});
		params.put("setMetadata-setNamespace", "wuheng");
		params.put("setSpec-setReplicas", 2);
		params.put("setSpec-setTemplate-setMetadata-setName", "busybox-dm");
		params.put("setSpec-setTemplate-setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("app", "busybox-dm");
			}
		});
		params.put("setSpec-setTemplate-setSpec-setContainers", new ArrayList<Object>() {
			{
				add(new HashMap<String, Object>() {
					{
						put("setName", "busybox-dm");
						put("setImage", "dcr.io:5000/busybox:latest");
						put("setCommand", new ArrayList<String>() {
							{
								add("sleep");
								add("3600");
							}
						});
						put("setImagePullPolicy", "IfNotPresent");
					}
				});
			}
		});
	}
	
	public static void createByObject() {

		Deployment dm = new Deployment();
		
		{
			ObjectMeta md = new ObjectMeta();;
			md.setName("busybox-dm");
			md.setNamespace("wuheng");
			{
				Map<String, String> labels = new HashMap<String, String>();
				labels.put("app", "busybox-dm");
				md.setLabels(labels);
			}
			dm.setMetadata(md );
		}
		
		{
			DeploymentSpec spec = new DeploymentSpec();
			spec.setReplicas(2);
			{
				PodTemplateSpec template = new PodTemplateSpec();
				{
					PodSpec pc = new PodSpec();
					{
						List<Container> containers = new ArrayList<Container>();
						{
							Container c = new Container();
							{
								c.setImage("dcr.io:5000/busybox:latest");
								c.setImagePullPolicy("IfNotPresent");
								c.setName("busybox-dm");
								List<String> commands = new ArrayList<String>();
								{
									commands.add("sleep");
									commands.add("3600");
								}
								c.setCommand(commands );
							}
							containers.add(c);
						}
						pc.setContainers(containers);
					}
					template.setSpec(pc);
				}
				spec.setTemplate(template );
				
			}
			dm.setSpec(spec );
		}
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		test1();
//		testNewinstance();
//		testMethod();
	}

	protected static void testMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		Deployment d = new Deployment();
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			d.setKind("test");
		}
		long end1 = System.currentTimeMillis();
		System.out.println(end1-start1);
		
		long start2 = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			Method m = Deployment.class.getDeclaredMethod("setKind", String.class);
			m.invoke(d, "test");
		}
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
	}

	protected static void testNewinstance()
			throws Exception {
		
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			new Deployment();
		}
		long end1 = System.currentTimeMillis();
		System.out.println(end1-start1);
		
		long start2 = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			Deployment.class.newInstance();
		}
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
	}

	protected static void test1()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, Exception {
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			createByObject();
		}
		long end1 = System.currentTimeMillis();
		System.out.println(end1-start1);
		
//		long start4 = System.currentTimeMillis();
//		for (int i = 0; i < 10000; i++) {
//			createByObject();
//		}
//		long end4 = System.currentTimeMillis();
//		System.out.println(end4-start4);
		
//		KubernetesModelParametersGenerator kmpg = new KubernetesModelParametersGenerator();
//		Object obj = Class.forName(KubernetesKindModelsAnalyzer
//						.getAnalyzer().getKindModel(Constants.YAML_DEPLOYMENT)).newInstance();
//		Map<String, String> pt = KubernetesModelParametersAnalyzer.getAnalyzer().getModelParameters(Constants.YAML_DEPLOYMENT);
//		
//		long start2 = System.currentTimeMillis();
//		for(int i = 0; i < 10000; i++) {
//			kmpg.generateParameters(params, obj, pt);
//		}
//		long end2 = System.currentTimeMillis();
//		System.out.println(end2-start2);
		
		FastKubernetesModelGenerator fkmpg = new FastKubernetesModelGenerator();
//		KubernetesModelParametersGenerator fkmpg = new KubernetesModelParametersGenerator();
		Object fobj = Class.forName(new KubernetesKindModelsAnalyzer().getKindModel("Deployment")).newInstance();
		Map<String, String> fpt = new KubernetesModelParametersAnalyzer().getModelParameters("Deployment");
		
		long start3 = System.currentTimeMillis();
//		for(int i = 0; i < 10000; i++) {
//			fkmpg.generateParameters(params, fobj, fpt);
//		}
		long end3 = System.currentTimeMillis();
		System.out.println(end3-start3);
		
	}

}
