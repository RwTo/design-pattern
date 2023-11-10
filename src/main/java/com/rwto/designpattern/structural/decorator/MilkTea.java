package com.rwto.designpattern.structural.decorator;

/**
 * 被装饰者：奶茶
 * @author renmw
 * @create 2023/11/10 19:03
 **/
public class MilkTea implements Tea{

    @Override
    public String getName() {
        return "奶茶";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
