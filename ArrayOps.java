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
    public static int sum(int[][] arr) {
        return sum(sumRows(arr));
    }
    public static int[] sumCols(int[][] matrix) {
        int columns = matrix[0].length;
        int[] sum = new int[columns];
        for (int i = 0; i < columns; i++) {
            int scolumn = 0;
            for (int j = 0; j < matrix.length; j++) {
                scolumn += matrix[j][i];
            }
            sum[i] = scolumn;
        }
        return sum;
    }
    public static boolean isRowMagic(int[][] matrix) {
        int[] sumrows = sumRows(matrix);
        for (int i = 1; i < sumrows.length; i++) {
            if (sumrows[i-1] != sumrows[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isColMagic(int[][] matrix) {
        int[] sumcols = sumCols(matrix);
        for (int i = 1; i < sumcols.length; i++) {
            if (sumcols[i-1] != sumcols[i]) {
                return false;
            }
        }
        return true;
    }
}