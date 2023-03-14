package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter the required size of the array: ");
        int arraySize = scanner.nextInt(); //the size of the array

        int[] listOfNumbers = new int[arraySize]; //empty array

        System.out.println("Enter the elements of the array one by one");

        for (int i = 0; i < arraySize; i++) { //loop to enter all the elements for the array
            System.out.println("Please enter element number: " + (i + 1));
            listOfNumbers[i] = scanner.nextInt();
        }
        int sum = 0;

        for (int i = 0; i < listOfNumbers.length; i++) { //loop to write down all the entered elements
            if (i == 0){
                System.out.print("Source array: ");
            }
            System.out.print(listOfNumbers[i] + " " );
            sum = sum + listOfNumbers[i]; //count sum
            }

        System.out.println();
        System.out.println("Sum of all elements: " + sum);

    /*
    2nd variant
    Scanner scanner = new Scanner(System.in);
    int sum = 0;

    System.out.println("Please enter the array size: ");
    int arraySize = scanner.nextInt();

    //Declare empty array in given size
    int storageArray[] = new int[arraySize];
    System.out.println("Please enter array elements one by one");

    for(int i = 0; i < storageArray.length; i++){
    System.out.println("Please enter element number: " + (i + 1));
    storageArray[i] = scanner.nextInt();
    sum += storageArray[i];
    }
    System.out.println(Arrays.toString(storageArray));
    System.out.println("Sum" + sum);

     */






    }
    }


