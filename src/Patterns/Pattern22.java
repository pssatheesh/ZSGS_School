package Patterns;

public class Pattern22 {
    private static void printPattern(int n){
        int size=2*n-1;
        int [][]arr=new int[100][100];
        int front=0;
        int last=size-1;
        while(n!=0){
            for(int i=front;i<=last;i++){
                for(int j=front;j<=last;j++){
                    if(i==front || j==front || i==last || j==last){
                        arr[i][j]=n;
                    }
                }

            }
            n--; front++; last--;
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        printPattern(n);
    }
}
