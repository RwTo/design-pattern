package com.rwto.designpattern.structural.composite;

/**
 * 员工节点，也是叶子节点
 * @author renmw
 * @create 2023/11/13 20:16
 **/
public class Employee extends OrganizationComponent{
    //叶子节点没有List属性

    public Employee(String name, String describe) {
        super(name, describe);
    }

    @Override
    public void show() {
        System.out.println("员工姓名： " + name + " 描述：" + describe );
    }

    @Override
    public void work() {
        System.out.println("加班干活！！！");
    }
}
