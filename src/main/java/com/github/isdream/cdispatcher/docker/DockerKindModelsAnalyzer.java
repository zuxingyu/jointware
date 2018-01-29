/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.docker;

import java.util.Set;

import com.github.isdream.cdispatcher.KindModelsAnalyzer;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class DockerKindModelsAnalyzer extends KindModelsAnalyzer {

	protected final static String POSTFIX = "CmdImpl";
	
	private static DockerKindModelsAnalyzer analyzer = null;
	
	@Override
	protected Set<String> getKinds() {
		return DockerKindsAnalyzer.getAnalyzer().getKinds();
	}

	@Override
	protected void initPackages() {
		packages.add(DockerConstants.MODEL_PACKAGE_BASE);
		packages.add(DockerConstants.MODEL_PACKAGE_EXTENSION);
	}
	
	
	@Override
	protected void analyse(String pakagesName) {
		for (String kind : getKinds()) {
			 try {
				 Class.forName(pakagesName + "." + kind + POSTFIX);
				 models.put(kind, pakagesName + "." + kind + POSTFIX);
			} catch (ClassNotFoundException e) {
				// ignore here
			}
		 }
	}

	/**
	 * @return 单例模式
	 */
	public static KindModelsAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new DockerKindModelsAnalyzer();
			} catch (Exception e) {
				// ignore here
			}
		}
		return analyzer;
	}

}
