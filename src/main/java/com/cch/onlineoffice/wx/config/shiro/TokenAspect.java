package com.cch.onlineoffice.wx.config.shiro;

import com.cch.onlineoffice.wx.common.util.R;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author cch
 * @create 2022-11-20 21:57
 * 描述：拦截所有Web方法的返回值，在返回的R对象中添加更新后的令牌
 */
@Aspect
@Component
public class TokenAspect {

    @Autowired
    private ThreadLocalToken threadLocalToken;

    @Pointcut("execution(public * com.cch.onlineoffice.wx.controller.*.*(..)))")
    public void aspect() {

    }

    @Around("aspect()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        R r = (R) point.proceed(); //方法执行结果
        String token = threadLocalToken.getToken();
        //如果ThreadLocal中存在Token，说明是更新的Token
        if (token != null) {
            r.put("token", token); //往响应中放置Token
            threadLocalToken.clear();
        }
        return r;
    }
}