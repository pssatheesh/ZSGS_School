package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<(2*n-(2*i+1));j++){
                System.out.print("*");
            }
            //space
            System.out.println();
        }
        System.out.println("-----------------------Another method-----------------------------");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
