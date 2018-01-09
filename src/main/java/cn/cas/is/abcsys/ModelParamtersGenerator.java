/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys;

import java.lang.reflect.Method;
import java.util.Map;

import io.fabric8.kubernetes.client.dsl.Createable;

/**
 * @author henry
 * @email  wuheng@otcaix.iscas.ac.cn
 *
 * @date   2018年1月3日
 */
public abstract class ModelParamtersGenerator {

	protected Object kind = null;
	
	protected Object kindModel = null;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object generate(Object client, String kind, Map<String, Object> params) throws Exception {
		Createable object = (Createable) getKindObject(client, kind);
		Object param = getParameter(params, kind);
		return object.create(param);
	}
	
	protected Object getKindModel(Object client, String desc) throws Exception {
		Object obj = client;
		for (String name : desc.split("-")) {
			Method method = obj.getClass().getMethod(name);
			obj = method.invoke(obj);
		}
		return obj;
	}
	
	protected abstract Object getKindObject(Object client, String kind) throws Exception;
	
	protected abstract Object getParameter(Map<String, Object> params, String kind) throws Exception;
	
	protected abstract Method getCreateMethod(Object client, String kind) throws Exception;
}
