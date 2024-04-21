import java.util.Scanner;

public class Main {
    public static int convertInt(String str){
        int n=0;
        int i=0;
        while(i<str.length()){
            int temp=str.charAt(i)-48;
            n=(n*10)+temp;
            i++;
        }
        return n;
    }
    public static void main(String[] args) {
        String s="25";
        System.out.println((int)Math.sqrt(25));


    }
}