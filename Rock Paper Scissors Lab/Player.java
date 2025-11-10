public class Player {
    private String name;
    private String choice;

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        choice = choice.toLowerCase();
        if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
            this.choice = choice;
        }
        this.choice = RPSGame.generateRandomChoice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " chose " + choice + ".";
    }
}
