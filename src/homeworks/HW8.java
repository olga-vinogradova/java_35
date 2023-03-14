package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float sum = 0;

        System.out.println("Please enter the required size of the array: ");
        int arraySize = scanner.nextInt(); //asking to enter the arrays size

        float [] listOfNumbers = new float[arraySize]; //empty array , float data types values

        System.out.println("Enter the grades of the array one by one");

        for(int i = 0; i < listOfNumbers.length; i++){
            System.out.println("Please enter grade number: " + (i+1));
            listOfNumbers[i] = scanner.nextFloat();
            sum += listOfNumbers[i];
        }
        float average = (sum/ listOfNumbers.length);
        System.out.printf("Average grade: %.2f\n",average); //values average
        System.out.println("There was passed  " + listOfNumbers.length + " values"); //count of grades

    }
}
