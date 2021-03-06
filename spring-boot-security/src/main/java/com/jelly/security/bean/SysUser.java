package com.jelly.security.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @version V1.0
 * @author: Jelly
 * @program: spring-boot-security
 * @description:
 * @date: 2019-03-10 18:53
 **/
@Data
public class SysUser {

    private Integer id;

    private String name;

    private String password;

}

