package com.rwto.designpattern.behavioral.memento;

/**
 * @author renmw
 * @create 2023/11/21 22:02
 **/
public class MementoTest {
    public static void main(String[] args) {
        Editor editor = new Editor();
        MementoManger mementoManger = new MementoManger();
        editor.setContent("this is content");
        mementoManger.push(editor.createMemento());

        editor.setContent("hello world");
        mementoManger.push(editor.createMemento());

        editor.setContent("123");
        System.out.println("当前值："+editor.getContent());

        editor.rollBack(mementoManger.pop());
        System.out.println("回滚后："+editor.getContent());

        editor.rollBack(mementoManger.pop());
        System.out.println("回滚后："+editor.getContent());

    }
}
