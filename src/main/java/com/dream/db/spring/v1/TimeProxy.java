package com.dream.db.spring.v1;

/**
 * @Author : huzejun
 * @Date: 2021/12/16-0:17
 */
public class TimeProxy {

    public void before(){
        System.out.println("method start..." + System.currentTimeMillis());
    }

    public void after(){
        System.out.println("method stop..." + System.currentTimeMillis());
    }
}
