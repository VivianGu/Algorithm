package com.imooc.algorithm.study;

/**
 * Created by guxiaowei on 17/2/21.
 */
public class MergeSort <T extends Comparable<T>> implements IBaseSort<T>{
    private void MergeSortOne(T[]arr,int l,int r){

        if(l >= r){
            return;
        }
        if(r-l<15){
            insectionSort(arr,l,r);
            return;
        }
        int mid = (l+r)/2;
        MergeSortOne(arr,l,mid);
        MergeSortOne(arr,mid+1,r);
        Merge(arr,l,r,mid);

    }

    private void insectionSort(T[]arr ,int l,int r){
        for(int i = l+1; i <= r; i++){
            T temp = arr[i];
            int j;
            for(j = i; j > l && arr[j-1].compareTo(temp)>0; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }
    }

    private void Merge(T[]arr,int l,int r,int mid){
        Object temp[] = new Object[r-l+1];
        for(int i = l; i <= r; i++){
            temp[i-l] = arr[i];
        }
        int i = l, j = mid + 1;
        for(int k = l; k <= r; k++ ){
            if(i > mid) {
                arr[k] = (T) temp[j - l];
                j++;
            }else if(j > r){
                arr[k] = (T)temp[i-l];
                i++;
            }else {
                T a = (T) temp[i-l];
                T b = (T) temp[j-l];
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
        MergeSortOne(arr,0,n-1);
    }
}
