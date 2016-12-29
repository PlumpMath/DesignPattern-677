package com.rudy.design.createtype.abstractfactory;

import com.rudy.design.createtype.factory.SmsSender;

/**
 * Created by RudyJun on 2016/12/29.
 */

/**
 * 抽象工厂模式测试类
 */
public class AbstactFactoryTest {
    public static void main(String[] args) {
        Provider provider = new SmsSenderFactory();
        SmsSender sender = (SmsSender) provider.produce();
        sender.SendMessage();
    }
}
