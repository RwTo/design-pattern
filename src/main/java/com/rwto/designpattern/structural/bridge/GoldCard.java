package com.rwto.designpattern.structural.bridge;

/**
 * @author renmw
 * @create 2023/11/16 10:59
 **/
public class GoldCard extends BankCard{


    public GoldCard(Transfer transfer) {
        super(transfer);
    }


    @Override
    public void transfer() {
        System.out.println("金卡===");
        super.transfer();
    }
}
