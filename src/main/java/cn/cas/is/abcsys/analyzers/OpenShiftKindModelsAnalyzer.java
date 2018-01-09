/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys.analyzers;

import java.util.List;
import java.util.Set;

import cn.cas.is.abcsys.Constants;
import cn.cas.is.abcsys.KindModelsAnalyzer;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public class OpenShiftKindModelsAnalyzer extends KindModelsAnalyzer {

	private static OpenShiftKindModelsAnalyzer analyzer = null;
	
	@Override
	protected Set<String> getKinds() {
		return OpenShiftKindsAnalyzer.getAnalyzer().getKinds();
	}

	@Override
	protected List<String> getPackages() {
		packages.add(Constants.MODEL_OPENSHIFT_PACKAHE);
		this.initCommonsPackages();
		return packages;
	}
	
	public static KindModelsAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new OpenShiftKindModelsAnalyzer();
			} catch (Exception e) {
			}
		}
		return analyzer;
	}

}
