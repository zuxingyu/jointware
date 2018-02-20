/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.defaultimpl;

import java.util.Set;

import com.github.isdream.chameleon.KindModelsAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月20日
 */
public class DefaultKindModelsAnalyzer extends KindModelsAnalyzer {

	private final static DefaultKindsAnalyzer analyzer = new DefaultKindsAnalyzer();
	
	@Override
	protected Set<String> getKinds() {
		return analyzer.getKinds();
	}

	@Override
	protected void analyse(String pakagesName) {
		// ignore here
	}

	@Override
	protected void initPackages() {
		// ignore here
	}

}
