package Leetcode;

import java.util.Arrays;

public class MedianL4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length=nums1.length+nums2.length;
        int []res=new int[length];
        int k=0;
        for(int i:nums1){
            res[k++]=i;
        }
        for(int i:nums2){
            res[k++]=i;
        }
        Arrays.sort(res);
        int mid=res.length/2;
        if(res.length%2!=0){
            return (double)res[mid];
        }
        return (double)(res[mid]+res[mid-1])/2;
    }

    public static void main(String[] args) {
        int []nums1={1,3};
        int []nums2={2,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
