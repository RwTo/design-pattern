package com.rwto.designpattern.behavioral.observer.simple;

/**
 * 视图观察者：充当观察者抽象
 * 定义观察者观察到信息后，需要执行的方法
 * @author renmw
 * @create 2023/11/17 13:15
 **/
public interface ViewObserver {
    void update(String data);
}
