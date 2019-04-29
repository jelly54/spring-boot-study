package com.jelly.oauth2demo.authorization.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * @version V1.0
 * @program: oauth2-demo
 * @description: 资源服务器配置，配置访问资源的方式（httpBasic、formLogin）。配置可以不经授权就访问的资源。
 * @date: 2019-04-05 14:16
 **/
@Configuration
@EnableResourceServer
public class MyResourceServerConfig extends ResourceServerConfigurerAdapter {
    /**
     * 自定义登录成功处理器
     */
    @Autowired
    private AuthenticationSuccessHandler loginInSuccessHandler;

    /**
     * 自定义失败成功处理器
     */
    @Autowired
    private AuthenticationFailureHandler loginInFailureHandler;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        //表单登录 方式
        http.formLogin()
                .failureHandler(loginInFailureHandler)
                .successHandler(loginInSuccessHandler)
                .and()
                .authorizeRequests()
                .anyRequest().authenticated()
                //关闭跨站请求防护
                .and()
                .csrf().disable();

    }
}
