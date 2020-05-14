package com.liwei.androidstudy.algorithm;

public class MergeSort {

    /**
     * 归并排序
     * @param arr  原数组
     * @param left  左下标
     * @param right 右下标
     * @param temp 临时数组
     */
    public static void mergeSort(int[] arr,int left,int right,int[] temp){
        if (left < right){
            int mid =( left + right )/2;
            // 向左递归
            mergeSort(arr,left,mid,temp);
            // 向右递归
            mergeSort(arr,mid+1,right,temp);
            // 合并
            merge(arr,left,mid,right,temp);
        }
    }
    /**
     * 合并
     * @param arr 需要排序的原始数组
     * @param left 左边有序序列的初始索引
     * @param mid  中间索引
     * @param right 右边有序序列的初始索引
     * @param temp 临时数组
     */
    public static void merge(int[] arr,int left,int mid,int right,int[] temp) {
        // 初始化i,左边有序序列的初始索引
        int i = left;
        // 初始化j,右边有序序列的初始索引
        int j = mid + 1;
        // 临时数组的索引
        int t = 0;
        //1.将左右两边的有序数据按照规则填充到temp中,直到左右两边的有序序列有一边处理完为止
        while (i <= mid && j <= right) {
            //如果左边的有序序列当前的元素小于右边有序序列当前的元素
            if (arr[i] <= arr[j]) {
                // 将左边有序序列的元素填充到temp中
                temp[t] = arr[i];
                t = t + 1;
                i = i + 1;
            } else {
                //如果右边的有序序列当前的元素小于左边有序序列当前的元素
                // 将右边有序序列的元素填充到temp中
                temp[t] = arr[j];
                t = t + 1;
                j = j + 1;
            }
        }
        //2.把剩余的数据的一边依次全部填充到temp中
        while (i <=  mid){
            // 左边的有效数据还有剩余就全部填充到temp中
            temp[t] = arr[i];
            t = t + 1;
            i = i + 1;
        }
        while (j <= right){
            // 右边的有效数据还有剩余就全部填充到temp中
            temp[t] = arr[j];
            t = t + 1;
            j = j + 1;
        }
        //3.将temp数组的元素拷贝到arr中,每次都要拷贝
        // t要清空
        t = 0;
        int tempLeft = left;
        while (tempLeft <= right){
            arr[tempLeft] = temp[t];
            t = t + 1;
            tempLeft = tempLeft + 1;
        }
    }
}
