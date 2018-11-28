package com.ctf.controller.develop;

import com.ctf.service.developer.DevUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/dev")
public class DevUserController {
    /**
     * 1.有一个入口：开发者平台
     * 2.登录（正确跳转，错误提示）
     * 3.注销（注销返回系统登录页）
     */
    @Resource
    private DevUserService service;
    private Logger logger = Logger.getLogger(DevUserController.class);

    @RequestMapping(value = "/login")
    public String Login(){
        logger.debug("我进入了LginController");
        return "devlogin";
    }
}
