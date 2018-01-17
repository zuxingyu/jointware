/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.github.isdream.cdispatcher.utils.ObjectUtils;
import com.github.isdream.cdispatcher.utils.StringUtils;

import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.client.dsl.CreateOrReplaceable;
import io.fabric8.kubernetes.client.dsl.Createable;
import io.fabric8.kubernetes.client.dsl.Deletable;
import io.fabric8.kubernetes.client.dsl.Listable;
import io.fabric8.kubernetes.client.dsl.Nameable;
import io.fabric8.kubernetes.client.dsl.Namespaceable;
import io.fabric8.kubernetes.client.dsl.Scaleable;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public abstract class ModelParamtersGenerator {

	private final static Set<String> workloadControllers = new HashSet<String>();
	
	private final static String IGNORE_NAMESPACE = "ignore.namespace";
	
	static {
		workloadControllers.add("Deployment");
		workloadControllers.add("ReplicationController");
		workloadControllers.add("Job");
		workloadControllers.add("ReplicaSet");
		workloadControllers.add("StatefulSet");
		workloadControllers.add("DeploymentConfig");
	}
	
	protected Object kindModel = null;
	
	protected Map<String, String> paramTypes = null;
	
	/**
	 * 根据 用户 需要 发布的kind（如 Deployment, StatefulSet等），以及用户指定的key, value对params
	 * 向指定的Kubernetes和OpenShift进行部署
	 * 
	 * 如果名字存在重名，则发布失败，
	 * 
	 * 如果输入参数有问题，则会返回异常，通常包括空指针异常、无该方法可反射等异常
	 * 
	 * 此外，该方法适用于所有的kind，详情见https://github.com/is-dream/cluster-dispatcher/blob/master/docs/yaml-kinds.md
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object create(Object client, String kind, Map<String, Object> params) throws Exception {
		if (ObjectUtils.isNull(params) || ObjectUtils.isNull(client) || StringUtils.isNull(kind)) {
			throw new Exception("neither name or namespace is null,  or the number is less than 0.");
		}
		
		Createable instance = (Createable) getKindModel(client, kind);
		Object param = generateParameters(params, kind);
		return instance.create(param);
	}
	
	/**
	 * 根据 用户 需要 发布的kind（如 Deployment, StatefulSet等），以及用户指定的key, value对params
	 * 向指定的Kubernetes和OpenShift进行部署
	 * 
	 * 如果名字存在重名，则会替换，不会报错。
	 * 
	 * 如果输入参数有问题，则会返回异常，通常包括空指针异常、无该方法可反射等异常
	 * 
	 * 此外，该方法适用于所有的kind，详情见https://github.com/is-dream/cluster-dispatcher/blob/master/docs/yaml-kinds.md
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object createOrReplace(Object client, String kind, Map<String, Object> params) throws Exception {
		if (ObjectUtils.isNull(params) || ObjectUtils.isNull(client) || StringUtils.isNull(kind)) {
			throw new Exception("neither name or namespace is null,  or the number is less than 0.");
		}
		
		CreateOrReplaceable instance = (CreateOrReplaceable) getKindModel(client, kind);
		Object param = generateParameters(params, kind);
		
		return instance.createOrReplace(param);
	}
	
	/**
	 * 根用户 向指定的Kubernetes和OpenShift发起发送扩容/缩容请求，必须满足特定类型、namespace和name
	 * 
	 * 这里的名是指Metedata.name的名字
	 * 
	 * 扩展/缩小实例数,这里的numbers是指扩展后，或者收缩后的实例数。
	 * 
	 * 比如当前实例数为2，
	 *  - 如果numberes填写4，则执行后有4个pod
	 *  - 反之，如果numbers填写1， 则执行后仅有1个pod
	 * 
	 * 仅仅对以下kind有效 <br>
	 * 
	 * - Deployment  <br>
	 * - ReplicationController  <br>
	 * - Job  <br>
	 * - ReplicaSet  <br>
	 * - StatefulSet  <br>
	 * - DeploymentConfig  <br>
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public Object scaleTo(Object client, String kind, String namespace, String name, int numbers) throws Exception {
		if (ObjectUtils.isNull(client) || StringUtils.isNull(kind) || 
				StringUtils.isNull(namespace) || StringUtils.isNull(name) || numbers <= 0 || numbers >= Integer.MAX_VALUE) {
			throw new Exception("neither name or namespace is null,  or the number is less than 0.");
		}
		
		if(!workloadControllers.contains(kind) ) {
			throw new Exception("Unsupport kind, kind should be " + workloadControllers);
		}
		
		Namespaceable instance = (Namespaceable) getKindModel(client, kind);
		return ((Scaleable)((Nameable)instance.inNamespace(namespace)).withName(name)).scale(numbers);
	}
	
	public Object query(Object client, String kind, String name) throws Exception {
		return this.query(client, kind, IGNORE_NAMESPACE, name);
	}
	/**
	 * 根用户 向指定的Kubernetes和OpenShift进行查询，必须满足特定类型、namespace和name
	 * 
	 * 这里的名是指Metedata.name的名字
	 * 
	 * 返回的是指定类型的对象
	 * 
     * 此外，该方法适用于所有的kind，详情见https://github.com/is-dream/cluster-dispatcher/blob/master/docs/yaml-kinds.md
	 */
	@SuppressWarnings("rawtypes")
	public Object query(Object client, String kind, String namespace, String name) throws Exception {
		if (ObjectUtils.isNull(client) || StringUtils.isNull(namespace) || StringUtils.isNull(name)) {
			throw new Exception("client, or kind, or name, or namespace is null.");
		}
		
		Object instance = getKindModel(client, kind);
		
		if (instance instanceof Namespaceable) {
			instance = ((Namespaceable)instance).inNamespace(namespace);
		} else if (!namespace.equals(IGNORE_NAMESPACE)) {
			throw new Exception("invalid namespace");
		}
		
		instance =  ((Listable)instance).list();
		
		for (Object obj : ((KubernetesResourceList)instance).getItems()) {
			if (name.equals(((HasMetadata)obj).getMetadata().getName())) {
				return obj;
			}
		}
		return null;
	}
	
	
	/**
	 * 删除不需要namespace的资源，比如Namespace自身
	 */
	public boolean delete(Object client, String kind, String name) throws Exception {
		return delete(client, kind, IGNORE_NAMESPACE, name);
	}
	
	/**
	 * 删除需要namespace的资源，比如Deployment、Job等
	 */
	@SuppressWarnings("rawtypes")
	public boolean delete(Object client, String kind, String namespace, String name) throws Exception {
		if (ObjectUtils.isNull(client) || StringUtils.isNull(namespace) || StringUtils.isNull(name)) {
			throw new Exception("client, or kind, or name, or namespace is null.");
		}
		Object instance = getKindModel(client, kind);
		
		if (instance instanceof Namespaceable) {
			instance = ((Namespaceable)instance).inNamespace(namespace);
		} else if (!namespace.equals(IGNORE_NAMESPACE)) {
			throw new Exception("invalid namespace");
		}
		
		return (boolean) ((Deletable)((Nameable)instance).withName(name)).delete();
	}
	
	
	public abstract Object getKindModel(Object client, String kind) throws Exception;
	
	public abstract Object generateParameters(Map<String, Object> params, String kind) throws Exception;
	
	protected abstract Method getCreateMethod(Object client, String kind) throws Exception;
}
