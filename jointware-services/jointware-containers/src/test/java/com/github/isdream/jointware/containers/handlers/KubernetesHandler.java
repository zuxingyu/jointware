/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.containers.handlers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.isdream.jointware.containers.JSONToExecutorSampleTest;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月12日
 */
public class KubernetesHandler extends AbstractHandler {

	public final static String KEY_RESOURCES = "resources";
	
	public final static String REQUEST_RESOURCES = "requestsResources";
	
	public final static String LIMITES_RESOURCES = "limitsResources";
	
	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Map<String, Object>> doHandle(Map<String, Map<String, Object>> originRequest, String tag, String kind) {
		
		String type = DEFAULT_TYPE;
		
		Map<String, Map<String, Object>> newRequests = new HashMap<String, Map<String, Object>>();
		Map<String, Map<String, String>> keys = keyRules.get("kubernetes-" + kind);
		
		Map<String, Object> oldMap = originRequest.remove(type);
		Map<String, Object> newMap = getMap(newRequests, type);
		
		for (String key : oldMap.keySet()) {
			
			Object value = oldMap.get(key);
			
			if (value.getClass().getName().equals(AbstractHandler.IS_LIST)) {
				List<String> list = (List<String>) value;
				if (list == null || list.size() == 0) {
					continue;
				}
				
				if(list.get(0).startsWith(tag)) {
					
				} else {
					newMap.put(keys.get(type).get(key), oldMap.get(key));
				}
				
			} else {
				newMap.put(keys.get(type).get(key), oldMap.get(key));
			}
		}
		return newRequests;
	}
	
	protected Map<String, Object> getMap(Map<String, Map<String, Object>> map, String type) {
		if (map.get(type) == null) {
			map.put(type, new HashMap<String, Object>());
		}
		return map.get(type);
	}

	public static void main(String[] args) throws Exception {
		Map<String, Map<String, Object>> originRequest = JSONToExecutorSampleTest.getClientRequest();
		System.out.println(new KubernetesHandler().doHandle(originRequest, "jointwareRef", "deployment"));
	}
}
