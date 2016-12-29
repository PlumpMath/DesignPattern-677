package com.rudy.design.behavetype.observer;

/**
 * Created by RudyJun on 2016/12/29.
 */

public class MyObserverable implements Observerable {
    private Observer observer;

    public MyObserverable() {
    }

    public void subscriber(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyDataSetChange() {
        if (observer != null) {
            observer.update();
        }
    }
}
