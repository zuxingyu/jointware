/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.openshift;

import com.github.isdream.chameleon.container.kubernetes.KubernetesConstants;

/**
 * @author henry, wuheng@otcaix.iscas.ac.cn
 *
 * 2018年1月3日
 */
public class OpenShiftConstants extends KubernetesConstants {

	//

	public static final String CLIENT = "io.fabric8.openshift.client.DefaultOpenShiftClient";
	
	
	public static final String MODEL_OPENSHIFT_PACKAHE = "io.fabric8.openshift.api.model";
	
	//
	public static final String KIND_POLICY = "Policy";

	public static final String KIND_GROUP = "Group";

	public static final String KIND_USER = "User";

	public static final String KIND_OAUTHCLIENT = "OAuthClient";

	public static final String KIND_CLUSTERROLEBINDING = "ClusterRoleBinding";

	public static final String KIND_IMAGESTREAMTAG = "ImageStreamTag";

	public static final String KIND_IMAGESTREAM = "ImageStream";

	public static final String KIND_BUILD = "Build";

	public static final String KIND_BUILDCONFIG = "BuildConfig";

	public static final String KIND_ROLEBINDING = "RoleBinding";

	public static final String KIND_ROUTE = "Route";

	public static final String KIND_POLICYBINDING = "PolicyBinding";

	public static final String KIND_OAUTHAUTHORIZETOKEN = "OAuthAuthorizeToken";

	public static final String KIND_ROLE = "Role";

	public static final String KIND_PROJECT = "Project";

	public static final String KIND_OAUTHACCESSTOKEN = "OAuthAccessToken";

	public static final String KIND_DEPLOYMENTCONFIG = "DeploymentConfig";

}
