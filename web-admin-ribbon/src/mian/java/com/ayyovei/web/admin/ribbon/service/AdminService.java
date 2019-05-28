package com.ayyovei.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/5/28
 */
@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String message) {
        return restTemplate.getForObject("http://service-admin:hi?message=" + message,String.class);
    }

    public String hiError(String message) {
        return String.format("hi your message is : %s,but request was failed", message);
    }
}
