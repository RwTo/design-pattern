package com.rwto.designpattern.behavioral.visitor;

/**
 * @author renmw
 * @create 2023/11/21 23:03
 **/
public class VisitorTest {
    public static void main(String[] args) {
        ShapeCollection collection = new ShapeCollection();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        collection.add(circle);
        collection.add(rectangle);

        //用红色蜡笔访问
        RedCrayon redCrayon = new RedCrayon();
        collection.accept(redCrayon);

        System.out.println("==================================");
        //用黑色蜡笔访问
        BlackCrayon blackCrayon = new BlackCrayon();
        collection.accept(blackCrayon);
    }
}
