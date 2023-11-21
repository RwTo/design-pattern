package com.rwto.designpattern.behavioral.memento;

/**
 * 编辑器：充当需要保存的对象
 * @author renmw
 * @create 2023/11/21 21:58
 **/
public class Editor {
    private String content;

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public Memento createMemento(){
        return new Memento(content);
    }

    public void rollBack(Memento memento){
        this.content = memento.getContent();
    }
}
