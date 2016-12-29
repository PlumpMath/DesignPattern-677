package com.rudy.design.behavetype.observer;

/**
 * Created by RudyJun on 2016/12/29.
 */

public class MyObserver implements Observer {
    @Override
    public void update() {
        System.out.println("update");
    }
}
