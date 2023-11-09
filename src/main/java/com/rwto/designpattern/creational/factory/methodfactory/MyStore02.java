package com.rwto.designpattern.creational.factory.methodfactory;

import com.rwto.designpattern.creational.factory.Bun;

/**
 * @author renmw
 * @create 2023/11/6 19:41
 **/
public class MyStore02 {
    /**
     * 工厂方法模式
     * 有多个工厂，一个工厂只产一种产品
     * @param type
     * @return
     */
    BunFactory factory;

    public void setFactory(BunFactory factory) {
        this.factory = factory;
    }

    public Bun order(){
        Bun bun = factory.createBun();
        //打包...等操作
        bun.pack();
        return bun;
    }
}
