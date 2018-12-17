package test;

import com.xurui.adapter.HDMIPort;
import com.xurui.adapter.VGIPort;
import com.xurui.adapter.impl.HDMIToVGI;

/**
 * Created by Administrator on 2018/12/17.
 */
public class TestAdapter {
    public static void main(String[] args) {
        //定义一个HDMI接口
        HDMIPort hdmiPort = new HDMIPort() {

            @Override
            public void workByHDMI() {
                System.out.println("workByHDMI...");
            }
        };
        //将HDMI接口转换为VGI接口
        VGIPort vgiPort = new HDMIToVGI(hdmiPort);
        //经过转换HDMI接口变成了VGI接口
        vgiPort.workByVGI();
    }
}
