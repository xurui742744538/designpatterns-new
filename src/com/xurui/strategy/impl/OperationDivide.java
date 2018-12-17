package com.xurui.strategy.impl;

import com.xurui.strategy.Strategy;

/**
 * Created by Administrator on 2018/12/17.
 */
public class OperationDivide implements Strategy{
    @Override
    public int calculate(int num1, int num2) {
        int res = 0;
        try {
            res = num1 / num2;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
