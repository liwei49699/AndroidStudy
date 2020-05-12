package com.liwei.androidstudy.structure.linear;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void test() {

        //创建队列(LinkedList实现了Queue,拥有queue的特性)
        //特性:先进先出
        Queue<Integer> queue = new LinkedList<>();
        //进队 往队尾插入
        queue.offer(1);
        //获取队头元素 不可为empty(empty NoSuchElementException)
        Integer element = queue.element();
        //获取队头元素 可以empty(empty返回null)
        Integer peek = queue.peek();
        //获取队头元素 并删除(empty返回null)
        Integer poll = queue.poll();
        //获取队头元素 并删除(empty NoSuchElementException)
        Integer remove = queue.remove();
    }
}
