package com.rwto.designpattern.behavioral.observer.simple;

/**
 * @author renmw
 * @create 2023/11/17 13:26
 **/
public class DataSourceA extends DataSource{

    public void update(String data){
        //一系列计算，数据发生变更
        System.out.println("数据源发生更新："+data);
        notifyObserver(data);
    }

    @Override
    protected void notifyObserver(String data) {
        for (ViewObserver observer : this.observers) {
            observer.update(data);
        }
    }
}
