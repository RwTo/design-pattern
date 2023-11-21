package com.rwto.designpattern.behavioral.visitor;

/**
 * 圆形：具体访问的元素
 * @author renmw
 * @create 2023/11/21 22:55
 **/
public class Circle implements Shape{
    @Override
    public void accept(Visitor visitor) {
        visitor.drawCircle(this);
    }
}
