package homeworks;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        /*     Write an application, that will read two numbers from user
        (of type int) and will print true, if both numbers are the
        same sign (both are positive, or both are negative), or false
        otherwise.

        If at least one of given numbers is equal to 0, your application
        should print false.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        boolean compare = true;

        if (numberOne < 0 && numberTwo < 0){
            System.out.println(compare);
        } else if (numberOne > 0 && numberTwo > 0) {
            System.out.println(compare);
        } else {
            System.out.println(!compare);
        }


    }
}
