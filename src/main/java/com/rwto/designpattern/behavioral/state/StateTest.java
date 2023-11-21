package com.rwto.designpattern.behavioral.state;

/**
 * @author renmw
 * @create 2023/11/21 22:34
 **/
public class StateTest {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.setState(new PlayState());
        mediaPlayer.doAction();

        mediaPlayer.setState(new PauseState());
        mediaPlayer.doAction();
    }
}
