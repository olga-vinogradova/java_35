package tasks;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] quizArray = new String[4][4];
        int[] answer = {3,1,2,2};
        int score = 0;

        quizArray[0][0] = "Capital city of Australia?";
        quizArray[0][1] = "Sydney";
        quizArray[0][2] = "Melbourne";
        quizArray[0][3] = "Canberra";

        quizArray[1][0] = "Capital city of USA?";
        quizArray[1][1] = "Washington";
        quizArray[1][2] = "New York";
        quizArray[1][3] = "Dallas";

        quizArray[2][0] = "Capital city of Brazil?";
        quizArray[2][1] = "Rio de Janeiro";
        quizArray[2][2] = "Brasilia";
        quizArray[2][3] = "San paulo";

        quizArray[3][0] = "Capital city of Canada?";
        quizArray[3][1] = "Montreal";
        quizArray[3][2] = "Ottawa";
        quizArray[3][3] = "Calgary";


        //i - row
        //j-column
        for (int i = 0; i < quizArray.length; i++) {

            //print out question
            System.out.println(quizArray[i][0]);

            for (int j = 1; j < quizArray[i].length; j++) {
                //print out answers
                System.out.println("\t" + j + ") " + quizArray[i][j]); //"\t" <---for using tab
            }
            //ask user for input
            System.out.println("Answer (1-3):");
            int answerInput = scanner.nextInt();


            //check if answer is correct
            if (answerInput == answer[i]){
                System.out.println("Correct!");
                score++;
            }
            else {
                System.out.println("False");
            }

            System.out.println("-------------------");


        }
        System.out.println("You answered correct to " + score + " questions" );
    }
}


