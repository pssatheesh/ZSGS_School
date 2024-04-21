package ProgramContest1;

import java.util.Stack;

public class DecodeSeq {
     static String decode(String str){
         if(str==null || str.isEmpty()){
             return "";
         }

         Stack<Integer> code=new Stack<>();
         String result="";
         for(int i=0;i<=str.length();i++){
             code.push(i+1);
             if(i==str.length() || str.charAt(i)=='I'){
                 while(!code.isEmpty()){
                     result+=code.pop();
                 }
             }
         }

         return result;
     }
    public static void main(String[] args) {
        String str="IDID";
        //o/p 13254
        System.out.println(decode(str));
    }
}
