/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.commons.rules;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月19日
 */
public class ListClassFromSpecifiedPackageRule {

	/**
	 * @param pkg packageName
	 * @param postfixs 后缀
	 * @return proxy方法名
	 */
	public static String generate(String pkg, List<String> postfixs) {
		StringBuffer sb = new StringBuffer();
		Set<String> classSet = listAllClasses(pkg, true);
		for (String fullname : classSet) {
			boolean ignore = true;
			for (String postfix : postfixs) {
				if (fullname.endsWith(postfix)) {
					ignore = false;
					break;
				}
			}
			
			if (!ignore) {
				sb.append("\t/**").append("\n");
				sb.append("\t * @return ").append(fullname).append("\n");
				sb.append("\t */").append("\n");
				int idx = fullname.lastIndexOf(".");
				sb.append("\t")
					.append("public ")
					.append(fullname)
					.append(" proxy")
					.append(fullname.substring(idx + 1))
					.append("() {")
					.append("\n");
				sb.append("\t")
					.append("\t")
					.append("return new ")
					.append(fullname)
					.append("();")
					.append("\n");
				sb.append("\t}")
				    .append("\n");
				sb.append("\n").append("\n");
			}
		}
		return sb.toString();
	}
	
	/**
	 * 获取某包下所有类
	 * @param packageName 包名
	 * @param isRecursion 是否遍历子包
	 * @param suffixstr 后綴名
	 * @return 类的完整名称
	 * @throws Exception 
	 */
	public static Set<String> listAllClasses(String packageName, 
									boolean isRecursion) {
		URL url = Thread.currentThread().getContextClassLoader()
							.getResource(packageName.replace(".", "/"));
		try {
			String protocol = url.getProtocol();
			if (protocol.equals("file")) {
				return getClassNameFromDir(url.getPath(), 
											packageName, 
											isRecursion);
			} else if (protocol.equals("jar")) {
                return getClassNameFromJar(((JarURLConnection) 
                							url.openConnection()).getJarFile().entries(), 
                							packageName, 
                							isRecursion);
			}
		} catch (Exception e) {
			// ignore here
		}
		
		return new HashSet<String>();
	}

	/**
	 * 从项目文件获取某包下所有类
	 * @param filePath 文件路径
	 * @param className 类名集合
	 * @param isRecursion 是否遍历子包
	 * @param suffixstr 後綴名
	 * @return 类的完整名称
	 */
	private static Set<String> getClassNameFromDir(String filePath, String packageName, boolean isRecursion) {
		Set<String> classSet = new HashSet<String>();
		try {
			filePath = java.net.URLDecoder.decode(new String(filePath.getBytes("ISO-8859-1"), "UTF-8"), "UTF-8");
			File file = new File(filePath);
			File[] files = file.listFiles();
			for (File childFile : files) {
				if (childFile.isDirectory()) {
					if (isRecursion) {
						classSet.addAll(getClassNameFromDir(childFile.getPath(), packageName+"."+childFile.getName(), isRecursion));
					}
				} else {
					String fileName = childFile.getName();
					if (fileName.endsWith(".properties") && !fileName.contains("$")) {
						//className.add(fileName);
						classSet.add(packageName+ "." + fileName);
					}
				}
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return classSet;
	}

	
	/**
	 * @param jarEntries Jar包
	 * @param packageName 包名
	 * @param isRecursion 循环
	 * @return 包名
	 */
	private static Set<String> getClassNameFromJar(Enumeration<JarEntry> jarEntries, String packageName, boolean isRecursion){
		Set<String> classSet = new HashSet<String>();
		
		while (jarEntries.hasMoreElements()) {
			JarEntry jarEntry = jarEntries.nextElement();
			if(!jarEntry.isDirectory()){
				/*
	             * 这里是为了方便，先把"/" 转成 "." 再判断 ".class" 的做法可能会有bug
	             * (FIXME: 先把"/" 转成 "." 再判断 ".class" 的做法可能会有bug)
	             */
				String entryName = jarEntry.getName().replace("/", ".");
				if (entryName.endsWith(".class") && !entryName.contains("$") && entryName.startsWith(packageName)) {
					entryName = entryName.replace(".class", "");
					if(isRecursion){
						classSet.add(entryName);
					} else if(!entryName.replace(packageName+".", "").contains(".")){
						classSet.add(entryName);
					}
				}
			}
		}
		
		return classSet;
	}
	
	public static void main(String[] args) throws Exception {
		String packageName = "com.amazonaws.services.ec2.model";
		List<String> postfixs = new ArrayList<String>();
		postfixs.add("Request");
		System.out.println(ListClassFromSpecifiedPackageRule.generate(packageName, postfixs));
//		generateAmazonEC2Kinds();
	}

	protected static void generateAmazonEC2Kinds() {
		String packageName = "com.aliyuncs.ecs.model.v20140526";
		List<String> postfixs = new ArrayList<String>();
		postfixs.add("Request");
		System.out.println(ListClassFromSpecifiedPackageRule.generate(packageName, postfixs));
	}
}
