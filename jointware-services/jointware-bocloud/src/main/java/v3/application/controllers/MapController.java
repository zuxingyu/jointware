/**
 * Copyright (2017, ) Institute of Software, Chinese Academy of Sciences
 */
package v3.application.controllers;

import v3.application.result.ResultBean;
import v3.application.services.MapConverterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author Xuyuanjia xuyuanjia2017@otcaix.iscas.ac.cn
 * @Date 2017/10/8 1:24
 * @File ReleaseController.java
 */
@Controller
@RequestMapping("/v1.7/")
public class MapController {

    @Resource(name="MapConverterService")
    private MapConverterService cs;

    // 发布（变更）应用的统一入口；
    @RequestMapping("dispatch.do")
    public @ResponseBody
    ResultBean releaseApplication(@RequestBody Map<String,Object> map){
        if(map.get("test3") instanceof Map){
            System.out.println("test3:"+map.get("test3"));
        }
        System.out.println(map.get("test"));
        return new ResultBean(true,"a test");
    }
}
