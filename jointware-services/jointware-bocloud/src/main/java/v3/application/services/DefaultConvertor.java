package v3.application.services;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Service("defaultConvertor")
public class DefaultConvertor implements Convertor {

    private static Logger logger = Logger.getLogger(DefaultConvertor.class);

    @Override
    public Map<String, Object> changeValueOrStructure(Map<String, Object> parameter, Properties prop) {
        logger.info("no proper Convertor");
        return new HashMap<String,Object>(){
            {
                put("success",false);
            }
        };
    }
}
