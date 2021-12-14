package com.dream.db.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author : huzejun
 * @Date: 2021/12/13-22:13
 */

class Bullet{
    public UUID id = UUID.randomUUID();
    boolean living = true;

    @Override
    public String toString() {
        return "Bullet{" +
                "id=" + id +
                ", living=" + living +
                '}';
    }
}


public class BulletPool {
    List<Bullet> bullets = new ArrayList<>();
    {
        for (int i = 0; i < 5; i++) bullets.add(new Bullet());
    }

    public Bullet getBullets() {
        for (int i = 0; i < bullets.size(); i++) {
            final Bullet b = bullets.get(i);
            if (!b.living) return b;
        }
        return new Bullet();
    }

    public static void main(String[] args) {
        BulletPool bp = new BulletPool();

        for (int i = 0; i < 10; i++) {
            Bullet b = bp.getBullets();
            System.out.println(b);
        }
    }
}
