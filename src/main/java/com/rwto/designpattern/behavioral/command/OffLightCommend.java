package com.rwto.designpattern.behavioral.command;

/**
 * 关灯命令，具体命令
 * @author renmw
 * @create 2023/11/21 20:14
 **/
public class OffLightCommend implements Commend{
    private Light light;

    public OffLightCommend(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
