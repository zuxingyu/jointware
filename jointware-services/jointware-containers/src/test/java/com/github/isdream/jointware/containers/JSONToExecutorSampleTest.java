/**
 * 
 */
package com.github.isdream.jointware.containers;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.github.isdream.jointware.containers.clients.AbstractClient;
import com.github.isdream.jointware.containers.clients.ClientsManager;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;

/**
 * @author Henry
 *
 */
public class JSONToExecutorSampleTest {
	
	
	/**********************************************
	 * 
	 *                Mock client request
	 * 
	 **********************************************/
	
	@SuppressWarnings("unchecked")
	public static Map<String, Map<String, Object>> getClientRequest() {
		return (Map<String, Map<String, Object>>) JSON.parse("examples/client-request.json");
	}

	/**************************************************
	 * 
	 *                 Create Client
	 * 
	 **************************************************/
	
	protected static Object createClient(Map<String, Object> map) {
		try {
			return ClientsManager.getClient((String)
					map.get(ClientsManager.PLATFORM_TYPE))
					.create(map);
		} catch (Exception e) {
			return null;
		}
	}
	
	/**************************************************
	 * 
	 *                 Create Executor
	 * 
	 **************************************************/
	
	protected static Object createExecutor(Map<String, Object> map) {
		try {
			return ClientsManager.getClient((String)
					map.get(ClientsManager.PLATFORM_TYPE))
					.getConatinerDispatcher();
		} catch (Exception e) {
			return null;
		}
	}
	
	/**************************************************
	 * 
	 *                 Get Kind
	 * 
	 **************************************************/
	
	protected static String getKind(Map<String, Object> map) {
		try {
			return (String) map.get(AbstractClient.KIND);
		} catch (Exception e) {
			return null;
		}
	}

	/**********************************************
	 * 
	 *                rules
	 * 
	 **********************************************/
	
	public static Map<String, Map<String, Object>> kubeKeysRule = (Map<String, Map<String, Object>>) JSON.parse("examples/kubernetes-keys.json");; 
	
	public static Map<String, Map<String, Object>> toTargetMap(Map<String, Map<String, Object>> origin, String key) {
		
		return null;
	}
	
	/**********************************************
	 * 
	 *                Main
	 * 
	 **********************************************/
	
	public static void main(String[] args) throws Exception {
		// JsonToMap
		Map<String, Map<String, Object>> originRequest = getClientRequest();
		
		// getClient
		DefaultKubernetesClient client = (DefaultKubernetesClient) createClient(originRequest.get("target"));
		
		// toTartgetMap
		Map<String, Map<String, Object>> targetRequest = toTargetMap(originRequest, "bocodevopsplatform");
		
		// getExcutor
		ConatinerDispatcher executor = (ConatinerDispatcher) createExecutor(originRequest.get("target"));
		
		// impl
		executor.create(client, getKind(originRequest.remove("target")), targetRequest);
	}

}
