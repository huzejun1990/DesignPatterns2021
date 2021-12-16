package com.dream.db.Iterator.v5;

/**
 * @Author : huzejun
 * @Date: 2021/12/16-17:23
 * v1:构造一个容器，可以添加对象
 * v2:用链表来实现一个容器
 * v3:添加容器的共同接口，实现容器的替换
 * v4:如何对容器遍历呢？
 */
public class Main {
    public static void main(String[] args) {
        Collection_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());

        //这个接口的调用方式：
        Iterator_ it = list.iterator();;
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
    }
}
