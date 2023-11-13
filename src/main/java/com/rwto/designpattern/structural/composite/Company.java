package com.rwto.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 公司节点，也是根节点
 * @author renmw
 * @create 2023/11/13 20:15
 **/
public class Company extends OrganizationComponent{

    private final List<OrganizationComponent> departments = new ArrayList<>();

    public Company(String name, String describe) {
        super(name, describe);
    }

    @Override
    public void show() {
        System.out.println("公司名称： " + name + " 描述：" + describe + "部门数量：" + departments.size());
        for (OrganizationComponent department : departments) {
            department.show();
        }
    }

    @Override
    public void add(OrganizationComponent component) {
        departments.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        departments.remove(component);
    }

    @Override
    public void PaySalaries() {
        System.out.println("全体员工发薪水啦！！！！！！！！");
    }
}
