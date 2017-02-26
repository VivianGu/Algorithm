import com.imooc.algorithm.util.SortTestHelper;

/**
 * Created by guxiaowei on 17/2/11.
 */
public class MainTest {

    public static void main(String args[]){
        int n = 50000;
        Integer[] a = SortTestHelper.getIntArr(n,0,n);
        Integer[] b = SortTestHelper.copyArray(a,n);
        Integer[] c = SortTestHelper.copyArray(a,n);
        Integer[] d = SortTestHelper.copyArray(a,n);
        Integer[] e = SortTestHelper.copyArray(a,n);
        Integer[] f = SortTestHelper.copyArray(a,n);
        try{
            //Integer[] d = SortTestHelper.getNearlyOrderedIntArr(n,3);
           // Integer[] e = SortTestHelper.copyArray(c,n);

//            SortTestHelper.testSort("SelectionSort","SelectionSort",a,n);
//            SortTestHelper.testSort("InsertionSort","InsertionSort",b,n);
//            SortTestHelper.testSort("BubbleSort","BubbleSort",c,n);
//            SortTestHelper.testSort("ShellSort","ShellSort",d,n);
            SortTestHelper.testSort("MergeSort","MergeSort",e,n);
            SortTestHelper.testSort("MergeSortButton","MergeSortButton",f,n);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("sort result:");
        SortTestHelper.printArr(f,n);

       // SortTestHelper.printArr(b,n);
    }

}
