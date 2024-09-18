package com.rwto.designpattern.creational.singleton;

/**
 * @author renmw
 * @create 2023/11/6 13:59
 **/
public class LazySingleton {
    private volatile static LazySingleton instance;

    /**
     * 简单懒汉式
     * 问题：线程不安全，一般不用
     * @return
     */
    public static LazySingleton getInstance01() {
        if(null == instance){
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * synchronized
     * 解决了线程安全问题，但效率低，一般不用
     * @return
     */
    public synchronized static LazySingleton getInstance02() {
        if(null == instance){
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 双重检查锁模式
     * 降低锁的粒度，只锁创建对象的代码块
     * 需要增加 volatile 来保证原子性，防止jvm指令重排，但同时屏蔽了JVM的一些代码优化
     * @return
     */
    public static LazySingleton getInstance03() {
        if(null == instance){// 第一个判空：防止多个线程争抢锁，如果不是空，就不用锁了
            synchronized (LazySingleton.class){
                if(null == instance){//第二个判空：防止多个线程经过第一层判空，同时等待锁是否，防止重复创建对象
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    /**
     * 静态内部类方式
     * 只有在使用时才会创建静态内部类，推荐使用
     * @return
     */
    public static LazySingleton getInstance04() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder{
        private static final LazySingleton INSTANCE = new LazySingleton();
    }
}
