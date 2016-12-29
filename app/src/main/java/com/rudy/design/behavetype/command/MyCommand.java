package com.rudy.design.behavetype.command;

/**
 * Created by RudyJun on 2016/12/29.
 */

public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
