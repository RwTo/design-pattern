package com.rwto.designpattern.behavioral.memento;

/**
 * 备忘录：充当备忘录角色
 * @author renmw
 * @create 2023/11/21 21:53
 **/
public class Memento {
    private String content;

    public Memento(String content){
        this.content = content;
    }
    public String getContent() {
        return content;
    }
}
