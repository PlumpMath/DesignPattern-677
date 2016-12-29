package com.rudy.design.createtype.factory;

/**
 * Created by RudyJun on 2016/12/29.
 */

/**
 * 静态工厂模式测试类
 */
public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SenderFactory.produceEmail();
        sender.SendMessage();
    }
}
