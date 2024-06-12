package ProgramContest1;

import java.util.ArrayList;
import java.util.Arrays;

public class UniquePermutation {
    static String Swap(String s, int low, int high){
        String ans="";
        /*for(int i=0;i<s.length();i++){
            if(i==low){
                ans+=s.charAt(high);
            } else if (i==high) {
                ans+=s.charAt(low);
            }else{
                ans+=s.charAt(i);
            }
        }*/
        char []arr=s.toCharArray();
        char temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        return new String(arr);
    }
    static ArrayList<String> list=new ArrayList<>();
    static void permute(String s, int low, int high){
        if(low==high){
            list.add(s);
        }else{
            for(int i=low;i<=high;i++){
                s=Swap(s, low, i);

                permute(s, low+1, high);
            }
        }
    }

    public static void main(String[] args) {
        String s="ABC";
        permute(s, 0, s.length()-1);
        System.out.println(list);
        for(String i:list){
            System.out.println(i+" ");
        }
    }
}
