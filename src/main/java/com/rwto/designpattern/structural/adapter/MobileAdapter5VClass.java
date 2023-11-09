package com.rwto.designpattern.structural.adapter;

/**
 * 类对象适配器
 * @author renmw
 * @create 2023/11/9 18:36
 **/
public class MobileAdapter5VClass extends HouseholdElectricity220V implements MobileElectricity{
    @Override
    public int output5V() {
        super.output220V();
        /*变压操作*/
        System.out.println("开始变压220V->5V");
        System.out.println("输出5V");
        return 5;
    }

    @Override
    public int output10V() {
        super.output220V();
        /*变压操作*/
        System.out.println("开始变压220V->10V");
        System.out.println("输出10V");
        return 10;
    }
}
