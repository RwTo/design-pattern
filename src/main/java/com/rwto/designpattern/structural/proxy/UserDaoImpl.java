package com.rwto.designpattern.structural.proxy;

/**
 * @author renmw
 * @create 2023/11/8 19:28
 **/
public class UserDaoImpl implements UserDao{

    public void insert(){
        System.out.println("插入一个用户");
    }
}
