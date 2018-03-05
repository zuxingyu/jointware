/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.vm.aliyun;

import java.util.Set;

import com.aliyuncs.RpcAcsRequest;
import com.github.isdream.chameleon.KindModelsAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月20日
 */
public class AliyunECSKindModelsAnalyzer extends KindModelsAnalyzer {

	protected final static String MODEL_PACKAHE_ECS = "com.aliyuncs.ecs.model.v20140526";
	
	protected final static String SUFFIX = "Request";
	
	private static final AliyunECSKindsAnalyzer ecsAnalyzer = new AliyunECSKindsAnalyzer();
	
	@Override
	protected Set<String> getKinds() {
		return ecsAnalyzer.getKinds();
	}

	@Override
	protected void initPackages() {
		packages.add(MODEL_PACKAHE_ECS);
	}

	@Override
	protected void analyse(String pakagesName) {
		for (String kind : getKinds()) {
			 try {
				 Class<?> clazz = Class.forName(pakagesName + "." + kind + SUFFIX);
				 if (RpcAcsRequest.class.getName().equals(
						 clazz.getSuperclass().getName())) {
					 models.put(kind, pakagesName + "." + kind + SUFFIX);
				 }
			} catch (ClassNotFoundException e) {
				// ignore here
			}
		 }
	}

}
