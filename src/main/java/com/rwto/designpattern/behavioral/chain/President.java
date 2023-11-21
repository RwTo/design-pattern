package com.rwto.designpattern.behavioral.chain;

/**
 * 董事长：最高级处理节点
 * @author renmw
 * @create 2023/11/21 19:46
 **/
public class President extends Handler{

    @Override
    public void askForLeave(int days) {
        if (days < 100){
            System.out.println("董事长审批假条："+days+" 天");
            return;
        }
        if(superior == null){
            System.out.println("拒绝审批！");
            return;
        }
        superior.askForLeave(days);
    }
}
