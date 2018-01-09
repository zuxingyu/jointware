/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import cn.cas.is.abcsys.utils.ObjectUtils;
import cn.cas.is.abcsys.utils.StringUtils;
import io.fabric8.kubernetes.client.dsl.Createable;
import io.fabric8.kubernetes.client.dsl.MultiDeleteable;
import io.fabric8.kubernetes.client.dsl.Nameable;
import io.fabric8.kubernetes.client.dsl.Namespaceable;
import io.fabric8.kubernetes.client.dsl.Scaleable;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public abstract class ModelParamtersGenerator {

	private final static Set<String> workloadControllers = new HashSet<String>();
	
	static {
		workloadControllers.add("Deployment");
		workloadControllers.add("ReplicationController");
		workloadControllers.add("Job");
		workloadControllers.add("ReplicaSet");
		workloadControllers.add("StatefulSet");
		workloadControllers.add("DeploymentConfig");
	}
	
	protected Object kindModel = null;
	
	/**
	 * @param client kubernetes or OpenShit client
	 * @param kind Deployment, Namespace, etcd
	 * @param params see <code>ModelParamtersViewer.printModel3<code>
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object create(Object client, String kind, Map<String, Object> params) throws Exception {
		if (ObjectUtils.isNull(params) || ObjectUtils.isNull(client) || StringUtils.isNull(kind)) {
			throw new Exception("neither name or namespace is null,  or the number is less than 0.");
		}
		
		Createable instance = (Createable) generateKindModel(client, kind);
		Object param = generateParameters(params, kind);
		return instance.create(param);
	}
	
	/**
	 * 扩展/缩小实例数,这里的numbers是指扩展后，或者收缩后的实例数。
	 * 比如当前实例数为2，如果numberes填写4，则执行后有4个pods
	 * 反之，如果numbers填写1， ，则执行后仅有4个pods
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
	 * @param client
	 * @param kind
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public Object scaleTo(Object client, String kind, String namespace, String name, int numbers) throws Exception {
		if (StringUtils.isNull(namespace) || StringUtils.isNull(namespace) || numbers <= 0 || numbers >= Integer.MAX_VALUE) {
			throw new Exception("neither name or namespace is null,  or the number is less than 0.");
		}
		
		if(!workloadControllers.contains(kind) ) {
			throw new Exception("Unsupport kind, kind should be " + workloadControllers);
		}
		
		Namespaceable instance = (Namespaceable) generateKindModel(client, kind);
		return ((Scaleable)((Nameable)instance.inNamespace(namespace)).withName(name)).scale(numbers);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean delete(Object client, String kind, Map<String, Object> params) throws Exception {
		if (ObjectUtils.isNull(params) || ObjectUtils.isNull(client) || StringUtils.isNull(kind)) {
			throw new Exception("neither name or namespace is null,  or the number is less than 0.");
		}
		MultiDeleteable instance = (MultiDeleteable) generateKindModel(client, kind);
		Object param = generateParameters(params, kind);
		return (boolean) instance.delete(param);
	}
	
	protected Object getKindModel(Object client, String desc) throws Exception {
		Object obj = client;
		for (String name : desc.split("-")) {
			Method method = obj.getClass().getMethod(name);
			obj = method.invoke(obj);
		}
		return obj;
	}
	
	protected abstract Object generateKindModel(Object client, String kind) throws Exception;
	
	protected abstract Object generateParameters(Map<String, Object> params, String kind) throws Exception;
	
	protected abstract Method getCreateMethod(Object client, String kind) throws Exception;
}
