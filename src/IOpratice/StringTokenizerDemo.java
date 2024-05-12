package IOpratice;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) throws Exception{
        String str="Good Morning, Vetri $vendu$ma pott$u parrad$a ethin$eechal";
        StringTokenizer st=new StringTokenizer(str, "$");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
