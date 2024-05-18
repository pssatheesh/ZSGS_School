package Leetcode;

import java.util.Stack;

public class DecodeStrL394 {
    public static String decodeString(String s) {
        Stack<Character> st=new Stack<>();

        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            StringBuilder ch=new StringBuilder();
            if(s.charAt(i)==']'){
                while(st.peek()!='['){
                    ch.append(st.pop());
                }
                st.pop();
                int n=st.pop()-48;
                ch.reverse();
                for(int j=0;j<n;j++){
                    res.append(ch);
                }

            }
            st.push(s.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }
}
