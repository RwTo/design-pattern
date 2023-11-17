package com.rwto.designpattern.behavioral.observer.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据源类：充当抽象主题角色
 * 观察者模式抽象主题角色写法大致一致
 * 包含，观察者列表，增删观察者方法，通知观察者方法

 * @author renmw
 * @create 2023/11/17 13:21
 **/
public abstract class DataSource {
    protected List<ViewObserver> observers = new ArrayList<>();
    //添加观察者
    public void addObserver(ViewObserver observer) {
        observers.add(observer);
    }
    //删除观察者
    public void removeObserver(ViewObserver observer) {
        observers.remove(observer);
    }


    protected abstract void notifyObserver(String data);
}
