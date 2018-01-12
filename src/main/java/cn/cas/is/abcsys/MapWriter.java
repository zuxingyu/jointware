/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import cn.cas.is.abcsys.analyzers.KubernetesKindModelsAnalyzer;
import cn.cas.is.abcsys.rules.Fabric8ModelParametersIgnoreRule;
import cn.cas.is.abcsys.rules.JavaObjectRule;
import cn.cas.is.abcsys.utils.ObjectUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @date 2018年1月12日
 *
 */
public class MapWriter {

	protected StringBuffer sb = new StringBuffer();

	public String yamlToMap(Object object) throws Exception {
		sb.append("\t").append("public static Map<String, Object> params = new HashMap<String, Object>();")
				.append("\n");
		this.write(object, "", false, "\t", "");
		return sb.toString();
	}

	@SuppressWarnings("unchecked")
	protected void write(Object object, String parent, boolean ignore, String indent, String type) throws Exception {
		Method[] methods = object.getClass().getMethods();
		for (Method method : methods) {
			if (Fabric8ModelParametersIgnoreRule.ignore(method.getName()) || method.getParameterCount() != 0) {
				continue;
			}

			Object thisObject = method.invoke(object);
			if (ObjectUtils.isNull(thisObject)) {
				continue;
			}

			if (!method.getName().startsWith("get")) {
				continue;
			}
			
			String typeName = method.getGenericReturnType().getTypeName();
			String str = "".equals(parent) ? method.getName().replace("get", "set") : parent + "-" + method.getName().replace("get", "set");
			if (JavaObjectRule.isPrimitive(typeName)) {
				
				if (ignore) {
					sb.append(indent).append("put(\"" + str + "\", \""
							+ thisObject + "\");").append("\n");
				} else {
					sb.append(indent).append("params.put(\"" + str + "\", \"" + thisObject + "\");").append("\n");
				}
			} else if (JavaObjectRule.isStringMap(typeName)) {

				Map<String, String> map = (Map<String, String>) thisObject;

				if (map.isEmpty()) {
					continue;
				}

				sb.append(indent).append("params.put(\"" + str + "\", new HashMap<String, String>() {").append("\n");
				sb.append(indent).append("\t").append("{").append("\n");

				for (String key : map.keySet()) {
					sb.append(indent).append("\t").append("\t")
							.append("put(\"" + key + "\", \"" + map.get(key) + "\");").append("\n");
				}
				sb.append(indent).append("\t").append("}").append("\n");
				sb.append(indent).append("});").append("\n");
				continue;
			} else if (JavaObjectRule.isMap(typeName)) {
				
				Map<String, Object> map = new HashMap<String, Object>();
				if (map.isEmpty()) {
					continue;
				}
				System.out.println("I am Map<String, Object>.");
				for (String name : map.keySet()) {
					System.out.println(name + "=" + map.get(name));
				}

			} else if (JavaObjectRule.isStringList(typeName)) {

				List<String> list = (List<String>) thisObject;
				if (list.isEmpty()) {
					continue;
				}

				sb.append(indent).append("params.put(\"" + str + "\", new ArrayList<Object>() {").append("\n");
				sb.append(indent).append("\t").append("{").append("\n");

				for (String value : list) {
					sb.append(indent).append("\t").append("\t").append("add(\"" + value + "\");").append("\n");
				}
				sb.append(indent).append("\t").append("}").append("\n");
				sb.append(indent).append("});").append("\n");
				continue;
			} else if (JavaObjectRule.isList(typeName)) {
				System.out.println("I am List<Object>." + method.getName());
				List<Object> list = (List<Object>) thisObject;
				if (list.isEmpty()) {
					continue;
				}

				sb.append(indent).append("params.put(\"" + str + "\", new ArrayList<Object>() {").append("\n");
				sb.append(indent).append("\t").append("{").append("\n");
				String temp = indent;
				
				sb.append(indent).append("add(new HashMap<String, Object>() {").append("\n");
				sb.append(indent).append("\t").append("{").append("\n");
				indent = indent + "\t\t";
				
				for (Object obj : list) {
					this.write(obj, "", true, indent, "Map");
				}
				
				indent = temp;
				sb.append(indent).append("\t").append("}").append("\n");
				sb.append(indent).append("});").append("\n");
				
				sb.append(indent).append("\t").append("}").append("\n");
				sb.append(indent).append("});").append("\n");

			} else {
				
//				if (ignore) {
//					sb.append(indent).append("\t").append("add(new HashMap<String, Object>() {").append("\n");
//					sb.append(indent).append("\t").append("\t").append("{").append("\n");
//					
//					sb.append(indent).append("\t").append("\t").append("}").append("\n");
//					sb.append(indent).append("\t").append("});").append("\n");
//				}
				
				if ("".equals(parent)) {
					write(thisObject, method.getName().replace("get", "set"), false, "\t", "");
				} else {
					write(thisObject, str, false, "\t", "");
				}
			}
		}
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName(KubernetesKindModelsAnalyzer.getAnalyzer().getKindModel(Constants.YAML_DEPLOYMENT));
		Yaml yaml = new Yaml();
		Object obj = yaml.loadAs(new FileInputStream(new File("examples/controllers/busybox-dm.yaml")), clazz);

		MapWriter writer = new MapWriter();
		System.out.println(writer.yamlToMap(obj));
	}

}
