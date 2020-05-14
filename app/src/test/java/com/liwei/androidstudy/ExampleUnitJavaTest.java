package com.liwei.androidstudy;

import com.liwei.androidstudy.algorithm.BubbleSort;
import com.liwei.androidstudy.algorithm.HeapSort;
import com.liwei.androidstudy.algorithm.InsertionSort;
import com.liwei.androidstudy.algorithm.MergeSort;
import com.liwei.androidstudy.algorithm.QuickSort;
import com.liwei.androidstudy.algorithm.RadixSort;
import com.liwei.androidstudy.algorithm.SelectSort;
import com.liwei.androidstudy.algorithm.ShellSort;
import com.liwei.androidstudy.structure.linear.ArrayListTest;
import com.liwei.androidstudy.structure.linear.ArrayTest;
import com.liwei.androidstudy.structure.linear.StackTest;
import com.liwei.androidstudy.structure.tree.TreeMapTest;

import org.junit.Test;

import java.util.Arrays;
import java.util.TreeMap;

public class ExampleUnitJavaTest {

    @Test
    public void testArray(){

//        int[] arrays = {1,2,3};
//        arrays[3] = 4;
//        System.out.println(arrays);
//        ArrayTest.test();

//        int[] array = new int[5];
//        Integer[] array1 = new Integer[5];
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array1));

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);

//        System.out.println(arrayList.get(1));

//        arrayList.remove(new Integer(1));
//
//        System.out.println(arrayList);

//        StackTest.test();
//        ArrayListTest.test();
//        int[] arrays = {3,2,6,4,7,9,1,8};
////        BubbleSort.bobbleSort(arrays);
////        SelectSort.selectSort(arrays);
////        InsertionSort.insertSort(arrays);
////        ShellSort.shellSort(arrays);
////        QuickSort.quickSort(arrays,0,arrays.length - 1);
//        int[] temp = new int[arrays.length];
//        MergeSort.mergeSort(arrays,0,arrays.length - 1,temp);
//        System.out.println(Arrays.toString(temp));
        int[] ints = {321, 1234, 543, 324, 24, 960, 540, 672, 783, 1000, 2131, 121, 2313, 141};
//        RadixSort.radixSort(ints);
        HeapSort.heapSort(ints);
    }

}
