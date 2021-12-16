package com.dream.db.Iterator.v3;

/**
 * @Author : huzejun
 * @Date: 2021/12/16-17:18
 */
class LinkedList_ implements Collection_ {
    Node head = null;
    Node tail = null;
    //目前容器中有多少个元素
    private int size = 0;

    public void add(Object o){
        Node n = new Node(o);
        n.next = null;

        if (head == null){
            head = n;
            tail = n;
        }
        tail.next = n;
        tail = n;
        size++;
    }

    private class Node {
        private Object o;
        Node next;

        public Node(Object o) {
            this.o = o;
        }

    }
    public int size(){
        return size;
    }

}
