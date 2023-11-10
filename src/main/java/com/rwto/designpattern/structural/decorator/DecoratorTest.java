package com.rwto.designpattern.structural.decorator;


/**
 * @author renmw
 * @create 2023/11/10 19:41
 **/
public class DecoratorTest {
    public static void main(String[] args) {
        /*给我一杯奶茶*/
        System.out.println("==========================给我一杯奶茶====================================");
        Tea milkTea = new MilkTea();
        System.out.println(milkTea.getName() + " = " + milkTea.getPrice());


        /*给我一杯珍珠奶茶*/
        System.out.println("===========================给我一杯珍珠奶茶===================================");
        milkTea = new DecoratorTaroBall(milkTea);
        System.out.println(milkTea.getName() + " = " + milkTea.getPrice());


        /*给我一杯珍珠椰果奶茶*/
        System.out.println("============================给我一杯珍珠椰果奶茶==================================");
        milkTea = new DecoratorCoconut(milkTea);
        System.out.println(milkTea.getName() + " = " + milkTea.getPrice());
    }
}
