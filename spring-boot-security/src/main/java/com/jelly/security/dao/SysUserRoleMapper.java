package com.jelly.security.dao;

import com.jelly.security.bean.SysUserRole;
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
    @Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<SysUserRole> listByUserId(Integer userId);
}
