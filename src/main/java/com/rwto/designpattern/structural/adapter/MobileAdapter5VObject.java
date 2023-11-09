package com.rwto.designpattern.structural.adapter;

/**
 * 对象适配器
 * @author renmw
 * @create 2023/11/9 18:39
 **/
public class MobileAdapter5VObject implements MobileElectricity{

    private final HouseholdElectricity220V electricity220V;

    public MobileAdapter5VObject(HouseholdElectricity220V householdElectricity220V) {
        this.electricity220V = householdElectricity220V;
    }

    @Override
    public int output5V() {
        electricity220V.output220V();
        /*变压操作*/
        System.out.println("开始变压220V->5V");
        System.out.println("输出5V");
        return 5;
    }

    @Override
    public int output10V() {
        electricity220V.output220V();
        /*变压操作*/
        System.out.println("开始变压220V->10V");
        System.out.println("输出10V");
        return 10;
    }
}
