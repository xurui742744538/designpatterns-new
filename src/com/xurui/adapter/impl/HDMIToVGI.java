package com.xurui.adapter.impl;

import com.xurui.adapter.HDMIPort;
import com.xurui.adapter.VGIPort;

/**
 * Created by Administrator on 2018/12/17.
 */
//将HDMI接口转换为VGI,这就是适配器
public class HDMIToVGI implements VGIPort {

    HDMIPort hdmiPort;

    public HDMIToVGI(HDMIPort hdmiPort) {
        this.hdmiPort = hdmiPort;
    }
    //将HDMI接口转换为VGI接口
    @Override
    public void workByVGI() {
        hdmiPort.workByHDMI();
    }
}