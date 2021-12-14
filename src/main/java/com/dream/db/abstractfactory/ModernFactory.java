package com.dream.db.abstractfactory;

/**
 * @Author : huzejun
 * @Date: 2021/12/9-17:41
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWapon() {
        return new AK47();
    }
}
