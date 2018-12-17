package test;

import com.xurui.factory.CPUFactory;
import com.xurui.factory.Provider;
import com.xurui.factory.impl.AMDCPUFactory;
import com.xurui.factory.impl.InterCPUFactory;

/**
 * Created by Administrator on 2018/12/17.
 */
public class CUPFactoryTest {
    public static void main(String[] args) {
        //创建一个生产CPU工厂的工厂
         Provider cpufactory = new InterCPUFactory();
       // Provider cpufactory = new AMDCPUFactory();
        //通过CPU工厂的工厂创建一个IntelCPU工厂
        CPUFactory intelcpu = cpufactory.createCPUFactory();
        //IntelCPU工厂生产intelCPU
        intelcpu.createCPU();
    }
}
