package com.rudy.design.createtype.abstractfactory;

import com.rudy.design.createtype.factory.Sender;
import com.rudy.design.createtype.factory.SmsSender;

/**
 * Created by RudyJun on 2016/12/29.
 */

public class SmsSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
