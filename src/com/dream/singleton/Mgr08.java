package com.dream.singleton;

/**
 * @Author : huzejun
 * @Date: 2021/12/4-0:15
 * 不仅可以解决线程同步，还可以防止反序列化
 */
public enum Mgr08 {

    INSTANCE;

    public void m(){ }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }

}
