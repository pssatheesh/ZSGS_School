package Patterns;


/*  **********
    ****  ****
    ***    ***
    **      **
    *        *
    *        *
    **      **
    ***    ***
    ****  ****
    **********
*
* */
public class Pattern19 {
    public static void main(String[] args) {
        int n=5;
        patternPrint(n);
    }

    private static void patternPrint(int n) {
        int space=0;
        for(int i=0;i<n;i++){
            //star
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }
        space=2*n-2;
        for(int i=1;i<=n;i++){
            //star
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            space-=2;
            System.out.println();
        }
    }
}
