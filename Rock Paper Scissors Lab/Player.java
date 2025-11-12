public class Player {
    private String name;
    private String choice;

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        String lowerChoice = choice.toLowerCase();
        if (lowerChoice.equals("rock") || lowerChoice.equals("paper") || lowerChoice.equals("scissors")) {
            this.choice = lowerChoice;
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }
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
