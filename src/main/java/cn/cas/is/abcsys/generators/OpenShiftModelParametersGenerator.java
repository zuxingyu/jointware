/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys.generators;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import cn.cas.is.abcsys.analyzers.KubernetesKindsAnalyzer;
import cn.cas.is.abcsys.analyzers.KubernetesModelParametersAnalyzer;
import cn.cas.is.abcsys.analyzers.OpenShiftKindsAnalyzer;
import cn.cas.is.abcsys.analyzers.OpenShiftModelParametersAnalyzer;
import cn.cas.is.abcsys.utils.StringUtils;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月8日
 */
public class OpenShiftModelParametersGenerator extends KubernetesModelParametersGenerator {

	@Override
	protected Object generateKindModel(Object client, String kind) throws Exception {
		String desc = OpenShiftKindsAnalyzer.getAnalyzer().getKindDesc(kind);
		return createKindModelByDesc(client, desc);
	}

	@Override
	protected Map<String, String> getModelParams(String kind) {
		return StringUtils.isNull(kind) ? new HashMap<String, String>() : 
			OpenShiftModelParametersAnalyzer.getAnalyzer().getModelParameters(kind);
	}

	@Override
	protected String getDesc(String kind) {
		return StringUtils.isNull(kind) ? "" 
				: OpenShiftKindsAnalyzer.getAnalyzer().getKindDesc(kind);
	}

	
}
