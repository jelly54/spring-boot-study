package com.jelly.oauth2demo.authorization.security;

import com.jelly.oauth2demo.bean.SysUser;
import com.jelly.oauth2demo.service.SysUserRoleService;
import com.jelly.oauth2demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 我们需要自定义 UserDetailsService ，将用户信息和权限注入进来。
 * <p>
 * 我们需要重写 loadUserByUsername 方法，参数是用户输入的用户名。
 * <p>
 * 返回值是UserDetails，这是一个接口，一般使用它的子类
 * org.springframework.security.core.userdetails.User，
 * <p>
 * 它有三个参数，分别是用户名、密码和权限集。
 *
 * @version V1.0
 * @author: Jelly
 * @program: spring-boot-security
 * @description:
 * @date: 2019-03-10 19:25
 **/
@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private SysUserService userService;


    @Autowired
    private SysUserRoleService userRoleService;


    /**
     * 根据用户名加载 user、
     *
     * @param username 用户名（登录名）
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        // 从数据库中取出用户信息
        SysUser user = userService.getByName(username);
        // 判断用户是否存在
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        // 添加权限
        List<String> userRoles = userRoleService.listByUserName(username);
        for (String userRole : userRoles) {
            authorities.add(new SimpleGrantedAuthority(userRole));
        }
        // 返回UserDetails实现类
        return new User(user.getName(), user.getPassword(), authorities);
    }
}
