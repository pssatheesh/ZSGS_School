package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L1207_UniqueOcc {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> ans=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(ans.containsKey(arr[i])){
                int temp=ans.get(arr[i]);
                ans.put(arr[i], temp+1);
            }else{
                ans.put(arr[i], 1);
            }

        }
        System.out.println(ans);
        Set<Integer> set=new HashSet<>();
        for(int s:ans.values())
            set.add(s);

        return set.size()==ans.size();
    }


    public static void main(String[] args) {
        int []arr={1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
