package SurpriseTest;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input");
        int n=scanner.nextInt();
        int [][]result=new int[n][n];
        int number=1;
        int minRows=0, maxRows=n-1;
        int minCols=0, maxCols=n-1;
        while(number<=n*n){
            for(int i=minCols;i<=maxCols;i++){
                result[minRows][i]=number;
                number++;
            }
            for(int i=minRows+1;i<=maxRows;i++){
                result[i][maxCols]=number;
                number++;
            }
            for(int i=maxCols-1;i>=minCols;i--){
                result[maxRows][i]=number;
                number++;
            }
            for(int i=maxRows-1;i>=minRows+1;i--){
                result[i][minCols]=number;
                number++;
            }
            minRows++;
            maxRows--;
            minCols++;
            maxCols--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
