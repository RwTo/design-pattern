package com.rwto.designpattern.behavioral.interpreter;

/**
 * @author renmw
 * @create 2023/11/21 16:25
 **/
public class InterpreterTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.parse("1 + 1");
        calculator.calculate("1 + 1");
        calculator.calculate("1 + 2 - 2 - 1");
    }
}
