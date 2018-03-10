/**
 * Copyright (2018-2019) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.kubernetes;

import com.github.isdream.jointware.core.ModelGenerator;
import com.github.isdream.jointware.core.ModelParameterAnalyzer;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月8日
 */
public class OpenshiftModelGenerator extends ModelGenerator {

	protected final static OpenshiftModelParameterAnalyzer 
						analyzer = new OpenshiftModelParameterAnalyzer();
	
	public OpenshiftModelGenerator() {
		super();
	}

	public OpenshiftModelGenerator(String objectRef) {
		super(objectRef);
	}
	
	@Override
	public ModelParameterAnalyzer getModelParameter() {
		return analyzer;
	}

}
