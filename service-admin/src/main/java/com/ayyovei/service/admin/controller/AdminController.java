package com.ayyovei.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/5/28
 */
@RestController
public class AdminController {
    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String hello(String message) {
        return  "you message is :" + message + ",my applicationName is :"+ applicationName +
                ",port is :" + port;
    }
}
