package com.cch.onlineoffice.wx.config.shiro;

import org.springframework.stereotype.Component;

/**
 * @author cch
 * @create 2022-11-20 21:45
 * 描述：新令牌保存到ThreadLocalToken里面。保存线程安全的数据，而且避免了使用线程锁
 */
@Component
public class ThreadLocalToken {
    private ThreadLocal local=new ThreadLocal();

    public void setToken(String token){
        local.set(token);
    }

    public String getToken(){
        return (String) local.get();
    }

    public void clear(){
        local.remove();
    }
}
