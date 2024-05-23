package Leetcode;

import java.util.Stack;

public class LongValidParenthesisL32 {
    //Without using stack
    static int longestValidParentheses1(String s) {
        int left=0,right=0,maxLength=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                left++;
            }else{
                right++;
            }

            if(left==right){
                maxLength=Math.max(maxLength,2*right);
            }else if(right>left){
                right=left=0;
            }
        }

        left=right=0;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='('){
                left++;
            }else{
                right++;
            }

            if(left==right){
                maxLength=Math.max(maxLength,2*left);
            }else if(right<left){
                right=left=0;
            }
        }
        return maxLength;
    }

    static int longestValidParentheses(String s) {
        if(s.isEmpty()) return 0;
        Stack<Integer> st=new Stack<>();
        int maxi=0;
        st.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                maxi=Math.max(maxi, i-st.peek());
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(longestValidParentheses(s));
        System.out.println(longestValidParentheses1(s));
    }
}
