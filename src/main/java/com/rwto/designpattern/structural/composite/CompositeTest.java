package com.rwto.designpattern.structural.composite;

/**
 * @author renmw
 * @create 2023/11/13 20:06
 **/
public class CompositeTest {

    public static void main(String[] args) {
        Company company = new Company("吃得饱有限公司", "干饭得干饱！");
        Department bun = new Department("包子铺", "卖包子");
        Employee employee1 = new Employee("张三", "包子厨师");
        Employee employee2 = new Employee("李四", "清洁工");

        bun.add(employee1);
        bun.add(employee2);
        Department milkTea = new Department("奶茶店", "卖奶茶");
        Employee employee3 = new Employee("王五", "奶茶师");
        Employee employee4 = new Employee("赵六", "售货员");

        milkTea.add(employee3);
        milkTea.add(employee4);

        company.add(bun);
        company.add(milkTea);

        company.show();

        /*开除赵六*/
        System.out.println("======================开除赵六============================");
        milkTea.remove(employee4);
        company.show();
        /*关闭包子业务*/
        System.out.println("======================关闭包子业务============================");
        company.remove(bun);
        company.show();
    }
}
