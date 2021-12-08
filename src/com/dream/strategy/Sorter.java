package com.dream.strategy;

/**
 * @Author : huzejun
 * @Date: 2021/12/4-16:03
 */
public class Sorter<T> {

    public  void sort(T[] arr,Comparator<T> comparator){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i+1; j <arr.length; j++) {
                minPos = comparator.compare(arr[j],arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr,i,minPos);
        }
    }

    // sort(int) /sort(double)

    void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
