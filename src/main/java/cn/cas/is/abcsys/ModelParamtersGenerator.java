/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys;

import java.lang.reflect.Method;
import java.util.Map;

import io.fabric8.kubernetes.client.dsl.Createable;
import io.fabric8.kubernetes.client.dsl.MultiDeleteable;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public abstract class ModelParamtersGenerator {

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
		Createable instance = (Createable) generateKindModel(client, kind);
		Object param = generateParameters(params, kind);
		return instance.create(param);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object update(Object client, String kind, Map<String, Object> params) throws Exception {
		Createable instance = (Createable) generateKindModel(client, kind);
		Object param = generateParameters(params, kind);
		return instance.create(param);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean delete(Object client, String kind, Map<String, Object> params) throws Exception {
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
