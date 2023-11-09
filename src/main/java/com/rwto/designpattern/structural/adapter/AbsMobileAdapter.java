package com.rwto.designpattern.structural.adapter;

/**
 * 抽象适配器类
 * @author renmw
 * @create 2023/11/9 18:42
 **/
public abstract class AbsMobileAdapter implements MobileElectricity{
    @Override
    public int output5V() {
        throw new RuntimeException("请先重写");
    }

    @Override
    public int output10V() {
        throw new RuntimeException("请先重写");
    }
}
