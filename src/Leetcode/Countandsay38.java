package Leetcode;

public class Countandsay38 {
    static String countandsay(int n){
        String result="1";
        for(int i=1;i<n;i++){
            String next="";
            int j=0;
            while(j<result.length()){
                int count=1;
                if(j<result.length()-1 && (result.charAt(j)==result.charAt(j+1))){
                    count++;
                    j++;
                }
                next+=Integer.toString(count)+result.charAt(j);
                j++;
            }
            result=next;
        }
        return result;
    }

    static  String helper(String str, int n){
        if(n==1){
            return str;
        }
        StringBuilder res=new StringBuilder();
        int count=1, i;
        for(i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                res.append(count);
                res.append(str.charAt(i-1));
                count=1;

            }else{
                count++;
            }
        }
        res.append(count);
        res.append(str.charAt(i-1));
        return helper(res.toString(), n-1);
    }
    public static void main(String[] args) {
        int n=5;
       // System.out.println(countandsay(n));
        String str="1";
        if(n==1){
            System.out.println(str);
        }else{
            System.out.println(helper(str, n));
        }
    }
}
