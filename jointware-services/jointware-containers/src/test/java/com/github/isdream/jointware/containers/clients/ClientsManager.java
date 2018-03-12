/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.containers.clients;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月12日
 */
public class ClientsManager {

	@SuppressWarnings("unchecked")
	protected static Map<String, String> clients = (Map<String, String>) JSON.parse("examples/client-type.json");;
	
	static {
	}
	
	public final static String PLATFORM_TYPE = "platformType";
	
	public static AbstractClient getClient(String type) {
		try {
			return (AbstractClient) Class.forName(clients.get(type)).newInstance();
		} catch (Exception e) {
			return null;
		}
	}
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String> ();
		map.put("kubernetes", KubernetesClient.class.getName());
	}
}
