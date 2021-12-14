package com.dream.db.proxy.v02;

import java.util.Random;

/**
 * @Author : huzejun
 * @Date: 2021/12/14-14:45
 * 问题：我想记录坦克的移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方源码呢？ benchmark
 */
public class Tank implements Movable {

    /**
     * 模拟坦克移动了一段时间
     */
    @Override
    public void move() {
        final long start = System.currentTimeMillis();

        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        final long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}

interface Movable {
    void move();
}
