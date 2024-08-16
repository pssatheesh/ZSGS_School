package Leetcode;

public class IsSubsequenceL392 {
    public static boolean isSubsequence(String s, String t) {
        int i=0, j=0;
        if(s.isEmpty()) return true;
        while(i<t.length() && j<s.length()){
            char ch=s.charAt(j);
            if(t.charAt(i)==ch){
                j++;
                if(j==s.length()){
                    return true;
                }
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="abc";
        String t="ahbgdc";
        System.out.println(isSubsequence(s, t));

    }
}
