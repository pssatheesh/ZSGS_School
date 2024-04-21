package Recursion;

import java.util.ArrayList;
import java.util.List;

public class StringSequence {
    static List<String> al=new ArrayList<>();
    public static void findSubsequence(String s, String ans){
        if(s.length()==0){
            al.add(ans);
            return;
        }
        findSubsequence(s.substring(1), ans+s.charAt(0));

        findSubsequence(s.substring(1), ans);
    }
    static void Subsequence(String str, String res){
        if(str.isEmpty()){
            System.out.println(res);
            return;
        }
        char ch=str.charAt(0);
        Subsequence(str.substring(1), res);
        Subsequence(str.substring(1), res+ch);

    }

    public static void main(String[] args) {
        String s="abc";
        findSubsequence(s, " ");
        //System.out.println(al);
        Subsequence(s, "");
    }
}
