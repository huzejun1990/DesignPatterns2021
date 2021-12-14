package com.dream.strategy;

/**
 * @Author : huzejun
 * @Date: 2021/12/7-0:55
 */
public class Dog implements Comparable<Dog>{

    int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Dog d) {
        if(this.food < d.food) return -1;
        else if(this.food > d.food)return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
