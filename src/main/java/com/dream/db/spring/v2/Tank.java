package com.dream.db.spring.v2;

import java.util.Random;

/**
 * @Author : huzejun
 * @Date: 2021/12/16-0:12
 */
public class Tank {

    public void move(){
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
