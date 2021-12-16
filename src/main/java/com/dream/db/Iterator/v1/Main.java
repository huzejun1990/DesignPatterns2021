package com.dream.db.Iterator.v1;

/**
 * @Author : huzejun
 * @Date: 2021/12/16-15:02
 * 构造一个容器，可以添加对象
 */
public class Main {
    public static void main(String[] args) {
        ArrayList_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());
    }

}

/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
class ArrayList_ {
    Object[] objects = new Object[10];
    // objects中 下一个空的位置在哪儿，或者说，目前容器有多少个元素
    private int index = 0;
    public void add(Object o){
        if (index == objects.length) {
            Object[] newobjects = new Object[this.objects.length * 2];
            System.arraycopy(objects,0,newobjects,0,objects.length);
            objects = newobjects;
        }
        objects[index] = 0;
        index ++;
    }
    public int size(){
        return index;
    }
}
