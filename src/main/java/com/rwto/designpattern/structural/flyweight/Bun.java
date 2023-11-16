package com.rwto.designpattern.structural.flyweight;

/**
 * 包子接口：充当抽象享元角色
 * @author renmw
 * @create 2023/11/16 13:11
 **/
public abstract class Bun {
    protected Integer price;

    public Bun(Integer price) {
        this.price = price;
    }

    public abstract void show();
}
