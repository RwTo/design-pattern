package com.rwto.designpattern.structural.adapter;

/**
 * 家用电：220V
 * 这是 被适配的类
 * @author renmw
 * @create 2023/11/9 18:30
 **/
public class HouseholdElectricity220V {
    /**
     * 输出220V电压
     * @return
     */
    public int output220V(){
        System.out.println("输出220V电压");
        return 220;
    }
}
