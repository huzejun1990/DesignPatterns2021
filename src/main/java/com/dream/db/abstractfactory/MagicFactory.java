package com.dream.db.abstractfactory;

/**
 * @Author : huzejun
 * @Date: 2021/12/9-17:41
 */
public class MagicFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWapon() {
        return new MagicStick();
    }
}
