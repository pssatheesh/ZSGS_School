package Leetcode;

public class Rotateimage48 {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
      /*  int [][]res=new int[3][3];
        for(int i=0;i<=2;i++){
            int col=0;
            for(int j=2;j>=0;j--){
                res[i][col]=arr[j][i];
                col++;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }*/
        //Another Method
        for(int i=0;i<arr.length;i++){
            int j=0;
            int k=arr.length-1;
            while(j<k){
                swap(arr,j,i,k,i);
                j++;
                k--;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                swap(arr,i,j,j,i);
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void swap(int [][]arr, int i, int j, int k, int l){
        int temp=arr[i][j];
        arr[i][j]=arr[k][l];
        arr[k][l]=temp;
    }
}
