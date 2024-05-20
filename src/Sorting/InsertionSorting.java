package Sorting;

import java.util.Arrays;

public class InsertionSorting {
    private static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            int min=arr[i];
            while ((j>-1)&&(arr[j]>min)){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=min;
        }
    }
    public static void main(String[] args) {
        int []arr={28,56,34,7,12,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
