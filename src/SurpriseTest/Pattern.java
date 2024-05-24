package SurpriseTest;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int n = sc.nextInt();
        for (int i = 1; i <= (n / 2) + 1; i++) {
            //space
            for (int j = 1; j < (n / 2) + 1; i++) {
                System.out.print(" ");
            }
            //Number
            for (int j = 1; j < n / 2; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 1; j < (n / 2) + 1; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n / 2; i++) {
            //space
            for (int j = n / 2; j >= 1; i--) {
                System.out.print(" ");
            }
            //Number
            for (int j = 1; j < n / 2; j++) {
                System.out.print("*");
            }

            //space
            for (int j = n / 2; j >= 1; i--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
