package v3.application;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.isdream.jointware.containers.DispatcherService;
import com.github.isdream.jointware.containers.impl.KubernetesDispatcherService;
import io.fabric8.kubernetes.api.model.Namespace;
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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Map;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:config/spring-*.xml"})
@WebAppConfiguration
public class NsDispatchK8s {

    public final static String MASTER_URL = "http://118.190.46.58:9888";
    public static String NAMESPACE = "{\"main\":{\"setMetadata-setName\":\"xyj\",\"setMetadata-setLabels\":{\"name\":\"xyj\",\"type\":\"deployment\"}}}";

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
        DispatcherService dp = new KubernetesDispatcherService();
        dp.create(createClient(), Namespace.class.getSimpleName(), getParams(NAMESPACE));
        //System.out.println(JSONObject.toJSONString(dp.query(createClient(),"Namespace","xyj")));
        //dp.delete(createClient(),"Namespace","xyj");
    }
}
