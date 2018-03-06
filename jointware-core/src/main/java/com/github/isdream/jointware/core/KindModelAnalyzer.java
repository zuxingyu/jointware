/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package com.github.isdream.jointware.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.isdream.jointware.core.utils.StringUtils;

/**
 * 发现kind对应fabric8的对象。
 * models是由key, value组成的Map <br>
 * 
 * 比如： <br> <br>
 * 
 * 对于ServiceAccount的kind，是通过如下方式实例化的：  <br>
 * io.fabric8.kubernetes.api.model.ServiceAccount <br>
 * 
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 * 2018年3月2日
 */
public abstract class KindModelAnalyzer {

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
	
	public KindModelAnalyzer() {
		super();
		analyseModels();
	}

	/**
	 * 分析kind对应的model
	 */
	protected abstract void analyseModels();
	
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
	
	
	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	
	/**
	 * @return 获取所有的kind
	 */
	protected abstract Set<String> getKinds();
	
}
