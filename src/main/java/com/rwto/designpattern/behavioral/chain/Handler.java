package com.rwto.designpattern.behavioral.chain;

/**
 * @author renmw
 * @create 2023/11/21 19:43
 **/
public abstract class Handler {
    /**
     * 上级处理者
     */
    protected Handler superior;

    public void setSuperior(Handler superior) {
        this.superior = superior;
    }

    /**
     * 请假 * 天数
     */
    public abstract void askForLeave(int days);
}
