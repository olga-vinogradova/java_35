package tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = scanner.nextInt();

        if (year < 0 ){
            System.out.println("Invalid input");
        } else if (year > 2100) {
            System.out.println("You are looking too far in the future, live for today");
        }
        else if ((year%400 == 0) || ((year%4 == 0) && (year%100 != 0))) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }
}
