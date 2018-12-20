package com.baizhi.wsf.service;

import com.baizhi.wsf.dto.BannerDto;

public interface BannerService {
    public BannerDto list_all(Integer page, Integer rows);
}
