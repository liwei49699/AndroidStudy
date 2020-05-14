package com.liwei.androidstudy.algorithm;

import java.util.Arrays;

public class HeapSort {

    /**
     * 堆排序
     * @param array 待排序数组
     */
    public static void heapSort(int[] array){
        int len = array.length;
        //建堆  len/2-1最后一个非叶子节点
        for(int i = len / 2 - 1; i >= 0;i--){
            maxHeapAdjust(array,i,len-1);
        }
        //排序,根节点和最后一个节点交换
        //换完以后，取走根，重新建堆
        //len-1 最后一个节点
        for(int i=len-1;i>0;i--){
            int temp=array[0];
            array[0]=array[i];
            array[i]=temp;
            maxHeapAdjust(array,0,i-1);
        }
        System.out.println(Arrays.toString(array));
    }
    /**
     * 堆调整
     * @param array 待排序数组
     * @param start 起始点
     * @param end 结束点
     */
    private static void maxHeapAdjust(int array[],int start,int end){
        //父亲的位置
        int father = start;
        //儿子的位置
        int son = father * 2 + 1;
        //如果子节点下标在可以调整的范围内就一直调整下去
        while(son <= end){
            //如果没有右孩子就不用比,有的话,比较两个儿子，选择最大的出来
            if(son + 1 <= end && array[son] < array[son+1]){
                son++;
            }
            //和父节点比大小
            if(array[father] > array[son]){
                return;
            } else {//父亲比儿子小，就要对整个子树进行调整
                int temp = array[son];
                array[son] = array[father];
                array[father] = temp;
                //递归下一层
                father = son;
                son = father * 2 + 1;
            }
        }
    }
}
