/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.github.isdream.chameleon.commons.utils.StringUtils;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 *
 * 2018年1月3日
 */
public abstract class ModelParametersAnalyzer {

	public static final String MODEL_METHOD_SET = "set";
	
	/**
	 * 
	 * 记录以下信息，方便通过反射，进行实例化
	 * 
	 * setMetadata=io.fabric8.kubernetes.api.model.ObjectMeta
	 * setMetadata-setName=java.lang.String
	 * setMetadata-setNamespace=java.lang.String
	 * setMetadata-setAnnotations=java.util.Map<java.lang.String, java.lang.String>
	 * setMetadata-setClusterName=java.lang.String
	 * setMetadata-setFinalizers=java.util.List<java.lang.String>
	 * setMetadata-setGenerateName=java.lang.String
	 * setMetadata-setGeneration=java.lang.Long
	 * setMetadata-setInitializers=io.fabric8.kubernetes.api.model.Initializers
	 * setMetadata-setInitializers-setPending=java.util.List<io.fabric8.kubernetes.api.model.Initializer>
	 * setMetadata-setInitializers-setPending-setName=java.lang.String
	 * setMetadata-setLabels=java.util.Map<java.lang.String, java.lang.String>
	 * setMetadata-setSelfLink=java.lang.String
	 * setMetadata-setUid=java.lang.String
	 * setMetadata-setCreationTimestamp=java.lang.String
	 * setMetadata-setDeletionGracePeriodSeconds=java.lang.Long
	 * setMetadata-setDeletionTimestamp=java.lang.String
	 * setMetadata-setOwnerReferences=java.util.List<io.fabric8.kubernetes.api.model.OwnerReference>
	 * setMetadata-setOwnerReferences-setName=java.lang.String
	 * setMetadata-setOwnerReferences-setKind=java.lang.String
	 * setMetadata-setOwnerReferences-setBlockOwnerDeletion=java.lang.Boolean
	 * setMetadata-setOwnerReferences-setUid=java.lang.String
	 * setMetadata-setOwnerReferences-setController=java.lang.Boolean
	 * setMetadata-setResourceVersion=java.lang.String
	 * setKind=java.lang.String
	 * setAutomountServiceAccountToken=java.lang.Boolean
	 * setImagePullSecrets=java.util.List<io.fabric8.kubernetes.api.model.LocalObjectReference>
	 * setImagePullSecrets-setName=java.lang.String
	 * setSecrets=java.util.List<io.fabric8.kubernetes.api.model.ObjectReference>
	 * setSecrets-setName=java.lang.String
	 * setSecrets-setKind=java.lang.String
	 * setSecrets-setNamespace=java.lang.String
	 * setSecrets-setUid=java.lang.String
	 * setSecrets-setResourceVersion=java.lang.String
	 * setSecrets-setFieldPath=java.lang.String
	 * 
	 * 比如setMetadata-setName=java.lang.String，是指
	 * 对应指定的kind的模型，比如Deployment，首先执行setMetadata操作，进行实例化
	 * 再执行setName操作生效
	 */
	private final Map<String, Map<String, String>> models = new HashMap<String,  Map<String, String>>();
	
	/**
	 * 主要针对setMetadata和setSpec的场景，其parent为“”
	 * 如果是先setMetadata实例化，再setName，则setName的parent为setMetadata
	 */
	protected final static String DEFAULT_PARENT = "";
	
	public ModelParametersAnalyzer() {
		analyseModels(getKindModels());
	}

	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	
	private void analyseModels(Map<String, String> kindModels)  {
		for (String kind : kindModels.keySet()) {
			try {
				Class<?> modelClass = Class.forName(kindModels.get(kind));
				models.put(kind, new LinkedHashMap<String, String>());
				analyse(modelClass, kindModels, kind,  DEFAULT_PARENT);
			} catch (Exception e) {
				// ignore here
			}
		}
	}
	
	private void analyse(Class<?> clazz, Map<String, String> kindModels, 
								String kind, String parent) throws Exception {
		for (Method method : clazz.getMethods()) {
			if(canReflect(method)) {
				addToModel(kind, parent, method);
				if(canLoop(getParamType(method))) {
					analyse(Class.forName(getParamType(method)), kindModels, kind, getParent(parent, method));
				}
			}
			
		}
	}

	/**
	 * 主要针对这种场景进行提取
	 * setMetadata-setOwnerReferences=java.util.List<io.fabric8.kubernetes.api.model.OwnerReference>
	 * 则参数的类型是io.fabric8.kubernetes.api.model.OwnerReference
	 * 
	 * @param method 方法名
	 * @return 参数类型
	 */
	private String getParamType(Method method) {
		String fullname = method.getGenericParameterTypes()[0].getTypeName();
		String typename = fullname.indexOf("<") == -1 ? fullname 
				: fullname.substring(fullname.indexOf("<") + 1, fullname.indexOf(">"));
		return typename;
	}

	/**
	 * 对于分析出来的参数及其类型，进行记录，比如
	 * 
	 * setMetadata=io.fabric8.kubernetes.api.model.ObjectMeta
	 * setMetadata-setName=java.lang.String
	 * 
	 */
	private void addToModel(String kind, String parent, Method method) {
		Map<String, String> results = models.get(kind);
		results.put(getParent(parent, method), method.getGenericParameterTypes()[0].getTypeName());
	}

	/**
	 * 对于setMetadata，则models记录的key为setMetadata
	 * 对于setMetadata后再执行setName此类u操作，models里记录的应该是setMetadata-setName
	 * 
	 * @param parent 父节点
	 * @param method 方法名
	 * @return 得到父节点
	 */
	protected String getParent(String parent, Method method) {
		return DEFAULT_PARENT.equals(parent) 
				? method.getName() : parent + "-" + method.getName();
	}

	/**
	 * 根据fabric8的代码规范，只过滤add和set开头，且只有一个参数的方法
	 * 这些方法可以说明这个方法的反射规则
	 * 
	 * @param method 方法名
	 * @return 是否可以反射
	 */
	protected abstract boolean canReflect(Method method);
	
	/**
	 * （1）不是基础类型，如int, String等
	 * （2）也不是Map类型，因为在fabric8中，Map中只会存储String类型的key, value对
	 * 
	 * 如果不满足上述两个条件，则说明需要进一步进行分析
	 * 
	 * @param typename 类型名
	 * @return 是否可以循环
	 */
	protected abstract boolean canLoop(String typename);
	
	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	
	/**
	 * @return 获取所有kind对应的模型
	 */
	protected abstract Map<String, String> getKindModels();

	/**
	 * @return 获取所有模型
	 */
	public Map<String, Map<String, String>> getModels() {
		return models;
	}
	
	/**
	 * @param kind kind类型
	 * @return 获取所有模型参数
	 */
	public Map<String, String> getModelParameters(String kind) {
		return StringUtils.isNull(kind) 
				? new HashMap<String, String>() : models.get(kind);
	}
	
}
