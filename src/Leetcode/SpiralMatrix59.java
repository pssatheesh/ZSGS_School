package Leetcode;

import java.util.Arrays;

public class SpiralMatrix59 {
    public static void main(String[] args) {
        int [][]arr=new int[3][3];
        //o/p [][]res= 1,2,3,6,9,8,7,4,5
        int left=0, right=2, top=0, bottom=2;
        int dir=0, value=1;
        while(left<=right && top<=bottom && value<=9){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    arr[top][i]=value++;
                }

                top++;
            }else if(dir==1){
                for(int i=top;i<=bottom;i++){
                    arr[i][right]=value++;
                }

                right--;
            }else if(dir==2){
                for(int i=right;i>=left;i--){
                    arr[bottom][i]=value++;
                }
                bottom--;
            }else if(dir==3){
                for(int i=bottom;i>=top;i--) {
                    arr[i][left]=value++;
                }
                left++;
            }

            dir=(dir+1)%4;

        }
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
    }
}
