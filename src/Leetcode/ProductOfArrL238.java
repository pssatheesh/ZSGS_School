package Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class ProductOfArrL238 {
    static public int[] productExceptSelf(int[] nums) {
        int []res=new int[nums.length];
        res[0]=1;
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int postfix=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]*=postfix;
            postfix*=nums[i];
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        System.out.println(productExceptSelf(arr));

    }
}
