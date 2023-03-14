package homeworks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HW11 {
    public static void main(String[] args) {

        //Personal code. Check if entered in proper format and asking if user want to enter it again.

        Scanner scanner = new Scanner(System.in);
        char again; // declare


        do {
            System.out.println("Enter your personal number");
            String personalNumber = scanner.nextLine();

            if (Pattern.matches("[0-9]{6}-[0-9]{5}", personalNumber)) {
                System.out.println("Your inputted personal number is valid");
            } else {
                System.out.println("Your inputted personal number is not valid");
            }

            System.out.println("Do you want to check your personal number again? y/n");
            again = scanner.next().charAt(0); //reading only one character
            scanner.nextLine(); //fixing problem
//            if (again == 'n') {
//                break;
//            }
        }
        while (again == 'y'); //validation ! ---- checking condition, verbal should be initialized al least once before while . is equal to something. could not be equal to nothing




        /* second variant
        Scanner scanner = new Scanner(System.in);
        char again = 'y';
        Pattern pattern = Pattern.compile("[0-9]{6}-[0-9]{5}");
        while (again == 'y'){
        //1. Asking for input from user and calling matches method
        System.out.println("Enter your personal number");
        String personalNumber = scanner.nextLine().trim();

        Matcher matcher = pattern.matcher(personalNumber);
        boolean matches = matcher.matches();
        //2.Determining is input is valid or not
        if(matches){
        System.out.println("Your inputted personal number is valid");
        }else{
        System.out.println("Your inputted personal number is not valid");
        }
        //3. Asking if user want's to repeat the action
        System.out.println("Do you want to check your personal number again? y/n");
        again = scanner.next().charAt(0);
        scanner.nextLine();
        }
         */




    }
}


