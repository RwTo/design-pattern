package com.rwto.designpattern.behavioral.strategy;

/**
 * 策略模式测试，可以看成一个计算器
 * 策略模式也是一种组合的用法，与装饰模式，桥接模式很像
 * 区别在于：
 * 桥接模式是两个不同的维度，是抽象与实现的解耦
 * 策略模式Context 是固定的，只考虑策略的替代
 * 所以桥接模式比策略模式多了个 抽象类
 * 装饰模式 是对装饰品的重复叠加，可以重复叠加，组合元素是递归的
 * 而策略模式只能选择一种算法
 * 所以 装饰模式的 装饰者要增加一个抽象装饰者 ，并且继承被装饰者
 * @author renmw
 * @create 2023/11/16 19:21
 **/
public class StrategyTest {
    public static void main(String[] args) {
        /*1+2 = 3*/
        ComputeContext context = new ComputeContext(new AddOperation());
        context.showDoOperation(1,2);
        /*2*3 = 6*/
        context.setOperation(new MultiplyOperation());
        context.showDoOperation(2,3);
        /*6/3 = 2*/
        context.setOperation(new DivisionOperation());
        context.showDoOperation(6,3);
        /*7-3 = 4*/
        context.setOperation(new SubtractOperation());
        context.showDoOperation(7,3);
    }
}
