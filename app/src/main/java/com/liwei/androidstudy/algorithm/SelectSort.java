package com.liwei.androidstudy.algorithm;

import java.util.Arrays;

public class SelectSort {

    /**
     * 选择排序 时间复杂度O(n^2)
     * @param arr 排序数组
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            // 记录最小值的下标,从0开始
            int minIndex = i;
            // 记录最小值,假设是a[0]开始
            int minValue = arr[i];
            // 从i后开始循环
            for (int j = i+1; j < arr.length; j++) {
                // 如果最小的值,并不是a[i],重置minIndex和minValue
                if (minValue > arr[j]){
                    // 获取最小值,和最小值的下标
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            // 将最小的值放在a[i],比较并进行交换
            if (minIndex != i) {
                // 把a[0]第一个值先放在a[minIndex]处
                arr[minIndex] = arr[i];
                // 把保存下来的最小值回填到a[0],即找到了全局的最小值
                arr[i] = minValue;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
