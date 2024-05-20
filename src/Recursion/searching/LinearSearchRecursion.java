package Recursion.searching;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchRecursion {
    static boolean findSort(int []arr, int index){

        if(index==arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && findSort(arr, index+1);
    }
    static boolean find(int []arr, int target, int index){
        if(index==arr.length){
            return true;
        }
        return arr[index]==target || find(arr, target, index+1);
    }

    static int findIndex(int []arr, int target, int index){
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return findIndex(arr, target, index+1);
        }
    }

    static int findIndexLast(int []arr, int target, int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return findIndexLast(arr, target, index-1);
        }
    }

    static List<Integer> list=new ArrayList<>();
    static ArrayList<Integer> findAllIndex(int []arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,5,5,5,6};
        int target=5;
        System.out.println(findSort(arr, 0));
        System.out.println(find(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
        System.out.println(findIndexLast(arr, target, arr.length-1));
        ArrayList ans=findAllIndex(arr, target, 0, new ArrayList<>());
        System.out.println(ans);

    }
}
