package Practice;

import java.util.Arrays;

public class SelectionSort {
    public static void selection(int []arr){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []arr={8,2,6,4,10,1};
        selection(arr);

    }
}
