/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.github.isdream.chameleon.commons.utils.StringUtils;

/**
 * The {@code KindsAnalyzer} class represents the relationship between kind name and kind description.
 * All kind object literals in Java programs can be instantiated by kind description.
 * <p>
 * Here, kind means a executable unit of a specified cloud java client, then we can manage the VM,
 * Container, OSS life cycle. 
 * <p>
 * 
 *  
 * 
 * @author henry(wuheng@otcaix.iscas.ac.cn) <br>
 *
 * 2018年1月3日 <br>
 * 
 *  对于Deployment的kind，是通过如下方式实例化的：  <br>
 *  DefaultKubernetesClient client = new DefaultKubernetesClient(); <br>
 *  client.extensions().deployments(). <br>
 *  则kinds需要记录的key是Deployment，value是extensions-deployments <br>
 *  
 *   <br> <br>
 *  又比 对于Pod的kind，是通过如下方式实例化的： <br>
 *  DefaultKubernetesClient client = new DefaultKubernetesClient(); <br>
 *  client.pods(). <br>
 *  则kinds需要记录的key是Pod，value是pods <br>
 * 
 */
public abstract class KindsAnalyzer {

	/**
	 * 用来记录所有的kind及其描述，所谓描述，是指该kind如何实例化
	 * 比如 deployment可如下获取
	 * DefaultKubernetesClient client = new DefaultKubernetesClient();
	 * client.extensions().deployments().
	 * 则kinds需要记录的key是deployment，value是extensions-deployments
	 * 
	 * 又比如Pod可以如下获取
	 * DefaultKubernetesClient client = new DefaultKubernetesClient();
	 * client.pods().
	 * 则kinds需要记录的key是pods，value是pod
	 */
	protected final Map<String, String> kinds = new HashMap<String, String>();
	
	/**
	 * 
	 */
	protected final static String DEFAULT_PARENT = "";
	
	/************************************************************************************
	 * 
	 *
	 * 
	 ************************************************************************************/

	/**
	 * @throws Exception 反射异常
	 */
	public KindsAnalyzer() {
		try {
			this.analyse(getClient(), DEFAULT_PARENT);
		} catch (Exception e) {
			// ignore here
		}
	}
	
	/**
	 * 分析出客户端(KubernetesClient，OpenShiftClient)的所有kind的类型
	 * 
	 * @param classname 类名
	 * @param parent 父节点
	 * @throws Exception 反射异常
	 */
	protected void analyse(String classname, String parent) throws Exception {
		Class<?> client = Class.forName(classname);
    	for (Method method : client.getMethods()) {
    		if (isKind(method)) {
    			kinds.put(toKind(method), getDesc(parent, method));
    		} else if (isKindGroup(method)) {
    			analyse(method.getReturnType().getName(), method.getName());
    		} else {
    			continue;
    		}
    	}
	}
	
	/**
	 * 获取指定客户端(KubernetesClient，OpenShiftClient)的所有的kind的类型
	 * kind比如Deployment，Pod等
	 * 
	 * @return 获取指定客户端(KubernetesClient，OpenShiftClient)的所有的kind的类型
	 */
	public Set<String> getKinds() {
		return kinds.keySet();
	}
	
	/**
	 * 获取kind的描述，以便后续可以通过反射进行实例化
	 * 比如kind是Deployment，desc是extensions-deployments
	 * 表示可以通过client.extensions().deployments()进行实例化
	 * 
	 * @param kind 具体kind类型
	 * @return 获取kind的描述，以便后续可以通过反射进行实例化
	 */
	public String getKindDesc(String kind) {
		return StringUtils.isNull(kind) ? null : kinds.get(kind);
	}
	
	
	/************************************************************************************
	 * 
	 * 
	 * 
	 ************************************************************************************/
	
	/**
	 * 
	 * @param method 方法名
	 * @return 方法名对应的kind
	 */
	protected abstract boolean isKind(Method method);
	
	/**
	 * 
	 * @param method 方法名
	 * @return 是不是kindGroup
	 */
	protected abstract boolean isKindGroup(Method method);
	
	/**
	 * @param method 名字
	 * @return 转换为kind的类型
	 */
	protected abstract String toKind(Method method);
	
	/**
	 * @param parent 父节点是什么
	 * @param method 方法名
	 * @return 描述
	 */
	protected abstract String getDesc(String parent, Method method);
	
	/**
	 * @return the client for the specified cloud
	 */
	protected abstract String getClient();
	
}
