package com.rudy.design.structuretype.adapter;

/**
 * Created by RudyJun on 2016/12/29.
 */

/**
 * 对象的适配器模式：当希望将一个对象（source）转换成满足另一个新接口（Targetable）的对象时，
 * 可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
 */
public class OWrapper implements Targetable {

    private Source source;

    public OWrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void methodA() {
        source.methodA();
    }

    @Override
    public void methodB() {
        System.out.println("this is the targetable method!");
    }
}
