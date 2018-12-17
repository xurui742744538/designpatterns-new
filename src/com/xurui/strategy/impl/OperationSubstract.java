package com.xurui.strategy.impl;

import com.xurui.strategy.Strategy;

/**
 * Created by Administrator on 2018/12/17.
 */
public class OperationSubstract implements Strategy {
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}
