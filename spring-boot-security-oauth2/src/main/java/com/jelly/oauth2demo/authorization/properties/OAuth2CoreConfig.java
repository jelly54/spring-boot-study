package com.jelly.oauth2demo.authorization.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @version V1.0
 * @program: oauth2-demo
 * @description:
 * @date: 2019-04-05 14:09
 **/
@Configuration
@EnableConfigurationProperties(OAuth2Properties.class)
public class OAuth2CoreConfig  {
}
