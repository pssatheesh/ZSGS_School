package Leetcode;

public class L260_SingleNumber {
    public static int[] singleNumber(int[] nums) {
        int []res=new int[nums.length/2];
        int count=0;
        if(nums.length<2)
            return nums;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[i]=-1;
                    nums[j]=-1;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){
                System.out.println(nums[i]);
                res[count++]=nums[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int []arr={1,2,1,3,2,5};
        singleNumber(arr);
    }
}
