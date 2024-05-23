package Leetcode;

public class MaxVowelsStrL1456 {
    private static int maxVowels(String s, int k) {
        int count=0, max=0;
        for(int j=0;j<=s.length()-k;j++){
            String temp=s.substring(j, k+j);
            System.out.println(temp);
            count=0;
            for(int i=0;i<k;i++){
                if(temp.charAt(i)=='a' || temp.charAt(i)=='e' || temp.charAt(i)=='i' || temp.charAt(i)=='o' || temp.charAt(i)=='u' ){
                    count++;
                }
            }
            max=Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        String s="weallloveyou";
        System.out.println(maxVowels(s, 7));
    }
}
