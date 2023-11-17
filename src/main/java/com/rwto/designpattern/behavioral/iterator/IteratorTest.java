package com.rwto.designpattern.behavioral.iterator;

import com.rwto.designpattern.behavioral.iterator.jdk.JDKUserContainer;
import com.rwto.designpattern.behavioral.iterator.normal.MyIterator;
import com.rwto.designpattern.behavioral.iterator.normal.UserContainer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;

/**
 * 以观察者列表为例，使用迭代器模式
 * 提供一种统一的方式遍历集合中的元素，并且使用中不需要了解集合的内部结构
 * @author renmw
 * @create 2023/11/17 14:49
 **/
@SpringBootTest
public class IteratorTest {

    /**
     * 自行实现迭代器模式
     */
    @Test
    public void normalTest(){
        UserContainer userContainer = new UserContainer();
        MyIterator iterator = userContainer.getIterator();
        System.out.println("MyIterator迭代器遍历：");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * 借助java.util包下的Iterator接口完成
     * 可以看下源码中ArrayList等集合类的迭代器的实现，差不多
     */
    @Test
    public void JDKTest(){

        JDKUserContainer userContainer = new JDKUserContainer();
        Iterator<String> iterator = userContainer.getIterator();
        System.out.println("Iterator<String>迭代器遍历：");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
