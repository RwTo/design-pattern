package com.rwto.designpattern.structural.facade;

/**
 * @author renmw
 * @create 2023/11/15 22:54
 **/
public class FacadeTest {
    public static void main(String[] args) {

        XiaoAiStudent xiaoAi = new XiaoAiStudent();
        /*我回家啦*/
        xiaoAi.leaving();

        /*我离开了*/
        xiaoAi.leaving();
    }

}
