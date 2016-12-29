package com.rudy.design.behavetype.command;

/**
 * Created by RudyJun on 2016/12/29.
 */

/**
 * 命令模式： 实现命令的发出者和执行者之间解耦，实现请求和执行分开（通过命令实现）
 */
public class CommandTest {
    public static void main(String[] args) {
        //命令接收者
        Receiver receiver = new Receiver();
        //命令需要一个命令接收者
        Command cmd = new MyCommand(receiver);
        //命令发出者拥有命令
        Invoker invoker = new Invoker(cmd);
        //命令发出
        invoker.action();
    }
}
