package com.imooc.algorithm.study;

import java.util.Objects;

/**
 * Created by guxiaowei on 17/2/25.
 */
public class MergeSortButton <T extends Comparable<T>> implements IBaseSort<T>  {

    private void MergeBut(T[] arr,int n){
        for(int sz = 1; sz <= n; sz+=sz){
            for(int i = 0; i+sz < n; i+=sz+sz){
                Merge(arr,i,i+sz-1,Math.min(i+sz+sz-1,n-1));
            }
        }
    }

    private void Merge(T[]arr ,int l,int mid,int r){
        Object[] temp = new Object[r-l+1];
        for(int i = l; i <= r; i++){
            temp[i-l] = arr[i];
        }
        int i = l, j = mid + 1;
        for(int k = l; k <= r; k++){
            if(i > mid){
                arr[k] = (T)temp[j-l];
                j++;
            }else if(j > r){
                arr[k] = (T)temp[i-l];
                i++;
            }else{
                T a = (T)temp[i-l];
                T b = (T)temp[j-l];
                if(a.compareTo(b) < 0){
                    arr[k] = a;
                    i++;
                }else{
                    arr[k] = b;
                    j++;
                }
            }

        }
    }
    @Override
    public void getSort(T[] arr, int n) throws Exception {

    }
}
