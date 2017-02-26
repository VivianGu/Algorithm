package com.imooc.algorithm.study;

/**
 * Created by guxiaowei on 17/2/11.
 */
public interface IBaseSort<T extends Comparable<T>> {
    public void getSort(T[] arr,int n) throws Exception;

}
