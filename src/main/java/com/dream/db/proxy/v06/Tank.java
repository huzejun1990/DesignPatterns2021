package com.dream.db.proxy.v06;

import java.util.Random;

/**
 * @Author : huzejun
 * @Date: 2021/12/14-14:45
 * 问题：我想记录坦克的移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方源码呢？
 * v05:使用代理
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
        new TankTimeProxy(new Tank()).move();
    }
}

class TankTimeProxy implements Movable{
    Tank tank;

    public TankTimeProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        final long start = System.currentTimeMillis();
        tank.move();
        final long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

class TankLogProxy implements Movable {
    Tank tank;

    @Override
    public void move() {
        System.out.println("start moving");
        tank.move();
        System.out.println("stopped!");
    }
}


interface Movable {
    void move();
}
