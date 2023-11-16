package com.rwto.designpattern.behavioral.strategy;

/**
 * 操作接口：充当抽象策略
 * @author renmw
 * @create 2023/11/16 19:14
 **/
public interface Operation {
    int doOperation(int num1, int num2);
    String operator();
}
