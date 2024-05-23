package Leetcode;

public class DivideIntL29 {

    private static void main(String[] args) {
        int dividend=7;
        int divisor=3;
        System.out.println(divide(dividend, divisor));
    }

    private static int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE || divisor==-1){
            return Integer.MAX_VALUE;
        }
        int sign=(dividend<0 || divisor<0)?-1:1;
        long dvd=Math.abs(dividend);
        long dvs=Math.abs(divisor);
        long ans=0;

        while(dvd>=dvs){
            long k=1;
            while (2*k*dvs <= dvd)
                k*=2;

            dvd-=k*dvs;
            ans+=k;
        }
        return (int) (sign * ans);
    }
}
