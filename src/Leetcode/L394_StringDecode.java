package Leetcode;

import java.util.Stack;

public class L394_StringDecode {
    private static String decodeString(String s) {
        Stack<Integer> numbers=new Stack<>();
        Stack<String> chars=new Stack<>();
        StringBuilder res=new StringBuilder();
       int k=0;
       for(char c:s.toCharArray()) {
           if (Character.isDigit(c)) {
               k = (k * 10) + (c - 48);
               continue;
           }
           if (c == '[') {
               numbers.push(k);
               k = 0;
               chars.push(String.valueOf(c));
               continue;
           }
           if (c != ']') {
               chars.push(String.valueOf(c));
               continue;
           }
           StringBuilder temp = new StringBuilder();
           while (!chars.peek().equals("["))
               temp.insert(0, chars.pop());

           chars.pop(); // remove ]


           StringBuilder replace = new StringBuilder();
           int n = numbers.pop();
           for (int i = 0; i < n; i++)
               replace.append(temp);

           chars.push(replace.toString());
       }
           while(!chars.isEmpty()){
               res.insert(0, chars.pop());
           }

        return res.toString();
    }

    public static void main(String[] args) {
        String str="3[a2[c]]";
        System.out.println(decodeString(str));
    }
}
