package com.dream.strategy;

/**
 * @Author : huzejun
 * @Date: 2021/12/4-16:33
 */
public class Cat implements Comparable<Cat> {
    int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Cat c){
        if (this.weight < c.weight) return -1;
        else if (this.weight > c.weight) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }


}
