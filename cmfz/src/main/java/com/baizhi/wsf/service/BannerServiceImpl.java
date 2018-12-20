package com.baizhi.wsf.service;

import com.baizhi.wsf.dto.BannerDto;
import com.baizhi.wsf.entity.Banner;
import com.baizhi.wsf.mapper.BannerMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 描述:
 *
 * @author wsp
 * @create 2018-12-20 16:01
 */
@Service
@Transactional(rollbackFor = Exception.class)

public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerMapper bannerMapper;
    @Autowired
    private BannerDto bannerDto;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public BannerDto list_all(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        List<Banner> list = bannerMapper.selectAll();
        Integer count = bannerMapper.selectCount(null);
        bannerDto.setTotal(count);
        bannerDto.setRows(list);
        return bannerDto;
    }
}
    