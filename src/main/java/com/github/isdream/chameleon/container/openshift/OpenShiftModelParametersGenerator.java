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
		String desc = new OpenShiftKindsAnalyzer().getKindDesc(kind);
		return createKindModelByDesc(client, desc);
	}

	@Override
	protected Map<String, String> getModelParams(String kind) {
		return StringUtils.isNull(kind) ? new HashMap<String, String>() : 
			new OpenShiftModelParametersAnalyzer().getModelParameters(kind);
	}

	@Override
	protected String getDesc(String kind) {
		try {
			return StringUtils.isNull(kind) ? "" 
					: new OpenShiftKindsAnalyzer().getKindDesc(kind);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	protected Object createKindModel(String kind) throws Exception {
		return Class.forName(new OpenShiftKindModelsAnalyzer().getKindModel(kind)).newInstance();
	}

	@Override
	protected Map<String, String> createParamsType(String kind) {
		return StringUtils.isNull(kind) ? new HashMap<String, String>()
				: new OpenShiftModelParametersAnalyzer().getModelParameters(kind);
	}
	
}
