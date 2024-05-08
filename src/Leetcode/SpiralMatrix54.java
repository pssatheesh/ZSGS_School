package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3,4},{5,6,7,8},{9,10,11,12}
        };
        List<Integer> list=new ArrayList<>();
        int dir=0;
        int left=0, top=0, right=arr[0].length-1, bottom=arr.length-1;
        while(top<=bottom && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    list.add(arr[top][i]);
                    //System.out.print(arr[top][i]+" ");
                }
                top++;
            }else if(dir==1){
                for(int i=top;i<=bottom;i++)
                    //System.out.print(arr[i][right]+" ");
                    list.add(arr[i][right]);
                right--;
            }else if(dir==2){
                for(int i=right;i>=left;i--)
                    //System.out.print(arr[bottom][i]+" ");
                    list.add(arr[bottom][i]);
                bottom--;
            }else if(dir==3){
                for(int i=bottom;i>=top;i--)
                    //System.out.print(arr[i][left]+" ");
                    list.add(arr[i][left]);
                left++;
            }
            dir=(dir+1)%4;
        }
        System.out.println(list);
    }
}
