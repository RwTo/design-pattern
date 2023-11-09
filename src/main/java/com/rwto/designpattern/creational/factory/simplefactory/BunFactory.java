package com.rwto.designpattern.creational.factory.simplefactory;

import com.rwto.designpattern.creational.factory.BeefBun;
import com.rwto.designpattern.creational.factory.Bun;
import com.rwto.designpattern.creational.factory.PorkBun;

/**
 * @author renmw
 * @create 2023/11/6 19:09
 **/

/**
 * 具体工厂：提供了创建产品的方法，调用者通过该方法来创建产品。
 */
public class BunFactory {

    public Bun createBun(String type){
        Bun bun = null;
        switch (type){
            case "beef":
                bun = new BeefBun();
                break;
            case "pork":
                bun = new PorkBun();
                break;
            default:
                throw new RuntimeException("我不会做");
        }
        return bun;
    }

    /**
     * 静态简单工厂
     * @param type
     * @return
     */
    public static Bun staticCreateBun(String type){
        Bun bun = null;
        switch (type){
            case "beef":
                bun = new BeefBun();
                break;
            case "pork":
                bun = new PorkBun();
                break;
            default:
                throw new RuntimeException("我不会做");
        }
        return bun;
    }
}
