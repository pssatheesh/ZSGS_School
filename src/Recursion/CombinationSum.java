package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    //Leetcode 39
    static  void findcombination(int index, int target, int[] arr, List<List<Integer>> ans, List<Integer>ds){
        if(arr.length==index){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(index<=target){
            ds.add(arr[index]);
            findcombination(index, target-arr[index], arr, ans, ds);
            ds.remove(ds.size()-1);
        }
        findcombination(index+1, target, arr, ans, ds);
    }
    static List<List<Integer>> Combination(int []arr, int target){
        List<List<Integer>> ans=new ArrayList<>();
        findcombination(0, target, arr, ans, new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5};
        int target=8;
        System.out.println(Combination(arr, target));
    }
}
