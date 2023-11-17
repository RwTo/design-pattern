package com.rwto.designpattern.behavioral.iterator.normal;

/**
 * 容器接口：充当抽象聚合器
 * 用来表名这是一个集合，并且可以使用迭代器遍历这个集合
 * @author renmw
 * @create 2023/11/17 14:53
 **/
public interface MyContainer {
    MyIterator getIterator();
}