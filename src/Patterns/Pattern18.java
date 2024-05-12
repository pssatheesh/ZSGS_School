package Patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int n=5;
        Print(n);
    }

    public static void Print(int n) {
        for(int i=0;i<n;i++){
            for(char j='E';j>='E'-i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
