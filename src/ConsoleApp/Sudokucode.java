package ConsoleApp;

public class Sudokucode {
    private int boxSize;
    private int gridSize;

    public Sudokucode(int boxSize) {
        this.boxSize=boxSize;
        this.gridSize=boxSize*boxSize;

    }

    public void display(int [][]board) {
        for(int row=0;row<gridSize;row++){
            if(row%boxSize==0 && row!=0){
                System.out.println("---------------------");
            }
            for(int col=0;col<gridSize;col++){
                if(col%boxSize==0 && col!=0){
                    System.out.print("| ");
                }
                System.out.print(board[row][col]+" ");
            }
            System.out.println();
        }
    }

    public  boolean allowInRow(int [][]board, int row, int number){
        for(int i=0;i<gridSize;i++){
            if(board[row][i]==number){
                return false;
            }
        }
        return true;
    }
    public boolean allowInCol(int [][]board, int col, int number){
        for(int i=0;i<gridSize;i++){
            if(board[i][col]==number){
                return false;
            }
        }
        return true;
    }
    public boolean allowInBox(int [][]board, int row, int col, int number){
        int boxCol=col-(col%boxSize);
        int boxRow=row-(row%boxSize);
        for(int i=0;i<boxSize;i++){
            for(int j=0;j<boxSize;j++){
                if(board[boxRow+i][boxCol+j]==number){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isAllowed(int [][]board, int row, int col, int number){
        return allowInRow(board, row, number) &&
                allowInCol(board, col, number) &&
                allowInBox(board, row, col, number);
    }

    public boolean solved(int [][]board){
        for(int row=0;row<gridSize;row++){
            for(int col=0;col<gridSize;col++){
                if(board[row][col]==0){
                    for(int num=1;num<=gridSize;num++){
                        if(isAllowed(board,row,col,num)){
                            board[row][col]=num;
                            if(solved(board)){
                                return true;
                            }
                            board[row][col]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
