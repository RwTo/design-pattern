package com.rwto.designpattern.structural.flyweight;

/**
 * 享元模式测试
 * 享元模式就是工厂模式的一种进化版，进化点在于 工厂中增加了 缓存
 * 可以理解为，享元模式的工厂用来生产 模板，同样的模板只需要生产一次，所以享元工厂中有缓存 存储 模板
 * 享元工厂一般只有一个，所以享元工厂一般用单例 模式实现
 * @author renmw
 * @create 2023/11/16 11:22
 **/
public class FlyWeightTest {

    public static void main(String[] args) {
        BunFactory flyWeightFactory = BunFactory.getInstance();

        Bun beef = flyWeightFactory.getBun("beef");
        beef.show();
        Bun pork = flyWeightFactory.getBun("pork");
        pork.show();
        Bun beef2 = flyWeightFactory.getBun("beef");
        beef2.show();
        /*获取的两次牛肉包 是同一个*/
        System.out.println(beef.equals(beef2));
    }
}
