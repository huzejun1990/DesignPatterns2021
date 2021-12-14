package com.dream.db.proxy.v01;

import java.util.Random;

/**
 * @Author : huzejun
 * @Date: 2021/12/14-14:45
 * 问题：我想记录坦克的移动时间
 */
public class Tank implements Movable {

    /**
     * 模拟坦克移动了一段时间
     */
    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}

interface Movable {
    void move();
}
