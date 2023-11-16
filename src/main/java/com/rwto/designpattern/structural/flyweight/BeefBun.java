package com.rwto.designpattern.structural.flyweight;

/**
 * 牛肉包，充当具体享元类
 * @author renmw
 * @create 2023/11/16 13:13
 **/
public class BeefBun extends Bun{
    public BeefBun(Integer price) {
        super(price);
    }

    @Override
    public void show() {
        System.out.println("牛肉包，售价："+this.price+" 元");
    }
}
