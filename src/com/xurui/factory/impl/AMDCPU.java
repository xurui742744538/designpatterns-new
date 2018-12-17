package com.xurui.factory.impl;

import com.xurui.factory.CPUFactory;

/**
 * Created by Administrator on 2018/12/17.
 */
public class AMDCPU implements CPUFactory {
    @Override
    public void createCPU() {
        System.out.println("create AMDCUP...");
    }
}
