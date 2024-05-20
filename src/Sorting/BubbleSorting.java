package Sorting;

import java.util.Arrays;

public class BubbleSorting {
    private static void bubbleSort(int []arr){
        boolean swapped;
        do{
            swapped=false;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swapped=true;
                }
            }
        }while(swapped);


    }
    public static void main(String[] args) {
        int []arr={28,56,34,7,12,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
