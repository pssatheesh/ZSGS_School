package Bank.login;

import java.util.Scanner;

public class LoginView {
    private static Scanner sc=new Scanner(System.in);
    private static LoginModel loginModel;

    public LoginView(){
        loginModel=new LoginModel(this);
    }

    public void init() {
        System.out.println("Enter the Card Number: ");
        long card=sc.nextLong();
        System.out.println("Enter the password");
        int pass=sc.nextInt();
        loginModel.validate(card, pass);
    }
}
