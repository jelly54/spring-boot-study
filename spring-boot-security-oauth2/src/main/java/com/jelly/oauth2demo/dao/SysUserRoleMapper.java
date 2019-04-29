package com.jelly.oauth2demo.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @version V1.0
 * @author: Jelly
 * @program: spring-boot-security
 * @description:
 * @date: 2019-03-10 19:08
 **/
public interface SysUserRoleMapper {
    /**
     * 根据用户名，获取所有权限
     *
     * @param userName 用户名
     * @return 权限集合
     */
    @Select("SELECT  r.name FROM sys_role AS r INNER JOIN sys_user_role AS ur ON r.id=ur.role_id INNER JOIN sys_user AS u ON u.id=ur.user_id AND u.`name` = #{userName}")
    List<String> listByUserName(String userName);
}
