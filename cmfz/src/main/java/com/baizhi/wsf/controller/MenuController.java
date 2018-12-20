package com.baizhi.wsf.controller;

import com.baizhi.wsf.entity.Menu;
import com.baizhi.wsf.service.MenuService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述:
 *
 * @author wsp
 * @create 2018-12-19 19:41
 */
@RestController
@RequestMapping("/test")
@Log4j
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/test")
    public List<Menu> list_all() {
        log.info(menuService.list_all());
        return menuService.list_all();
    }
}
    