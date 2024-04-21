package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationTarget {
    public static void main(String[] args) {
        int []arr={1,2,1};
        int n=arr.length;
        int sum=2;
        List<Integer> ds=new ArrayList<>();
        printSequence(0, ds, 0, sum, n, arr);
    }

    private static void printSequence(int index, List<Integer> ds, int s, int sum, int n, int[] arr) {
        if(index==n){
            if(s==sum){
                System.out.println(ds);
            }
            return;
        }

        ds.add(arr[index]);
        s+=arr[index];
        printSequence(index+1, ds, s, sum, n, arr);
        s-=arr[index];
        ds.remove(arr[index]);
        printSequence(index+1, ds, s, sum, n, arr);
    }
}
