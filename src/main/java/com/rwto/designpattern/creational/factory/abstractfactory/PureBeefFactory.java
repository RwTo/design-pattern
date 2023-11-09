package com.rwto.designpattern.creational.factory.abstractfactory;

import com.rwto.designpattern.creational.factory.BeefBun;
import com.rwto.designpattern.creational.factory.Bun;

/**
 * @author renmw
 * @create 2023/11/6 19:51
 **/
public class PureBeefFactory implements Factory{
    @Override
    public Bun createBun() {
        return new BeefBun();
    }

    @Override
    public Milk createMilk() {
        return new PureMilk();
    }
}
