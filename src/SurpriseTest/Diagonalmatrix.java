package SurpriseTest;

public class Diagonalmatrix {
    public static void main(String[] args) {
        System.out.println("*");
        int n=3;
// 		int [][]arr=new int[n][n];
// 		Random random=new Random();
// 		for(int i=0;i<n;i++){
// 		    for(int j=0;j<n;j++){
// 		        int temp=(int)Math.random();
// 		        arr[i][j]=temp;
// 		    }
// 		}

        int [][]arr={{1,2,3}, {4,5,6}, {7,8,9}};
        int length=(n*2)-1;
        int [][]res=new int[length][length];

        for(int i=0;i<length;i++){
            for(int j=0;j<n;j++){
                if(j==i){
                    for(int k=0;k<j;k++){
                        res[i][k]=arr[k][j];
                    }
                }
            }
        }
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                //  if(res[i][i]!=0){
                System.out.print(res[i][j]+" ");
                //}
            }
            System.out.println();
        }
    }
}
