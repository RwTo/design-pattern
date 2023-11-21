package com.rwto.designpattern.behavioral.interpreter;

/**
 * 抽象二元运算符；表述非终结符的抽象类
 * @author renmw
 * @create 2023/11/21 15:45
 **/
public abstract class AbsBinaryOperatorExpression implements ExpressionInterpreter{
    protected ExpressionInterpreter left;
    protected ExpressionInterpreter right;

    public AbsBinaryOperatorExpression(ExpressionInterpreter left, ExpressionInterpreter right) {
        this.left = left;
        this.right = right;
    }
}
