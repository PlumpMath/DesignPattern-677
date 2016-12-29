package com.rudy.design.structuretype.adapter;

/**
 * Created by RudyJun on 2016/12/29.
 */

/**
 * 对象的适配器模式的测试类
 */
public class OWrapperTest {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new OWrapper(source);
        target.methodA();
        target.methodB();
    }
}
