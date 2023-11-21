package com.rwto.designpattern.behavioral.mediator;

/**
 * 人：充当抽象同事角色
 * 需要包含 中介者属性
 * 需要两个方法，接收信息和发送信息
 * @author renmw
 * @create 2023/11/21 19:17
 **/
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void sendMsg(String msg);
    public abstract void getMsg(String msg);
}
