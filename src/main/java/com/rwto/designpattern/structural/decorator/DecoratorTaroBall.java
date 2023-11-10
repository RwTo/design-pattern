package com.rwto.designpattern.structural.decorator;

/**
 * 装饰者：芋圆
 * @author renmw
 * @create 2023/11/10 19:24
 **/
public class DecoratorTaroBall extends AbsDecoratorIngredients{

    public DecoratorTaroBall(Tea tea) {
        super(tea);
    }

    @Override
    public int getPrice() {
        /*被装饰者的价格 + 当前椰果的价格*/
        return super.getPrice() + 2;
    }

    @Override
    public String getName() {
        return super.getName() + " + " + "椰果";
    }
}
