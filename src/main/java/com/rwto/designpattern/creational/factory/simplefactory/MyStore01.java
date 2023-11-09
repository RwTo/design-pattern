package com.rwto.designpattern.creational.factory.simplefactory;

import com.rwto.designpattern.creational.factory.Bun;
import com.rwto.designpattern.creational.factory.simplefactory.BunFactory;

/**
 * @author renmw
 * @create 2023/11/6 19:17
 **/
public class MyStore01 {
    /**
     * 简单工厂模式
     * 只有一个工厂
     */
    BunFactory factory = new BunFactory();


    public Bun order(String type){
        Bun bun = factory.createBun(type);
        //打包...等操作
        bun.pack();
        return bun;
    }
}
