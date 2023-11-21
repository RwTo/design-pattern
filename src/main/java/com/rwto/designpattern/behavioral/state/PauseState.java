package com.rwto.designpattern.behavioral.state;

/**
 * 暂停状态：充当具体状态角色
 * 内部方法表示当前状态需要执行的操作
 * @author renmw
 * @create 2023/11/21 22:31
 **/
public class PauseState implements State{
    @Override
    public void action() {
        System.out.println("暂停播放");
    }
}
