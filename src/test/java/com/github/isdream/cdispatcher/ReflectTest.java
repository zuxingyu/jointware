/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

import java.lang.reflect.Method;
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
//		System.out.println(UserMapWriterTest.write(Constants.YAML_SERVICE, "examples/constructors/service.yaml"));
//		System.out.println(UserMapWriterTest.write(Constants.YAML_RESOURCEQUOTA, "examples/generators/ResourceQuota.yaml"));
		System.out.println(UserMapWriterTest.write(Constants.YAML_DEPLOYMENT, "examples/controllers/deployment.yaml"));
		
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
