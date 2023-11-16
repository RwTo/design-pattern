package com.rwto.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 包子工厂：用来做享元工厂，生产牛肉包，猪肉包
 * 享元工厂一般是单例的，这里使用懒汉式静态内部类实现单例
 * @author renmw
 * @create 2023/11/16 13:06
 **/
public class BunFactory {


    //享元池
    public Map<String,Bun> bunPool = new ConcurrentHashMap<>();

    public Bun getBun(String name){
        Bun bun = bunPool.get(name);
        if(null != bun){
            return bun;
        }
        if("beef".equals(name)){
            bun = new BeefBun(10);
        }else if ("pork".equals(name)){
            bun = new PorkBun(5);
        }else{
            throw new RuntimeException("没有此类型的包子");
        }
        bunPool.put(name,bun);
        return bun;
    }

    public static BunFactory getInstance(){
        return SingletonHolder.INSTANCE;
    }


    private static class SingletonHolder{
        private static final BunFactory INSTANCE = new BunFactory();
    }
}
