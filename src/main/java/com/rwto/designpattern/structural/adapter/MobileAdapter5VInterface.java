package com.rwto.designpattern.structural.adapter;

/**
 * 接口适配器类
 * @author renmw
 * @create 2023/11/9 18:41
 **/
public class MobileAdapter5VInterface extends AbsMobileAdapter{
    private final HouseholdElectricity220V electricity220V;

    public MobileAdapter5VInterface(HouseholdElectricity220V electricity220V) {
        this.electricity220V = electricity220V;
    }

    @Override
    public int output5V() {
        electricity220V.output220V();
        /*变压操作*/
        System.out.println("开始变压220V->5V");
        System.out.println("输出5V");
        return 5;
    }
}
