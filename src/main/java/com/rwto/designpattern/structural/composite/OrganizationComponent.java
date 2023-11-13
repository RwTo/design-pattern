package com.rwto.designpattern.structural.composite;

/**
 * 安全组合模式：抽象类只写公共方法，子类自行实现自己的方法，即将 PaySalaries，teamActivity，work方法拿到子类中实现
 * 透明组合模式：抽象类包含所有方法，子类使用哪个就重写哪个
 * 抽象组件类
 * @author renmw
 * @create 2023/11/13 20:08
 **/
public abstract class OrganizationComponent {
    /*名称*/
    protected String name;
    /*描述*/
    protected String describe;

    public OrganizationComponent(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    public abstract void show();


    public void add(OrganizationComponent component){
        throw new RuntimeException("方法没有实现");
    }

    public void remove(OrganizationComponent component){
        throw new RuntimeException("方法没有实现");
    }

    /*公司发薪水*/
    public void PaySalaries(){
        throw new RuntimeException("方法没有实现");
    }

    /*部门团建*/
    public void teamActivity(){
        throw new RuntimeException("方法没有实现");
    }

    /*员工干活*/
    public void work(){
        throw new RuntimeException("方法没有实现");
    }
}
