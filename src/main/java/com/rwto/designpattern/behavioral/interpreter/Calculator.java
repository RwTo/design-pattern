package com.rwto.designpattern.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 计算器：充当环境类
 * 用来转化和存储表达式
 * @author renmw
 * @create 2023/11/21 15:58
 **/
public class Calculator {
    private Map<String,ExpressionInterpreter> expressionMap = new HashMap<>();

    public ExpressionInterpreter parse(String expression){
        String[] elements = expression.split(" ");
        ExpressionInterpreter left,right;
        Stack<ExpressionInterpreter> stack = new Stack<ExpressionInterpreter>();
        for (int i = 0; i < elements.length; i++) {
            String operator = elements[i];
            if ("+".equals(operator) || "-".equals(operator) ) {
                left = stack.pop();
                right = new ValueExpression(Integer.parseInt(elements[++i]));

                ExpressionInterpreter interpreter = null;
                if ("+".equals(operator)) {
                    interpreter = new AddExpression(left, right);
                } else if ("-".equals(operator)) {
                    interpreter = new SubstractExpression(left, right);
                } else {
                    throw new RuntimeException("不支持该运算符：" + operator);
                }
                stack.push(interpreter);
            } else {
                ValueExpression numberInterpreter = new ValueExpression(Integer.parseInt(elements[i]));
                stack.push(numberInterpreter);
            }
        }
        ExpressionInterpreter res = stack.pop();
        expressionMap.put(expression,res);
        return res;
    }

    public void calculate(String expression){
        ExpressionInterpreter interpreter = expressionMap.get(expression);
        if(interpreter == null){
            interpreter = parse(expression);
        }
        System.out.println(expression + " = " +interpreter.interpret());
    }
}
