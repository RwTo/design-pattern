package com.rwto.designpattern.behavioral.strategy;

/**
 * 计算环境：充当策略的调用类
 * 维护一个对策略对象的引用
 * @author renmw
 * @create 2023/11/16 19:19
 **/
public class ComputeContext {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public ComputeContext(Operation operation) {
        this.operation = operation;
    }

    public void showDoOperation(int num1, int num2){
        int res = operation.doOperation(num1, num2);
        System.out.println(num1 + operation.operator() +num2 + " = " + res);
    }
}
