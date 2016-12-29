package com.rudy.design.behavetype.command;

/**
 * Created by RudyJun on 2016/12/29.
 */

public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exe();
    }
}
