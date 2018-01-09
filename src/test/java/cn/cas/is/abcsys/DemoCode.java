/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys;

import io.fabric8.kubernetes.api.model.extensions.Deployment;
import io.fabric8.kubernetes.api.model.extensions.DeploymentList;
import io.fabric8.kubernetes.api.model.extensions.DoneableDeployment;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.ScalableResource;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @date   2018年1月9日
 *
 */
public class DemoCode {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://127.0.0.1:9888");
		
		MixedOperation<Deployment, DeploymentList, DoneableDeployment, ScalableResource<Deployment, DoneableDeployment>> deployments = client.extensions().deployments();
		Deployment deployment = new Deployment();
		
		// create
		deployments.create(deployment );
		// update 
		deployments.inNamespace("").withName("").scale(2);
		// delete
		deployments.delete(deployment);
	}
}
