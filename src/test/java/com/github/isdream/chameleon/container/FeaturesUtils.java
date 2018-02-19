/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container;

import java.util.Set;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * 2018年2月19日
 */
public class FeaturesUtils {

	public static void showAll(String name, Set<String> kinds) {
		System.out.println("## " + name + " features:");
		System.out.println();
		System.out.println("```");
		for (String kind : kinds) {
			System.out.println("- " + kind);
		}
		System.out.println("```");
	}
	
	public static void testFeaturesWithTrueResults(Set<String> kinds) {
		for (String kind : kinds) {
			System.out.println("Assert.assertEquals(kinds.contains(\"" + kind
					+ "\"), true);");
		}
		
	}
	
	public static void testFeaturesWithFalseResults(Set<String> kinds) {
		for (String kind : kinds) {
			System.out.println("Assert.assertEquals(kinds.contains(\"" + kind
					+ "False\"), false);");
		}
		
	}
}
