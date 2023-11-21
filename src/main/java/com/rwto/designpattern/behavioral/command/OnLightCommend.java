package com.rwto.designpattern.behavioral.command;

/**
 * 开灯命令，具体命令
 * @author renmw
 * @create 2023/11/21 20:14
 **/
public class OnLightCommend implements Commend{
    private Light light;

    public OnLightCommend(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
