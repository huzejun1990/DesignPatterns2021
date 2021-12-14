package com.dream.db.observer.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : huzejun
 * @Date: 2021/12/10-18:58
 *
 * 分离观察者与被观察者
 */

class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();

}

//事件类
class wakeUpEvent {
    long timestamp;
    String loc;

    public wakeUpEvent(long timestamp, String loc) {
        this.timestamp = timestamp;
        this.loc = loc;
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

    public void hug(){
        System.out.println("mum hugging...");
    }



    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        hug();
    }
}

class Dog implements Observer {
    public void wang(){
        System.out.println("wang...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        wang();
    }


}
public class Main {
}
