package com.rwto.designpattern.behavioral.visitor;

/**
 * @author renmw
 * @create 2023/11/21 22:52
 **/
public interface Visitor {
    /**
     * 访问信息方法
     * 每增加一个访问元素，要增加一个方法
     * @param circle
     */
    void drawCircle(Circle circle);
    void drawRectangle(Rectangle rectangle);
}
