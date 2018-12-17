package com.xurui.factory.impl;

import com.xurui.factory.CPUFactory;
import com.xurui.factory.Provider;

/**
 * Created by Administrator on 2018/12/17.
 */
public class AMDCPUFactory implements Provider {
    @Override
    public CPUFactory createCPUFactory() {
        return new AMDCPU();
    }
}
