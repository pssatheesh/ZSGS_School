package chatBot;

import chatBot.english.EnglishView;
import chatBot.models.Menu;

import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private static Database db=new Database();
    private static List<Menu> menuList;
    private Scanner scan;
    public void init(){
        menuList=db.displayMenu();
        for(Menu m:menuList){
            System.out.println(m);
        }
        scan=new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice=scan.nextInt();
        while(true){
            switch (choice){
                case 1:
                    EnglishView englishview=new EnglishView();
                    englishview.init(choice);
                    break;
                default:
                    showAlert("Invalid choice");
                    break;
            }
        }
    }

    private void showAlert(String str) {
        System.out.println(str);
    }
}
