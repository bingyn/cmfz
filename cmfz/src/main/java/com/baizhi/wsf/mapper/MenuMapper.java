package com.baizhi.wsf.mapper;

import com.baizhi.wsf.entity.Menu;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 描述:
 *
 * @author wsp
 * @create 2018-12-19 21:44
 */

public interface MenuMapper extends Mapper<Menu> {
    public List<Menu> listAll();
}
    