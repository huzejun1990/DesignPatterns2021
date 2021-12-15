package com.dream.db.spring.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author : huzejun
 * @Date: 2021/12/16-0:17
 */
@Aspect
public class TimeProxy {

    @Before("execution(void com.dream.db.spring.v2.Tank.move())")
    public void before(){
        System.out.println("method start..." + System.currentTimeMillis());
    }

    @After("execution(void com.dream.db.spring.v2.Tank.move())")
    public void after(){
        System.out.println("method stop..." + System.currentTimeMillis());
    }
}
