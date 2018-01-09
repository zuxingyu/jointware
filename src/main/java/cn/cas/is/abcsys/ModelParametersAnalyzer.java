/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import cn.cas.is.abcsys.rules.Fabric8ModelFilterRule;
import cn.cas.is.abcsys.rules.Fabric8ModelIgnoreRule;
import cn.cas.is.abcsys.utils.ObjectUtils;
import cn.cas.is.abcsys.utils.StringUtils;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public abstract class ModelParametersAnalyzer {

	private final Map<String, Map<String, String>> models = new HashMap<String,  Map<String, String>>();
	
	protected final static String DEFAULT_PARENT = "";
	
	protected ModelParametersAnalyzer() throws Exception {
		analyseModels(this.getKindModels());
	}

	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	
	private void analyseModels(Map<String, String> kindModels) throws Exception  {
		for (String kind : kindModels.keySet()) {
			Class<?> modelClass = Class.forName(kindModels.get(kind));
			models.put(kind, new LinkedHashMap<String, String>());
			this.analyse(modelClass, kindModels, kind,  DEFAULT_PARENT);
		}
	}
	
	private void analyse(Class<?> clazz, 
			Map<String, String> kindModels, 
			String kind,
			String parent) throws Exception {
		for (Method method : clazz.getMethods()) {
			
			if(canReflect(method)) {
				addToModel(kind, parent, method);
				
				if(canLoop(getParamType(method))) {
					analyse(Class.forName(getParamType(method)), kindModels, kind, getParent(parent, method));
				}
			}
			
		}
	}

	private String getParamType(Method method) {
		String fullname = method.getGenericParameterTypes()[0].getTypeName();
		String typename = fullname.indexOf("<") == -1 ? fullname 
				: fullname.substring(fullname.indexOf("<") + 1, fullname.indexOf(">"));
		return typename;
	}

	private void addToModel(String kind, String parent, Method method) {
		Map<String, String> results = models.get(kind);
		results.put(getParent(parent, method), method.getGenericParameterTypes()[0].getTypeName());
	}

	protected String getParent(String parent, Method method) {
		return DEFAULT_PARENT.equals(parent) 
				? method.getName() : parent + "-" + method.getName();
	}

	protected boolean canReflect(Method method) {
		return ObjectUtils.isNull(method) ? false 
				: ((method.getName().startsWith(Constants.MODEL_ADD_TAG) 
				|| method.getName().startsWith(Constants.MODEL_SET_TAG)) 
				&& method.getParameterCount() == 1 
				&& !Fabric8ModelIgnoreRule.ignore(method.getName()));
	}
	
	/**
	 * 不是基础类型，也不是Map
	 * 
	 * @param typename
	 * @return
	 */
	protected boolean canLoop(String typename) {
		return !Fabric8ModelFilterRule.filter(typename) // 不是基础类型 
				&& typename.split(",").length < 2;      // 不是Map
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
	
	public Map<String, String> getModel(String kind) {
		return StringUtils.isNull(kind) 
				? new HashMap<String, String>() : models.get(kind);
	}
	
	public String printModel1(String kind) {
		StringBuffer sb = new StringBuffer();
		Map<String, String> map = models.get(kind);
		for(String name : map.keySet()) {
			sb.append(name).append("=").append(map.get(name)).append("\n");
		}
		return sb.toString();
	}
	
	public String printModel2(String kind) {
		StringBuffer sb = new StringBuffer();
		Map<String, String> map = models.get(kind);
		for(String name : map.keySet()) {
			String[] split = name.split("-");
			int len = split.length;
			int i = 0;
			while (i++ < len -1) {
				sb.append("\t");
			}
			sb.append(split[i - 1].substring(3)).append("=").append(map.get(name)).append("\n");
		}
		return sb.toString();
	}
	
}
