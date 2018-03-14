package v3.application;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.isdream.jointware.containers.ConatinerExecutor;
import com.github.isdream.jointware.containers.impl.KubernetesExecutor;
import io.fabric8.kubernetes.api.model.Namespace;
import io.fabric8.kubernetes.api.model.extensions.Deployment;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:config/spring-*.xml"})
@WebAppConfiguration
public class DmDispatchK8s {

    public final static String MASTER_URL = "http://118.190.46.58:9888";
    public static String DEPLOY = "{\"jointwareRef0-io.fabric8.kubernetes.api.model.EnvVar\":{\"setName\":\"JAVA_HOME\",\"setValue\":\"sbxyj\"},\"jointwareRef1-io.fabric8.kubernetes.api.model.ContainerPort\":{\"setName\":\"name2\",\"setContainerPort\":8888,\"setProtocol\":\"TCP\"},\"jointwareRef3-memory-io.fabric8.kubernetes.api.model.Quantity\":{\"setAmount\":\"128Mi\"},\"jointwareRef0-cpu-io.fabric8.kubernetes.api.model.Quantity\":{\"setAmount\":\"1\"},\"jointwareRef0-io.fabric8.kubernetes.api.model.Container\":{\"setName\":\"tomcat\",\"setLivenessProbe-setSuccessThreshold\":1,\"setLivenessProbe-setInitialDelaySeconds\":60,\"setVolumeMounts\":[\"jointwareRef0-io.fabric8.kubernetes.api.model.VolumeMount\"],\"setLivenessProbe-setHttpGet-setScheme\":\"HTTP\",\"setResources-setLimits\":[\"jointwareRef0-cpu-io.fabric8.kubernetes.api.model.Quantity\",\"jointwareRef1-memory-io.fabric8.kubernetes.api.model.Quantity\"],\"setLivenessProbe-setTimeoutSeconds\":5,\"setEnv\":[\"jointwareRef0-io.fabric8.kubernetes.api.model.EnvVar\",\"jointwareRef1-io.fabric8.kubernetes.api.model.EnvVar\"],\"setReadinessProbe-setTimeoutSeconds\":5,\"setReadinessProbe-setHttpGet-setScheme\":\"HTTP\",\"setReadinessProbe-setHttpGet-setPath\":\"/\",\"setLivenessProbe-setHttpGet-setPort-setIntVal\":8080,\"setReadinessProbe-setHttpGet-setPort-setIntVal\":80,\"setLivenessProbe-setHttpGet-setPath\":\"/\",\"setReadinessProbe-setSuccessThreshold\":1,\"setResources-setRequests\":[\"jointwareRef2-cpu-io.fabric8.kubernetes.api.model.Quantity\",\"jointwareRef3-memory-io.fabric8.kubernetes.api.model.Quantity\"],\"setReadinessProbe-setFailureThreshold\":5,\"setPorts\":[\"jointwareRef0-io.fabric8.kubernetes.api.model.ContainerPort\",\"jointwareRef1-io.fabric8.kubernetes.api.model.ContainerPort\"],\"setLivenessProbe-setFailureThreshold\":5,\"setReadinessProbe-setInitialDelaySeconds\":60,\"setImage\":\"registry.example.com:5000/busybox\"},\"jointwareRef1-memory-io.fabric8.kubernetes.api.model.Quantity\":{\"setAmount\":\"256Mi\"},\"main\":{\"setMetadata-setNamespace\":\"xyj\",\"setSpec-setTemplate-setMetadata-setLabels\":{\"app\":\"xyj-dm\"},\"setSpec-setSelector-setMatchLabels\":{\"app\":\"xyj-dm\"},\"setSpec-setTemplate-setSpec-setContainers\":[\"jointwareRef0-io.fabric8.kubernetes.api.model.Container\"],\"setSpec-setTemplate-setMetadata-setName\":\"xyj-dm\",\"setMetadata-setName\":\"xuyuanjia-dm\",\"setSpec-setTemplate-setSpec-setNodeSelector\":{\"xuyuanjia-dm\":\"node1_node2\"},\"setSpec-setReplicas\":2,\"setSpec-setTemplate-setSpec-setVolumes\":[\"jointwareRef0-io.fabric8.kubernetes.api.model.Volume\"],\"setMetadata-setLabels\":{\"projectId\":\"ab1234\"}},\"jointwareRef2-cpu-io.fabric8.kubernetes.api.model.Quantity\":{\"setAmount\":\"0.5\"},\"jointwareRef0-io.fabric8.kubernetes.api.model.VolumeMount\":{\"setName\":\"name1\",\"setMountPath\":\"/opt\"},\"jointwareRef0-io.fabric8.kubernetes.api.model.Volume\":{\"setName\":\"name1\",\"setHostPath-setPath\":\"/opt\"},\"jointwareRef1-io.fabric8.kubernetes.api.model.EnvVar\":{\"setName\":\"TOMCAT_HOME\",\"setValue\":\"sbwh\"},\"jointwareRef0-io.fabric8.kubernetes.api.model.ContainerPort\":{\"setName\":\"name1\",\"setContainerPort\":8080,\"setProtocol\":\"TCP\"}}";

    protected static DefaultKubernetesClient createClient() {
        Config config = new ConfigBuilder()
                .withMasterUrl(MASTER_URL)
                .build();
        return new DefaultKubernetesClient(config);
    }

    @SuppressWarnings("unchecked")
    protected static Map<String, Map<String, Object>> getParams(String text) {
        return (Map<String, Map<String, Object>>) JSON.parse(text);
    }

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void before() throws Exception {
        //this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    public void dispatchANs() throws Exception {
        ConatinerExecutor dp = new KubernetesExecutor();
        dp.create(createClient(), Deployment.class.getSimpleName(), getParams(DEPLOY));
        //dp.scaleTo(createClient(),"Deployment","xyj","xyj-dm",3);
        //System.out.println(JSONObject.toJSONString(dp.query(createClient(),"Deployment","xyj","xyj-dm")));
        //dp.delete(createClient(),"Deployment","xyj","xyj-dm");
    }
}
