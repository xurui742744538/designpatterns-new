package test;

import com.xurui.strategy.context.Context;
import com.xurui.strategy.impl.OperationAdd;
import com.xurui.strategy.impl.OperationSubstract;

/**
 * Created by Administrator on 2018/12/17.
 */
public class StrategyTest {
    public static void main(String[] args) {
        //计算 1 + 1
        Context context = new Context(new OperationAdd());
        System.out.println("1 + 1 = " + context.calculate(1,1));
        //计算 1 - 1
        context = new Context(new OperationSubstract());
        System.out.println("1 - 1 = " +context.calculate(1,1));
    }
}
