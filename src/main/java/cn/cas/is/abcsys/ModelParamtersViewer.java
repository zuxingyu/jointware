/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys;

import java.util.Map;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @date   2018年1月9日
 *
 */
public class ModelParamtersViewer {

	private Map<String, Map<String, String>> models = null;

	public ModelParamtersViewer(final ModelParametersAnalyzer analyzer) {
		super();
		this.models = analyzer.getModels();
	}

	public String printModel1(String kind) {
		StringBuffer sb = new StringBuffer();
		Map<String, String> map = models.get(kind);
		for(String name : map.keySet()) {
			sb.append(name).append("=")
					.append(map.get(name)).append("\n");
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
				sb.append("  ");
			}
			sb.append(split[i - 1]
						.substring(3)).append("=")
						.append(map.get(name)).append("\n");
		}
		return sb.toString();
	}
	
}
