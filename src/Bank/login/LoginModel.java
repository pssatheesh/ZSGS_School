package Bank.login;

import Bank.MainMenu;
import Bank.database.DbCode;

public class LoginModel {
    private static LoginView loginView;
    private static DbCode dbcode;
    private static MainMenu menu=new MainMenu();
    public LoginModel(LoginView loginView) {
        this.loginView=loginView;
    }

    public void validate(long card, int pass) {
        if(dbcode.validate(card, pass)){
            System.out.println("Login successfully");
            menu.init();
        }else{
            System.out.println("Invalid login");
        }
    }
}
