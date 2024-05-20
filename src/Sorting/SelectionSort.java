package Sorting;


import java.util.Arrays;

public class SelectionSort {
    private static void Sort(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }

    }
    public static void main(String[] args) {
        int []arr={28,56,34,7,12,1};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
