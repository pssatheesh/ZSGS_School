package chatBot.models;

public class Menu {
    private int id;
    private String choice;

    public Menu(int id, String choice) {
        this.id = id;
        this.choice = choice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    @Override
    public String toString() {
        return  id +"\t"+
                choice + "\t";

    }
}
