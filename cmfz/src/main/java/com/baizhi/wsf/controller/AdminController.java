package com.baizhi.wsf.controller;

import com.baizhi.wsf.entity.Admin;
import com.baizhi.wsf.service.AdminService;
import com.baizhi.wsf.service.MenuService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author wsp
 * @create 2018-12-20 9:06
 */
@RestController
@RequestMapping("/login")

public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/login")
    public String login(Admin admin) {
        String status = adminService.getOne(admin);
        return status;
    }
}
    