
public class test {

    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(" ");
            }

            for(int j=i+1;j<(2*n)-1;j++){
                System.out.print("*");
            }

            for(int j=n-1;j>=0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }


    }


}
