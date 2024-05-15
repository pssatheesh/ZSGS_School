package Leetcode;

public class L1768 {
    public static String mergeAlternately(String word1, String word2) {
        int length= Math.min(word1.length(), word2.length());
        StringBuilder res=new StringBuilder();
        for(int i=0;i<length;i++){
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }
        if(word1.length()>length){
            res.append(word1.substring(length));
        }else{
            res.append(word2.substring(length));
        }
        return res.toString();

    }

    public static void main(String[] args) throws Exception{
        System.out.println(mergeAlternately("abcd", "pq"));

    }
}
