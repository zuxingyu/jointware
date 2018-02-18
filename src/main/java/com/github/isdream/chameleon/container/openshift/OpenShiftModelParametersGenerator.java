/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.openshift;

import java.util.HashMap;
import java.util.Map;

import com.github.isdream.chameleon.commons.utils.StringUtils;
import com.github.isdream.chameleon.container.kubernetes.KubernetesModelGenerator;

/**
 * @author henry,wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月8日
 */
public class OpenShiftModelParametersGenerator extends KubernetesModelGenerator {

	@Override
	public Object getKindModel(Object client, String kind) throws Exception {
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

	@Override
	protected Object createKindModel(String kind) throws Exception {
		return Class.forName(OpenShiftKindModelsAnalyzer
				.getAnalyzer().getKindModel(kind)).newInstance();
	}

	@Override
	protected Map<String, String> createParamsType(String kind) {
		return StringUtils.isNull(kind) ? new HashMap<String, String>()
				: OpenShiftModelParametersAnalyzer.getAnalyzer().getModelParameters(kind);
	}
	
}
