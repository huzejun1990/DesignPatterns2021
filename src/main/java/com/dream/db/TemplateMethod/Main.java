package com.dream.db.TemplateMethod;

/**
 * @Author : huzejun
 * @Date: 2021/12/20-20:36
 */
public class Main {
    public static void main(String[] args) {
        F f = new c1();
        f.m();
    }

}

abstract class F {
    void m(){
        op1();
        op2();
    }

    abstract void op1();
    abstract void op2();
}

class c1 extends F {

    @Override
    void op1() {
        System.out.println("p1");
    }

    @Override
    void op2() {
        System.out.println("p2");
    }
}
