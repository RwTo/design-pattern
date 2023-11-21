package com.rwto.designpattern.behavioral.interpreter;

/**
 * 表达式数值：表示终结符表达式
 * @author renmw
 * @create 2023/11/21 15:41
 **/
public class ValueExpression implements ExpressionInterpreter{
    private int value;

    public ValueExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
