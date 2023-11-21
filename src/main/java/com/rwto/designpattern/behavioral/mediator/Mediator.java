package com.rwto.designpattern.behavioral.mediator;

/**
 * 中介：充当抽象中介者
 * @author renmw
 * @create 2023/11/21 19:10
 **/
public interface Mediator {
    /**
     * 注册用户信息，注册房东和租客信息
     * @param person
     */
    void register(Person person);

    /**
     * 联系中介者
     * @param msg
     * @param person
     */
    void contact(String msg, Person person);
}
