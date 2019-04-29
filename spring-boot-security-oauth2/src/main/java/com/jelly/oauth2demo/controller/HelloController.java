package com.jelly.oauth2demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @program: oauth2-demo
 * @description:
 * @date: 2019-04-22 15:38
 **/
@RestController
public class HelloController {
    @GetMapping("/te/hello")
    public Object hello() {
        return "hello body";
    }

    @RequestMapping(value = "/api")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String success() {
        return "SUCCESS";
    }
}
