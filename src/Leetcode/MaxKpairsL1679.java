package Leetcode;

import java.util.Arrays;

public class MaxKpairsL1679 {
    private static int maxOperations(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[right]+nums[left];
            if(sum==k){
                left++;
                right--;
                count++;
            }else if(sum>k){
                right--;
            }else{
                left++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4};
        System.out.println(maxOperations(arr, 5));
    }
}
