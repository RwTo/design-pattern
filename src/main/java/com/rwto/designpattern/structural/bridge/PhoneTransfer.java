package com.rwto.designpattern.structural.bridge;

/**
 * @author renmw
 * @create 2023/11/16 10:59
 **/
public class PhoneTransfer implements Transfer{
    @Override
    public void transferOut() {
        System.out.println("手机转账");
    }
}
