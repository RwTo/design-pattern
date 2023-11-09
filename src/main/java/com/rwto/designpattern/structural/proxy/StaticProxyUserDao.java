package com.rwto.designpattern.structural.proxy;

/**
 * @author renmw
 * @create 2023/11/8 19:31
 **/
public class StaticProxyUserDao implements UserDao{

    private UserDao userDao;

    public StaticProxyUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void insert(){
        //事务开启...
        System.out.println("事务开启");
        userDao.insert();
        //方法增强...
        //事务提交...
        System.out.println("事务提交");
    }
}

