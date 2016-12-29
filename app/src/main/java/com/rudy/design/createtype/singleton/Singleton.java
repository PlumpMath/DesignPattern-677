package com.rudy.design.createtype.singleton;

/**
 * Created by RudyJun on 2016/12/29.
 */

/**
 * 单例模式
 */
public class Singleton {

    private Singleton() {
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
