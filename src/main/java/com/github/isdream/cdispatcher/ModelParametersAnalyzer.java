/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.github.isdream.cdispatcher.rules.Fabric8Kind2ModelFilterRule;
import com.github.isdream.cdispatcher.rules.Fabric8ModelParametersIgnoreRule;
import com.github.isdream.cdispatcher.utils.ObjectUtils;
import com.github.isdream.cdispatcher.utils.StringUtils;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 *
 * @date   2018年1月3日
 */
public abstract class ModelParametersAnalyzer {

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
	
	protected ModelParametersAnalyzer() throws Exception {
		analyseModels(this.getKindModels());
	}

	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	
	private void analyseModels(Map<String, String> kindModels) 
											throws Exception  {
		for (String kind : kindModels.keySet()) {
			Class<?> modelClass = Class.forName(kindModels.get(kind));
			models.put(kind, new LinkedHashMap<String, String>());
			this.analyse(modelClass, kindModels, kind,  DEFAULT_PARENT);
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
	 * @param method
	 * 
	 * @return
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
	 * @param kind
	 * @param parent
	 * @param method
	 */
	private void addToModel(String kind, String parent, Method method) {
		Map<String, String> results = models.get(kind);
		results.put(getParent(parent, method), method.getGenericParameterTypes()[0].getTypeName());
	}

	/**
	 * 对于setMetadata，则models记录的key为setMetadata
	 * 对于setMetadata后再执行setName此类u操作，models里记录的应该是setMetadata-setName
	 * 
	 * @param parent
	 * @param method
	 * @return
	 */
	protected String getParent(String parent, Method method) {
		return DEFAULT_PARENT.equals(parent) 
				? method.getName() : parent + "-" + method.getName();
	}

	/**
	 * 根据fabric8的代码规范，只过滤add和set开头，且只有一个参数的方法
	 * 这些方法可以说明这个方法的反射规则
	 * 
	 * @param method
	 * @return
	 */
	protected boolean canReflect(Method method) {
		return ObjectUtils.isNull(method) ? false 
				: ((method.getName().startsWith(Constants.MODEL_ADD_TAG) // add开头的方法 
				|| method.getName().startsWith(Constants.MODEL_SET_TAG)) // set开头的方法
				&& method.getParameterCount() == 1  //该方法只有一个参数
				&& !Fabric8ModelParametersIgnoreRule.ignore(method.getName())); //可以人工指定过滤哪些方法
	}
	
	/**
	 * （1）不是基础类型，如int, String等
	 * （2）也不是Map类型，因为在fabric8中，Map中只会存储String类型的<key, value>对
	 * 
	 * 如果不满足上述两个条件，则说明需要进一步进行分析
	 * 
	 * @param typename
	 * @return
	 */
	protected boolean canLoop(String typename) {
		return !Fabric8Kind2ModelFilterRule.filter(typename) // 不是基础类型 
				&& typename.split(",").length < 2;      // 不是Map，在fabric8中，Map会通过泛型表示，如Map<String, String>，则通过,划分，长度小于2的不是Map
	}
	
	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	
	protected abstract Map<String, String> getKindModels();

	public Map<String, Map<String, String>> getModels() {
		return models;
	}
	
	public Map<String, String> getModelParameters(String kind) {
		return StringUtils.isNull(kind) 
				? new HashMap<String, String>() : models.get(kind);
	}
	
}
