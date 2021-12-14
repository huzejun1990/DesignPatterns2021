package com.dream.strategy;

/**
 * @Author : huzejun
 * @Date: 2021/12/8-16:53
 */
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1,T o2);

    default void m() {
        System.out.println("m");
    }
}
