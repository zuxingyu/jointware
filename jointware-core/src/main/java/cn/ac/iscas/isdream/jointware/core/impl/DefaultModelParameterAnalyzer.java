/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences 
 */
package cn.ac.iscas.isdream.jointware.core.impl;

import java.lang.reflect.Method;
import java.util.Map;

import cn.ac.iscas.isdream.jointware.core.ModelParameterAnalyzer;

/**
 * @author wuheng@(otcaix.iscas.ac.cn)
 *
 * 2018年3月2日
 */
public class DefaultModelParameterAnalyzer extends ModelParameterAnalyzer {

	protected DefaultKindModelAnalyzer analyzer = new DefaultKindModelAnalyzer();
	
	@Override
	protected boolean canReflect(Method method) {
		return false;
	}

	@Override
	protected boolean canLoop(String typename) {
		return false;
	}

	@Override
	protected Map<String, String> getKindModels() {
		return analyzer.getKindModels();
	}

}
