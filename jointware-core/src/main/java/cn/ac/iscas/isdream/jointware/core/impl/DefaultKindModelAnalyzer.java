/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package cn.ac.iscas.isdream.jointware.core.impl;

import java.util.Set;

import cn.ac.iscas.isdream.jointware.core.KindModelAnalyzer;

/**
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 * 2018年3月2日
 */
public class DefaultKindModelAnalyzer extends KindModelAnalyzer {

	private final static DefaultKindAnalyzer analyzer = new DefaultKindAnalyzer();
	
	@Override
	protected Set<String> getKinds() {
		return analyzer.getKinds();
	}

	@Override
	protected void analyseModels() {
		
	}

}
