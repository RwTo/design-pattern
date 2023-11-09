package com.rwto.designpattern.creational.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author renmw
 * @create 2023/11/6 14:09
 **/
@SpringBootTest
public class SingletonTest {

    @Test
    public void hungrySingletonTest(){
        /**
         * 饿汉式（三种实现方式）
         */
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance1 == instance2); //true

        EnumSingleton singleton1 = EnumSingleton.SINGLETON;
        EnumSingleton singleton2 = EnumSingleton.SINGLETON;
        System.out.println(singleton1 == singleton2); //true

        /**
         * 懒汉式
         */
    }

    @Test
    public void lazySingletonTest(){
        /**
         * 懒汉式（四种实现方式）
         */
        //简单懒汉式
        LazySingleton instance01 = LazySingleton.getInstance01();
        //synchronized
        LazySingleton instance02 = LazySingleton.getInstance02();
        //双重检查锁
        LazySingleton instance03 = LazySingleton.getInstance03();
        //静态内部类--推荐使用
        LazySingleton instance04 = LazySingleton.getInstance04();
    }
}
