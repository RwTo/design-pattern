package com.rwto.designpattern.behavioral.iterator.normal;

/**
 * 迭代器接口：充当抽象迭代器角色
 * 用来定义统一遍历集合的方法
 * @author renmw
 * @create 2023/11/17 14:53
 **/
public interface MyIterator {
    boolean hasNext();
    Object next();
}
