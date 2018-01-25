/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.generators;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.github.isdream.cdispatcher.analyzers.KubernetesKindModelsAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018-1-25
 */
public class FastKubernetesModelParametersGenerator extends KubernetesModelParametersGenerator {

	protected final static Map<String, Method> methodCached = new HashMap<String, Method>();
	
	@SuppressWarnings("rawtypes")
	protected final static Map<String, Class> classCached = new HashMap<String, Class>();

	@Override
	protected Method getThisMethod(Object object, String fullname, Class<?> paramType) throws Exception {
		
		if (methodCached.get(fullname + paramType.getName()) == null) {
			String paramName = getParamName(fullname);
			methodCached.put(fullname + paramType.getName(), 
					object.getClass().getDeclaredMethod(paramName, paramType));
		}
		
		return methodCached.get(fullname + paramType.getName());
	}

	@Override
	protected Class<?> getThisClass(String name) throws Exception {
		if (classCached.get(name) == null) {
			classCached.put(name, Class.forName(name));
		}
		return classCached.get(name);
	}

	@Override
	protected Object createKindModel(String kind) throws Exception {

		Class<?> clazz = getThisClass(KubernetesKindModelsAnalyzer
								.getAnalyzer().getKindModel(kind));
		return clazz.newInstance();
	} 
	
}
