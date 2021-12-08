package com.dream.strategy;

import java.util.Arrays;

/**
 * @Author : huzejun
 * @Date: 2021/12/4-16:08
 */
public class Main {

    public static void main(String[] args) {
//        int[] a = {9, 3, 2, 5, 6, 1, 8};
        Cat[] a = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
//        Dog[] a = {new Dog(3),new Dog(5),new Dog(1)};
         Sorter<Cat> sorter = new Sorter();
        sorter.sort(a,new CatHeightComparator());
        System.out.println(Arrays.toString(a));
    }
}
