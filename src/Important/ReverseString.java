package Important;

import java.util.Scanner;

public class ReverseString {
    private static String reverse(String str){
        if(str.isEmpty() || !str.contains(" "))
            return str;
        int lastIndex=str.lastIndexOf(' ');
        String lastWord=str.substring(lastIndex+1);
        String remaining=str.substring(0, lastIndex);
        return lastWord+" "+reverse(remaining);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input:");
        String str=sc.nextLine();
        System.out.println(reverse(str));
    }
}
