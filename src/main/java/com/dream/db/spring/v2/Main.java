package com.dream.db.spring.v2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : huzejun
 * @Date: 2021/12/16-0:30
 *
 * sping aop test
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop_auto.xml");
        Tank t = (Tank) context.getBean("tank");
        t.move();

    }

}
