package com.liwei.androidstudy.algorithm;

import java.util.Arrays;

public class BubbleSort {

/**
 * 冒泡排序,时间复杂度为O(n^2)
 * @param arr
 */
public static void bobbleSort(int[] arr) {
    // 是否进行过交换,默认为false
    boolean flag = false;
    // 需要遍历的次数
    for (int i = 0; i < arr.length - 1; i++) {
        //遍历数组中的值,来比较
        for (int j = 0; j < arr.length - 1 - i; j++) {
            // 如果后面的数比前面的数要大,则进行交换
            if (arr[j] > arr[j+1]) {
                flag = true;
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        // 如果flag==false,表示没有进行过交换,直接退出即可
        // 即已经排好了序
        if (!flag) {
            break;
        } else {
            // 要将flag重置,进行下一次的判断
            flag = false;
        }
    }
    System.out.println(Arrays.toString(arr));
}
}
