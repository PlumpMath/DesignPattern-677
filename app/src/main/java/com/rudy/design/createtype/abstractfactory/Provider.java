package com.rudy.design.createtype.abstractfactory;

import com.rudy.design.createtype.factory.Sender;

/**
 * Created by RudyJun on 2016/12/29.
 */

/**
 * 抽象工厂模式接口，实现Provider接口即可作为一个工厂类，无需改动现成的代码，这样拓展性比工厂模式好
 */
public interface Provider {
    Sender produce();
}
