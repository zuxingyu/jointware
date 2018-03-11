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

    public void convertSubEnvKey(String[] refType,Map<String,Object> oldMap,String subKey,Object subValue,Map<String,Object> newRef,Map<String,Object> oldRef){
        String value = (String)oldRef.get("value");
        newRef.put((String)subValue,value);
    }

    public void convertSubEnvValue(String[] refType,Map<String,Object> oldMap,String subKey,Object subValue,Map<String,Object> newRef,Map<String,Object> oldRef){

    }


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
                    if(subValue instanceof List && ((List<String>) value).size() > 0){
                        convertList(oldMap,subKey,subValue,newMap,newRef,refType[1]);
                    }
                    else{
                        ReflectionTools.executeConvertSubMethod(this,
                                "convertSub"+ReflectionTools.upperCase(refType[1])+ReflectionTools.upperCase(subKey),
                                refType,oldMap,subKey,subValue,newRef,oldRef);
                    }
                }catch (Exception e){
                    if(e instanceof NoSuchMethodException){
                        this.simpleConvertSub(refType,oldMap,subKey,subValue,newRef);
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
                    if(value instanceof List && ((List) value).size() > 0){
                        this.convertList(oldMap,key,value,newMap,mainMap,null);
                    }
                    else{
//                        ReflectionTools.executeConvertMethod(this,
//                                "convert"+ReflectionTools.upperCase(key),
//                                oldMap,key,value, newMap);
                    }
                } catch (Exception e) {
                    if(e instanceof NoSuchMethodException){
                        this.simpleConvert(oldMap,key,value,mainMap);
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
