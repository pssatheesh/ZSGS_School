package Leetcode;

public class Rotateimage48 {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int [][]res=new int[3][3];
        for(int i=0;i<=2;i++){
            int col=0;
            for(int j=2;j>=0;j--){
                res[i][col]=arr[j][i];
                col++;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(res[i][j]);
            }
            System.out.println();
        }
    }
}
