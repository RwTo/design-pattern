package com.rwto.designpattern.creational.factory.abstractfactory;

import com.rwto.designpattern.creational.factory.Bun;

/**
 * @author renmw
 * @create 2023/11/6 19:39
 **/
public interface Factory {
    Bun createBun();
    Milk createMilk();
}
