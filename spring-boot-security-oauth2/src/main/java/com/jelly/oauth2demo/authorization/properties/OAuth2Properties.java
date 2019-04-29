package com.jelly.oauth2demo.authorization.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @version V1.0
 * @program: oauth2-demo
 * @description:
 * @date: 2019-04-05 14:05
 **/
@Data
@ConfigurationProperties(prefix = "jelly.security.oauth2")
public class OAuth2Properties {
    private String jwtSigningKey = "jelly";

    private OAuth2ClientProperties[] clients = {};
}
