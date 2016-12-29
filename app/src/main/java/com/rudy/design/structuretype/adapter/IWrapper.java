package com.rudy.design.structuretype.adapter;

/**
 * Created by RudyJun on 2016/12/29.
 */

/**
 * 接口的适配器模式: 在其子类（FWrapper 、 SWrapper）实现我们只需要的方法
 */
public abstract class IWrapper implements Targetable {

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }
}
