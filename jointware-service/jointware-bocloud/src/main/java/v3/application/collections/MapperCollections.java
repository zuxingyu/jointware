package v3.application.collections;

import java.util.Map;

/**
 * Created by Administrator on 2018/1/28.
 */
public class MapperCollections {
    private Map<String,String> toKubernetesController;
    private Map<String,String> toKubernetesFieldType;

    public Map<String, String> getToKubernetesController() {
        return toKubernetesController;
    }

    public void setToKubernetesController(Map<String, String> toKubernetesController) {
        this.toKubernetesController = toKubernetesController;
    }

    public Map<String, String> getToKubernetesFieldType() {
        return toKubernetesFieldType;
    }

    public void setToKubernetesFieldType(Map<String, String> toKubernetesFieldType) {
        this.toKubernetesFieldType = toKubernetesFieldType;
    }
}
