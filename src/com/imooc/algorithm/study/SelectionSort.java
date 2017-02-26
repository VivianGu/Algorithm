package com.imooc.algorithm.study;

import com.imooc.algorithm.util.SortTestHelper;

/**
 * Created by guxiaowei on 17/2/11.
 */
public class SelectionSort<T extends Comparable<T>> implements IBaseSort<T>  {

    @Override
    public void getSort(T[] arr, int n) throws Exception {

        for(int i = 0; i < n; i++){
            int maxIndex = i;
            for(int j = i; j < n; j++){
                if (arr[j].compareTo(arr[maxIndex]) < 0){
                    maxIndex = j;
                }
            }
            SortTestHelper.swap(arr,i,maxIndex);
        }
    }
}
