/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.generators;

import java.util.HashMap;
import java.util.Map;

import com.github.isdream.cdispatcher.analyzers.OpenShiftKindsAnalyzer;
import com.github.isdream.cdispatcher.analyzers.OpenShiftModelParametersAnalyzer;
import com.github.isdream.cdispatcher.utils.StringUtils;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月8日
 */
public class OpenShiftModelParametersGenerator extends KubernetesModelParametersGenerator {

	@Override
	public Object generateKindModel(Object client, String kind) throws Exception {
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