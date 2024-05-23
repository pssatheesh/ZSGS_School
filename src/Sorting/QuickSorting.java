package Sorting;

import java.util.Arrays;

public class QuickSorting {
    private static void quicksort(int []arr, int start, int end){
        if(start<end){
            int p=Partition(arr, start, end);
            quicksort(arr, start, p-1);
            quicksort(arr, p+1, end);
        }
    }

    private static int Partition(int[] arr, int start, int end) {
        int pivot=arr[end];
        int p=start-1;
        for(int i=start;i<end;i++){
            if(arr[i]<pivot){
                p++;
                int temp=arr[p];
                arr[p]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[p+1];
        arr[p+1]=arr[end];
        arr[end]=temp;
        return p+1;
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 6, 2, 6, 1};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
