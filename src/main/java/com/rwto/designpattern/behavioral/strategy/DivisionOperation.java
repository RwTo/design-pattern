package com.rwto.designpattern.behavioral.strategy;

/**
 * 除法操作：充当具体策略
 * @author renmw
 * @create 2023/11/16 19:15
 **/
public class DivisionOperation implements Operation{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 / num2;
    }

    @Override
    public String operator() {
        return "/";
    }
}
