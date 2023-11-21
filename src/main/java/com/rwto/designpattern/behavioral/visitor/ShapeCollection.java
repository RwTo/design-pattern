package com.rwto.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 图形集合：充当元素集合
 * 存储所有元素
 * @author renmw
 * @create 2023/11/21 23:04
 **/
public class ShapeCollection {
    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape){
        if(shapes.contains(shape)){
            return;
        }
        shapes.add(shape);
    }

    public void remove(Shape shape){
        shapes.remove(shape);
    }

    public void accept(Visitor visitor){
        shapes.forEach(shape -> shape.accept(visitor));
    }
}
