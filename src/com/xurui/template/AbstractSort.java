package com.xurui.template;

/**
 * Created by Administrator on 2018/12/17.
 */
public abstract class AbstractSort {
    public abstract void sort(int[] array);
    //防止子类覆盖使用final修饰
    public final void printArray(int[] array) {
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
