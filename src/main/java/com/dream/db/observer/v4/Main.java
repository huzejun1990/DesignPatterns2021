package com.dream.db.observer.v4;

/**
 * @Author : huzejun
 * @Date: 2021/12/10-17:47
 *
 * 加入多个观察者
 */

class Child {
    private boolean cry = false;
    private Dad dad = new Dad();
    private Mum mum = new Mum();
    private  Dog dog = new Dog();


    public boolean isCry() {
        return cry;
    }

    public void wakeUp(){
        cry = true;
        dad.feed();
        dog.wang();
        mum.hug();
    }
}


public class Main {
}

class Dad {
    public void feed() {
        System.out.println("dad feeding...");
    }

}

class Mum {

    public void hug(){
        System.out.println("mum hugging...");
    }
}

class Dog {

    public void wang(){
        System.out.println("dog wang...");
    }
}
