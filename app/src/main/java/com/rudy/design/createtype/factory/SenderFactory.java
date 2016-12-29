package com.rudy.design.createtype.factory;

/**
 * Created by RudyJun on 2016/12/29.
 */

/**
 * 工厂方法模式:建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 * EmailSender、SmsSender都实现了Sender接口，通过不同方法返回不同的Sender实现实例。
 * 缺点：类的创建依赖工厂类，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，因此还有一个抽象工厂模式。
 */
public class SenderFactory {
    public static Sender produceEmail() {
        return new EmailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
