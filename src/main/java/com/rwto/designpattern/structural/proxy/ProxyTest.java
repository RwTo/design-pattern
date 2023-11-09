package com.rwto.designpattern.structural.proxy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

import java.lang.reflect.Proxy;

/**
 * @author renmw
 * @create 2023/11/8 19:29
 **/
@SpringBootTest
public class ProxyTest {

    @Test
    public void staticProxyTest(){
        //直接使用
        UserDao userDao = new UserDaoImpl();
        userDao.insert();

        System.out.println("---------------------------------------------------");
        //通过静态代理的方式，增强insert()方法
        StaticProxyUserDao staticProxyUserDao = new StaticProxyUserDao(userDao);
        staticProxyUserDao.insert();
    }

    @Test
    public void JdkProxyTest(){
        UserDao userDao = new UserDaoImpl();
        /*
        * 参数1：指定一个类加载器
        * 参数2：指定接口 getInterfaces()
        * 参数3：指定对应的代理方法
        * */
        System.out.println();
        UserDao proxyUserDao = (UserDao)Proxy.newProxyInstance(UserDao.class.getClassLoader(), UserDaoImpl.class.getInterfaces(), (proxy, method, args) -> {
            System.out.println("事务开启");
            Object invoke = method.invoke(userDao,args);
            System.out.println("事务关闭");
            return invoke;
        });
        proxyUserDao.insert();
    }

    @Test
    public void CGlibProxyTest(){
        // 创建Enhancer对象 类似于 Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象 即需要代理的类
        enhancer.setSuperclass(UserDaoImpl.class);
        //设置回调函数，增强方法
        /**
         * o 代理对象，即生成的代理类的实例,这里是生成的代理对象，不是被代理对象
         * method 被代理方法的Method对象
         * args 方法调用时传递的参数数组
         * methodProxy 方法代理对象
         */
        enhancer.setCallback((MethodInterceptor) (o, method, args, methodProxy) -> {
            System.out.println("事务开启");
            //这里注意使用的是 invokeSuper() 调用的是父类的接口
            Object invoke = methodProxy.invokeSuper(o,args);
            System.out.println("事务提交");
            return invoke;
        });
        // 生成代理对象
        UserDaoImpl proxy = (UserDaoImpl) enhancer.create();
        proxy.insert();
    }
}
