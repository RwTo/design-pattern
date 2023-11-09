package com.rwto.designpattern.creational.factory.abstractfactory;

/**
 * @author renmw
 * @create 2023/11/6 19:50
 **/
public class PureMilk implements Milk{
    public PureMilk() {
        System.out.println("做一杯纯牛奶");
    }

    @Override
    public void pack() {
    }
}
