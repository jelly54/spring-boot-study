package com.jelly.oauth2demo.authorization.properties;

import lombok.Data;

/**
 * @version V1.0
 * @program: oauth2-demo
 * @description:
 * @date: 2019-04-05 14:07
 **/
@Data
public class OAuth2ClientProperties {

    private String clientId;

    private String clientSecret;

    private Integer accessTokenValiditySeconds = 7200;
}
