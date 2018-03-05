/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.vm.aws;

import java.util.Set;

import com.amazonaws.AmazonWebServiceRequest;
import com.github.isdream.chameleon.KindModelsAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月20日
 */
public class AmazonEC2KindModelsAnalyzer extends KindModelsAnalyzer {

	protected final static String MODEL_PACKAHE_EC2 = "com.amazonaws.services.ec2.model";
	
	protected final static String SUFFIX = "Request";
	
	private static final AmazonEC2KindsAnalyzer ec2Analyzer = new AmazonEC2KindsAnalyzer();
	
	@Override
	protected Set<String> getKinds() {
		return ec2Analyzer.getKinds();
	}

	@Override
	protected void initPackages() {
		packages.add(MODEL_PACKAHE_EC2);
	}

	@Override
	protected void analyse(String pakagesName) {
		for (String kind : getKinds()) {
			 try {
				 Class<?> clazz = Class.forName(pakagesName + "." + kind + SUFFIX);
				 if (clazz.getSuperclass() != null && 
						 AmazonWebServiceRequest.class.getName().equals(
						 clazz.getSuperclass().getName())) {
					 models.put(kind, pakagesName + "." + kind + SUFFIX);
				 }
			} catch (ClassNotFoundException e) {
				// ignore here
			}
		 }
	}

}
