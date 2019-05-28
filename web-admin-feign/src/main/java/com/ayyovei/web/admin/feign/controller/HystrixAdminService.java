package com.ayyovei.web.admin.feign.controller;

import com.ayyovei.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/5/29
 */
@Component
public class HystrixAdminService implements AdminService {
    @Override
    public String hello(String message) {
        return String.format("hi, feign hystrix test, your message is : %s,but request was failed", message);
    }
}
