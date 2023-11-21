package com.rwto.designpattern.behavioral.command;

/**
 * @author renmw
 * @create 2023/11/21 20:15
 **/
public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        User user = new User();
        //打开灯
        user.openLight(new OnLightCommend(light));
        //关灯
        user.closeLight(new OffLightCommend(light));
    }
}
