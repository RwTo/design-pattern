package com.rwto.designpattern.behavioral.iterator.normal;

/**
 * 用户容器类：充当具体聚合器角色
 * 表示这是一个容器的实现类，内部含有迭代器的实现类
 * 并且通过内部的迭代器可以遍历这个容器元素
 *
 * 这里具体迭代器通过内部类的方式实现，也可以单独实现：单独实现要求迭代器内部有聚合类的引用
 * @author renmw
 * @create 2023/11/17 14:55
 **/
public class UserContainer implements MyContainer{
    private String[] users;

    public UserContainer() {
        users = new String[]{"张三","李四","王五","赵六"};
    }

    @Override
    public MyIterator getIterator() {
        return new UserIterator();
    }

    /**
     * 迭代器实现类，充当具体迭代器
     * 通过此类可以遍历对应集合
     */
    private class UserIterator implements MyIterator{

        int index;

        @Override
        public boolean hasNext() {
            if(index < users.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return users[index++];
            }
            return null;
        }
    }
}
