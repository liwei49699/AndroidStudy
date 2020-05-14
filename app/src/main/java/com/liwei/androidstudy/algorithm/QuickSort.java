package com.liwei.androidstudy.algorithm;

import java.util.Arrays;

public class QuickSort {

    /**
     * 快速排序
     * @param arr 排序数组
     * @param left 数组的开始索引
     * @param right 数组的结束索引
     */
    public static void quickSort(int[] arr,int left,int right) {
        int start = left;
        int end = right;
        //排序的基点
        int pivot = arr[(left + right) / 2];
        //左右两端扫描
        while (start <= end) {
            //从前向后寻找大于基点的值
            while (pivot > arr[start]) start++;
            //从后向前寻找小于基点的值
            while (pivot < arr[end]) end--;

            //交换值进行下一次循环
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        //从左边将剩余的树再排序
        if (end > left) quickSort(arr,left,end);
        //从有边将剩余的树再排序
        if (start < right) quickSort(arr,start,right);
        System.out.println(Arrays.toString(arr));
    }
}
