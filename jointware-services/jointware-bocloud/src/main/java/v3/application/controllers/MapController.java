/**
 * Copyright (2017, ) Institute of Software, Chinese Academy of Sciences
 */
package v3.application.controllers;

import v3.application.result.ResultBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import v3.application.services.ServiceSelector;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Xuyuanjia xuyuanjia2017@otcaix.iscas.ac.cn
 * @Date 2017/10/8 1:24
 * @File ReleaseController.java
 */
@Controller
@RequestMapping("/v1.7/")
public class MapController {

    @Resource(name="serviceSelector")
    private ServiceSelector ss;

    // 应用生命周期管理
    @RequestMapping("dispatch.do")
    public @ResponseBody
    ResultBean releaseApplication(@RequestBody HashMap<String,Object> map){
        ss.getConvertor(map);
        return new ResultBean(true,"a test");
    }
}
