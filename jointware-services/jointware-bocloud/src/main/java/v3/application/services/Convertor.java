package v3.application.services;

import java.util.Map;
import java.util.Properties;

public interface Convertor {
    public Map<String,Object> changeValueOrStructure(Map<String,Object> parameter,Properties prop);
}
