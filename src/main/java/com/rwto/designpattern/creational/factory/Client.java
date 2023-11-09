package com.rwto.designpattern.creational.factory;

import com.rwto.designpattern.creational.factory.Bun;
import com.rwto.designpattern.creational.factory.abstractfactory.BreakfastPorkFactory;
import com.rwto.designpattern.creational.factory.abstractfactory.MyStore03;
import com.rwto.designpattern.creational.factory.abstractfactory.PureBeefFactory;
import com.rwto.designpattern.creational.factory.methodfactory.BeefBunFactory;
import com.rwto.designpattern.creational.factory.methodfactory.MyStore02;
import com.rwto.designpattern.creational.factory.methodfactory.PorkBunFactory;
import com.rwto.designpattern.creational.factory.simplefactory.MyStore01;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 模拟用户下单
 * @author renmw
 * @create 2023/11/6 19:26
 **/
@SpringBootTest
public class Client {


    /**
     * 简单工厂模式
     */
    @Test
    public void client01(){
        MyStore01 myStore = new MyStore01();
        Bun beef = myStore.order("beef");
        Bun pork = myStore.order("pork");
    }

    /**
     * 工厂方法模式
     */
    @Test
    public void client02(){
        MyStore02 myStore = new MyStore02();
        myStore.setFactory(new BeefBunFactory());
        myStore.order();
        myStore.setFactory(new PorkBunFactory());
        myStore.order();
    }


    /**
     * 抽象工厂模式
     */
    @Test
    public void client03(){
        MyStore03 myStore = new MyStore03();
        myStore.setFactory(new PureBeefFactory());
        myStore.orderBun();
        myStore.orderMilk();
    }
}
