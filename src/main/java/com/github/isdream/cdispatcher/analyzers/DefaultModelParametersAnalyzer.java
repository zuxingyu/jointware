/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.analyzers;

import java.util.HashMap;
import java.util.Map;

import com.github.isdream.cdispatcher.ModelParametersAnalyzer;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class DefaultModelParametersAnalyzer extends ModelParametersAnalyzer {

	private static DefaultModelParametersAnalyzer analyzer = null;
	
	protected DefaultModelParametersAnalyzer() throws Exception {
		super();
	}
	
	@Override
	protected Map<String, String> getKindModels() {
		return new HashMap<String, String>();
	}

	public static DefaultModelParametersAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new DefaultModelParametersAnalyzer();
			} catch (Exception e) {
				// ignore here
			}
		}
		return analyzer;
	}
}
