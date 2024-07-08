package Important;

import java.util.Arrays;
import java.util.Scanner;

public class DaysCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []cur={7,7,2024};
        int []dob={7,9,2000};
        int []res=new int[3];
        if(cur[0]<dob[0]){
            cur[0]=cur[0]+30;
            cur[1]=cur[1]-1;
        }
        res[0]=cur[0]-dob[0];
        if(cur[1]<dob[1]){
            cur[1]=cur[1]+12;
            cur[2]=cur[2]-1;
        }
        res[1]=cur[1]-dob[1];
        res[2]=cur[2]-dob[2];
        System.out.println(res[2]+" Years "+res[1]+" Months "+res[0]+" Days");
        calculatedays(res);
    }

    private static void calculatedays(int[] res) {
        int days=res[0];
        int []month={31,28,31,30,31,30,31,31,30,31,30,31};
        int mon=0;
        for(int i=0;i<res[1];i++){
            days+=month[i];
        }
        days+=res[2]*365;
        days+=res[2]/4;
        System.out.println("Total days: "+days);
        int temp=(int)Math.ceil((days/30.44));
        System.out.println("Total days: "+temp);
        System.out.println("Total weeks: "+(days/7));
        System.out.println("Total Hours: "+(days*24)+" Hrs");
        System.out.println("Total Minutes: "+(days*24*60)+" mins");
        System.out.println("Total Minutes: "+(days*24*60*60)+" secs");
    }


}
