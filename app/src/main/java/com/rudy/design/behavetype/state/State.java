package com.rudy.design.behavetype.state;

/**
 * Created by RudyJun on 2016/12/29.
 */

public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void methodA() {
        System.out.println("methodA");
    }

    public void methodB() {
        System.out.println("methodB");
    }
}
