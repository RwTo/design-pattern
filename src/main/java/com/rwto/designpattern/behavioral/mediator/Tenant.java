package com.rwto.designpattern.behavioral.mediator;

/**
 * 租客：充当具体同事角色
 * @author renmw
 * @create 2023/11/21 19:18
 **/
public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void sendMsg(String msg) {
        System.out.println(name+" 发送消息："+msg);
        /*将消息发送给 中介者，并指明是谁发的*/
        this.mediator.contact(msg,this);
    }

    @Override
    public void getMsg(String msg) {
        System.out.println(name+" 接收消息："+msg);
    }

}
