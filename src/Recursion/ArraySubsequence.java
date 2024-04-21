package Recursion;

import java.util.ArrayList;

public class ArraySubsequence {
    public static void subsequence(int []arr, int index, ArrayList<Integer> result){
        if(index== arr.length){
            if(result.size()>0){
                System.out.println(result);
            }
        }else{
            subsequence(arr, index+1, result);
            result.add(arr[index]);

            subsequence(arr, index+1, result);
            result.remove(result.size()-1);
        }
        return;
    }
    public static void main(String[] args) {
        int []arr={1,2,3};
        ArrayList<Integer> result=new ArrayList<>();
        subsequence(arr, 0, result);

    }
}
