package com.dream.singleton;

/**
 * @Author : huzejun
 * @Date: 2021/12/3-17:31
 * 跟 01是一个意思
 */
public class Mgr02 {
    private final static Mgr02 INSTANCE;

    static {
        INSTANCE = new Mgr02();
    }

    private Mgr02(){}

    public static Mgr02 getInstance(){
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr02 m1 = Mgr02.getInstance();
        Mgr02 m2 = Mgr02.getInstance();
        System.out.println(m1 == m2);
    }

}
