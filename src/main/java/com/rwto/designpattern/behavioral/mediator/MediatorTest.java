package com.rwto.designpattern.behavioral.mediator;


/**
 * @author renmw
 * @create 2023/11/21 19:31
 **/
public class MediatorTest {
    public static void main(String[] args) {
        HouseMediator mediator = new HouseMediator();
        HouseOwner houseOwnerA = new HouseOwner("房东A", mediator);
        HouseOwner houseOwnerB = new HouseOwner("房东B", mediator);

        Tenant tenantA = new Tenant("租客A", mediator);
        Tenant tenantB = new Tenant("租客B", mediator);

        /*中介绑定房东租客信息*/
        mediator.register(houseOwnerA);
        mediator.register(houseOwnerB);
        mediator.register(tenantA);
        mediator.register(tenantB);

        tenantA.sendMsg("有没有一室一厅");
        System.out.println("===================================================");
        houseOwnerB.sendMsg("我有一室一厅");
    }
}
