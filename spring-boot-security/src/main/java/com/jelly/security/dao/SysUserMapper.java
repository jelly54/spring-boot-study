package com.jelly.security.dao;

import com.jelly.security.bean.SysUser;
import org.apache.ibatis.annotations.Select;

/**
 * @version V1.0
 * @author: Jelly
 * @program: spring-boot-security
 * @description:
 * @date: 2019-03-10 19:03
 **/
public interface SysUserMapper {
    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    SysUser getById(Integer id);

    @Select("SELECT * FROM sys_user WHERE name = #{name}")
    SysUser getByName(String name);
}