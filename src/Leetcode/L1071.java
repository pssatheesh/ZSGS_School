package Leetcode;

public class L1071 {
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gcd=getGcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }
    public static int getGcd(int a, int b){
        if(b==0) return a;
        return getGcd(b, a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }
}
