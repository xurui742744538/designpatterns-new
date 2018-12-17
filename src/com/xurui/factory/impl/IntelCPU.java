package com.xurui.factory.impl;

import com.xurui.factory.CPUFactory;

/**
 * Created by Administrator on 2018/12/17.
 */
public class IntelCPU implements CPUFactory {
    @Override
    public void createCPU() {
        System.out.println("create IntelCPU...");
    }
}
