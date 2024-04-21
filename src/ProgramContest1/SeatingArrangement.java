package ProgramContest1;

import java.util.Scanner;

public class SeatingArrangement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the seat number");
        int seat=scanner.nextInt();
        if(seat%6==1 || seat%6==0){
            System.out.println("Your seat is Window Seat");
        }else if(seat%6==2 || seat%6==5){
            System.out.println("Your seat is Middle Seat");
        }else if(seat%6==3 || seat%6==4){
            System.out.println("Your seat is Arisle Seat");
        }
    }
}
