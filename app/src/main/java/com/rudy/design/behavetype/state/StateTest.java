package com.rudy.design.behavetype.state;

/**
 * Created by RudyJun on 2016/12/29.
 */

public class StateTest {
    public static void main(String[] args) {
        State state = new State();
        Action context = new Action(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
