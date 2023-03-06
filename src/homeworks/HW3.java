package homeworks;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        /*      Write an application, that will read one number from user (of type int)
        and check, if given number is "near" 100. A number is "near" 100 when
        difference between it and 100 is no bigger than 10. (not popular method, that was covered)

        Your application should read one number (int) and print false or true on the screen,
                according to instructions above.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt(); // System.out.println(Math.abs(100 - input) <= 10);


        System.out.println("Is number near 100?");
        boolean numberNearHundred = true;

        if (number >= 90 && number <= 110) {
            System.out.println(numberNearHundred);
        } else {
            System.out.println(!(numberNearHundred));
        }

    }
}
/* variant 2
boolean value1 = number >= 90;
boolean value2 = number <= 110;
System.out.println (value1 && value2);
 */

/*variant 3 !!!!!!!!!!!!!
int input = scanner.nextInt();
System.out.println(Math.abs(100 - input) <=10);
 */

/*variant 4
int number = 0;

while(Math.abs(100 - number) > 10){
System.out.println("Please enter number");
number = scanner.nextInt();

if (Math.abs(100 - number) < 10){
System.out.print("True");  .......eto ispravitj, tak ne pisatj tru ili false, a delatj boolean
}else{
System.out.println("False");
 */

/* variant 5
Int num = scanner.nextInt();
int diff;
diff = Math.abs(100 - num);

if(diff <= 10){System.out.println("True")}
 */