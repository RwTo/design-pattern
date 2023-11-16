package com.rwto.designpattern.structural.bridge;

/**
 * 银行卡：充当抽象角色
 * 用来控制转账,提供桥接的功能
 * @author renmw
 * @create 2023/11/16 10:48
 **/
public abstract class BankCard {

    private Transfer transfer;

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
    }

    public BankCard(Transfer transfer) {
        this.transfer = transfer;
    }

    public void transfer(){
        transfer.transferOut();
    }
}
