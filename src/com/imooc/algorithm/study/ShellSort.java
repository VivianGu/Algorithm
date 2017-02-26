package com.imooc.algorithm.study;

import com.imooc.algorithm.util.SortTestHelper;

/**
 * Created by guxiaowei on 17/2/19.
 */
public class ShellSort <T extends Comparable<T>> implements IBaseSort<T>{
    private Integer shell_sort_h = 3;
    @Override
    public void getSort(T[] arr, int n) throws Exception {
        int h = 1;
        while(h < n/this.shell_sort_h){
            h = this.shell_sort_h * h + 1;
        }

        while(h >= 1){

            for(int i = h; i < n; i++){
                T temp = arr[i];
                int j;
                for(j = i; j >= h && arr[j].compareTo(arr[j-h])<0; j -= h){
                    SortTestHelper.swap(arr,j,j-h);
                }
                arr[j] = temp;
            }
            h /= 3;
        }
    }
}
