package tasks;

import java.util.Scanner;

public class LeapYearInMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = scanner.nextInt();

        determinLeapYear(year);
        System.out.println(determinLeapYearString(year));
    }

    public static void determinLeapYear(int year) { //(int year) <--could write different name and in name method would be not the same
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }

    public static String determinLeapYearString(int year) {
        String answer;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            answer = "Leap year";
        } else {
            answer = "Not a leap year";
        }
        return answer;
    }
}