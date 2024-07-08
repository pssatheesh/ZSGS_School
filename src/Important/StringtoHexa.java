package Important;

import java.util.Scanner;

public class StringtoHexa {
    private static String convertHexatoString(String str){
        char []arr=str.toCharArray();

        String res="";
        for(int i=0;i<arr.length-1;i=i+2){
            String ch=""+arr[i]+""+arr[i+1];
            char temp=(char)Integer.parseInt(ch, 16);
            res+=temp;
        }

        return res;
    }
    private static String convertHexa(String str){
        char []arr=str.toCharArray();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String temp=Integer.toHexString(arr[i]);
            res.append(temp);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input:");
        String str=sc.nextLine();
        System.out.println(convertHexa(str));
        String s="68656C6C6F20776F726C64";
        System.out.println(convertHexatoString(s));
        //input: hello world
        //output: 68656C6C6F20776F726C64
    }
}
