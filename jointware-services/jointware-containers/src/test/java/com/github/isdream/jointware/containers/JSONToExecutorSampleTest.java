/**
 * 
 */
package com.github.isdream.jointware.containers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.github.isdream.jointware.containers.clients.AbstractClient;
import com.github.isdream.jointware.containers.clients.ClientsManager;
import com.github.isdream.jointware.core.ModelGenerator;
import com.github.isdream.jointware.kubernetes.KubernetesModelGenerator;

import io.fabric8.kubernetes.api.model.extensions.Deployment;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;

/**
 * @author Henry
 *
 */
public class JSONToExecutorSampleTest {
	
	/*********************************************
	 * 
	 * 
	 * 
	 ***********************************************/
	
    private static Map<String,Object> getTarget(){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("platformType","kubernetes");
        params.put("kind","Deployment");
        return params;
    }

    private void getReferences(Map params){
        params.put("boco-instance",new HashMap<String,Object>(){
            {
                put("name","tomcat");
                put("image","registry.example.com:5000/busybox");
                put("envs",new ArrayList<String>(){
                    {
                        add("boco1-env");
                        add("boco2-env");
                    }
                });
                put("ports",new ArrayList<String>(){
                    {
                        add("boco3-port");
                        add("boco4-port");
                    }
                });
                put("probes",new ArrayList<String>(){
                    {
                        add("boco5-probe");
                        add("boco6-probe");
                    }
                });
                put("resources",new HashMap<String,Object>(){
                    {
                        put("minCpu","0.5");
                        put("maxCpu","1");
                        put("minMem","128Mi");
                        put("maxMem","256Mi");
                    }
                });
                put("volumeMounts",new ArrayList<String>(){
                    {
                        add("boco7-volumeMount");
                    }
                });
            }
        });
        params.put("boco1-env",new HashMap<String,Object>(){
            {
                put("key","JAVA_HOME");
                put("value","sbxyj");
            }
        });
        params.put("boco2-env",new HashMap<String,Object>(){
            {
                put("key","TOMCAT_HOME");
                put("value","sbwh");
            }
        });
        params.put("boco3-port",new HashMap<String,Object>(){
            {
                put("name","name1");
                put("port",8080);
                put("protocol","TCP");
            }
        });
        params.put("boco4-port",new HashMap<String,Object>(){
            {
                put("name","name2");
                put("port",8888);
                put("protocol","TCP");
            }
        });
        params.put("boco5-probe",new HashMap<String,Object>(){
            {
                put("type","livenessProbe");
                put("delaySeconds",60);
                put("failureThreshold",5);
                put("path","/");
                put("port",8080);
                put("requestType","httpGet");
                put("scheme","HTTP");
                put("successThreshold",1);
                put("timeoutSeconds",5);
            }
        });
        params.put("boco6-probe",new HashMap<String,Object>(){
            {
                put("type","readinessProbe");
                put("delaySeconds",60);
                put("failureThreshold",5);
                put("path","/");
                put("port",80);
                put("requestType","httpGet");
                put("scheme","HTTP");
                put("successThreshold",1);
                put("timeoutSeconds",5);
            }
        });
        params.put("boco7-volumeMount",new HashMap<String,Object>(){
            {
                put("name","name1");
                put("path","/opt");
                put("mountPath","/opt");
            }
        });
//        params.put("boco8-volume",new HashMap<String,Object>(){
//            {
//                put("name","name1");
//                put("path","/opt");
//            }
//        });
    }

    private static Map<String,Object> getMain(){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("namespace","xyj");
        params.put("name","xuyuanjia-dm");
        params.put("replica",2);
        params.put("labels",new HashMap<String,Object>(){
            {
                put("projectId","ab1234");
            }
        });
        params.put("instances",new ArrayList<String>(){
            {
                add("boco-instance");
            }
        });
//        params.put("volumes",new ArrayList<String>(){
//            {
//                add("boco8-volume");
//            }
//        });
        params.put("selector",new HashMap<String,Object>(){
            {
                put("app","xyj-dm");
            }
        });
        params.put("instanceLabels",new HashMap<String,Object>(){
            {
                put("app","xyj-dm");
            }
        });
        params.put("instanceName","xyj-dm");
        return params;
    }

    private static Map<String, Map<String, Object>> getTotalParams(Map<String,Object> target,Map<String,Object> main){
    	Map<String, Map<String, Object>> params = new HashMap<>();
        params.put("target",target);
        params.put("main",main);
        return params;
    }
	
	
	/**********************************************
	 * 
	 *                Mock client request
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * 
	 **********************************************/
	
	@SuppressWarnings("unchecked")
	public static Map<String, Map<String, Object>> getClientRequest() throws Exception {
		// examples/client-request.json
		return JSON.parseObject(new FileInputStream(new File("examples/client-request5.json")), null, null);
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
	
	public static Map<String, Map<String, Object>> toTargetMap(Map<String, Map<String, Object>> origin, String key) {
		try {
			return ClientsManager.getClient((String)
					origin.get("target").get(ClientsManager.PLATFORM_TYPE))
					.getHandler().doHandle(origin, key, (String) origin.get("target").get("kind"));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**********************************************
	 * 
	 *                Main
	 * 
	 **********************************************/
	
	public static void main(String[] args) throws Exception {
		// JsonToMap
//		Map<String, Map<String, Object>> originRequest = getClientRequest();
		Map<String, Map<String, Object>> originRequest = getTotalParams(getTarget(),getMain());
		
		// getClient
//		DefaultKubernetesClient client = (DefaultKubernetesClient) createClient(originRequest.get("target"));
		
		// toTartgetMap
//		Map<String, Map<String, Object>> targetRequest = toTargetMap(originRequest, "bocodevopsplatform");
//		Map<String, Map<String, Object>> targetRequest = toTargetMap(originRequest, "jointwareRef");
		Map<String, Map<String, Object>> targetRequest = toTargetMap(originRequest, "boco");
		
		ModelGenerator mg = new KubernetesModelGenerator();
		System.out.println(targetRequest);
		System.out.println(mg.toObject(targetRequest, Deployment.class.getSimpleName()));
		// getExcutor
//		ConatinerExecutor executor = (ConatinerExecutor) createExecutor(originRequest.get("target"));
		
		// impl
//		executor.create(client, getKind(originRequest.remove("target")), targetRequest);
	}

}
