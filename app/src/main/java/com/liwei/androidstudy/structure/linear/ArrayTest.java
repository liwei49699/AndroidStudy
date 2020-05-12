package com.liwei.androidstudy.structure.linear;

import java.util.Arrays;

/**
 * 数组类型
 */
public class ArrayTest {

    public static void test(){
        //创建数组的三种方式(可存储基本数据类型和对象类型)
        //静态方式创建1
        int[] array1 = {1,2,3};
        //静态方式创建2
        int[] array2 = new int[]{1,2,3};
        //动态创建
        int[] arrayValue3 = new int[5];
        Integer[] arrayObject3 = new Integer[5];

        System.out.println("基本数据类型数组arrayValue3：" + Arrays.toString(arrayValue3));
        System.out.println("对象类型数组arrayObject3：" + Arrays.toString(arrayObject3));

        System.out.println("原始的数组array1：" + Arrays.toString(array1));

        //优势
        //修改，赋值
        array1[1] = 4;
        //取值 超出长度时会报数组下标越界异常
        int a1 = array1[1];
        System.out.println("修改后的数组array1:" + a1 + "==" + Arrays.toString(array1));

        //劣势：删除时需数组的copy，且易产生碎片
        //删除(删除索引为1的数据)
        //创建新数组存储数据
        int[] array4 = new int[array1.length - 1];
        for (int i = 0; i < array4.length; i++) {

            if (i < 1) {
                array4[i] = array1[i];
            } else {
                array4[i] = array1[i + 1];
            }
        }
        array1 = array4;
        System.out.println("删除索引为1的数据后的数组array1：" + Arrays.toString(array1));
        //插入(在索引1处插入数据5) 扩容时需数组复制
        //数组容量固定的话需创建新数组扩容接受
        int[] array5 = new int[array1.length + 1];
        for (int i = 0; i < array5.length; i++) {
            if (i < 1) {
                array5[i] = array1[i];
            } else if (i == 1) {
                array5[i] = 5;
            } else {
                array5[i] = array1[i - 1];
            }
        }
        array1 = array5;
        System.out.println("在索引为1的数据后的数组array1：" + Arrays.toString(array1));

    }
}
