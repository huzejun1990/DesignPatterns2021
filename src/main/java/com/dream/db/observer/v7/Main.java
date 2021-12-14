package com.dream.db.observer.v7;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : huzejun
 * @Date: 2021/12/10-21:55
 *
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 */

class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
    }

}

class wakeUpEvent {
    long timestamp;
    String loc;
    Child source;

    public wakeUpEvent(long timestamp, String loc, Child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }
}

interface Observer {
    void actionOnWakeUp(wakeUpEvent event);
}

class Dad implements Observer {

    public void feed(){
        System.out.println("dad feed...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        feed();
    }
}

class Mum implements Observer {

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        hug();
    }

    public void hug() {
        System.out.println("huging");
    }
}

class Dog implements Observer {

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        wang();
    }

    public void wang() {
        System.out.println("wang....");
    }
}
public class Main {
}
