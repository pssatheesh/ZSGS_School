package ProgramContest1;

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input"); //1+2*3
        String str=scanner.next();
        str.replace(" ","");
        int val=0, result=0;
        char symbol='+';
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                val=(val*10)+(str.charAt(i)-48);
            }else {
                if(!Character.isDigit(str.charAt(i+1))){
                    System.out.println(-1);
                    break;
                }
                result=check(result, val, symbol);
                val=0;
                symbol=str.charAt(i);
            }
        }
        result=check(result, val, symbol);
        System.out.println(result);
    }
    static int check(int a, int b, char symbol){
        int total=0;
        switch (symbol){
            case '+':
                total=a+b;
                break;
            case '-':
                total=a-b;
                break;
            case '*':
                total=a*b;
                break;
            case '/':
                total=a/b;
                break;
            default:
                System.out.println("Invalid type");
        }
        return total;
    }
}
