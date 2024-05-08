package Leetcode;

public class StringCompress443 {
    public static void main(String[] args) {
        char []chars={'a', 'b', 'b','b','c','c'};
        StringBuilder res=new StringBuilder();
        int index=0, count=0;
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            count=0;
            for(int j=i+1;j<chars.length;j++){
                if(ch==chars[j]){
                    index=i;
                    count++;
                }
            }
            System.out.println(chars[i]+" "+i+" "+count);
        }
        System.out.println(index);
    }
}
