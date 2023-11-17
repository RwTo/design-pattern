package com.rwto.designpattern.behavioral.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author renmw
 * @create 2023/11/17 13:18
 **/
public class JDKViewBObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ViewB 观察到"+o.getClass().getSimpleName()+"数据变换");
        System.out.println(arg + " ViewB 更新视图！");
    }
}
