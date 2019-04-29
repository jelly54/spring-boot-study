package com.jelly.oauth2demo.service;

import com.jelly.oauth2demo.bean.SysUser;
import com.jelly.oauth2demo.dao.SysUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version V1.0
 * @author: Jelly
 * @program: spring-boot-security
 * @description:
 * @date: 2019-03-10 19:09
 **/
@Service
public class SysUserService {

    @Resource
    private SysUserMapper userMapper;

    public SysUser getById(Integer id) {
        return userMapper.getById(id);
    }

    public SysUser getByName(String name) {
        return userMapper.getByName(name);
    }
}
