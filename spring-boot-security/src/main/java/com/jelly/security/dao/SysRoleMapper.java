package com.jelly.security.dao;

import com.jelly.security.bean.SysRole;
import org.apache.ibatis.annotations.Select;

/**
 * @version V1.0
 * @author: Jelly
 * @program: spring-boot-security
 * @description:
 * @date: 2019-03-10 19:07
 **/
public interface SysRoleMapper {
    @Select("SELECT * FROM sys_role WHERE id = #{id}")
    SysRole getById(Integer id);
}

