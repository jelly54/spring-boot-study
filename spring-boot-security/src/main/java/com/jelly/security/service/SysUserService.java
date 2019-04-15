package com.jelly.security.service;

import com.jelly.security.bean.SysUser;
import com.jelly.security.dao.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version V1.0
 * @author: Jelly
 * @program: spring-boot-security
 * @description:
 * @date: 2019-03-10 19:09
 **/
@Service
public class SysUserService {
    @Autowired
    private SysUserMapper userMapper;

    public SysUser getById(Integer id) {
        return userMapper.getById(id);
    }

    public SysUser getByName(String name) {
        return userMapper.getByName(name);
    }
}
