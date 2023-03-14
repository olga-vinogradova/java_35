package basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) { //patterns could be used to change the password
        //Example 1

        Pattern pattern = Pattern.compile("a+b"); //import class Pattern
        Matcher matcher = pattern.matcher("abc"); //import class Matcher

        System.out.println(matcher.matches());
        System.out.println(matcher.find());


        //Example 2
        //Any 3 symbols that would be any lower case letter or number from 5 to 9
        System.out.println(Pattern.matches("[a-z5-9]{3}","abc"));

        //2 Uppercase letters followed by at least 2 lower case letter and then by 3 numbers
        System.out.println(Pattern.matches("[A-Z]{2}[a-z]{2,}[0-9]{3}","VCtfhgd123"));

        // 2 to 7 any letter or any numbers
        System.out.println(Pattern.matches("[a-zA-Z0-9]{2,7}","yfjhghk"));




        //Task
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your car's plate number");
        String plateNumber = scanner.nextLine();

        // 2 Uppercase letters followed by one "-" symbol and then 2 to 4 numbers
        if (Pattern.matches("[A-Z]{2}-[0-9]{2,4}",plateNumber)){
            System.out.println("Your plate number is valid");
        }else {
            System.out.println("Your plate number is not valid");
        }







    }
}
