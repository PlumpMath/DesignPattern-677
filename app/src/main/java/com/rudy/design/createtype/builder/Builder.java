package com.rudy.design.createtype.builder;


import com.rudy.design.createtype.factory.EmailSender;
import com.rudy.design.createtype.factory.Sender;
import com.rudy.design.createtype.factory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RudyJun on 2016/12/29.
 */

/**
 * 建造者模式，将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属性。
 * 建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西。
 * EmailSender、SmsSender相当于产品，而produceMailSender、produceSmsSender是管理方法
 * senders就属于复合对象
 */
public class Builder {

    private List<Sender> senders = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            senders.add(new EmailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            senders.add(new SmsSender());
        }
    }
}


