package com.imooc.algorithm.util;

import com.imooc.algorithm.study.IBaseSort;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by guxiaowei on 17/2/11.
 */
public  class SortTestHelper {

    public static Integer[] getIntArr(int n ,int rangeL ,int rangeR){

        Integer[] arr = new Integer[n];
        for(int i = 0; i<n; i++){
            arr[i] = (int)(Math.random()*(rangeR-rangeL)+rangeL);
        }
        return arr;
    }

    public static <T> void printArr(T[] arr,int n){
        for(int i=0; i<n; i++){
            if(i==n-1){
                System.out.println(arr[i]+".");
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }



    public static <T> void swap(T[] arr, int a, int b) throws Exception {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static <T extends Comparable<T>> void testSort(String sortClass,String sortName,T[] arr,int n) throws Exception {
        Class a = Class.forName("com.imooc.algorithm.study."+sortClass);
        IBaseSort sort = (IBaseSort) a.newInstance();

        long start_time = new Date().getTime();
        sort.getSort(arr,n);
        long end_time = new Date().getTime();
        double cost_time = (end_time-start_time)/1000.0000;
        //long cost_time = end_time-start_time;
        System.out.println(sortName+",spend time:"+cost_time);
        if(isSorted(arr,n)){
            System.out.println(sortName+",sort successful!!");
        }else{
            System.out.println(sortName+",sort failed");
        }

    }

    public static<T extends Comparable<T>> boolean isSorted(T[] arr,int n){
        for(int i = 0; i < n-1; i++){
            if(arr[i].compareTo(arr[i+1]) > 0){
                return false;
            }
        }
        return true;
    }

    public static Integer[] copyArray(Integer[] arr,int n){
        Integer[] arr_copy = new Integer[n];
        arr_copy = arr.clone();
        return arr_copy;
    }

    public static Integer[] getNearlyOrderedIntArr(int n ,int swapTimes) throws Exception{

        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++){
            arr[i] = i;
        }
        for(int i = 0; i< swapTimes; i++){
            int a = (int)Math.random()*n;
            int b = (int)Math.random()*n;
            swap(arr,a,b);
        }
        return arr;
    }

}
