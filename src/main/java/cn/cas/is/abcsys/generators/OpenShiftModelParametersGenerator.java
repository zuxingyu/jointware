/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys.generators;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Stack;

import cn.cas.is.abcsys.analyzers.OpenShiftKindsAnalyzer;
import cn.cas.is.abcsys.analyzers.OpenShiftModelParametersAnalyzer;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月8日
 */
public class OpenShiftModelParametersGenerator extends KubernetesModelParametersGenerator {

	@Override
	protected Object getKindObject(Object client, String kind) throws Exception {
		String desc = OpenShiftKindsAnalyzer.getAnalyzer().getKindDesc(kind);
		return _getKindObject(client, desc);
	}

	@Override
	protected Method getCreateMethod(Object client, String kind) throws Exception {
		String desc = OpenShiftKindsAnalyzer.getAnalyzer().getKindDesc(kind);
		Object kindModel = getKindModel(client, desc);
		return getMethod(kindModel, NEW_OBJECT_METHOD);
	}

	@Override
	protected Object getParameter(Map<String, Object> allParams, String kind) throws Exception {
		Map<String, String> paramMapping = OpenShiftModelParametersAnalyzer.getAnalyzer().getModelParameters(kind);
		for (String paramNameTag : allParams.keySet()) {
			
			Stack<String> stack = new Stack<String>();
			String temp = paramNameTag;
			stack.push(temp);
			while (temp.lastIndexOf("-") != -1) {
				temp = temp.substring(0, temp.lastIndexOf("-")); 
				stack.push(temp);
			}
			
			while (!stack.isEmpty()) {
				initParameter(paramMapping, 
						stack.pop(), 
						allParams);
			}
			
		}
		return kindModel;
	}

	
}
