package com.rudy.design.structuretype.adapter;

/**
 * Created by RudyJun on 2016/12/29.
 */

public class IWrapperTest {

    public static void main(String[] args) {

        Targetable t1 = new FWrapper();
        Targetable t2 = new SWrapper();
        t1.methodA();
        t1.methodB();
        t2.methodA();
        t2.methodB();
    }
}
