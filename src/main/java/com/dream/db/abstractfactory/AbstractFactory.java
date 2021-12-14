package com.dream.db.abstractfactory;

/**
 * @Author : huzejun
 * @Date: 2021/12/9-16:43
 */
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWapon();
}
