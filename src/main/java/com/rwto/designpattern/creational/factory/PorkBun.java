package com.rwto.designpattern.creational.factory;

/**
 * 具体产品：实现或者继承抽象产品的子类。
 * @author renmw
 * @create 2023/11/6 19:09
 **/
public class PorkBun implements Bun {
    public PorkBun() {
        System.out.println("包猪肉包");
    }

    @Override
    public void pack() {
    }
}
