package com.rwto.designpattern.behavioral.command;

/**
 * @author renmw
 * @create 2023/11/21 20:10
 **/
public class User {

    public void openLight(Commend commend){
        commend.execute();
    }

    public void closeLight(Commend commend){
        commend.execute();
    }
}
