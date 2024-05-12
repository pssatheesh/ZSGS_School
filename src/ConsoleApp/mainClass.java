package ConsoleApp;

import java.util.Scanner;


public class mainClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row=scanner.nextInt();
        Sudokucode sud=new Sudokucode((int) Math.sqrt(row));
        //System.out.println("Enter the input from row wise left to right");
        int [][]board=new int[row][row];
        for(int i=0;i<row;i++){
            System.out.print("Enter the "+(i+1)+" row ");
            for(int j=0;j<row;j++){

                board[i][j]=scanner.nextInt();
            }
        }
//        int [][]board={
//                {0, 0, 0, 6, 0, 0, 4, 0, 0},
//                {7, 0, 0, 0, 0, 3, 6, 0, 0},
//                {0, 0, 0, 0, 9, 1, 0, 8, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 5, 0, 1, 8, 0, 0, 0, 3},
//                {0, 0, 0, 3, 0, 6, 0, 4, 5},
//                {0, 4, 0, 2, 0, 0, 0, 6, 0},
//                {9, 0, 3, 0, 0, 0, 0, 0, 0},
//                {0, 2, 0, 0, 0, 0, 1, 0, 0}
//        };

//       int [][]board={
//                {1,0,0,4},
//                {3,0,0,2},
//                {0,1,4,0},
//                {0,3,0,1}
//        };
        if(sud.solved(board)){
            sud.display(board);
            System.out.println("Yah finished");
        }else {
            System.out.println("Oops");
        }

    }
}
