package com.rwto.designpattern.behavioral.visitor;

/**
 * 形状：抽象元素
 * @author renmw
 * @create 2023/11/21 22:51
 **/
public interface Shape {
    /**
     * 接收访问的方法
     * @param visitor
     */
    void accept(Visitor visitor);
}
