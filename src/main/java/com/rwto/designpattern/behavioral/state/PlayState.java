package com.rwto.designpattern.behavioral.state;

/**
 * @author renmw
 * @create 2023/11/21 22:31
 **/
public class PlayState implements State{
    @Override
    public void action() {
        System.out.println("开始播放");
    }
}
