package v3.application.convertor;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import v3.application.services.DeploymentConvertor;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:config/spring-*.xml"})
@WebAppConfiguration
public class ReflectionTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private DeploymentConvertor dc;
    @Before
    public void before() throws Exception {
       dc = ( DeploymentConvertor ) webApplicationContext.getBean("deploymentConvertor");
    }

    @Test
    public void doRequestBody() throws Exception {
        dc.changeValueOrStructure(null,null);
    }
}
