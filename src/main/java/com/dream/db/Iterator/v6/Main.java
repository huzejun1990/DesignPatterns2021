package com.dream.db.Iterator.v6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author : huzejun
 * @Date: 2021/12/16-21:26
 * v1:构造一个容器，可以添加对象
 * v2:用链表来实现一个容器
 * v3:添加容器的共同接口，实现容器的替换
 * v4:如何对容器遍历呢？
 * v4:用一种统一的遍历方式，要求每一个容器都要提供Iterator的实现类
 *     作业：实现Linked的Iterator
 * v6:JDK的容器Iterator
 */
public class Main {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        for (int i = 0; i < 15; i++) {
            c.add(new String("s" + i));
        }
        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
