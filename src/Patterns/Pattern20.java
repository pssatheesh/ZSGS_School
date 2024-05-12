package Patterns;

public class Pattern20 {
    private static void printPattern(int n){
        int space=2*n-2;
        for(int i=1;i<2*n-1;i++){
            int stars=i;
            if(i>n) stars=2*n-i;
            //star
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) space-=2;
            else space+=2;
        }
    }
    public static void main(String[] args) {
        int n=5;
        printPattern(n);
    }
}
