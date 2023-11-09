package com.rwto.designpattern.creational.factory.abstractfactory;

import com.rwto.designpattern.creational.factory.BeefBun;
import com.rwto.designpattern.creational.factory.Bun;
import com.rwto.designpattern.creational.factory.PorkBun;

/**
 * @author renmw
 * @create 2023/11/6 19:51
 **/
public class BreakfastPorkFactory implements Factory{
    @Override
    public Bun createBun() {
        return new PorkBun();
    }

    @Override
    public Milk createMilk() {
        return new BreakfastMilk();
    }
}
