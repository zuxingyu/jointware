/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

import java.util.HashMap;
import java.util.Map;

import com.github.isdream.cdispatcher.analyzers.KubernetesKindModelsAnalyzer;
import com.github.isdream.cdispatcher.analyzers.KubernetesModelParametersAnalyzer;
import com.github.isdream.cdispatcher.analyzers.OpenShiftKindModelsAnalyzer;
import com.github.isdream.cdispatcher.analyzers.OpenShiftModelParametersAnalyzer;
import com.github.isdream.cdispatcher.utils.ObjectUtils;
import com.github.isdream.cdispatcher.utils.StringUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * 2018-1-25
 *
 */
public class ClassAndMethodCache {

	@SuppressWarnings("rawtypes")
	protected final Map<String, Class> classCache = new HashMap<String, Class>();
	
	@SuppressWarnings("rawtypes")
	protected final Map<String, Class> methodCache = new HashMap<String, Class>();
	
	protected final static Map<String, KindModelsAnalyzer> kmas = new HashMap<String, KindModelsAnalyzer>();
	
	static {
		kmas.put(Constants.CLIENT_KUBERNETES, KubernetesKindModelsAnalyzer.getAnalyzer());
		kmas.put(Constants.CLIENT_OPENSHIFT, OpenShiftKindModelsAnalyzer.getAnalyzer());
	}
	
	protected final static Map<String, ModelParametersAnalyzer> mpas = new HashMap<String, ModelParametersAnalyzer>();
	
	static {
		mpas.put(Constants.CLIENT_KUBERNETES, KubernetesModelParametersAnalyzer.getAnalyzer());
		mpas.put(Constants.CLIENT_OPENSHIFT, OpenShiftModelParametersAnalyzer.getAnalyzer());
	}
	
	/**
	 * type should be neither Constants.CLIENT_KUBERNETES or Constants.CLIENT_OPENSHIFT 
	 * 
	 * @param type Constants.CLIENT_KUBERNETES or Constants.CLIENT_OPENSHIFT
	 * @throws Exception Unsupport
	 */
	public void createCache(String type) throws Exception {
		if (StringUtils.isNull(type) 
				|| ObjectUtils.isNull(kmas.get(type))) {
			throw new Exception("Type should be neither Constants.CLIENT_KUBERNETES or Constants.CLIENT_OPENSHIFT");
		}
		
		cacheAll(kmas.get(type), mpas.get(type));
	}
	
	protected void cacheAll (KindModelsAnalyzer kma, ModelParametersAnalyzer mpa) throws Exception {
		for (String kind: kma.getKinds()) {
			classCache.put(kind, Class.forName(kma.getKindModel(kind)));
//			mpa.getModelParameters(kind)
		}
	}
	
}
