package com.jelly.oauth2demo.service;

import com.jelly.oauth2demo.bean.SysRole;
import com.jelly.oauth2demo.dao.SysRoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version V1.0
 * @author: Jelly
 * @program: spring-boot-security
 * @description:
 * @date: 2019-03-10 19:10
 **/
@Service
public class SysRoleService {

    @Resource
    private SysRoleMapper roleMapper;

    public SysRole getById(Integer id) {
        return roleMapper.getById(id);
    }
}
