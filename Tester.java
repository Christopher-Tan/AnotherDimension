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
    }
}