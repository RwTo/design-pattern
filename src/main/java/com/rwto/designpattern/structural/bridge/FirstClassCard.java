package com.rwto.designpattern.structural.bridge;

/**
 * @author renmw
 * @create 2023/11/16 10:59
 **/
public class FirstClassCard extends BankCard{


    public FirstClassCard(Transfer transfer) {
        super(transfer);
    }

    @Override
    public void transfer() {
        System.out.println("一类卡===");
        super.transfer();
    }
}
