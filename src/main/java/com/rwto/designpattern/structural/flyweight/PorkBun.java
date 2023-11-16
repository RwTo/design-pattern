package com.rwto.designpattern.structural.flyweight;

/**
 * 猪肉包，充当具体享元类
 * @author renmw
 * @create 2023/11/16 13:13
 **/
public class PorkBun extends Bun{

    public PorkBun(Integer price) {
        super(price);
    }

    @Override
    public void show() {
        System.out.println("猪肉包，售价："+this.price+" 元");
    }
}
