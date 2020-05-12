package com.liwei.androidstudy.structure.linear;

import java.util.LinkedList;

public class LinkedListTest {

    public static void test() {

        //创建链表(通过指针连接实现,原理后面分析)
        LinkedList<Integer> linkedList = new LinkedList<>();
        //在链表尾部插入数据 成功插入返回true
        boolean add = linkedList.add(1);
        //获取位置0处的节点值 越界IndexOutOfBoundsException
        //查找时会根据下标判断是从头结点还是尾结点遍历
        Integer integer = linkedList.get(0);
        //获取头结点的值 empty则NoSuchElementException
        Integer first = linkedList.getFirst();
        //获取尾结点的值 empty则NoSuchElementException
        Integer last = linkedList.getLast();
        //移除第一个结点 越界IndexOutOfBoundsException 返回结点值
        Integer remove = linkedList.remove(0);
        //对应值的结点删除(删除可能存在歧义,不知删除对应值还是索引位置)
        //删除时会对应类型的equals方法 不存在返回false
        boolean remove1 = linkedList.remove(new Integer(1));
    }
}
