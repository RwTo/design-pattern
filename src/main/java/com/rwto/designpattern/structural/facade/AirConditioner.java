package com.rwto.designpattern.structural.facade;

/**
 * 空调：充当子系统类
 * @author renmw
 * @create 2023/11/15 23:01
 **/
public class AirConditioner {

    public void turnOn(){
        System.out.println("打开空调");
    }

    public void turnOff(){
        System.out.println("关闭空调");
    }
}
