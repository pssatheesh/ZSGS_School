package Leetcode;

public class HouseRobber213 {
    public static int rob(int[] nums) {
        int max=0;
        int length=0;
        int []res=new int[nums.length];
        if(nums.length<=3){
            for(int i=0;i<nums.length;i++){
                max=Math.max(max, nums[i]);
            }
            return max;
        }
        res[0]=nums[0];
        res[1]=Math.max(nums[0],nums[1]);
        //res[2]=Math.max(res[2],nums[2]);
        if(nums.length%2!=0){
            length=nums.length-1;
        }else{ length=nums.length;}
        for(int i=2;i<length;i++){
            res[i]=Math.max(res[i-2]+nums[i], res[i-1]);
        }
        return res[res.length-1];
    }

    public static int robe(int[] nums) {
        if(nums.length<1)
        {
            return 0;
        }
        else if(nums.length==1)
        {
            return nums[0];
        }
        if(nums.length<=3)
        {
            int max=0;
            for(int i=0;i<nums.length;i++){
                max=Math.max(max, nums[i]);
            }
            return max;
        }
        else
        {
            int[] res=new int[nums.length];
            res[0]=nums[0];
            res[1]=Math.max(nums[0],nums[1]);
            for(int i=2;i<nums.length-1;i++)
            {
                res[i]=Math.max(res[i-1],res[i-2]+nums[i]);
            }
            int[] res1=new int[nums.length];
            res1[0]=nums[1];
            res1[1]=Math.max(nums[1],nums[2]);
            for(int i=3;i<nums.length;i++)
            {
                res1[i-1]=Math.max(res1[i-2],res1[i-3]+nums[i]);
            }
            return Math.max(res[nums.length-2],res1[nums.length-2]);
        }
    }

    public static void main(String[] args) {
        int []arr={200,3,140,20,10};
        System.out.println(robe(arr));
    }
}
