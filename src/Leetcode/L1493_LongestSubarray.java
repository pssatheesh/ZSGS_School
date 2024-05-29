package Leetcode;

public class L1493_LongestSubarray {
    private static int longestSubarray(int[] nums) {
        int l=0, count=0, max=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                count++;
            }
            while (count>1){
                if(nums[l]==0){
                    count--;
                }
                l++;
            }
            max=Math.max(max, r-l-count+1);
        }
        return (max==nums.length)?nums.length-1:max;
    }

    public static void main(String[] args) {
        //int []arr={0,1,1,1,0,1,1,0,1};
        int []arr={1,1,0,1};
        System.out.println(longestSubarray(arr));

    }
}
