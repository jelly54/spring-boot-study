package com.jelly.oauth2demo.service;

import com.jelly.oauth2demo.bean.SysUserRole;
import com.jelly.oauth2demo.dao.SysUserRoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version V1.0
 * @author: Jelly
 * @program: spring-boot-security
 * @description:
 * @date: 2019-03-10 19:11
 **/
@Service
public class SysUserRoleService {

    @Resource
    private SysUserRoleMapper userRoleMapper;

    public List<String> listByUserName(String userName) {
        return userRoleMapper.listByUserName(userName);
    }
}