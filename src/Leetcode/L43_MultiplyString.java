package Leetcode;

public class L43_MultiplyString {
    private static String multiply(String num1, String num2) {
        int m=num1.length(), n=num2.length();
        int []arr=new int[m+n];
        for(int i=m-1;i>=0;i--){
            for (int j=n-1;j>=0;j--){
                int mul=(num1.charAt(i)-48)*(num2.charAt(j)-48);
                int p1=i+j, p2=i+j+1;
                int sum=mul+arr[p2];
                arr[p1]+=sum/10;
                arr[p2]=sum%10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i:arr){
            if(!(sb.length()==0 && i==0)){
                sb.append(i);
            }
        }
        return (sb.length()==0)?"0": sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }
}
