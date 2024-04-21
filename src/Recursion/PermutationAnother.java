package Recursion;



public class PermutationAnother {
    static void swap(int []arr, int j, int i){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void printArray(int []arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3};
        //o/p 123,132,213,231,312,321
        printPermutation(arr, 0);
    }

    static void printPermutation(int[] arr, int i) {
        if(i==arr.length-1){
            System.out.println("");
            printArray(arr);
            return;
        }
        for(int j=i;j<arr.length;j++){
            swap(arr, j, i);
            printPermutation(arr, i+1);
            swap(arr, j, i);
        }
    }
}