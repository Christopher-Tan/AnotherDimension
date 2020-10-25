public class ArrayOps {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int largest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static int[] sumRows(int[][] matrix) {
        int[] sum = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            sum[i] = sum(matrix[i]);
        }
        return sum;
    }
    public static int[] largestInRows(int[][] matrix) {
        int[] largest = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            largest[i] = largest(matrix[i]);
        }
        return largest;
    }
}