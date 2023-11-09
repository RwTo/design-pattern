package com.rwto.designpattern.structural.proxy;

import java.lang.reflect.Proxy;

/**
* 代理工厂，用来创建代理对象
*/
public class JDKProxyFactory {

    private UserDao userDao;

    public JDKProxyFactory(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 获取JDK动态代理对象
     * @return
     */
    public UserDao getJDKProxyObject(){

        UserDao proxyObject = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(),
                (proxy,method,args) -> {
                    System.out.println("方法增强，jdk动态代理模式");
                    Object res = method.invoke(userDao, args);
                    return res;
                });

        return proxyObject;
    }
}
