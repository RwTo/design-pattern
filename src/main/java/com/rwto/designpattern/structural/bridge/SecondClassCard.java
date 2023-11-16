package com.rwto.designpattern.structural.bridge;

/**
 * @author renmw
 * @create 2023/11/16 10:59
 **/
public class SecondClassCard extends BankCard{

    public SecondClassCard(Transfer transfer) {
        super(transfer);
    }

    @Override
    public void transfer() {
        System.out.println("二类卡===");
        super.transfer();
    }
}
