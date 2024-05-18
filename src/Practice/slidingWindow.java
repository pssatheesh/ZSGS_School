package Practice;

public class slidingWindow {
    private static int maxSum(int []arr, int k){
        int windowsum=0, max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        for(int j=k;j<arr.length;j++){
            windowsum+=arr[j]-arr[j-k];
            max=Math.max(windowsum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr={1,9,-1,-2,7,3,-1,2};
        int k=4;
        System.out.println(maxSum(arr, k));
    }
}
