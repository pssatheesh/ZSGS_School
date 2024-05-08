package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval56 {

    public static void main(String[] args) {
        int [][]arr={ {1,3}, {2,6}, {8,10}, {15, 18}};
        int row=arr.length;
        int col=arr[0].length;
        int count=0;
        for(int i=0;i<row-1;i++){
            if(arr[i][1]>arr[i+1][0]){
                arr[i][1]=arr[i+1][1];
                arr[i+1][0]=0;
                arr[i+1][i+1]=0;
                i++;
                count++;
            }
        }
        System.out.println(count);
        int res[][]=new int[row-count][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
