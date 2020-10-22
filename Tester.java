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
    }
}