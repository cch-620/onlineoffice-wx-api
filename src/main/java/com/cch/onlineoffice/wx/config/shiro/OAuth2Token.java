package com.cch.onlineoffice.wx.config.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author cch
 * @create 2022-11-17 1:28
 * 描述：Token不能直接交给Shiro框架，需要先封装成AuthenticationToken类型的对象。
 *       把Token封装成认证对象
 */
public class OAuth2Token implements AuthenticationToken {
    private String token;

    public OAuth2Token(String token){
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
