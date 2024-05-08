package Practice;

import java.util.Arrays;

public class PlayGame {
    public static void rotateLeft(int[] row, int rot) {
        int n = row.length;
        rot %= n;
        reverse(row, 0, n - 1);
        reverse(row, 0, n - rot - 1);
        reverse(row, n - rot, n - 1);
    }

    public static void rotateRight(int[] row, int rot) {
        int n = row.length;
        rot %= n;
        reverse(row, 0, n - 1);
        reverse(row, 0, rot - 1);
        reverse(row, rot, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int isSimilar(int[][] mat, int row, int col, int rot) {
        int[][] original = new int[row][col];
        for (int i = 0; i < row; i++) {
            original[i] = Arrays.copyOf(mat[i], col);
        }

        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                rotateLeft(mat[i], rot);
            } else {
                rotateRight(mat[i], rot);
            }
        }

        for (int i = 0; i < row; i++) {
            if (!Arrays.equals(original[i], mat[i])) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int row = 2, col = 2;
        int[][] mat = {{1, 2}, {5, 6}};
        int rotation = 1;

        int result = isSimilar(mat, row, col, rotation);
        System.out.println("Output: " + result);
    }
}
