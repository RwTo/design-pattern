package com.rwto.designpattern.structural.decorator;

/**
 * 抽象装饰者：奶茶小料
 * @author renmw
 * @create 2023/11/10 19:28
 **/
public abstract class AbsDecoratorIngredients implements Tea{

    final private Tea tea;

    public AbsDecoratorIngredients(Tea tea) {
        this.tea = tea;
    }

    @Override
    public int getPrice() {
        //执行目标对象原本的行为
        return tea.getPrice();
    }

    @Override
    public String getName() {
        //执行目标对象原本的行为
        return tea.getName();
    }
}
