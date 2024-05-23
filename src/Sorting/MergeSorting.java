package Sorting;

import java.util.Arrays;

public class MergeSorting {
    private static void merge(int[] arr, int mid, int start, int end) {
        int N1 = mid - start + 1;
        int N2 = end - mid;

        int[] Left = new int[N1];
        int[] Right = new int[N2];

        int i, j, k;
        for (i = 0; i < N1; i++)
            Left[i] = arr[start + i];

        for (j = 0; j < N2; j++)
            Right[j] = arr[mid + j + 1];

        i = 0;
        j = 0;
        k = start;
        while (i < N1 && j < N2) {
            if (Left[i] < Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < N1) {
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < N2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    private static void mergesort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (end + start) / 2;
            mergesort(arr, start, mid);
            mergesort(arr, mid + 1, end);
            merge(arr, mid, start, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 6, 2, 6, 1};
        mergesort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
