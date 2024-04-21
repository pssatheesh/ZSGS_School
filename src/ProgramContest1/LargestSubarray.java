package ProgramContest1;

import java.util.HashMap;

public class LargestSubarray {
    static void largestsub(int []arr){
        int count=0;
        int maxLength=0;
        int startIndex=0, endIndex=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(count, -1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count+=1;
            }else{
                count-=1;
            }
            if(map.containsKey(count)){
                int getIndex=map.get(count);
                if(i-getIndex>maxLength){
                    maxLength=i-getIndex;
                    startIndex=getIndex+1;
                    endIndex=i;
                }
            }else{
                map.put(count, i);
            }
        }
        if(maxLength==0){
            System.out.println("No subarray in this array");
        }else{
            for(int i=startIndex;i<=endIndex;i++){
                System.out.print(arr[i]);
            }
        }

    }
    public static void main(String[] args) {
        int []arr={1,0,1,1,1,0,0};
        largestsub(arr);
    }
}
