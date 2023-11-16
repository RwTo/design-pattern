package com.rwto.designpattern.behavioral.template;

/**
 * 测试类
 * 包牛肉馅的包子
 * 包猪肉馅的包子
 * @author renmw
 * @create 2023/11/16 19:59
 **/
public class TemplateTest {
    public static void main(String[] args) {
        MakeBeefBun makeBeefBun = new MakeBeefBun();
        makeBeefBun.makeBun();

        System.out.println("====================================");
        MakePorkBun makePorkBun = new MakePorkBun();
        makePorkBun.makeBun();
    }
}
