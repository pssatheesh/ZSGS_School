package Leetcode;

public class L3110_scoreofString {
    static int scoreOfString(String s) {
        int sum=0;
        for(int i=1;i<s.length();i++){
            sum+=Math.abs(s.charAt(i-1)-s.charAt(i));
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        String s="hello";
        System.out.println(scoreOfString(s));
    }
}
