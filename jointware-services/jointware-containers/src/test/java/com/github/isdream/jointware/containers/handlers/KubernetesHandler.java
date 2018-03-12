/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.containers.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.isdream.jointware.containers.JSONToExecutorSampleTest;
import com.github.isdream.jointware.core.ModelParameterGenerator;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月12日
 */
public class KubernetesHandler extends AbstractHandler {

	protected final static Map<String, Map<String, Object>> DEFAULT_OBJECT = new HashMap<String, Map<String, Object>>();
	
	public final static String KEY_RESOURCES = "resources";
	
	public final static String KEY_REQUEST_RESOURCES = "requestsResources";
	
	public final static String KEY_LIMITES_RESOURCES = "limitsResources";
	
	public final static String TYPE_ENV = "env";
	
	public final static String TYPE_PORT = "port";
	
	public final static String TYPE_PROBE = "probe";
	
	public final static String TYPE_RESOURCE = "resource";
	
	public final static String TYPE_VOLUMEMOUNT = "volumeMount";
	
	protected final Map<String, String> valuesConvertor = new HashMap<String, String>();
	
	protected Map<String, Map<String, String>> keysConvertor;
	
	protected Map<String, String> typesConvertor;
	
	protected Map<String, Map<String, Object>> originRequest;
	
	protected Map<String, Map<String, Object>> newRequests = new HashMap<String, Map<String, Object>>();
	
	protected int n = 0;
	
	protected String tag;
	
	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Map<String, Object>> doHandle(
			Map<String, Map<String, Object>> originRequest, String tag, 
			String kind) throws Exception  {
		
		checkValid(originRequest, tag, kind);
		
		String originType = DEFAULT_TYPE;
		String newType = (valuesConvertor.get(DEFAULT_TYPE) == null) 
				? DEFAULT_TYPE : valuesConvertor.get(DEFAULT_TYPE);
		
		return doConvert(originType, newType);
	}

	@SuppressWarnings("unchecked")
	protected Map<String, Map<String, Object>> doConvert(
				String originType, String newType) {
		
		Map<String, Object> newMap = getMap(newRequests, newType);
		
		try {
			Map<String, Object> oldMap = originRequest.get(originType);
			
			for (String key : oldMap.keySet()) {
				
				Object value = oldMap.get(key);
				
				if (value.getClass().getName().equals(AbstractHandler.IS_LIST)) {
					List<String> list = (List<String>) value;
					
					if (list == null || list.size() == 0) {
						continue;
					}
					
					if(list.get(0).startsWith(tag)) {
						
						List<String> newValues = new ArrayList<String>();
						for (String thisValue : list) {
							
							if (TYPE_ENV.equals(getRealType(thisValue))) {
								List<Map<String, String>> thisMap = (List<Map<String, String>>) originRequest.get(thisValue);
								
								for (int i = 0; i < thisMap.size(); i++) {
									newValues.add(ModelParameterGenerator.JOINTWARE + ++n + "-" + getValue(typesConvertor, thisValue));
									Map<String, Object> tempMap = getMap(newRequests, ModelParameterGenerator.JOINTWARE + n + "-" + getValue(typesConvertor, thisValue));
									for (String thisKey : thisMap.get(i).keySet()) {
										tempMap.put(keysConvertor.get(TYPE_ENV).get(thisKey)
												, thisMap.get(i).get(thisKey));
									}
								}
								
								newRequests.get(valuesConvertor.get(originType)).put(keysConvertor.get(getRealType(originType)).get(key), newValues);
								continue;
							} else if (TYPE_RESOURCE.equals(getRealType(thisValue))) {
								System.out.println("This is resource");
								continue;
							}
							
							newValues.add(ModelParameterGenerator.JOINTWARE + ++n + "-" + getValue(typesConvertor, thisValue));
							valuesConvertor.put(thisValue, ModelParameterGenerator.JOINTWARE + n + "-" + getValue(typesConvertor, thisValue));
							doConvert(
									thisValue, ModelParameterGenerator.JOINTWARE + n + "-" 
										+ getValue(typesConvertor, thisValue));
						}
						newMap.put(keysConvertor.get(getRealType(originType)).get(key), newValues);
					} else {
						newMap.put(keysConvertor.get(getRealType(originType)).get(key), oldMap.get(key));
					}
					
				} else {
					newMap.put(keysConvertor.get(getRealType(originType)).get(key), oldMap.get(key));
				}
			}
		} catch (Exception e) {
			
			if (TYPE_PORT.equals(getRealType(originType))) {
				List<Map<String, String>> oldMap = (List<Map<String, String>>) originRequest.get(originType);
			} else if (TYPE_VOLUMEMOUNT.equals(getRealType(originType))) {
				List<Map<String, String>> oldMap = (List<Map<String, String>>) originRequest.get(originType);
			} else if (TYPE_PROBE.equals(getRealType(originType))) {
				Map<String, Object> oldMap = originRequest.get(originType);
			} else if (TYPE_RESOURCE.equals(getRealType(originType))) {
				Map<String, Object> oldMap = originRequest.get(originType);
			} else {
				throw new UnsupportedOperationException();
			}
			
		}
		return newRequests;
	}
	
	protected String getRealType(String type) {
		int idx = type.indexOf("-");
		return (idx == -1) ? DEFAULT_TYPE : type.substring(idx + 1);
	}

	protected void checkValid(Map<String, Map<String, Object>> originRequest, String tag, String kind) {
		if (originRequest == null || tag == null || kind == null) {
			throw new NullPointerException();
		}

		this.tag = tag;
		this.originRequest = originRequest;
		keysConvertor = keyRules.get("kubernetes-" + kind);
		typesConvertor = typeRules.get("kubernetes");

		if (keysConvertor == null || typesConvertor == null) {
			throw new NullPointerException();
		}
	}
	
	protected String getValue(Map<String, String> rules, String fullname) {
		int idx = fullname.indexOf("-");
		try {
			return rules.get(fullname.substring(idx + 1).trim());
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
		
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
