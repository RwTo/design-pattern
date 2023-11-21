package com.rwto.designpattern.behavioral.chain;

/**
 * 大领导：处理节点
 * @author renmw
 * @create 2023/11/21 19:46
 **/
public class Leader extends Handler{

    @Override
    public void askForLeave(int days) {
        if (days < 30){
            System.out.println("大领导审批假条："+days+" 天");
            return;
        }
        if(superior == null){
            System.out.println("拒绝审批！");
            return;
        }
        superior.askForLeave(days);
    }
}
