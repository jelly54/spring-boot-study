package com.jelly.oauth2demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jelly.oauth2demo.dao")
public class Oauth2demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2demoApplication.class, args);
    }

}
