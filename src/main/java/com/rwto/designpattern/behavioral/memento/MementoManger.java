package com.rwto.designpattern.behavioral.memento;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 备忘录管理者：充当备忘录管理者角色
 * 管理备忘录信息：用于存储历史记录
 * @author renmw
 * @create 2023/11/21 21:53
 **/
public class MementoManger {
    private Stack<Memento> mementos = new Stack<>();

    public void push(Memento memento){
        mementos.push(memento);
    }

    public Memento pop(){
        return mementos.pop();
    }
}
