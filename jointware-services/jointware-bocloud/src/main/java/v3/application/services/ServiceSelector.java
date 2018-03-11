package v3.application.services;

import org.apache.log4j.Logger;
import v3.application.initialization.AllInit;
import v3.application.result.ResultBean;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Properties;

public class ServiceSelector {
    private static Logger logger = Logger.getLogger(ServiceSelector.class);
    private Map<String,Convertor> convertors;

    public Map<String, Convertor> getConvertors() {
        return convertors;
    }

    public void setConvertors(Map<String, Convertor> convertors) {
        this.convertors = convertors;
    }

    public Map<String,Object> getConvertor(Map<String,Object> parameter){
        Convertor con = null;
        if(parameter.get("target") != null && parameter.get("target") instanceof Map){
            try {
                String type = (String)((Map<String,Object>)parameter.get("target")).get("platformType");
                con =  convertors.get(type);
                Properties pt = new Properties();
                File file = new File(AllInit.baseFilePath+"/propertiesMapper/"+type+".properties");
                logger.info("Convertor File Path: "+file.getAbsoluteFile());
                FileInputStream istream = null;
                istream = new FileInputStream(file);
                pt.load(istream);
                logger.info(pt.getProperty("abc"));
                istream.close();
                return con.changeValueOrStructure(parameter,pt);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        con =  convertors.get("default");
        return con.changeValueOrStructure(null,null);
    }

}
