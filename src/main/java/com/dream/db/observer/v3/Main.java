package com.dream.db.observer.v3;

/**
 * @Author : huzejun
 * @Date: 2021/12/10-16:19
 *
 * 加入观察者
 */
class Child {
    private boolean cry = false;
    private Dad d = new Dad();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp(){
        cry = true;
        d.feed();
    }
}

class Dad {
    public void feed(){
        System.out.println("dad feeding...");
    }
}

public class Main {

    public static void main(String[] args) {
        Child c = new Child();
        c.wakeUp();
    }
}
