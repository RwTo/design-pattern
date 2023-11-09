package com.rwto.designpattern.creational.singleton;

/**
 * @author renmw
 * @create 2023/11/6 13:58
 **/
//执行顺序：父类静态代码块 > 子类静态代码块 > 父类构造块 > 父类构造方法 > 子类构造块 > 子类构造方法
public class HungrySingleton {
    //方式1：静态变量
    private static HungrySingleton instance = new HungrySingleton();

    //方式2：静态代码块
    /*static {
        instance = new HungrySingleton();
    }*/
    //方式3：枚举，可以看 EnumSingleton.class

    public static HungrySingleton getInstance(){
        return instance;
    }
}
