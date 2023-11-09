package com.rwto.designpattern.creational.singleton;

/**
 * @author renmw
 * @create 2023/11/6 14:06
 **/
public enum EnumSingleton {
    SINGLETON("111","这是一个单例");

    private String value;
    private String msg;

    EnumSingleton(String value, String msg) {
        this.value = value;
        this.msg = msg;
    }
}
