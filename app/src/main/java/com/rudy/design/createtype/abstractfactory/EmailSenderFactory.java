package com.rudy.design.createtype.abstractfactory;

import com.rudy.design.createtype.factory.EmailSender;
import com.rudy.design.createtype.factory.Sender;

/**
 * Created by RudyJun on 2016/12/29.
 */

public class EmailSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new EmailSender();
    }
}
