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
        //row_magic
        int[][] array7 = {{10,20,30},{10,10,10,10,10,10},{40,20},{60},{10,50}};
        int[][] array8 = {{10,20,30},{10,10,10,10,10,10},{40,20},{60},{10,48}};
        System.out.println(ArrayOps.isRowMagic(array7));
        System.out.println(ArrayOps.isRowMagic(array8));
        //col_magic
        int[][] array9 = {{1,2,15},{5,1,2},{1,4,3},{5,3,4},{1,10,1},{5,5,1},{1,1,1},{5,2,1},{1,1,1},{5,1,1}};
        int[][] array10 = {{1,2,15},{5,1,2},{1,4,3},{5,3,4},{1,3,1},{5,5,1},{1,1,1},{5,2,1},{1,1,1},{5,1,1}};
        System.out.println(ArrayOps.isColMagic(array9));
        System.out.println(ArrayOps.isColMagic(array10));
        //checkpoint
        int[][] C = {{1,2,3,4},{2,3,4,1},{3,4,1,2}};
        int[][] D = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] E = {{2,2,2},{2,2,2}};
        System.out.println(ArrayOps.isRowMagic(C) + " " + ArrayOps.isColMagic(C));
        System.out.println(ArrayOps.isRowMagic(D) + " " + ArrayOps.isColMagic(D));
        System.out.println(ArrayOps.isRowMagic(E) + " " + ArrayOps.isColMagic(E));
        //location_magic
        int[][] F = {{2,4,2},{2,2,2}};
        System.out.println(ArrayOps.isLocationMagic(F,0,1));
        System.out.println(ArrayOps.isLocationMagic(F,1,1));
    }
}