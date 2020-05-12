package com.liwei.androidstudy.structure.tree;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {

    public static void test() {

        //创建TreeMap 基于红黑树实现(后面章节讲解) 元素会根据映射(key-value)key进行自然排序
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        //插入数据 会根据key的compareTo排序
        //0 已存在 返回被覆盖值 <0 插前面 >0插后面 返回null
        String b = treeMap.put(2, "b");
        String a = treeMap.put(1, "a");
        treeMap.put(3, "v");
        //获取对应映射的值 不存在返回null
        String s = treeMap.get(1);
        //获取TreeMap中第一个映射Entry empty返回null
        Map.Entry<Integer, String> integerStringEntry = treeMap.firstEntry();
        //获取TreeMap中最后一个映射Entry empty返回null
        Map.Entry<Integer, String> integerStringEntry1 = treeMap.lastEntry();
        //获取排序小于key的映射集合
        SortedMap<Integer, String> integerStringSortedMap = treeMap.headMap(3);
        //获取排序大于key的映射集合
        SortedMap<Integer, String> integerStringSortedMap1 = treeMap.tailMap(2);
        //获取排序大于key1小于key2的映射集合
        SortedMap<Integer, String> integerStringSortedMap2 = treeMap.subMap(1, 3);

        //map的遍历 获取每一个Entry(底层也是通过iterator实现)
        for (Map.Entry<Integer, String> stringEntry : treeMap.entrySet()) {
            Integer key = stringEntry.getKey();
            String value = stringEntry.getValue();
        }

        //map的遍历 通过iterator
        Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();
            Integer key = next.getKey();
            String value = next.getValue();
        }
    }
}
