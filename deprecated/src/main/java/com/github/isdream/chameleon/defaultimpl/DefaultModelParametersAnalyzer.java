/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.defaultimpl;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.github.isdream.chameleon.ModelParametersAnalyzer;

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

	/**
	 * @return 单例模式
	 */
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

	@Override
	protected boolean canReflect(Method method) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean canLoop(String typename) {
		// TODO Auto-generated method stub
		return false;
	}
}
