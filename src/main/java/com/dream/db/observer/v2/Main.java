package com.dream.db.observer.v2;

/**
 * @Author : huzejun
 * @Date: 2021/12/10-16:13
 */

class Child {
    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void wakeUp(){
        System.out.println("Waked Up! Crying wuwuwuwu...!");
        cry = true;
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("observing....");
        }
    }

}
