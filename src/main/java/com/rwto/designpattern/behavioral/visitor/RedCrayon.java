package com.rwto.designpattern.behavioral.visitor;

/**
 * 红色蜡笔：充当具体访问者
 * 每增加一个元素，需要增加一个访问方法，违反开闭原则
 * @author renmw
 * @create 2023/11/21 23:01
 **/
public class RedCrayon implements Visitor {
    @Override
    public void drawCircle(Circle circle) {
        System.out.println("用红色蜡笔 画 圆");
    }

    @Override
    public void drawRectangle(Rectangle rectangle) {
        System.out.println("用红色蜡笔 画 矩形");
    }
}
