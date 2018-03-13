//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package v3.application.example;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.kubernetes.api.model.Quantity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:config/spring-*.xml"})
@WebAppConfiguration
public class MockExampleTest {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    public MockExampleTest() {
    }

    @Before
    public void before() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    private Map<String,Object> getTarget(){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("platformType","kubernetes-deployment");
        return params;
    }

    private void getReferences(Map params){
        params.put("boco-instance",new HashMap<String,Object>(){
            {
                put("name","tomcat");
                put("image","registry.example.com:5000/busybox");
                put("envs",new ArrayList<String>(){
                    {
                        add("boco1-env");
                        add("boco2-env");
                    }
                });
                put("ports",new ArrayList<String>(){
                    {
                        add("boco3-port");
                        add("boco4-port");
                    }
                });
                put("probes",new ArrayList<String>(){
                    {
                        add("boco5-probe");
                        add("boco6-probe");
                    }
                });
                put("resources",new HashMap<String,Object>(){
                    {
                        put("minCpu","0.5");
                        put("maxCpu","1");
                        put("minMem","128Mi");
                        put("maxMem","256Mi");
                    }
                });
                put("volumeMounts",new ArrayList<String>(){
                    {
                        add("boco7-volumeMount");
                    }
                });
            }
        });
        params.put("boco1-env",new HashMap<String,Object>(){
            {
                put("key","JAVA_HOME");
                put("value","sbxyj");
            }
        });
        params.put("boco2-env",new HashMap<String,Object>(){
            {
                put("key","TOMCAT_HOME");
                put("value","sbwh");
            }
        });
        params.put("boco3-port",new HashMap<String,Object>(){
            {
                put("name","name1");
                put("port",8080);
                put("protocol","TCP");
            }
        });
        params.put("boco4-port",new HashMap<String,Object>(){
            {
                put("name","name2");
                put("port",8888);
                put("protocol","TCP");
            }
        });
        params.put("boco5-probe",new HashMap<String,Object>(){
            {
                put("type","livenessProbe");
                put("delaySeconds",60);
                put("failureThreshold",5);
                put("path","/");
                put("port",8080);
                put("requestType","httpGet");
                put("scheme","HTTP");
                put("successThreshold",1);
                put("timeoutSeconds",5);
            }
        });
        params.put("boco6-probe",new HashMap<String,Object>(){
            {
                put("type","readinessProbe");
                put("delaySeconds",60);
                put("failureThreshold",5);
                put("path","/");
                put("port",80);
                put("requestType","httpGet");
                put("scheme","HTTP");
                put("successThreshold",1);
                put("timeoutSeconds",5);
            }
        });
        params.put("boco7-volumeMount",new HashMap<String,Object>(){
            {
                put("name","name1");
                put("mountPath","/opt");
            }
        });
        params.put("boco8-volume",new HashMap<String,Object>(){
            {
                put("name","name1");
                put("path","/opt");
            }
        });
    }

    private Map<String,Object> getMain(){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("namespace","xyj");
        params.put("name","xuyuanjia-dm");
        params.put("replica",2);
        params.put("labels",new HashMap<String,Object>(){
            {
                put("projectId","ab1234");
            }
        });
        params.put("instances",new ArrayList<String>(){
            {
                add("boco-instance");
            }
        });
        params.put("volumes",new ArrayList<String>(){
            {
                add("boco8-volume");
            }
        });
        params.put("selector",new HashMap<String,Object>(){
            {
                put("app","xyj-dm");
            }
        });
        params.put("instanceLabels",new HashMap<String,Object>(){
            {
                put("app","xyj-dm");
            }
        });
        params.put("instanceName","xyj-dm");
        return params;
    }

    private Map<String,Object> getTotalParams(Map<String,Object> target,Map<String,Object> main){
        Map<String,Object> params = new HashMap<>();
        params.put("target",target);
        params.put("main",main);
        return params;
    }
    @Test
    public void doRequestBody() throws Exception {
        Map params = this.getTotalParams(this.getTarget(),this.getMain());
        this.getReferences(params);
        System.out.println(JSONObject.toJSONString(params));
        mockMvc.perform(post("/v1.7/dispatch.do").
                contentType(MediaType.APPLICATION_JSON).content(JSONObject.toJSONString(params))).
                andDo(print()).andReturn();
    }
}
