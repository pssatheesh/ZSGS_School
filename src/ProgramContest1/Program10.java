package ProgramContest1;

public class Program10 {
    public static void main(String[] args) {
        String str="123456758933312";
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum+=str.charAt(i)-48;
        }
        if(sum%3==0){
            System.out.println("Divisible by 3");
        }else{
            System.out.println("Not Divisible by 3");
        }

    }
}
