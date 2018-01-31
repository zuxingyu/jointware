/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.deprecated;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.github.isdream.cdispatcher.ModelParametersAnalyzer;
import com.github.isdream.cdispatcher.commons.rules.JavaObjectRule;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * 2018年1月30日
 *
 */
@Deprecated
public class ModelParamtersViewer {

	final static String dockerUrl = "tcp://118.190.46.58:12375";
	
	static Set<String> sets = new HashSet<String>();
	
	private Map<String, Map<String, String>> models = null;

	public ModelParamtersViewer(final ModelParametersAnalyzer analyzer) {
		super();
		this.models = analyzer.getModels();
	}

	/**
	 * @param kind 类型
	 * @return 结果
	 */
	public String printModel1(String kind) {
		StringBuffer sb = new StringBuffer();
		Map<String, String> map = models.get(kind);
		for(String name : map.keySet()) {
			sb.append(name).append("=")
					.append(map.get(name)).append("\n");
		}
		return sb.toString();
	}
	
	/**
	 * @param kind 类型
	 * @return 结果
	 */
	
	public String printModel2(String kind, int size) {
		StringBuffer sb = new StringBuffer();
		Map<String, String> map = models.get(kind);
		for(String name : map.keySet()) {
			String[] split = name.split("-");
			int len = split.length;
			int i = 0;
			while (i++ < len -1) {
				sb.append("  ");
			}
			sb.append(split[i - 1]).append("=")
						.append(map.get(name)).append("\n");
		}
		return sb.toString();
	}
	
	public String printModel3(String kind) {
		StringBuffer sb = new StringBuffer();
		Map<String, String> map = models.get(kind);
		for(String name : map.keySet()) {
			String clazz = map.get(name);
			if (JavaObjectRule.isPrimitive(clazz) || sets.contains(clazz) 
					|| JavaObjectRule.isMap(clazz) || JavaObjectRule.isList(clazz)) {
				continue;
			}
			sets.add(clazz);
			sb.append("classCached.put(\"").append(clazz).
							append("\", Class.forName(\"").append(clazz).append("\"));").append("\n");
		}
		return sb.toString();
	}
	
}
