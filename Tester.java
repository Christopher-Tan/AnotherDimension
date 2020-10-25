import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        //sum
        int[] array1 = {1,2,3,4};
        int[] array2 = {10,5,3,12};
        int[] array3 = {};
        System.out.println(ArrayOps.sum(array1));
        System.out.println(ArrayOps.sum(array2));
        System.out.println(ArrayOps.sum(array3));
        //largest
        System.out.println(ArrayOps.largest(array1));
        System.out.println(ArrayOps.largest(array2));
        //sum_rows
        int[][] array4 = {{1,5,10,14},{10,5,24},{},{2,4,8}};
        int[][] array5 = {};
        System.out.println(Arrays.toString(ArrayOps.sumRows(array4)));
        System.out.println(Arrays.toString(ArrayOps.sumRows(array5)));
        //largest_in_rows
        int[][] array6 = {{1,20,14,10},{10,5,2,4},{100,28,72,32},{10,100,1,10000,10}};
        System.out.println(Arrays.toString(ArrayOps.largestInRows(array6)));
        //sum
        System.out.println(ArrayOps.sum(array4));
        System.out.println(ArrayOps.sum(array5));
        System.out.println(ArrayOps.sum(array6));
        //checkpoint
        int[][] A = {{1,0,12,-1},{7,-2,2,1},{-5,-2,2,-9}};
        int[] B = {1,3,5};
        System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
        System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
        System.out.println(ArrayOps.sum(B));
        System.out.println(ArrayOps.sum(A));
        //sum_cols
        System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
    }
}