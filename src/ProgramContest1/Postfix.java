package ProgramContest1;

import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        String exp="545*+5/";
        Stack<Integer> result=new Stack<>();
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)>='0' && exp.charAt(i)<='9'){
                int temp=exp.charAt(i)-48;
                result.push(temp);
            }else{
                int val1=0, val2=0;
                switch (exp.charAt(i)){
                    case '+':
                        val1=result.pop();
                        val2=result.pop();
                        result.push(val1+val2);
                        break;
                    case '-':
                        val1=result.pop();
                        val2=result.pop();
                        result.push(val2-val1);
                        break;
                    case '*':
                        val1=result.pop();
                        val2=result.pop();
                        result.push(val1*val2);
                        break;
                    case '/':
                        val1=result.pop();
                        val2=result.pop();
                        result.push(val2/val1);
                        break;
                }
            }
        }
        System.out.println(result);
    }
}
