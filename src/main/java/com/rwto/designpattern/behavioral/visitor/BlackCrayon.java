package com.rwto.designpattern.behavioral.visitor;

/**
 * 黑色蜡笔：充当具体访问者
 * @author renmw
 * @create 2023/11/21 23:03
 **/
public class BlackCrayon implements Visitor{
    @Override
    public void drawCircle(Circle circle) {
        System.out.println("用黑色蜡笔 画 圆");
    }

    @Override
    public void drawRectangle(Rectangle rectangle) {
        System.out.println("用黑色蜡笔 画 矩形");
    }
}
