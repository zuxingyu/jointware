package v3.application.services;

import com.alibaba.fastjson.JSONObject;
import jdk.nashorn.internal.runtime.options.LoggingOption;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import v3.application.exception.ContainersAreNotListException;
import v3.application.exception.ReferenceIsIllegalException;
import v3.application.utils.ReflectionTools;

import java.util.*;

@Service("deploymentConvertor")
public class DeploymentConvertor implements Convertor {
    private static Logger logger = Logger.getLogger(Logger.class);
    private static Properties prop;

    public void testreflect(Map<String, Object> oldMap,Map<String, Object> newMap){
        System.out.println("reflecting");
    }

    public void simpleConvert(Map<String,Object> oldMap,String key,Object value,Map<String,Object> mainMap){
        String newKey = prop.getProperty(key);
        mainMap.put(newKey,value);
    }

    public  void simpleConvertSub(String[] refType,Map<String,Object> oldMap,String subKey,Object subValue,Map<String,Object> newRef){
        String newKey = prop.getProperty("--"+refType[0].replaceAll("\\d+","")+"-"+refType[1]+"-"+subKey);
        //System.out.println("newKey: "+"--"+refType[0].replaceAll("\\d+","")+"-"+refType[1]+"-"+subKey);
        newRef.put(newKey,subValue);
    }

//    public void convertSubEnvKey(String[] refType,Map<String,Object> oldMap,String subKey,Object subValue,Map<String,Object> newRef,Map<String,Object> oldRef){
//        String value = (String)oldRef.get("value");
//        newRef.put((String)subValue,value);
//    }
//
//    public void convertSubEnvValue(String[] refType,Map<String,Object> oldMap,String subKey,Object subValue,Map<String,Object> newRef,Map<String,Object> oldRef){
//
//    }

    public void convertSubInstanceProbes(String[] refType,Map<String,Object> oldMap,String subKey,Object subValue,Map<String,Object> newRef,Map<String,Object> oldRef,Map<String,Object> newMap){
        //System.out.println("instanceProbes");
        List<String> probeRefs = (List<String>)subValue;
        for(String temp :probeRefs){
            String[] probeRef = temp.split("-");
            Map<String,Object> probeContents =(Map<String,Object>) oldMap.get(temp);
            String prefix = prop.getProperty("$"+(String)probeContents.get("type"));

            if(((String) probeContents.get("requestType")).equals("httpGet")){
                String newKey1 = prefix+"-"+"setHttpGet"+"-"+"setPath";
                newRef.put(newKey1,probeContents.get("path"));

                String newKey2 = prefix+"-"+"setHttpGet"+"-"+"setScheme";
                newRef.put(newKey2,probeContents.get("scheme"));

                String newKey3 = prefix+"-"+"setHttpGet"+"-"+"setPort-setIntVal";
                newRef.put(newKey3,(Integer)probeContents.get("port"));
            }

            String newKey4 = prefix+"-"+"setInitialDelaySeconds";
            newRef.put(newKey4,probeContents.get("delaySeconds"));

            String newKey5 = prefix+"-"+"setFailureThreshold";
            newRef.put(newKey5,probeContents.get("failureThreshold"));

            String newKey6 = prefix+"-"+"setSuccessThreshold";
            newRef.put(newKey6,probeContents.get("successThreshold"));

            String newKey7 = prefix+"-"+"setPeriodSeconds";
            newRef.put(newKey7,probeContents.get("periodSeconds"));

            String newKey8 = prefix+"-"+"setTimeoutSeconds";
            newRef.put(newKey8,probeContents.get("timeoutSeconds"));
        }
    }

    public void convertSubInstanceResources(String[] refType,Map<String,Object> oldMap,String subKey,Object subValue,Map<String,Object> newRef,Map<String,Object> oldRef,Map<String,Object> newMap){
        Map<String,String> cpumem = (Map<String,String>)subValue;
        int li = 0;
        List<String> limits = new ArrayList<>();
        List<String> requests = new ArrayList<>();
        if(cpumem.get("maxCpu") != null){
            String tempKey = prop.getProperty("referenceKey")+li+"-cpu-io.fabric8.kubernetes.api.model.Quantity";
            limits.add(tempKey);
            newMap.put(tempKey,new HashMap<String,Object>(){
                {
                    put("setAmount",cpumem.get("maxCpu"));
                }
            });
            li++;
        }
        if(cpumem.get("maxMem") !=null){
            String tempKey = prop.getProperty("referenceKey")+li+"-memory-io.fabric8.kubernetes.api.model.Quantity";
            limits.add(tempKey);
            newMap.put(tempKey,new HashMap<String,Object>(){
                {
                    put("setAmount",cpumem.get("maxMem"));
                }
            });
            li++;
        }
        if(limits.size() > 0){
            newRef.put("setResources-setLimits",limits);
        }

        if(cpumem.get("minCpu") != null){
            String tempKey = prop.getProperty("referenceKey")+li+"-cpu-io.fabric8.kubernetes.api.model.Quantity";
            requests.add(tempKey);
            newMap.put(tempKey,new HashMap<String,Object>(){
                {
                    put("setAmount",cpumem.get("minCpu"));
                }
            });
            li++;
        }
        if(cpumem.get("minMem") !=null){
            String tempKey = prop.getProperty("referenceKey")+li+"-memory-io.fabric8.kubernetes.api.model.Quantity";
            requests.add(tempKey);
            newMap.put(tempKey,new HashMap<String,Object>(){
                {
                    put("setAmount",cpumem.get("minMem"));
                }
            });
            li++;
        }
        if(requests.size() > 0){
            newRef.put("setResources-setRequests",requests);
        }
    }

    /****
     *
     * @param oldMap: 初始输入参数
     * @param key： 祖父key值；
     * @param value：当前的引用数组
     * @param newMap：转换后的参数
     * @param currentMap：转换后参数中的main
     * @param parentString：当前父字符串
     */
    public void convertList(Map<String,Object> oldMap,String key,Object value,Map<String,Object> newMap,Map<String,Object> currentMap,String parentString){
        List<String> containers = (List<String>)value;
        int i =0;
        List<String> apiContainers = new ArrayList<>();
        for(String container:containers){
            String[] refType = container.split("-");
            if(refType.length !=2){
                throw new ReferenceIsIllegalException();
            }
            Map<String,Object> oldRef =(Map<String,Object>) oldMap.get(container);
            apiContainers.add(prop.getProperty("referenceKey")+i+"-"+prop.getProperty("-"+refType[1]));
            Map<String,Object> newRef = new HashMap<>();
            oldRef.forEach((subKey,subValue) ->{
                try {
                        ReflectionTools.executeConvertSubMethod(this,
                                "convertSub"+ReflectionTools.upperCase(refType[1])+ReflectionTools.upperCase(subKey),
                                refType,oldMap,subKey,subValue,newRef,oldRef,newMap);
                }catch (Exception e){
                    if(e instanceof NoSuchMethodException){
                        if(subValue instanceof List && ((List<String>) value).size() > 0 && ((List<String>) value).get(0).startsWith(prop.getProperty("parameterKey"))){
                            convertList(oldMap,subKey,subValue,newMap,newRef,refType[1]);
                        }
                        else{
                            this.simpleConvertSub(refType,oldMap,subKey,subValue,newRef);
                        }
                    }
                }
            });
            newMap.put(prop.getProperty("referenceKey")+i+"-"+prop.getProperty("-"+refType[1]),newRef);
            i++;
        }
        if(prop.getProperty(key) != null)
            currentMap.put(prop.getProperty(key),apiContainers);
        else{
            StringBuffer sb = new StringBuffer("--");
            sb.append(prop.getProperty("parameterKey"));
            sb.append("-");
            sb.append(parentString);
            sb.append("-");
            sb.append(key);
            currentMap.put(prop.getProperty(sb.toString()),apiContainers);
        }
    }

    @Override
    public Map<String, Object> changeValueOrStructure(Map<String, Object> oldMap, Properties prop) {
        DeploymentConvertor.prop = prop;
        Map<String, Object> newMap = new HashMap<>();//放置引用和main
        Map<String, Object> mainMap = new HashMap<>();//只放根信息
            ((Map<String,Object>)oldMap.get("main")).forEach((key, value) -> {
                try {
                    ReflectionTools.executeConvertMethod(this,
                            "convert"+ReflectionTools.upperCase(key),
                            oldMap,key,value, newMap);
                } catch (Exception e) {
                    if(e instanceof NoSuchMethodException){
                        if(value instanceof List && ((List) value).size() > 0 && ((List<String>) value).get(0).startsWith(prop.getProperty("parameterKey"))){
                            this.convertList(oldMap,key,value,newMap,mainMap,null);
                        }
                        else{
                            this.simpleConvert(oldMap,key,value,mainMap);
                        }
                    }
                    else{
                        e.printStackTrace();
                        newMap.put("success",false);
                    }
                }
            });
        newMap.put("main",mainMap);
        logger.info("new Map:"+ JSONObject.toJSONString(newMap));
        return newMap;
    }
}
