package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            // space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------Another method-----------------------------");
        for(int i=n;i>=0;i--){
            for(int j=0;j<=n;j++){
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
