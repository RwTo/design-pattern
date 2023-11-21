package com.rwto.designpattern.behavioral.chain;

/**
 * @author renmw
 * @create 2023/11/21 19:55
 **/
public class ChainTest {
    public static void main(String[] args) {
        //构建责任链
        President president = new President();
        Leader leader = new Leader();
        leader.setSuperior(president);
        Monitor monitor = new Monitor();
        monitor.setSuperior(leader);

        //请假
        monitor.askForLeave(8);
        monitor.askForLeave(15);
        monitor.askForLeave(70);
        monitor.askForLeave(100);

    }
}
