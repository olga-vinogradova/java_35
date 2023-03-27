package homeworks;

import java.util.Random;
import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1, please enter: rock, paper or scissors");
        String player1 = scanner.nextLine().toLowerCase().trim();

        /* System.out.println("Player 2, please enter: rock, paper or scissors");
        String player2 = scanner.nextLine().toLowerCase().trim();*/
        String[] words = {"rock","paper","scissors"}; //computer would randomly choose a value
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String player2 = words[randomIndex];
        System.out.println("Computer: " + player2);


        System.out.println(rockPaperScissors(player1, player2));
    }

    public static String rockPaperScissors(String player1, String player2) {
        String result;

        if (isInputCorrect(player1,player2) && player1.equals("rock") && player2.equals("scissors") ||
                player1.equals("paper") && player2.equals("rock") ||
                player1.equals("scissors") && player2.equals("paper")) {
            result = "Player 1 wins";
        } else if (isInputCorrect(player1,player2) && player1.equals("scissors") && player2.equals("rock") ||
                player1.equals("paper") && player2.equals("scissors") ||
                player1.equals("rock") && player2.equals("paper")) {
            result = "Player 2 wins";
        } else if (isInputCorrect(player1,player2)){
            result = "TIE";
        }else{
            result = "Input is incorrect!";
        }
        return result;
    }
    public static boolean isInputCorrect(String player1, String player2){
        return player1.matches("rock|scissors|paper") && player2.matches("rock|scissors|paper");
    }
}
