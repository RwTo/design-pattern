package com.rwto.designpattern.behavioral.observer.simple;

/**
 * @author renmw
 * @create 2023/11/17 13:18
 **/
public class ViewBObserver implements ViewObserver {
    @Override
    public void update(String data) {

        System.out.println(data + " ViewB 更新视图！");
    }
}
