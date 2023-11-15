package com.rwto.designpattern.structural.facade;

/**
 * 小爱同学：充当外观类
 * @author renmw
 * @create 2023/11/15 23:05
 **/
public class XiaoAiStudent {
    private RobotCleaner robotCleaner = new RobotCleaner();
    private AirConditioner airConditioner = new AirConditioner();
    private Light light = new Light();
    private SoundBox soundBox = new SoundBox();

    public void coming(){
        System.out.println("我回来了======");
        robotCleaner.turnOff();
        airConditioner.turnOn();
        light.turnOn();
        soundBox.turnOn();
    }

    public void leaving(){
        System.out.println("我离开了======");
        robotCleaner.turnOff();
        airConditioner.turnOn();
        light.turnOn();
        soundBox.turnOn();
    }

    public void command(){
        //根据语音指令，执行对应的动作
    }
}
