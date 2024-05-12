package Practice;

import java.util.Arrays;

public class Linearsearch {
    public static int find(int []arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static boolean contains(int []arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }

    public static int find(String str, char target){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
    public static int[] find(int [][]arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target)
                    return new int[] {row, col};
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int []arr={1,3,2,6,7,8};
        System.out.println(find(arr, 7));
        System.out.println(contains(arr, 7));
        System.out.println(find("satheesh", 'e'));
        int [][]mat={
                {1,2,3},
                {1,3,5,7,8},
                {9,7,5,3}};
        int []result=find(mat, 7);
        System.out.println(Arrays.toString(result));
    }
}
/*
* Find also Min and Max element
* count the character in the string
* count 4 digits element in the array {12,123,1234,5678,4563}
* */