package ProgramContest1;

import java.util.Scanner;

public class Program4 {
    /*a) Multiply a given integer with 15
    b) Multiply a given even integer with 7.5
    c) Calculate value of 15 × n/16*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input");
        int num= scanner.nextInt();
        int res=(num<<3)+(num<<2)+(num<<1)+(num<<0);
        int val=(num<<2)+(num<<1)+(num<<0)+(num>>1);
        int divide=(res>>4);
        System.out.println(res);
        System.out.println(val);
        System.out.println(divide);
    }
}
