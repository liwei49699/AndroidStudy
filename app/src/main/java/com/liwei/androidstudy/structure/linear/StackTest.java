package com.liwei.androidstudy.structure.linear;

import java.util.Stack;

public class StackTest {

    public static void test(){

        //创建栈 先进后出
        Stack<Integer> stack = new Stack<>();
        //判断栈是否为空
        boolean empty = stack.empty();
        //往栈中插入数据(插入的新数据位于栈顶部)
        Integer push = stack.push(1);
        //获取栈顶部元素 为empty报EmptyStackException
        Integer peek = stack.peek();
        //获取栈顶部元素 且从堆栈中移除 为empty报EmptyStackException
        Integer pop = stack.pop();
        System.out.println(stack.toString());
        //获取元素在栈中的位置 不同于其它索引 需从1开始 没有返回-1
        int search = stack.search(1);
    }
}
