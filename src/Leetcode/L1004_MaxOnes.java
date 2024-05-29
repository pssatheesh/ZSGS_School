package Leetcode;

public class L1004_MaxOnes {
    static int longestOnes(int[] nums, int k) {
        int r=0, l=0, counter=0;
        int n=nums.length;
        int max=0;
        while (r<n){
            if(nums[r]==0){
                counter++;
            }
            while(k<counter){
                if(nums[l]==0){
                    counter--;
                }
                l++;
            }
            max=Math.max(max, r-l+1);
            r++;
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr={1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(arr, 2));

    }
}
