package com.rwto.designpattern.behavioral.observer.jdk;

import java.util.Observable;

/**
 * @author renmw
 * @create 2023/11/17 13:26
 **/
public class JDKDataSourceA extends Observable {

    public void update(String data){
        //一系列计算，数据发生变更
        System.out.println("数据源发生更新："+data);
        setChanged();
        notifyObservers(data);
    }
}
