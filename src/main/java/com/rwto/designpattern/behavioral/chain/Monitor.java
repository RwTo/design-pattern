package com.rwto.designpattern.behavioral.chain;

/**
 * 组长：具体处理节点
 * @author renmw
 * @create 2023/11/21 19:46
 **/
public class Monitor extends Handler{

    @Override
    public void askForLeave(int days) {
        if (days < 10){
            System.out.println("组长审批假条："+days+" 天");
            return;
        }
        if(superior == null){
            System.out.println("拒绝审批！"+days+" 天");
            return;
        }
        superior.askForLeave(days);
    }
}
