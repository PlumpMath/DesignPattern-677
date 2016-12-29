package com.rudy.design.behavetype.observer;

/**
 * Created by RudyJun on 2016/12/29.
 */

/**
 * 观察者模式，被观察者MyObserverable ， 观察者MyObserver ， 两者产生订阅关系
 * 当被观察者MyObserverable发生动作时，观察者MyObserver作出响应
 */
public class ObserverTest {
    public static void main(String[] args) {
        MyObserverable observerable = new MyObserverable();
        MyObserver observer = new MyObserver();
        observerable.subscriber(observer);
        observerable.notifyDataSetChange();
    }
}
