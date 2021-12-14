package com.dream.strategy;

/**
 * @Author : huzejun
 * @Date: 2021/12/8-17:06
 */
public class CatHeightComparator implements Comparator<Cat>{

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.height > o2.height) return -1;
        else if (o1.height < o2.height) return 1;
        else return 0;
    }
}
