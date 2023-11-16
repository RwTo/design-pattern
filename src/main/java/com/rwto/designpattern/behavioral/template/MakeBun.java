package com.rwto.designpattern.behavioral.template;

/**
 * 制作包子，抽象类：充当抽象模板类
 * 用来定义制作包子的算法
 * @author renmw
 * @create 2023/11/16 19:52
 **/
public abstract class MakeBun {

    public void makeBun(){
        kneadDough();
        filling();
        steam();
    }

    /*包包子*/
    protected abstract void filling();

    protected void steam(){
        System.out.println("蒸包子");
    }

    protected void kneadDough(){
        System.out.println("和面");
    }
}
