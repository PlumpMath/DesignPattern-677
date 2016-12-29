package com.rudy.design.createtype.factory;

/**
 * Created by RudyJun on 2016/12/29.
 */

public class EmailSender implements Sender {
    @Override
    public void SendMessage() {
        System.out.println("EmailSender");
    }
}
