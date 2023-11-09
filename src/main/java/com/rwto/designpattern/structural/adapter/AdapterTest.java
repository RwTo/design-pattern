package com.rwto.designpattern.structural.adapter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author renmw
 * @create 2023/11/9 19:17
 **/
@SpringBootTest
public class AdapterTest {
    /**
     * 类适配器模式
     */
    @Test
    public void adapterClassTest(){
        MobileAdapter5VClass adapter = new MobileAdapter5VClass();
        adapter.output5V();
    }


    /**
     * 对象适配器模式
     */
    @Test
    public void adapterObjectTest(){
        HouseholdElectricity220V electricity220V = new HouseholdElectricity220V();
        MobileAdapter5VObject adapter = new MobileAdapter5VObject(electricity220V);
        adapter.output5V();
    }


    /**
     * 接口适配器模式
     */
    @Test
    public void adapterInterfaceTest(){
        HouseholdElectricity220V electricity220V = new HouseholdElectricity220V();
        MobileAdapter5VInterface adapter = new MobileAdapter5VInterface(electricity220V);
        adapter.output5V();
    }

}
