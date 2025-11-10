public class NPC {
    private String choice;

    public NPC() {
        this.choice = RPSGame.generateRandomChoice();
    }

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

    public String toString() {
        return "Opponent chose " + getChoice() + ".";
    }






}

