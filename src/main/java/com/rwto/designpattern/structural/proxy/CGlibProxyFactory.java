package com.rwto.designpattern.structural.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author renmw
 * @create 2023/11/8 20:56
 **/
public class CGlibProxyFactory implements MethodInterceptor {


    public <T>  T   getProxy(Class<T> clazz) {
        Enhancer en = new Enhancer();
        //设置代理的父类
        en.setSuperclass(clazz);
        //设置方法回调
        en.setCallback(this);
        //创建代理实例
        return (T)en.create();
    }

    /**
     *
     * @param o 代理对象，即生成的代理类的实例,这里是生成的代理对象，不是被代理对象
     * @param method 被代理方法的Method对象
     * @param objects 方法调用时传递的参数数组
     * @param methodProxy 方法代理对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("事务开启");
        //这里注意使用的是 invokeSuper() 调用的是父类的接口
        Object invoke = methodProxy.invokeSuper(o,objects);
        System.out.println("事务关闭");
        return invoke;
    }
}
