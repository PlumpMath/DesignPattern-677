package com.rudy.design.behavetype.state;

/**
 * Created by RudyJun on 2016/12/29.
 */

/**
 * 状态模式：当对象的状态改变时，同时改变其行为
 */
public class Action {
    private State state;

    public Action(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method() {
        if (state.getValue().equals("state1")) {
            state.methodA();
        } else if (state.getValue().equals("state2")) {
            state.methodB();
        }
    }
}
