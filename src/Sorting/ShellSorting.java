package Sorting;

import java.util.Arrays;

public class ShellSorting {
    static int shellSort(int[] arr, int n){
        for(int gap=n/2;gap>0;gap/=2){
            for(int i=gap;i<n;i++){
                int temp=arr[i];

                int j;
                for(j=i; j>=gap && arr[j-gap]>temp;j=j-gap){
                    arr[j]=arr[j-gap];
                }
               arr[j]=temp;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int []arr={8,6,3,2,1,7,5,4};
        System.out.println(shellSort(arr, arr.length));
        System.out.println(Arrays.toString(arr));
    }
}
