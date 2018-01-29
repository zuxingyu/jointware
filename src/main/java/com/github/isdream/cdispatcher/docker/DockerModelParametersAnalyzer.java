/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.docker;

import java.lang.reflect.Method;
import java.util.Map;

import com.github.isdream.cdispatcher.ModelParametersAnalyzer;
import com.github.isdream.cdispatcher.commons.rules.JavaMethodParametersIgnoreRule;
import com.github.isdream.cdispatcher.commons.rules.JavaObjectRule;
import com.github.isdream.cdispatcher.commons.utils.ObjectUtils;
import com.github.isdream.cdispatcher.defaultmodle.DefaultModelParametersAnalyzer;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月29日
 */
public class DockerModelParametersAnalyzer extends ModelParametersAnalyzer {

	private static DockerModelParametersAnalyzer analyzer = null;
	
	protected DockerModelParametersAnalyzer() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}


	/** 
	 * @return 单例模式
	 */
	public static ModelParametersAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new DockerModelParametersAnalyzer();
			} catch (Exception e) {
				e.printStackTrace();
				return DefaultModelParametersAnalyzer.getAnalyzer();
			}
		}
		return analyzer;
	}

	@Override
	protected Map<String, String> getKindModels() {
		return DockerKindModelsAnalyzer.getAnalyzer().getKindModels();
	}


	@Override
	protected boolean canReflect(Method method) {
		return ObjectUtils.isNull(method) ? false 
				: ((method.getName().startsWith(DockerConstants.MODEL_METHOD_WITH)) // with开头的方法
				&& method.getParameterCount() == 1  //该方法只有一个参数
				&& !method.getGenericParameterTypes()[0].getTypeName().endsWith("[]")
				&& !JavaMethodParametersIgnoreRule.ignore(method.getName())); //可以人工指定过滤哪些方法
	}


	@Override
	protected boolean canLoop(String typename) {
		return !JavaObjectRule.isPrimitive(typename)
				&& typename.split(",").length < 2;
	}

}
