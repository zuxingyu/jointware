/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package cn.cas.is.abcsys.kinds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import cn.cas.is.abcsys.Constants;
import cn.cas.is.abcsys.generators.KubernetesModelParametersGenerator;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import junit.framework.TestCase;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @date   2018年1月10日
 *
 */
@SuppressWarnings("serial")
public class PersistentVolumeTest extends TestCase {

	public static Map<String, Object> createPVParams = new HashMap<String, Object>();

	static {
		createPVParams.put("setMetadata-setName", "pv002");
		createPVParams.put("setMetadata-setLabels", new HashMap<String, String>() {
			{
				put("release", "stable");
			}
		});
		createPVParams.put("setSpec-setCapacity", new HashMap<String, Object>() {
			{
				put("setStorage", "5Gi");
			}
		});
		createPVParams.put("setSpec-setAccessModes", new ArrayList<String>() {
			{
				add("ReadWriteOnce");
			}
		});
		createPVParams.put("setSpec-setPersistentVolumeReclaimPolicy", "Recycle");
		createPVParams.put("setSpec-setHostPath-setPath", "/abcs/data/pv002");
	}
	
	public void testCreatePV() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		System.out.println(generator.create(client, Constants.YAML_PERSISTENTVOLUME, createPVParams));
	}
	
	public void testDeletePV() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		generator.delete(client, Constants.YAML_PERSISTENTVOLUME, "pv001");
	}
	
	public void testQueryPV() throws Exception {
		DefaultKubernetesClient client = new DefaultKubernetesClient("http://118.190.46.58:9888");
		KubernetesModelParametersGenerator generator = new KubernetesModelParametersGenerator();
		System.out.println(generator.query(client, Constants.YAML_PERSISTENTVOLUME, "pv001"));
	}
	
}
