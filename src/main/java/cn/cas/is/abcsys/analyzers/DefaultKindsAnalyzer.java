/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cas.is.abcsys.wukong.analyzers;

import java.lang.reflect.Method;

import cas.is.abcsys.wukong.KindsAnalyzer;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public class DefaultKindsAnalyzer extends OpenShiftKindsAnalyzer {

	private static DefaultKindsAnalyzer analyzer = null;
	
	protected DefaultKindsAnalyzer() throws Exception {
		super();
	}

	@Override
	protected boolean isKind(Method method) {
		return false;
	}

	@Override
	protected boolean isKindGroup(Method method) {
		return false;
	}

	@Override
	protected String toKind(String name) {
		return "";
	}

	@Override
	protected String getDesc(String parent, String name) {
		return "";
	}

	@Override
	protected String getClient() {
		return "";
	}
	
	public static KindsAnalyzer getAnalyzer() {
		if(analyzer == null) {
			try {
				analyzer = new DefaultKindsAnalyzer();
			} catch (Exception e) {
				// ignore here
			}
		}
		return analyzer;
	}

}
