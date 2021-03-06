/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.vm.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 * https://amazonaws-china.com/cn/documentation/sdk-for-java/
 * 2018年2月18日
 */
public class EC2Main {

//	final static String REGINE_ID = Regisions;

	final static String ACCESS_KEY_ID = "";

	final static String ACCESS_KEY_SECRET = "";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AWSCredentials ac = new BasicAWSCredentials(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
		AWSCredentialsProvider credentialsProvider = new AWSStaticCredentialsProvider(ac);
		
		AmazonEC2 ec2 = AmazonEC2ClientBuilder.standard()
								.withRegion(Regions.AP_NORTHEAST_1)
								.withCredentials(credentialsProvider )
								.build();
		System.out.println(ec2.getClass().getName());
//		for (com.amazonaws.services.ec2.model.Region region : ec2.describeRegions().getRegions()) {
//			System.out.println(region.getRegionName());
//		}
	}

}
