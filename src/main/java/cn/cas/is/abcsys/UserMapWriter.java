/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import cn.cas.is.abcsys.rules.Fabric8ModelParametersIgnoreRule;
import cn.cas.is.abcsys.rules.JavaObjectRule;
import cn.cas.is.abcsys.utils.ObjectUtils;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @date 2018年1月12日
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
	
	protected StringBuffer initInstance() {
		StringBuffer sb = new StringBuffer();
		return sb.append(INDENT_TAB).append(NEW_PARAMS).append(INDENT_NEWLINE);
	}
	
	
	// 下一个版本再优化
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
					initObjectList(parent, style, indent, sb, method, list);
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
			this.initParameters(map.get(key), DEFAULT_PARENT, STYLE_JUST_PUT, 
											indent + INDENT_TAB + INDENT_TAB, sb);
		}

		sb.append(indent).append(TAG_RIGHT_ANGLE_BRACKE).append(INDENT_NEWLINE);
		sb.append(indent).append(TAG_END_HASHMAP).append(INDENT_NEWLINE);
	}



	protected void initObjectList(String parent, String style, String indent, StringBuffer sb, Method method,
			List<Object> list) throws Exception {
		sb.append(indent).append(getPrefix(style)).append(TAG_LEFT_BRACKET).append(getThisParam(parent, method))
														.append(TAG_START_ARRAYLIST_OBJECT).append(INDENT_NEWLINE);
		sb.append(indent).append(TAG_LEFT_ANGLE_BRACKE).append(INDENT_NEWLINE);
		sb.append(indent).append(TAG_ADD_HASHMAP).append(INDENT_NEWLINE);
		sb.append(indent).append(INDENT_TAB).append(INDENT_TAB)
						.append(TAG_LEFT_ANGLE_BRACKE).append(INDENT_NEWLINE);

		for (Object obj : list) {
			this.initParameters(obj, DEFAULT_PARENT, STYLE_JUST_PUT, 
					indent+INDENT_TAB+INDENT_TAB+INDENT_TAB+INDENT_TAB, sb);
		}
		
		sb.append(indent).append(INDENT_TAB).append(INDENT_TAB)
						.append(TAG_RIGHT_ANGLE_BRACKE).append(INDENT_NEWLINE);
		sb.append(indent).append(INDENT_TAB).append(INDENT_TAB)
								.append(TAG_END_HASHMAP).append(INDENT_NEWLINE);
		
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
		
		sb.append(indent).append(getPrefix(style) + TAG_LEFT_BRACKET + getThisParam(parent, method) 
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
	
	protected static String getThisParam(String parent, Method method) {
		return (DEFAULT_PARENT.equals(parent)) ? "get" + method.getName().substring(3)
												: parent + "-" + method.getName().replace("get", "set");
	}
	

	protected String getPrefix(String style) throws Exception {
		String prefix = null;
		if (STYLE_JUST_PUT.equals(style)) {
			prefix = STYLE_JUST_PUT;
		} else if (STYLE_PARAM_PUT.equals(style)){
			prefix = STYLE_PARAM_PUT;
		} else {
			throw new Exception("Unsupport type.");
		}
		return prefix;
	}
	
	/*******************************************************************	
	 *  
	 *                          Others
	 *
	 *******************************************************************/
	
	protected static boolean isGetMethod(Method method) {
		return (method.getName().startsWith("get") 
				&& method.getParameterCount() == 0) ? true : false;
	}
	
	
	protected static boolean ignore(Method method) {
		return Fabric8ModelParametersIgnoreRule.ignore(method.getName());
	}

}
