package com.rwto.designpattern.behavioral.template;

/**
 * 做牛肉馅的包子：充当具体模板类
 * @author renmw
 * @create 2023/11/16 19:57
 **/
public class MakeBeefBun extends MakeBun{
    @Override
    protected void filling() {
        System.out.println("包牛肉馅");
    }
}
