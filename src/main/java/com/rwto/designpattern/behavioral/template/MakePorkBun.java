package com.rwto.designpattern.behavioral.template;

/**
 * 做猪肉馅的包子：充当具体模板类
 * @author renmw
 * @create 2023/11/16 19:57
 **/
public class MakePorkBun extends MakeBun{
    @Override
    protected void filling() {
        System.out.println("包猪肉馅");
    }
}
