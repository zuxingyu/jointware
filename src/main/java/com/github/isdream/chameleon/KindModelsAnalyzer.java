/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.isdream.chameleon.commons.utils.StringUtils;
import com.github.isdream.chameleon.container.kubernetes.KubernetesConstants;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 * 
 * 发现kind对应fabric8的对象。
 * models是由key, value组成的Map <br>
 * 
 * 比如： <br> <br>
 * 
 *  对于ServiceAccount的kind，是通过如下方式实例化的：  <br>
 *  io.fabric8.kubernetes.api.model.ServiceAccount <br>
 */
public abstract class KindModelsAnalyzer {

	/**
	 * 记录kind和model的对应关系，比如：
	 * Deployment=io.fabric8.kubernetes.api.model.extensions.Deployment
	 */
	protected final Map<String, String> models = new HashMap<String, String>();
	
	/**
	 * 基于先验知识，给出fabrci8实现这个kind模型所在的目录
	 */
	protected final List<String> packages = new ArrayList<String>();
	
	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	
	protected KindModelsAnalyzer() {
		super();
		initPackages();
		analyseKindModels();
	}

	private void analyseKindModels() {
		for(String pkg : packages) {
			analyse(pkg);
		}
	}

	protected void initCommonsPackages() {
		packages.add(KubernetesConstants.MODEL_PACKAHE_COMMON_AUTH);
		packages.add(KubernetesConstants.MODEL_PACKAHE_COMMON_EXTENSION);
		packages.add(KubernetesConstants.MODEL_PACKAHE_COMMON_API);
	}
	
	protected abstract void analyse(String pakagesName);
	
	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	/**
	 * @return 获取所有的kind
	 */
	protected abstract Set<String> getKinds();
	
	/**
	 * 在指定的Packages中查询kind对应的fabric8的model
	 * 
	 */
	protected abstract void initPackages();
	
	/**
	 * @return 获取所有的kind对应的fabric8模型
	 */
	public Map<String, String> getKindModels() {
		return models;
	}
	
	/**
	 * @param kind 具体的kind
	 * @return 获取指定kind对应的fabric8模型
	 */
	public String getKindModel(String kind) {
		return StringUtils.isNull(kind) ? null : models.get(kind);
	}
}
