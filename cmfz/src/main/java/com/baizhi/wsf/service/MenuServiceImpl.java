package com.baizhi.wsf.service;

import com.baizhi.wsf.entity.Menu;
import com.baizhi.wsf.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 描述:
 *
 * @author wsp
 * @create 2018-12-19 19:46
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Menu> list_all() {
        return menuMapper.listAll();
    }
}
    