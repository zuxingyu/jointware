/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月20日
 */
public class ModelsUtils {

	public static void showAllModels(String name, Map<String, String> models) {
		System.out.println("## " + name + " models:");
		System.out.println();
		System.out.println("```");
		Set<String> kinds = models.keySet();
		for (String kind : kinds) {
			System.out.println("- " + kind + " = " + models.get(kind));
		}
		System.out.println("```");
	}
	
	public static void testModelsWithTrueResults(Collection<String> models) {
		for (String model : models) {
			System.out.println("Assert.assertEquals(models.contains(\"" + model
					+ "\"), true);");
		}
		
	}
	
	public static void testModelsWithFalseResults(Collection<String> models) {
		for (String model : models) {
			System.out.println("Assert.assertEquals(models.contains(\"" + model
					+ "False\"), false);");
		}
		
	}
	
	public static boolean testGreatAndEuqalFeatures(Set<String> set1, Set<String> set2) {
		if (set1.size() < set2.size()) {
			return false;
		}
		
		return set1.containsAll(set2);
	}
	
	public static boolean testEuqalFeatures(Set<String> set1, Set<String> set2) {
		if (set1.size() != set2.size()) {
			return false;
		}
		
		return set1.containsAll(set2);
	}
}
