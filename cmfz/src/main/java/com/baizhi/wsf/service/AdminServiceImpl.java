package com.baizhi.wsf.service;

import com.baizhi.wsf.entity.Admin;
import com.baizhi.wsf.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 描述:
 *
 * @author wsp
 * @create 2018-12-20 9:02
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public String getOne(Admin admin) {
        Admin admin1 = adminMapper.selectOne(admin);
        if (admin1 == null) {
            return "用户不存在";
        } else if (!admin1.getPassword().equals(admin.getPassword())) {
            return "密码不正确";
        } else {
            return "success";
        }
    }
}
    