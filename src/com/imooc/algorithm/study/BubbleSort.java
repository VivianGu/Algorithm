package com.imooc.algorithm.study;

import com.imooc.algorithm.util.SortTestHelper;

/**
 * Created by guxiaowei on 17/2/19.
 */
public class BubbleSort <T extends Comparable<T>> implements IBaseSort<T>{

    @Override
    public void getSort(T[] arr, int n) throws Exception {
        Boolean isSwap = true;
        while(isSwap) {
            isSwap = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    SortTestHelper.swap(arr, i, i + 1);
                    isSwap = true;
                }
            }
            n--;
        }
    }
}
