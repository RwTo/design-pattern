package com.rwto.designpattern.behavioral.visitor;

/**
 * 矩形：具体访问的元素
 * @author renmw
 * @create 2023/11/21 22:55
 **/
public class Rectangle implements Shape{
    @Override
    public void accept(Visitor visitor) {
        visitor.drawRectangle(this);
    }
}
