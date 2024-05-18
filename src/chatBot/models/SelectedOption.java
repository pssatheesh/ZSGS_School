package chatBot.models;

public class SelectedOption {
    private int level;
    private int choice;

    public SelectedOption(int level, int choice) {
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
