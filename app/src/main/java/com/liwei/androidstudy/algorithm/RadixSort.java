package com.liwei.androidstudy.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {

    /**
     * 基数排序
     * @param arr 待排序数组
     */
    public static void radixSort(int[] arr) {
        // 获取最大的数是多少位
        int digit = getMaxDigit(arr);
        for (int i = 0; i < digit; i++) {
            // 执行 digit 次 bucketSort 排序即可
            bucketSort(arr, i);
        }
        System.out.println(Arrays.toString(arr));
    }
    private static int getMaxDigit(int[] arr) {
        // 默认只有一位
        int digit = 1;
        // 十进制每多一位，代表其值大了10倍
        int base = 10;
        for (int i : arr) {
            while (i >= base) {
                digit ++;
                base = base * 10;
            }
        }
        return digit;
    }
    private static void bucketSort(int[] arr, int digit) {
        int base = (int) Math.pow(10, digit);
        // init buckets
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
        // 只有0~9这十个数，所以准备十个桶
        for (int i = 0; i < 10; i++) {
            buckets.add(new ArrayList<Integer>());
        }
        // sort
        for (int i : arr) {
            int index = i / base % 10;
            buckets.get(index).add(i);
        }
        // output: copy back to arr
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int i : bucket) {
                arr[index++] = i;
            }
        }
    }
}
