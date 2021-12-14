package com.dream.db.abstractfactory;

/**
 * @Author : huzejun
 * @Date: 2021/12/9-0:15
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory f = new ModernFactory();

        Vehicle c =  f.createVehicle();
        c.go();
        Weapon w = f.createWapon();
        w.shoot();
        Food b = f.createFood();
        b.printName();

    }
}
