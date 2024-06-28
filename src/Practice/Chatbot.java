package Practice;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ChatBot {

    private Stack<Options> backStack = new Stack<>();

    private Connection getConnection() {
        String url="jdbc:mysql://localhost:3306/demo";
        String user="root";
        String pass="satheesh";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        ChatBot ivrs = new ChatBot();
        ivrs.start();
    }

    private void start() {
        int choice;
        backStack.push(new Options(0, 0));
        print(0, 0);
        Scanner input = new Scanner(System.in);
        do {
            System.out.println();
            System.out.print("Enter your option: ");
            choice = input.nextInt();
            if (choice == 9) {
                backStack.pop();
                if (backStack.isEmpty()) {
                    break;
                }
            } else {
                backStack.push(new Options(backStack.peek().level + 1, choice));
            }
            Options top = backStack.peek();
            print(top.level, top.choice);
        } while (choice != 0);
        System.out.println("Thank you for visiting our Bot...");
    }

    private void print(int level, int choice) {
        for (String choiceString : getOptions(level, choice)) {
            System.out.println(choiceString);
        }
    }

    private ArrayList<String> getOptions(int level, int choice) {
        ArrayList<String> choiceList = new ArrayList<>();
        String sql = "SELECT option_text FROM menu_options WHERE level = ? AND choice = ?";

        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, level);
            pstmt.setInt(2, choice);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                choiceList.add(rs.getString("option_text"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        if (choiceList.isEmpty() && level == 3) {
            choiceList.add("Your Option set Successfully");
            choiceList.add("9-Back");
            choiceList.add("0-Exit");
        }

        return choiceList;
    }

    public static class Options {
        private int level;
        private int choice;

        Options(int level, int choice) {
            this.level = level;
            this.choice = choice;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getChoice() {
            return choice;
        }

        public void setChoice(int choice) {
            this.choice = choice;
        }
    }
}
