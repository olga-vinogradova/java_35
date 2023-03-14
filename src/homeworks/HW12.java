package homeworks;

import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        //program, that allows to check if entered word is palindrome(could be read from the different sides)

        Scanner scanner = new Scanner(System.in);
        char firstWordPart = '0';
        char secondWordPart = '0';

        System.out.println("Please enter a name");
        String name = scanner.nextLine().toUpperCase().trim(); //if letters are uppercase & extra spaces added

        for (int i = 0; i < name.length()/2; i++) { //divide word into two parts
            firstWordPart = (name.charAt(i)); //check letters in the first part
            secondWordPart = (name.charAt(name.length()-1-i));} //check letters in the second part
            if (firstWordPart == secondWordPart){
                System.out.println(name + " is a palindrome");
            }
            else {
                System.out.println(name + " is not a palindrome");
            }
        }
    }

