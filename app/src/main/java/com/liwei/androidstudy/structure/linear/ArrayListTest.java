package com.liwei.androidstudy.structure.linear;

import java.util.ArrayList;

public class ArrayListTest {

    public static void test(){

        //可变数组的集合(具体底层原理在后续分析)
        //创建 只能存储对象内类
        ArrayList<Integer> arrayList = new ArrayList();

        //添加基本数据类型时会自动装箱(Integer i= 1)
        //手动装箱(Integer i = Integer.valueOf(1))
        //add时会涉及到数组的扩容 复制
        arrayList.add(1);
        arrayList.add(1);

        //索引删除(删除是也会涉及数组的复制)
        arrayList.remove(1);
        Integer integer = 1;
        //对应值删除(删除可能存在歧义,不知删除对应值还是索引位置)
        //删除时会对应类型的equals方法
        arrayList.remove(integer);

        //超出长度时会报数组下标越界异常
        Integer integer1 = arrayList.get(0);

    }

}
