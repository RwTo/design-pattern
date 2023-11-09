package com.rwto.designpattern.creational.factory.abstractfactory;

import com.rwto.designpattern.creational.factory.Bun;

/**
 * @author renmw
 * @create 2023/11/6 19:41
 **/
public class MyStore03 {
    /**
     * 抽象工厂模式
     * 有多个工厂，一个工厂生产一个产品族
     * @param type
     * @return
     */
    Factory factory;

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public Bun orderBun(){
        Bun bun = factory.createBun();
        //打包...等操作
        bun.pack();
        return bun;
    }

    public Milk orderMilk(){
        Milk milk = factory.createMilk();
        milk.pack();
        return milk;
    }
}
