package com.rudy.design.structuretype.adapter;

/**
 * Created by RudyJun on 2016/12/29.
 */

/**
 * 类的适配器模式的测试类
 */
public class AdaperTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.methodA();
        target.methodB();
    }
}
