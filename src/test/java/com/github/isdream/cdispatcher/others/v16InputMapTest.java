package com.github.isdream.cdispatcher.others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/28.
 */
public class v16InputMapTest {
    public static Map<String, Object> params = new HashMap<String, Object>();

    static {
        params.put("apiVersion","extensions/v1beta1");
        params.put("configType","releaseFullApplicationConfig");
        params.put("deploymentName","appnam3versionname");
        params.put("images",new ArrayList<Map<String,Object>>(){
            {
                add(new HashMap<String,Object>(){
                    {
                        put("containerName","containername");
                        put("envs",new ArrayList<Map<String,Object>>(){
                            {
                                add(new HashMap<String,Object>(){
                                    {
                                        put("key1","key1");
                                        put("value1","value1");
                                    }
                                });
                            }
                        });
                        put("name","redis");
                        put("ports",new ArrayList<Map<String,Object>>(){
                            {
                                add(new HashMap<String,Object>(){
                                    {
                                        put("name","port1");
                                        put("port",6379);
                                        put("protocol","TCP");
                                    }
                                });
                            }
                        });
                        put("probes",new ArrayList<Map<String,Object>>(){
                            {
                                add(new HashMap<String,Object>(){
                                    {
                                        put("delaySeconds",60);
                                        put("failureThreshold",5);
                                        put("path","/");
                                        put("port","6379");
                                        put("requestType","httpGet");
                                        put("scheme","HTTP");
                                        put("successThreshold",1);
                                        put("timeoutSeconds",5);
                                        put("type","livenessProbe");
                                    }
                                });
                            }
                        });
                        put("resources",new HashMap<String,Object>(){
                            {
                                put("maxCpu","1");
                                put("maxMem","1Gi");
                                put("minCpu","1");
                                put("minMem","1Gi");
                            }
                        });
                        put("storage","123123");
                        put("version","latest");
                        put("volumeMounts",new ArrayList<Map<String,Object>>(){
                            {
                                add(new HashMap<String,Object>(){
                                    {
                                        put("mountPath","/opt");
                                        put("name","volumename");
                                        put("type","logPath");
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
        params.put("kind","Deployment");
        params.put("imageGroupLabels",new ArrayList<HashMap<String,Object>>(){
            {
                add(new HashMap<String,Object>(){
                    {
                        put("mockTest","mockTest");
                    }
                });
            }
        });
        params.put("podLabels",new ArrayList<HashMap<String,Object>>(){
            {
                add(new HashMap<String,Object>(){
                    {
                        put("mockTest","mockTest");
                    }
                });
            }
        });
        params.put("imageGroupSelectors",new ArrayList<HashMap<String,Object>>(){
            {
                add(new HashMap<String,Object>(){
                    {
                        put("mockTest","mockTest");
                    }
                });
            }
        });
        params.put("nodeSelectors",new ArrayList<HashMap<String,Object>>(){
            {
                add(new HashMap<String,Object>(){
                    {
                        put("mockTest","mockTest");
                    }
                });
            }
        });
        params.put("masterIp","118.190.46.58");
        params.put("masterPort","9888");
        params.put("masterType","http");
        params.put("name","appnam3");
        params.put("namespace","default");
        params.put("platformType","kubernetes");
        params.put("replica",2);
        params.put("volumes",new ArrayList<Map<String,Object>>(){
            {
                add(new HashMap<String,Object>(){
                    {
                        put("name","volumename");
                        put("path","/abcs/kubelog/");
                        put("type","logPath");
                    }
                });
            }
        });
    }

    public static void main(String[] args) {

    }

}
