import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public NPC getOpponent() {
        return opponent;
    }

    public void setOpponent(NPC opponent) {
        this.opponent = opponent;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player name: ");
        String playerName = scan.next();
        System.out.println("Player choice: ");
        String playerChoice = scan.next();
        for(int i = 0; i < 2; i++) {
            if (validateChoice(playerChoice)) {
                setPlayerValues(playerName, playerChoice);
            } else {
                System.out.println("Player choice: ");
                playerChoice = scan.next();
            }
        }
        if (! validateChoice(playerChoice)) {
            String randomChoice = RPSGame.generateRandomChoice();
            System.out.println("0 remaining attempts, random choice will be assigned: " + randomChoice);
            setPlayerValues(playerName, randomChoice);
        }    
            
    }
        

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }

    public boolean didPlayerWin() {
        if (player.getChoice().equals("rock")) {
            if (opponent.getChoice().equals("scissors")) {
                return true;
            }
            return false;
        } else if (player.getChoice().equals("scissors")) {
            if (opponent.getChoice().equals("paper")) {
                return true;
            }
            return false;
        }
        if (opponent.getChoice().equals("rock")) {
            return true;
        }
        return false;
    }

    public String toString() {
       if (didPlayerWin()) {
        return player.getName() + " won! \nCongratulations!";
       }
       return "Opponent won! \nBetter luck next time!";
    }

    public String displayResults() {
        return "\n== GAME RESULTS ==\n" + player.getName() + " chose " + player.getChoice() + "."
            + "\nOpponent chose " + opponent.getChoice() + ". \n" + toString();
    }

    public static boolean validateChoice(String choice) {
        if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
            return true;
        }
        return false;
    }

    public static String generateRandomChoice() {
        int random = (int) (Math.random() * 3 + 1);
        if (random == 1) {
            return "paper";
        } else if (random == 2) {
            return "rock";
        }
        return "scissors";
        
    }
}
