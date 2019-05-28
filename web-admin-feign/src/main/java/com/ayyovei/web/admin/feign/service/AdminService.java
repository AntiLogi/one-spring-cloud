package com.ayyovei.web.admin.feign.service;

import com.ayyovei.web.admin.feign.controller.HystrixAdminService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/5/28
 */
@FeignClient(value = "service-admin",fallback = HystrixAdminService.class)
public interface AdminService {
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String hello(@RequestParam(value = "message") String message);

}
