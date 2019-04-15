package com.jelly.security.service;

import com.jelly.security.bean.SysRole;
import com.jelly.security.dao.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version V1.0
 * @author: Jelly
 * @program: spring-boot-security
 * @description:
 * @date: 2019-03-10 19:10
 **/
@Service
public class SysRoleService {

    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole getById(Integer id){
        return roleMapper.getById(id);
    }
}
