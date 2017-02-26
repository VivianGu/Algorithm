package com.imooc.algorithm.study;

import com.imooc.algorithm.util.SortTestHelper;

/**
 * Created by guxiaowei on 17/2/11.
 */
public class InsertionSort<T extends Comparable<T>> implements IBaseSort<T>  {

    @Override
    public void getSort(T[] arr, int n) throws Exception {

        for(int i = 1; i < n; i++){
            //优化方法
            T e = arr[i];
            int j;
            for( j = i; j > 0 && e.compareTo(arr[j-1]) < 0; j--) {
               arr[j] = arr[j-1];
            }
            arr[j]=e;
            //未优化方法
//            for(int j = i; j > 0 && arr[j].compareTo(arr[j-1]) < 0; j--){
//                SortTestHelper.swap(arr,j,j-1);
//            }

//            for(int j = i; j > 0; j--){
//                if(arr[j].compareTo(arr[j-1]) < 0){
//                    SortTestHelper.swap(arr,j,j-1);
//                }else{
//                    break;
//                }
//
//            }

        }
    }
}
