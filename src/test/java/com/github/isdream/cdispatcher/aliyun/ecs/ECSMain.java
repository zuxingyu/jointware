/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.aliyun.ecs;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse.Instance;
import com.aliyuncs.ecs.model.v20140526.DescribeZonesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeZonesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * https://help.aliyun.com/document_detail/25506.html?spm=a2c4g.11186623.6.855.B9GCJj
 *         2018年2月18日
 */
public class ECSMain {

	final static String REGINE_ID = "cn-qingdao";

	final static String ACCESS_KEY_ID = "LTAIA2sF7GLHvvY7";

	final static String ACCESS_KEY_SECRET = "kyZvz4W2BoBaS8PdthpHSFyxn81HgL";

	/**
	 * @param args
	 * @throws ClientException 
	 * @throws ServerException 
	 */
	public static void main(String[] args) throws ServerException, ClientException {
		IClientProfile profile = DefaultProfile.getProfile(REGINE_ID, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
		IAcsClient client = new DefaultAcsClient(profile);

		DescribeZonesRequest request = new DescribeZonesRequest();
		DescribeZonesResponse response = client.getAcsResponse(request);
		System.out.println(response.getZones().get(0).getZoneId());

		DescribeInstancesRequest dur = new DescribeInstancesRequest();
		for (Instance ins : client.getAcsResponse(dur).getInstances()) {
			System.out.println(ins.getInstanceName() + "\t:" + ins.getRegionId());
		}
		// dur.setZoneId(zoneId);;
	}

}
