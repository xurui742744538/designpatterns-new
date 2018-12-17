package test;

import com.xurui.template.AbstractSort;
import com.xurui.template.QuickSort;

/**
 * Created by Administrator on 2018/12/17.
 */
public class TemplatTest {
    public static void main(String[] args) {
        int[] arr = {3,5,2,45,243,341,111,543,24};
        //AbstractSort s = new MergeSort();
        AbstractSort s = new QuickSort();
        s.printArray(arr);
    }

}
