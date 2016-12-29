package com.rudy.design.createtype.factory;

/**
 * Created by RudyJun on 2016/12/29.
 */

public class SmsSender implements Sender {
    @Override
    public void SendMessage() {
        System.out.println("SmsSender");
    }
}
