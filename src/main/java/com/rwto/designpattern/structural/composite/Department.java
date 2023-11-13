package com.rwto.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 部门节点
 * @author renmw
 * @create 2023/11/13 20:15
 **/
public class Department extends OrganizationComponent{

    private final List<OrganizationComponent> employees = new ArrayList<>();

    public Department(String name, String describe) {
        super(name, describe);
    }

    @Override
    public void show() {
        System.out.println("部门名称： " + name + " 描述：" + describe + "员工数量：" + employees.size());
        for (OrganizationComponent employee : employees) {
            employee.show();
        }
    }

    @Override
    public void add(OrganizationComponent component) {
        employees.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        employees.remove(component);
    }

    @Override
    public void teamActivity() {
        System.out.println("部门组织团建活动！！！");
    }
}
