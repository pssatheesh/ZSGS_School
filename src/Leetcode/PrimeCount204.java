package Leetcode;

public class PrimeCount204 {
    public static void main(String[] args) {
        int count=0,n=10;
        prime(n);
        for(int i=1;i<=n;i++){
            int c=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    c=1;
                }
            }
            if(i>1 && c==0){
                count++;
            }
        }
        //System.out.println(count);
    }

    private static void prime(int n) {
        int count=0;
        if(n<=2){
            System.out.println("0");
        }
        int limit=(int)Math.sqrt(n);
        boolean []arr=new boolean[n];
        for(int i=2;i<=limit;i++){
            if(arr[i] == false){
                for(int j=i*i;j<n;j+=i){
                    arr[j]=true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]==true){
                count++;
            }
        }
        System.out.println(count);
    }
}
