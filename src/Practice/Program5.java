package Practice;


import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input:");
        int n=scanner.nextInt();
        int [][]arr=new int[n][n];
        int front = 0;
        int last = n-1;
        int number = 0;
        while(front <= last){
            number = number == 0 ? 1 : 0;
            for(int i = front ; i <= last ; i++){
                arr[front][i] = number;
                arr[last][i] = number;
                arr[i][front] = number;
                arr[i][last] = number;
            }
            front++;
            last--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
