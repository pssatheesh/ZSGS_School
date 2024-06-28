package Practice;

import java.util.Stack;

public class BinarytoHexa {
    private static void convertOctal(String str){
       StringBuilder s=new StringBuilder();
       int length=str.length();
       String temp="";
       while(length-3>0){
           temp=str.substring(length-3, length);
           int val=Integer.parseInt(temp, 2);
           s.append(val);
           length-=3;
       }
       if(length>0){
           temp=str.substring(0, length);
           int val=Integer.parseInt(temp, 2);
           s.append(val);
       }
        System.out.println(s.reverse());
    }
    private static void convertHexa(String str){
        StringBuilder s=new StringBuilder();
        int length=str.length();
        String temp="";
        while(length-4>0){
            temp=str.substring(length-4, length);
            s.append(value(temp));
            length-=4;
        }
        if(length>0){
            temp=str.substring(0, length);
            s.append(value(temp));
        }
        System.out.println(s.reverse());
    }
    private static String value(String str){
        int val=Integer.parseInt(str, 2);
        if(val<10){
            return val+"";
        }
        return (char)(val+55)+"";
    }
    public static void main(String[] args) {
        convertOctal("110111");
        convertHexa("0001101011000101");

    }
}
