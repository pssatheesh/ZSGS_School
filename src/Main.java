import java.io.*;
import java.util.*;


public class Main {
    public static int pivotIndex(int[] nums) {
        int leftsum=0, rightsum=0;
        int i=0;
        while(i<nums.length-1){
            int pivot=i;
            for(int j=0;j<pivot;j++){
                leftsum=+nums[j];
            }
            for(int j=pivot+1;j<nums.length-1;j++){
                rightsum=+nums[j];
            }
            if(leftsum==rightsum){
                return pivot;
            }
            i++;
        }
        return -1;
    }
    public static boolean closeStrings(String word1, String word2) {
        Set<Character> hs=new HashSet<>();
        if(word1.length()!=word2.length()){
            return false;
        }
        for(int i=0;i<word1.length();i++){
            hs.add(word1.charAt(i));
        }
        for(int i=0;i<word2.length();i++){
            if(!hs.contains(word2.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static double findMaxAverage(int[] nums, int k) {
        double max=Integer.MIN_VALUE, avg=0;
        double sum=0;
        if(nums.length ==1){
            return (double)nums[0];
        }
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        if(nums.length!=k){
            for(int j=k;j<nums.length;j++){
                sum+=nums[j]-nums[j-k];
                avg=sum/k;
                max=Math.max(max, avg);
            }
        }else{
            avg=sum/k;
            max=Math.max(max, avg);
        }

        return max;
    }
    public static void main(String[] args) {
//        int []nums={1,7,3,6,5,6};
//        System.out.println(closeStrings("cabbba", "aabbss"));
//        System.out.println("♥♥♥♥");
//        int []arr={9,7,3,5,6,2,1,8,1,9};
//        System.out.println(findMaxAverage(arr, 6));


    }


}