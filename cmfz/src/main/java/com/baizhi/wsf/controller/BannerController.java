package com.baizhi.wsf.controller;

import com.baizhi.wsf.dto.BannerDto;
import com.baizhi.wsf.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author wsp
 * @create 2018-12-20 16:59
 */
@RestController
@RequestMapping("/Banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @RequestMapping("/getAll")
    public BannerDto getAll(Integer page, Integer rows) {
        return bannerService.list_all(page, rows);
    }
}
    