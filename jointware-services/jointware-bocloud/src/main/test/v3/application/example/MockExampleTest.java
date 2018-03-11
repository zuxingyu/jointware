//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package v3.application.example;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
                put("name","containerName");
                put("image","registry.example.com:5000/busybox");
                put("envs",new ArrayList<String>(){
                    {
                        add("boco1-env");
                        add("boco2-env");
                    }
                });
            }
        });
        params.put("boco1-env",new HashMap<String,Object>(){
            {
                put("key","JAVA_HOME");
                put("value","sbxyj");
                put("third",new ArrayList<String>(){
                    {
                        add("boco1-bad");
                        add("boco2-bad");
                    }
                });
            }
        });
        params.put("boco2-env",new HashMap<String,Object>(){
            {
                put("key","TOMCAT_HOME");
                put("value","sbwh");
            }
        });
        params.put("boco1-bad",new HashMap<String,Object>(){
            {
                put("aaaa","aaaaa");
                put("bbbb","bbbbb");
            }
        });
        params.put("boco2-bad",new HashMap<String,Object>(){
            {
                put("aaaa","aaaaa");
                put("bbbb","bbbbb");
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
                put("projectId",1234);
            }

        });
        params.put("instances",new ArrayList<String>(){
            {
                add("boco-instance");
            }
        });
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
