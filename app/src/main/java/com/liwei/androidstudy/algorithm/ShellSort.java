package com.liwei.androidstudy.algorithm;

import java.util.Arrays;

public class ShellSort {

    /**
     * 希尔排序
     * @param arr 排序数组
     */
    public static void shellSort(int[] arr){

        for (int step = arr.length / 2; step > 0 ; step = step / 2) {
            // 每次缩小遍历次数增量 每次折半,缩小增量
            for (int i = step; i < arr.length; i++) {
                // 从step个位置,逐步对其所在的元素进行插入排序
                // 假定最小值是arr[i]
                int minValue = arr[i];
                // 记录i
                int minIndex = i;
                //1.minIdx-gap >=0 确保插入的位置不会越界
                //2.minVal < arr[minIdx-gap] 找到了待插入的数
                while (minIndex - step >= 0 && minValue < arr[minIndex - step]){
                    // 同插入排序
                    arr[minIndex] = arr[minIndex - step];
                    minIndex = minIndex - step;
                }
                arr[minIndex] = minValue;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
