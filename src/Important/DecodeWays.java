package Important;

public class DecodeWays {
    //Leetcode - 91

    private static int decode(String str){
        int []dp=new int[str.length()+1];
        dp[0]=1;
        dp[1]=1;
        if(str.startsWith("0")){
            return 0;
        }
        for(int i=2;i<=str.length();i++){
            int temp=str.charAt(i-1)-48;
            int temp1=Integer.parseInt(str.substring(i-2, i));
            if(temp>=1 && temp<=9){
                dp[i]+=dp[i-1];
            }
            if(temp1>=10 && temp1<=26)
                dp[i]+=dp[i-2];
        }
        return dp[dp.length-1];
    }
    public static void main(String[] args) {
        String s1="123";
        System.out.println(decode(s1));
        String s2="226";
        System.out.println(decode(s2));
        String s3="12";
        System.out.println(decode(s3));
    }
}
