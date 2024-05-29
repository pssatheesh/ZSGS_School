package Leetcode;

import java.math.BigInteger;

public class L1404_NumberofSteps {
    private static int numSteps(String s) {
        int carry=0, step=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)-'0'+carry==0){
                step+=2;
                carry+=1;
            }else{
                step+=1;
            }
        }
        return step+carry;
    }

    public static void main(String[] args) {
        //String s="1111110011101010110011100100101110010100101110111010111110110010";
        String s="1101";
        System.out.println(numSteps(s));
    }
}
