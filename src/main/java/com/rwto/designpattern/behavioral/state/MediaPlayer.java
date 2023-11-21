package com.rwto.designpattern.behavioral.state;

/**
 * 媒体播放器：充当环境类
 * 内部含有状态属性，根据状态属性决定播放行为
 * @author renmw
 * @create 2023/11/21 22:32
 **/
public class MediaPlayer {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void doAction(){
        this.state.action();
    }
}
