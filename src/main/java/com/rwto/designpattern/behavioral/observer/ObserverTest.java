package com.rwto.designpattern.behavioral.observer;

import com.rwto.designpattern.behavioral.observer.jdk.JDKDataSourceA;
import com.rwto.designpattern.behavioral.observer.jdk.JDKViewAObserver;
import com.rwto.designpattern.behavioral.observer.jdk.JDKViewBObserver;
import com.rwto.designpattern.behavioral.observer.simple.DataSourceA;
import com.rwto.designpattern.behavioral.observer.simple.ViewAObserver;
import com.rwto.designpattern.behavioral.observer.simple.ViewBObserver;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author renmw
 * @create 2023/11/17 9:36
 **/
@SpringBootTest
public class ObserverTest {

    @Test
    public void simpleTest(){
        DataSourceA dataSource = new DataSourceA();
        dataSource.addObserver(new ViewAObserver());
        dataSource.addObserver(new ViewBObserver());

        dataSource.update("新增一个数据");
        System.out.println("==================================");
        dataSource.update("删除一个数据");
    }

    /**
     * 使用jdk.util包下提供的 观察者类和触发抽象类 完成观察者模式
     */
    @Test
    public void JDKTest(){
        JDKDataSourceA dataSource = new JDKDataSourceA();
        dataSource.addObserver(new JDKViewAObserver());
        dataSource.addObserver(new JDKViewBObserver());

        dataSource.update("新增一个数据");
        System.out.println("==================================");
        dataSource.update("删除一个数据");
    }

}
