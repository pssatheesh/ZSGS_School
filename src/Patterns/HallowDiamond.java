package Patterns;

public class HallowDiamond {
    static void printPattern(int n){
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1){
                    System.out.print(ch);
                }else{
                    System.out.print(" ");
                }
            }ch++;
            System.out.println();
        }
        ch--;
        for(int i=n-1;i>=1;i--){
            ch--;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1){
                    System.out.print(ch);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=6;
        printPattern(n);

    }
}
