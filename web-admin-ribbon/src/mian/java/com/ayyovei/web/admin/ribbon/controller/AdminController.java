package com.ayyovei.web.admin.ribbon.controller;

import com.ayyovei.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "ribbonHi",method = RequestMethod.GET)
    public String ribbonHi(String message) {

        return adminService.hi(message);
    }
}
