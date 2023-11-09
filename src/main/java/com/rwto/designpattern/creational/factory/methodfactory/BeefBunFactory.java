package com.rwto.designpattern.creational.factory.methodfactory;

import com.rwto.designpattern.creational.factory.BeefBun;
import com.rwto.designpattern.creational.factory.Bun;

/**
 * @author renmw
 * @create 2023/11/6 19:37
 **/
public class BeefBunFactory implements BunFactory{

    @Override
    public Bun createBun() {
        return new BeefBun();
    }
}
