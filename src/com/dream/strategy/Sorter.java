package com.dream.strategy;

/**
 * @Author : huzejun
 * @Date: 2021/12/4-16:03
 */
public class Sorter {

    public static void sort(Comparable[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i+1; j <arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr,i,minPos);
        }
    }

    // sort(int) /sort(double)

    static  void swap(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
