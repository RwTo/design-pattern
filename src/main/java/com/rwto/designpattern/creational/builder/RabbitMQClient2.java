package com.rwto.designpattern.creational.builder;

import lombok.Builder;

@Builder
public class RabbitMQClient2 {

    private String host = "127.0.0.1";

    private int port = 5672;

    private int mode;

    private String exchange;

    private String queue;

    private boolean isDurable = true;

    int connectTime = 1000;

    public void sendMsg(String msg){
        System.out.println("发送消息："  + msg);
    }

}
