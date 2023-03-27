package homeworks;

import java.util.Scanner;

public class HW15partTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1, please enter: rock, paper, scissors, spock or lizard");
        String player1 = scanner.nextLine().toLowerCase().trim();
        System.out.println("Player 2, please enter: rock, paper, scissors, spock or lizard");
        String player2 = scanner.nextLine().toLowerCase().trim();

        System.out.println(rockPaperScissors(player1, player2));
    }

    public static String rockPaperScissors(String player1, String player2) {
        String result;

        if (isInputCorrect(player1,player2) && player1.equals("rock") && player2.matches("scissors|lizard") ||
                player1.equals("paper") && player2.matches("rock|spock") ||
                player1.equals("scissors") && player2.matches("paper|lizard")||
                player1.equals("lizard") && player2.matches("paper|spock")||
                player1.equals("spock") && player2.matches("scissors|rock")){
            result = "Player 1 wins";
        } else if (isInputCorrect(player1,player2) && player2.equals("rock") && player1.matches("scissors|lizard") ||
                player2.equals("paper") && player1.matches("rock|spock") ||
                player2.equals("scissors") && player1.matches("paper|lizard")||
                player2.equals("lizard") && player1.matches("paper|spock")||
                player2.equals("spock") && player1.matches("scissors|rock")) {
            result = "Player 2 wins";
        } else if (isInputCorrect(player1,player2)){
            result = "TIE";
        }else{
            result = "Input is incorrect!";
        }
        return result;
    }
    public static boolean isInputCorrect(String player1, String player2){
        return player1.matches("rock|scissors|paper|spock|lizard") && player2.matches("rock|scissors|paper|spock|lizard");
    }
}

