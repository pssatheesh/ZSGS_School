package Leetcode;

public class TrappingRainWaterL42 {
     private static int trap(int[] height) {
        int water=0;
        int n=height.length;
        int []rightmax=new int[n];
        int []leftmax=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                leftmax[0]=height[0];
                rightmax[n-1]=height[n-1];
            }else{
                leftmax[i]=Math.max(leftmax[i-1], height[i]);
                rightmax[n-i-1]=Math.max(rightmax[n-i], height[n-i-1]);
            }
        }

        for(int i=0;i<height.length;i++){
            water+=Math.min(leftmax[i], rightmax[i])-height[i];
        }
        return water;
    }

    public static void main(String[] args) {
        int []arr={4,2,0,3,2,5};
        System.out.println(trap(arr));
    }

}
