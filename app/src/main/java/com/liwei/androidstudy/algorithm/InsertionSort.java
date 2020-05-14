package com.liwei.androidstudy.algorithm;

import java.util.Arrays;

public class InsertionSort {

    /**
     * 插入排序
     * @param array 带排序数组
     */
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            // 定义待插入的数 从第二个数开始和第一个数进行比较
            int insertValue = array[i];
            // 第一个数的下标
            int insertIndex = i -1;
            //与前面的数作比较
            while (insertIndex >= 0 && insertValue < array[insertIndex]) {
                array[insertIndex+1] = array[insertIndex];
                insertIndex--;
            }
            // 将新数据插入
            if (insertIndex + 1 != i) {
                array[insertIndex + 1] = insertValue;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
