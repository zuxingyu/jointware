/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.jointware.containers.handlers;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年3月12日
 */
public class KubernetesHandler extends AbstractHandler {

	@Override
	public void doHandle(Properties props) {
		@SuppressWarnings("unchecked")
		Map<String, Map<String, Object>> map = (Map<String, Map<String, Object>>) props.get(AbstractHandler.OBJECT);
		String tag = props.getProperty(AbstractHandler.TAG);
		// instances
		List<String> instance = (List<String>) map.get("main").get("instances");
	}

}
