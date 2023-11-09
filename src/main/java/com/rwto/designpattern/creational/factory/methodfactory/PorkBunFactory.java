package com.rwto.designpattern.creational.factory.methodfactory;

import com.rwto.designpattern.creational.factory.Bun;
import com.rwto.designpattern.creational.factory.PorkBun;

/**
 * @author renmw
 * @create 2023/11/6 19:39
 **/
public class PorkBunFactory implements BunFactory {
    @Override
    public Bun createBun() {
        return new PorkBun();
    }
}
