package Practice;

public class DectoBinary {
    public static String convertBinary(int n){
        StringBuilder res=new StringBuilder();
        int rem=0;
        while(n>0){
            res.append(n%2);            //n%8 to Octal
            n/=2;                   //n/8
        }

        return res.reverse().toString();
    }
    public static String convertHexa(int n){
        StringBuilder res=new StringBuilder();
        int rem=0;
        while(n>0){
            rem=n%16;
            if(rem>9){
                int val=rem+55;
                res.append((char)val);
            }else
                res.append(rem);
            n/=16;
        }

        return res.reverse().toString();
    }

    private static int convertDecimal(String str){
        int res=1, index=1;
        StringBuilder temp=new StringBuilder();
        temp.append(str);
        temp.reverse();
        int []arr=new int[str.length()];
        arr[0]=1;
        for(int i=1;i<str.length();i++){
            res=res*2;
            arr[index]=res;
            index++;
        }
        int num=0;
        for(int i=arr.length-1;i>=0;i--){
            if(temp.charAt(i)=='1'){
                num+=arr[i];
            }
        }

        return num;
    }

    private static int convertDecimal(long num){
        int i=0, decimal=0;
        while(num>0){
            decimal+=Math.pow(2, i++)*(num%10);
            num--;
        }
        return decimal;
    }
    public static void main(String[] args) {
        System.out.println(convertBinary(8));
        System.out.println(convertDecimal("1000"));
        System.out.println(convertDecimal("1000"));
        System.out.println(convertHexa(19132));
    }
}
