package com.rwto.designpattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 房屋中介：充当中介者角色
 * @author renmw
 * @create 2023/11/21 19:09
 **/
public class HouseMediator implements Mediator{
    private List<Person> tenants = new ArrayList<>();
    private List<Person> houseOwners = new ArrayList<>();


    @Override
    public void register(Person person) {
        if (person instanceof Tenant && !tenants.contains(person)){
           tenants.add(person);
        }else if(person instanceof HouseOwner && !houseOwners.contains(person)){
            houseOwners.add(person);
        }
    }

    @Override
    public void contact(String msg, Person person) {
        if (person instanceof Tenant){
            //如果发送消息的是租客，应该发给房东，相当于群发
            houseOwners.forEach(o->o.getMsg(msg));
        }else if(person instanceof HouseOwner){
            //群发给租客
            tenants.forEach(o->o.getMsg(msg));
        }
    }
}
