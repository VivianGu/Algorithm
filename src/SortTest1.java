/**
 * Created by guxiaowei on 17/2/5.
 */
public class SortTest1 {
    public  void selectionSort(int arr[] ,int n){
        for(int i = 0; i < n ; i++){
            int minIndex = i;
            for(int j = i +1; j < n ; j++){
                if( arr[j] < arr[minIndex]){
                    minIndex = j ;
                }
            }
            //交换函数
            swap( arr,i,minIndex);

        }
    }
    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String args[]){
        int[] a = {10,4,7,3,6,8,2,5,1,9};
        new SortTest1().selectionSort(a,10);
        System.out.println("sort result:");
        for(int i = 0; i < 10; i++){
            System.out.print(a[i]+"  ");
        }
    }
}
