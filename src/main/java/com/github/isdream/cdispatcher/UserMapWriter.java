/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.isdream.cdispatcher.rules.Fabric8ModelParametersIgnoreRule;
import com.github.isdream.cdispatcher.rules.JavaObjectRule;
import com.github.isdream.cdispatcher.utils.ObjectUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * 2018年1月12日
 *
 */
public class UserMapWriter {

	public final static String DEFAULT_PARENT = "";
	
	public final static String NEW_PARAMS = "public static Map<String, Object> params = new HashMap<String, Object>();";
	
	public final static String INDENT_TAB = "\t";
	
	public final static String INDENT_NEWLINE = "\n";
	
	public final static String INDENT_LEFT_ANGLE_BRACKE = "{\"";
	
	public final static String INDENT_ANGLE_BRACKE = "(\"";
	
	public final static String STYLE_PARAM_PUT = "params.put";
	
	public final static String STYLE_JUST_PUT = "put";
	
	public final static String STYLE_JUST_ADD = "add";
	
	public final static String TAG_LEFT_BRACKET =  "(\"";
	
	public final static String TAG_MIDDLE_BRACKET =  "\", \"";
	
	public final static String TAG_MIDDLE_BRACKET2 =  "\", ";
	
	public final static String TAG_RIGHT_BRACKET =  "\");";
	
	public final static String TAG_RIGHT_BRACKET2 =  ");";
	
	public final static String TAG_START_HASHMAP = "\", new HashMap<String, String>() {";
	
	public final static String TAG_START_HASHMAP_OBJECT = "\", new HashMap<String, Object>() {";
	
	public final static String TAG_ADD_HASHMAP ="\t\tadd(new HashMap<String, Object>() {";
	
	public final static String TAG_END_HASHMAP = "});";
	
	public final static String TAG_START_ARRAYLIST = "\", new ArrayList<String>() {";
	
	public final static String TAG_START_ARRAYLIST_OBJECT = "\", new ArrayList<Object>() {";
	
	public final static String TAG_END_ARRAYLIST = "});";
	
	public final static String TAG_LEFT_ANGLE_BRACKE = "\t{";
	
	public final static String TAG_RIGHT_ANGLE_BRACKE = "\t}";
	
	public final static Map<String, String> cases = new HashMap<String, String>();
	
	static {
		//setSpec-setStrategy-setRollingUpdate-setMaxSurge-setStrVal
		//setTargetPort-setStrVal
		//setSpec-setStrategy-setRollingUpdate-setMaxUnavailable-setStrVal
		cases.put("setSpec-setStrategy-setRollingUpdate-setMaxSurge-setStrVal", "setSpec-setStrategy-setRollingUpdate-setMaxSurge-setIntVal");
		cases.put("setSpec-setStrategy-setRollingUpdate-setMaxUnavailable-setStrVal", "setSpec-setStrategy-setRollingUpdate-setMaxUnavailable-setIntVal");
		cases.put("setTargetPort-setStrVal", "setTargetPort-setIntVal");
	}
	
	/**
	 * @param object YAML对象
	 * @return Map对象
	 * @throws Exception 反射异常
	 */
	public String yamlToMap(Object object) throws Exception {
		
		if (ObjectUtils.isNull(object)) {
			return null;
		}
		
		StringBuffer sb = initInstance();
		initParameters(object, DEFAULT_PARENT, STYLE_PARAM_PUT, INDENT_TAB, sb);
		return sb.toString();
	}


	
	/*******************************************************************	
	 *  
	 *                          Init method
	 *
	 *******************************************************************/
	
	/**
	 * @return Map的组成
	 */
	protected StringBuffer initInstance() {
		StringBuffer sb = new StringBuffer();
		return sb.append(INDENT_TAB).append(NEW_PARAMS).append(INDENT_NEWLINE);
	}
	
	
	// 下一个版本再优化
	/**
	 * @param object 对象
	 * @param parent 父节点
	 * @param style 类型
	 * @param indent 缩进
	 * @param sb 字符集
	 * @return Map的组成
	 * @throws Exception 反射异常
	 */
	@SuppressWarnings("unchecked")
	protected StringBuffer initParameters(Object object, 
					String parent, String style, 
					String indent, StringBuffer sb) throws Exception {
		
		Method[] methods = object.getClass().getMethods();
		
		for (Method method : methods) {
			
			if (!isGetMethod(method) || ignore(method)) {
				continue;
			}

			Object thisValue = method.invoke(object);
			
			if (ObjectUtils.isNull(thisValue)) {
				continue;
			}
			
			String typeName = method.getGenericReturnType().getTypeName();
			
			
			if (JavaObjectRule.isPrimitive(typeName)) {
				// 基本类型
				if (typeName.equals("String") || typeName.equals(String.class.getName())) {
					initPrimitive1(parent, style, indent, sb, method, thisValue);
				} else {
					initPrimitive2(parent, style, indent, sb, method, thisValue);
				}
			} else if (JavaObjectRule.isStringMap(typeName)) {
				// Map<String, String>类型
				Map<String, String> map = (Map<String, String>) thisValue;
				if (!map.isEmpty()) {
					initStringMap(parent, style, indent, sb, method, map);
				}
				continue;
			} else if (JavaObjectRule.isMap(typeName)) {
				// Map<String, Object>类型
				Map<String, Object> map = (Map<String, Object>) thisValue;
				if (!map.isEmpty()) {
					initObjectMap(parent, style, indent, sb, method, map);
				}

			} else if (JavaObjectRule.isStringList(typeName)) {
				// List<String>类型
				List<String> list = (List<String>) thisValue;
				if (!list.isEmpty()) {
					initStringList(parent, style, indent, sb, method, list);
				}
				continue;
			} else if (JavaObjectRule.isList(typeName)) {
				// List<Object>类型
				List<Object> list = (List<Object>) thisValue;
				if (!list.isEmpty()) {
					initObjectList(parent, style, indent, sb, method, list, false);
				}
			} else {
				// Object类型
				initParameters(thisValue, getThisParam(parent, method), style, indent, sb);
			}
		}
		
		return sb;
	}



	protected void initObjectMap(String parent, String style, String indent, StringBuffer sb, Method method,
			Map<String, Object> map) throws Exception {
		sb.append(indent).append(getPrefix(style) + TAG_LEFT_BRACKET + getThisParam(parent, method) 
														+ TAG_START_HASHMAP_OBJECT).append(INDENT_NEWLINE);
		sb.append(indent).append(TAG_LEFT_ANGLE_BRACKE).append(INDENT_NEWLINE);

		
		for (String key : map.keySet()) {
			List<Object> list = new ArrayList<Object>();
			list.add(map.get(key));
			initObjectList(key, STYLE_JUST_PUT, 
					indent + INDENT_TAB + INDENT_TAB, sb, method, list, true);
		}
		
		sb.append(indent).append(TAG_RIGHT_ANGLE_BRACKE).append(INDENT_NEWLINE);
		sb.append(indent).append(TAG_END_HASHMAP).append(INDENT_NEWLINE);
	}
	
	
	protected void initObjectList(String parent, String style, String indent, StringBuffer sb, Method method,
			List<Object> list, boolean direct) throws Exception {
		if (!direct) {
			sb.append(indent).append(getPrefix(style)).append(TAG_LEFT_BRACKET).append(getThisParam(parent, method))
														.append(TAG_START_ARRAYLIST_OBJECT).append(INDENT_NEWLINE);
		} else {
			sb.append(indent).append(getPrefix(style)).append(TAG_LEFT_BRACKET).append(parent)
														.append(TAG_START_ARRAYLIST_OBJECT).append(INDENT_NEWLINE);
		}
		sb.append(indent).append(TAG_LEFT_ANGLE_BRACKE).append(INDENT_NEWLINE);

		for (Object obj : list) {
			
			sb.append(indent).append(TAG_ADD_HASHMAP).append(INDENT_NEWLINE);
			sb.append(indent).append(INDENT_TAB).append(INDENT_TAB)
							.append(TAG_LEFT_ANGLE_BRACKE).append(INDENT_NEWLINE);
			
			this.initParameters(obj, DEFAULT_PARENT, STYLE_JUST_PUT, 
					indent+INDENT_TAB+INDENT_TAB+INDENT_TAB+INDENT_TAB, sb);
			
			sb.append(indent).append(INDENT_TAB).append(INDENT_TAB)
						.append(TAG_RIGHT_ANGLE_BRACKE).append(INDENT_NEWLINE);
			sb.append(indent).append(INDENT_TAB).append(INDENT_TAB)
					.append(TAG_END_HASHMAP).append(INDENT_NEWLINE);
		}
		
		
		
		sb.append(indent).append(TAG_RIGHT_ANGLE_BRACKE).append(INDENT_NEWLINE);
		sb.append(indent).append(TAG_END_ARRAYLIST).append(INDENT_NEWLINE);
	}

	protected void initStringList(String parent, String style, String indent, 
												StringBuffer sb, Method method,
												List<String> list) throws Exception {
		
		sb.append(indent).append(getPrefix(style) + TAG_LEFT_BRACKET + getThisParam(parent, method) 
															+ TAG_START_ARRAYLIST).append(INDENT_NEWLINE);
		sb.append(indent).append(TAG_LEFT_ANGLE_BRACKE).append(INDENT_NEWLINE);

		for (String value : list) {
			sb.append(indent).append(INDENT_TAB).append(INDENT_TAB)
							.append(STYLE_JUST_ADD).append(INDENT_ANGLE_BRACKE).append(value)
							.append(TAG_RIGHT_BRACKET).append(INDENT_NEWLINE);
		}
		
		sb.append(indent).append(TAG_RIGHT_ANGLE_BRACKE).append(INDENT_NEWLINE);
		sb.append(indent).append(TAG_END_ARRAYLIST).append(INDENT_NEWLINE);
	}

	protected void initStringMap(String parent, String style,
						String indent, StringBuffer sb, Method method,
						Map<String, String> map) throws Exception {
		sb.append(indent).append(getPrefix(style) + TAG_LEFT_BRACKET + getThisParam(parent, method) 
															+ TAG_START_HASHMAP).append(INDENT_NEWLINE);
		sb.append(indent).append(TAG_LEFT_ANGLE_BRACKE).append(INDENT_NEWLINE);

		for (String key : map.keySet()) {
			sb.append(indent).append(INDENT_TAB).append(INDENT_TAB)
					.append(STYLE_JUST_PUT).append(INDENT_ANGLE_BRACKE).append(key)
					.append(TAG_MIDDLE_BRACKET).append(map.get(key)).append(TAG_RIGHT_BRACKET).append(INDENT_NEWLINE);
		}
		
		sb.append(indent).append(TAG_RIGHT_ANGLE_BRACKE).append(INDENT_NEWLINE);
		sb.append(indent).append(TAG_END_HASHMAP).append(INDENT_NEWLINE);
	}

	protected void initPrimitive1(String parent, String style, 
			String indent, StringBuffer sb, Method method, Object thisValue) throws Exception {
		
		String thisParam = getThisParam(parent, method);
		//setSpec-setStrategy-setRollingUpdate-setMaxSurge-setStrVal
		//setTargetPort-setStrVal
//		if (cases.keySet().contains(thisParam)) {
//			sb.append(indent).append(getPrefix(style) + TAG_LEFT_BRACKET + cases.get(thisParam) 
//					+ TAG_MIDDLE_BRACKET2 + thisValue + TAG_RIGHT_BRACKET2).append(INDENT_NEWLINE);
//			return;
//		}
		
		if (thisParam.endsWith("setStrVal")) {
			sb.append(indent).append(getPrefix(style) + TAG_LEFT_BRACKET + thisParam.substring(0, thisParam.length() - "setStrVal".length()) + "setIntVal" 
								+ TAG_MIDDLE_BRACKET2 + thisValue + TAG_RIGHT_BRACKET2).append(INDENT_NEWLINE);
			return;
		}
		
		sb.append(indent).append(getPrefix(style) + TAG_LEFT_BRACKET + thisParam 
        					+ TAG_MIDDLE_BRACKET + thisValue + TAG_RIGHT_BRACKET).append(INDENT_NEWLINE);
	}
	
	protected void initPrimitive2(String parent, String style, 
			String indent, StringBuffer sb, Method method, Object thisValue) throws Exception {
		
		sb.append(indent).append(getPrefix(style) + TAG_LEFT_BRACKET + getThisParam(parent, method) 
        					+ TAG_MIDDLE_BRACKET2 + thisValue + TAG_RIGHT_BRACKET2).append(INDENT_NEWLINE);
	}

	/*******************************************************************	
	 *  
	 *                          Getter method
	 *
	 *******************************************************************/
	
	/**
	 * @param parent 父节点
	 * @param method 方法名
	 * @return 字符串
	 */
	protected static String getThisParam(String parent, Method method) {
		if (!method.getName().startsWith("get")) {
			return parent;
		}
		return (DEFAULT_PARENT.equals(parent)) ? "set" + method.getName().substring(3)
												: parent + "-set" + method.getName().substring(3);
	}
	
	/**
	 * @param name 名字
	 * @return 类型
	 */
	protected String getParentForMapStyle(String name) {
		int idx = name.indexOf(".");
		return (idx == -1) ? name : name.substring(0, idx);
	}
	

	/**
	 * @param style 类型
	 * @return 前缀
	 * @throws Exception 反射异常
	 */
	protected String getPrefix(String style) throws Exception {
		String prefix = null;
		if (STYLE_JUST_PUT.equals(style)) {
			prefix = STYLE_JUST_PUT;
		} else if (STYLE_PARAM_PUT.equals(style)){
			prefix = STYLE_PARAM_PUT;
		}  else if (STYLE_JUST_ADD.equals(style)){
			prefix = STYLE_JUST_ADD;
		}
		else {
			throw new Exception("Unsupport type.");
		}
		return prefix;
	}
	
	/*******************************************************************	
	 *  
	 *                          Others
	 *
	 *******************************************************************/
	
	/**
	 * @param method 方法名
	 * @return 是否是get方法
	 */
	protected static boolean isGetMethod(Method method) {
		return (method.getName().startsWith("get") 
				&& method.getParameterCount() == 0) ? true : false;
	}
	
	
	/**
	 * @param method 方法名
	 * @return 是否忽略
	 */
	protected static boolean ignore(Method method) {
		return Fabric8ModelParametersIgnoreRule.ignore(method.getName());
	}

}
