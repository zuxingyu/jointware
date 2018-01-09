/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.cas.is.abcsys.utils.StringUtils;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 * 
 * 发现kind对应fabric8的对象。
 * models是由<key, value>组成的Map <br>
 * 
 * 比如： <br> <br>
 * 
 *  对于ServiceAccount的kind，是通过如下方式实例化的：  <br>
 *  io.fabric8.kubernetes.api.model.ServiceAccount <br>
 */
public abstract class KindModelsAnalyzer {

	protected final Map<String, String> mapping = new HashMap<String, String>();
	
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
		packages.add(Constants.MODEL_COMMON_AUTH_PACKAHE);
		packages.add(Constants.MODEL_COMMON_EXTENSION_PACKAHE);
		packages.add(Constants.MODEL_COMMON_API_PACKAHE);
	}
	
	protected void analyse(String pakagesName) {
		 for (String kind : getKinds()) {
			 try {
				 Class.forName(pakagesName + "." + kind);
				 mapping.put(kind, pakagesName + "." + kind);
			} catch (ClassNotFoundException e) {
				// ignore here
			}
		 }
	}
	
	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	/**
	 * 获取所有的kind
	 * 
	 * @return
	 */
	protected abstract Set<String> getKinds();
	
	/**
	 * 在指定的Packages中查询kind对应的fabric8的model
	 * 
	 * @return
	 */
	protected abstract void initPackages();
	
	public Map<String, String> getKindModels() {
		return mapping;
	}
	
	public String getKindModel(String kind) {
		return StringUtils.isNull(kind) ? null : mapping.get(kind);
	}
}
