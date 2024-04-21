package ProgramContest1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class subset {
    static void subArray(int []arr1, int []arr2){
        Map<Integer, Integer> result=new HashMap<>();
        int index=0;
        for(int i:arr1){
            result.put(i, 1);
        }
        for(int i=0;i<arr2.length;i++){
            if(result.containsKey(arr2[i])){
                int temp=result.get(arr2[i]);
                result.put(arr2[i], temp+1);
                index++;
            }
        }
        if(index==arr2.length){
            System.out.println("arr2[] is a subset of arr1[]");
        }else{
            System.out.println("arr2[] is not a subset of arr1[]");
        }
    }
    public static void main(String[] args) {
        int []a= {11, 1, 13, 21, 3, 7};
        int []b={11, 3, 7, 1, 22};
        int count=0;
        subArray(a, b);
        HashSet<Integer> result=new HashSet<>();
        for(int i:a){
            result.add(i);
        }
        for(int i=0;i<b.length;i++){
            if(result.contains(b[i])){
                count++;
            }
        }
        if(count==b.length){
            System.out.println("arr2[] is a subset of arr1[]");
        }else{
            System.out.println("arr2[] is not a subset of arr1[]");
        }
    }
}
