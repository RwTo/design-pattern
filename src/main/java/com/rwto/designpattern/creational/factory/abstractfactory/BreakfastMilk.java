package com.rwto.designpattern.creational.factory.abstractfactory;

/**
 * @author renmw
 * @create 2023/11/6 19:50
 **/
public class BreakfastMilk implements Milk{
    public BreakfastMilk() {
        System.out.println("做一杯早餐奶");
    }

    @Override
    public void pack() {
    }
}
