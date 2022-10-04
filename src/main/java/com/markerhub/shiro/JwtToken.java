package com.markerhub.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author shkstart
 * @create 2022-09-30 10:38
 */
public class JwtToken implements AuthenticationToken {
    private String token;
    public JwtToken(String token) {
        this.token = token;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }
    @Override
    public Object getCredentials() {
        return token;
    }
}
