package com.rwto.designpattern.structural.facade;

/**
 * @author renmw
 * @create 2023/11/15 23:01
 **/
public class SoundBox {

    public void turnOn(){
        System.out.println("打开音响，播放音乐!");
    }

    public void turnOff(){
        System.out.println("关闭音响");
    }
}
