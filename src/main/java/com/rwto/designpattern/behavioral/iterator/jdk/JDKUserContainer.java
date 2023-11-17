package com.rwto.designpattern.behavioral.iterator.jdk;


import java.util.Iterator;

/**
 * @author renmw
 * @create 2023/11/17 15:08
 **/
public class JDKUserContainer implements JDKMyContainer {

    private String[] users;

    public JDKUserContainer() {
        users = new String[]{"张三","李四","王五","赵六"};
    }

    @Override
    public Iterator<String> getIterator() {
        return new JDKUserIterator();
    }

    /**
     * 迭代器实现类，充当具体迭代器
     * 通过此类可以遍历对应集合
     *
     * 这里借助 Iterator<E> 来实现具体迭代器
     * 泛型就是 集合元素的类型，当前例子是String
     */
    private class JDKUserIterator implements Iterator<String> {

        int index;

        @Override
        public boolean hasNext() {
            if(index < users.length){
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            if(hasNext()){
                return users[index++];
            }
            return null;
        }
    }
}
