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
    public static void main(String[] args) {
        int []nums={1,7,3,6,5,6};
        System.out.println(closeStrings("cabbba", "aabbss"));
        System.out.println("♥♥♥♥");
        ArrayList<Integer> al=new ArrayList<>();

    }


}