package com.rwto.designpattern.behavioral.interpreter;

/**
 * 减法运算符：代表非终结符表达式
 * @author renmw
 * @create 2023/11/21 15:44
 **/
public class SubstractExpression extends AbsBinaryOperatorExpression{

    public SubstractExpression(ExpressionInterpreter left, ExpressionInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() - this.right.interpret();
    }
}
